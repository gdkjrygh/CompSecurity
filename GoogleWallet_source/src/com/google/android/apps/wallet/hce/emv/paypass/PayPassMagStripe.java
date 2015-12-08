// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv.paypass;

import com.google.android.apps.wallet.hce.basictlv.BasicTlv;
import com.google.android.apps.wallet.hce.basictlv.BasicTlvUtil;
import com.google.android.apps.wallet.hce.emv.HcePaymentApplet;
import com.google.android.apps.wallet.hce.emv.RotatingAtc;
import com.google.android.apps.wallet.hce.iso7816.Aid;
import com.google.android.apps.wallet.hce.iso7816.CommandApduException;
import com.google.android.apps.wallet.hce.iso7816.ResponseApdu;
import com.google.android.apps.wallet.hce.util.Hex;
import com.google.android.apps.wallet.hce.util.MoreArrays;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Shorts;
import com.google.wallet.common.hce.emv.paypass.PayPassCrypto;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.hce.emv.paypass:
//            PayPassState, PayPassPersonalization, PayPassConstants, PayPassCommandApduIns

public class PayPassMagStripe
    implements HcePaymentApplet
{

    private static final ResponseApdu CONDITIONS_NOT_SATISFIED = ResponseApdu.fromStatusWord(27013);
    private static final ResponseApdu FILE_NOT_FOUND = ResponseApdu.fromStatusWord(27266);
    private static final ResponseApdu INCORRECT_P1P2 = ResponseApdu.fromStatusWord(27270);
    private static final ResponseApdu RECORD_NOT_FOUND = ResponseApdu.fromStatusWord(27267);
    private static final ResponseApdu SECURITY_STATUS_NOT_SATISFIED = ResponseApdu.fromStatusWord(27010);
    private static final String TAG = com/google/android/apps/wallet/hce/emv/paypass/PayPassMagStripe.getSimpleName();
    private static final ResponseApdu WRONG_LENGTH = ResponseApdu.fromStatusWord(26368);
    private boolean activated;
    private final byte aidBytes[];
    private final RotatingAtc atc;
    private ResponseApdu getProcessingOptionsResponse;
    private com.google.android.apps.wallet.hce.emv.HcePaymentApplet.Listener listener;
    private PayPassState payPassState;
    private Boolean pinExpired;
    private final byte posCardholderInteractionInformation[] = new byte[3];
    private final PayPassPersonalization ppp;
    private ResponseApdu readRecordResponse;
    private ResponseApdu selectFci;

    public PayPassMagStripe(Aid aid, RotatingAtc rotatingatc, PayPassPersonalization paypasspersonalization)
    {
        payPassState = PayPassState.IDLE;
        pinExpired = null;
        aidBytes = aid.array();
        atc = rotatingatc;
        ppp = paypasspersonalization;
    }

    private ResponseApdu accept(byte abyte0[])
        throws GeneralSecurityException
    {
        int i = atc.getSecretAtc();
        int j = atc.getReaderAtc();
        WLog.dfmt(TAG, "readerAtc: %s", new Object[] {
            Integer.valueOf(j)
        });
        Object obj = ByteBuffer.wrap(abyte0, 5, 15);
        byte abyte1[] = Arrays.copyOfRange(abyte0, 5, 9);
        WLog.dfmt(TAG, "un in hex: %s", new Object[] {
            Hex.encode(abyte1)
        });
        j = ((ByteBuffer) (obj)).get(((ByteBuffer) (obj)).position() + 4);
        obj = (PayPassCrypto)Preconditions.checkNotNull(ppp.getPayPassCrypto());
        if (j > 0)
        {
            posCardholderInteractionInformation[1] = (byte)(posCardholderInteractionInformation[1] | 0x10);
            abyte0 = ((PayPassCrypto) (obj)).getPinCvc3Track1(abyte1, i);
            abyte1 = ((PayPassCrypto) (obj)).getPinCvc3Track2(abyte1, i);
            obj = ResponseApdu.fromDataAndStatusWord(BasicTlvUtil.tlvToByteArray(BasicTlvUtil.tlv(119, new BasicTlv[] {
                BasicTlvUtil.tlv(40801, abyte1), BasicTlvUtil.tlv(40800, abyte0), BasicTlvUtil.tlv(40758, atc.readerAtcToByteArray()), BasicTlvUtil.tlv(57163, posCardholderInteractionInformation)
            })), 36864);
        } else
        {
            abyte0 = ((PayPassCrypto) (obj)).getCvc3Track1(abyte1, i);
            abyte1 = ((PayPassCrypto) (obj)).getCvc3Track2(abyte1, i);
            obj = ResponseApdu.fromDataAndStatusWord(BasicTlvUtil.tlvToByteArray(BasicTlvUtil.tlv(119, new BasicTlv[] {
                BasicTlvUtil.tlv(40801, abyte1), BasicTlvUtil.tlv(40800, abyte0), BasicTlvUtil.tlv(40758, atc.readerAtcToByteArray())
            })), 36864);
        }
        WLog.dfmt(TAG, "cvc3Track1: %s", new Object[] {
            Hex.encode(abyte0)
        });
        WLog.dfmt(TAG, "cvc3Track2: %s", new Object[] {
            Hex.encode(abyte1)
        });
        listener.onComputeCryptographicChecksumData(this);
        return ((ResponseApdu) (obj));
    }

    private ResponseApdu decline(byte abyte0[])
    {
        abyte0 = ByteBuffer.wrap(abyte0, 5, 15);
        byte byte0 = abyte0.get(abyte0.position() + 4);
        abyte0 = new byte[3];
        if (byte0 > 0)
        {
            return ResponseApdu.fromDataAndStatusWord(BasicTlvUtil.tlvToByteArray(BasicTlvUtil.tlv(119, new BasicTlv[] {
                BasicTlvUtil.tlv(40758, atc.readerAtcToByteArray()), BasicTlvUtil.tlv(57163, abyte0)
            })), 36864);
        } else
        {
            return SECURITY_STATUS_NOT_SATISFIED;
        }
    }

    private ResponseApdu doProcessCommand(int i, byte abyte0[])
        throws GeneralSecurityException
    {
        Preconditions.checkState(activated);
        switch (i)
        {
        default:
            throw new IllegalArgumentException(String.format("Unexpected PayPassCommandApduIns: value=%s command=%s", new Object[] {
                Integer.valueOf(i), Hex.encode(abyte0)
            }));

        case 1: // '\001'
            return processSelect(abyte0);

        case 2: // '\002'
            return processGpo(abyte0);

        case 3: // '\003'
            return processReadRecord(abyte0);

        case 4: // '\004'
            return processCcc(abyte0);
        }
    }

    private ResponseApdu error(ResponseApdu responseapdu)
    {
        PayPassState paypassstate;
        if (payPassState == PayPassState.IDLE)
        {
            paypassstate = PayPassState.IDLE;
        } else
        {
            paypassstate = PayPassState.SELECTED;
        }
        payPassState = paypassstate;
        return responseapdu;
    }

    private static int getLc(byte abyte0[])
    {
        return abyte0[4] & 0xff;
    }

    private ResponseApdu processCcc(byte abyte0[])
        throws GeneralSecurityException
    {
        byte byte0 = abyte0[2];
        byte byte1 = abyte0[3];
        if ((byte0 & 0xff) != 142 || (byte1 & 0xff) != 128)
        {
            return INCORRECT_P1P2;
        }
        if (abyte0[4] != 15)
        {
            return WRONG_LENGTH;
        }
        Arrays.fill(posCardholderInteractionInformation, (byte)0);
        Preconditions.checkNotNull(pinExpired);
        if (!pinExpired.booleanValue())
        {
            return accept(abyte0);
        } else
        {
            return decline(abyte0);
        }
    }

    private ResponseApdu processGpo(byte abyte0[])
    {
        if (abyte0[2] != 0 || abyte0[3] != 0)
        {
            return INCORRECT_P1P2;
        }
        if (getLc(abyte0) != 2)
        {
            return WRONG_LENGTH;
        }
        if (abyte0[5] != -125 || abyte0[6] != 0)
        {
            return CONDITIONS_NOT_SATISFIED;
        }
        if (atc.hasReachedLimit())
        {
            WLog.d(TAG, "atc has reached its limit");
            listener.onAtcReachedLimit(this);
            return CONDITIONS_NOT_SATISFIED;
        } else
        {
            atc.next();
            listener.onGetProcessingOptionsResponse(this);
            return getProcessingOptionsResponse;
        }
    }

    private ResponseApdu processReadRecord(byte abyte0[])
    {
        int i = abyte0[2] & 0xff;
        int j = abyte0[3] & 0xff;
        if (i == 0 || (j & 7) != 4)
        {
            return INCORRECT_P1P2;
        }
        if (j >> 3 != 1)
        {
            return FILE_NOT_FOUND;
        }
        if (i != 1)
        {
            return RECORD_NOT_FOUND;
        } else
        {
            return readRecordResponse;
        }
    }

    private ResponseApdu processSelect(byte abyte0[])
    {
        if (abyte0[2] != 4 || abyte0[3] != 0)
        {
            return INCORRECT_P1P2;
        }
        int i = getLc(abyte0);
        if (aidBytes.length != i || !MoreArrays.equals(aidBytes, 0, abyte0, 5, i))
        {
            return FILE_NOT_FOUND;
        } else
        {
            return selectFci;
        }
    }

    private ResponseApdu success(int i, ResponseApdu responseapdu)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState = new int[PayPassState.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState[PayPassState.IDLE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState[PayPassState.SELECTED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState[PayPassState.INITIATED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.android.apps.wallet.hce.emv.paypass.PayPassState[payPassState.ordinal()])
        {
        default:
            return responseapdu;

        case 1: // '\001'
            payPassState = PayPassState.SELECTED;
            return responseapdu;

        case 2: // '\002'
            PayPassState paypassstate;
            if (i == 2)
            {
                paypassstate = PayPassState.INITIATED;
            } else
            {
                paypassstate = PayPassState.SELECTED;
            }
            payPassState = paypassstate;
            return responseapdu;

        case 3: // '\003'
            break;
        }
        PayPassState paypassstate1;
        if (i == 3)
        {
            paypassstate1 = PayPassState.INITIATED;
        } else
        {
            paypassstate1 = PayPassState.SELECTED;
        }
        payPassState = paypassstate1;
        return responseapdu;
    }

    public final void activate()
    {
        activated = true;
        selectFci = ResponseApdu.fromDataAndStatusWord(BasicTlvUtil.tlvToByteArray(BasicTlvUtil.tlv(111, new BasicTlv[] {
            BasicTlvUtil.tlv(132, aidBytes), BasicTlvUtil.tlv(165, new BasicTlv[] {
                BasicTlvUtil.tlv(80, "MasterCard".getBytes(Charsets.US_ASCII)), BasicTlvUtil.tlv(135, ppp.getApplicationPriorityIndicator()), BasicTlvUtil.tlv(40721, ppp.getIssuerCodeTableIndex())
            })
        })), 36864);
        getProcessingOptionsResponse = ResponseApdu.fromDataAndStatusWord(BasicTlvUtil.tlvToByteArray(BasicTlvUtil.tlv(119, new BasicTlv[] {
            BasicTlvUtil.tlv(130, (byte[])Preconditions.checkNotNull(ppp.getAip())), BasicTlvUtil.tlv(148, (byte[])Preconditions.checkNotNull(ppp.getAfl()))
        })), 36864);
        Preconditions.checkState(Arrays.equals((byte[])Preconditions.checkNotNull(ppp.getUdol()), PayPassConstants.EXPECTED_UDOL));
        readRecordResponse = ResponseApdu.fromDataAndStatusWord(BasicTlvUtil.tlvToByteArray(BasicTlvUtil.tlv(112, new BasicTlv[] {
            BasicTlvUtil.tlv(40812, Shorts.toByteArray(ppp.getAvn())), BasicTlvUtil.tlv(40802, (byte[])Preconditions.checkNotNull(ppp.getPcvc3Track1())), BasicTlvUtil.tlv(40803, (byte[])Preconditions.checkNotNull(ppp.getPunatcTrack1())), BasicTlvUtil.tlv(86, ppp.getTrack1Data()), BasicTlvUtil.tlv(40804, ppp.getNatcTrack1()), BasicTlvUtil.tlv(40805, (byte[])Preconditions.checkNotNull(ppp.getPcvc3Track2())), BasicTlvUtil.tlv(40806, (byte[])Preconditions.checkNotNull(ppp.getPunatcTrack2())), BasicTlvUtil.tlv(40811, ppp.getTrack2Data()), BasicTlvUtil.tlv(40807, ppp.getNatcTrack2()), BasicTlvUtil.tlv(40809, PayPassConstants.EXPECTED_UDOL)
        })), 36864);
    }

    public final String getApplicationLabel()
    {
        return "MasterCard";
    }

    public final RotatingAtc getAtc()
    {
        return atc;
    }

    public final PayPassPersonalization getPayPassPersonalization()
    {
        return ppp;
    }

    public final ResponseApdu processCommand(byte abyte0[], int i)
        throws GeneralSecurityException
    {
        Object obj;
        try
        {
            obj = PayPassCommandApduIns.fromByteArray(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            WLog.efmt(TAG, ((Throwable) (obj)), "Unrecognized command: %s [%s]", new Object[] {
                obj, Hex.encode(abyte0)
            });
            return error(((CommandApduException) (obj)).getErrorResponse());
        }
        i = ((PayPassCommandApduIns) (obj)).intValue();
        i;
        JVM INSTR tableswitch 1 4: default 40
    //                   1 97
    //                   2 126
    //                   3 139
    //                   4 152;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException(String.format("Unrecognized command: %s", new Object[] {
            obj
        }));
_L2:
        listener.onSelect(this);
_L7:
        if (!payPassState.acceptsCommand(((PayPassCommandApduIns) (obj))))
        {
            return error(CONDITIONS_NOT_SATISFIED);
        }
        break; /* Loop/switch isn't completed */
_L3:
        listener.onGetProcessingOptions(this);
        continue; /* Loop/switch isn't completed */
_L4:
        listener.onReadRecord(this);
        continue; /* Loop/switch isn't completed */
_L5:
        listener.onComputeCryptographicChecksum(this);
        if (true) goto _L7; else goto _L6
_L6:
        if (!activated)
        {
            return error(CONDITIONS_NOT_SATISFIED);
        }
        abyte0 = doProcessCommand(i, abyte0);
        if (abyte0.getStatusWord() != 36864)
        {
            return error(abyte0);
        } else
        {
            return success(i, abyte0);
        }
    }

    public final void setListener(com.google.android.apps.wallet.hce.emv.HcePaymentApplet.Listener listener1)
    {
        listener = listener1;
    }

    public final void setPinExpired(boolean flag)
    {
        pinExpired = Boolean.valueOf(flag);
    }

}
