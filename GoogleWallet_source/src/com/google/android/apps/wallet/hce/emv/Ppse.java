// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv;

import com.google.android.apps.wallet.hce.basictlv.BasicTlv;
import com.google.android.apps.wallet.hce.basictlv.BasicTlvUtil;
import com.google.android.apps.wallet.hce.iso7816.Aid;
import com.google.android.apps.wallet.hce.iso7816.ResponseApdu;
import com.google.common.base.Charsets;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.hce.emv:
//            Applet

public final class Ppse
    implements Applet
{
    public static interface Listener
    {

        public abstract void onPpseSelect(Ppse ppse);
    }


    private static final ResponseApdu CLA_NOT_SUPPORTED = ResponseApdu.fromStatusWord(28160);
    private static final byte DEDICATED_FILENAME[];
    private static final ResponseApdu FCI_PAYPASS;
    private static final ResponseApdu INS_NOT_SUPPORTED = ResponseApdu.fromStatusWord(27904);
    private static final ResponseApdu WRONG_DATA = ResponseApdu.fromStatusWord(27264);
    private static final ResponseApdu WRONG_P1P2 = ResponseApdu.fromStatusWord(27392);
    private Listener mListener;

    public Ppse()
    {
    }

    private static ResponseApdu createResponseApdu(byte abyte0[], String s)
    {
        return ResponseApdu.fromDataAndStatusWord(BasicTlvUtil.tlvToByteArray(BasicTlvUtil.tlv(111, new BasicTlv[] {
            BasicTlvUtil.tlv(132, DEDICATED_FILENAME), BasicTlvUtil.tlv(165, new BasicTlv[] {
                BasicTlvUtil.tlv(48908, new BasicTlv[] {
                    BasicTlvUtil.tlv(97, new BasicTlv[] {
                        BasicTlvUtil.tlv(79, abyte0), BasicTlvUtil.tlv(135, (byte)1), BasicTlvUtil.tlv(80, s.getBytes(Charsets.US_ASCII))
                    })
                })
            })
        })), 36864);
    }

    public final ResponseApdu processCommand(byte abyte0[], int i)
    {
        if (abyte0[0] != 0)
        {
            return CLA_NOT_SUPPORTED;
        }
        if (abyte0[1] != -92)
        {
            return INS_NOT_SUPPORTED;
        }
        if (abyte0[2] != 4)
        {
            return WRONG_P1P2;
        }
        if (abyte0[3] != 0)
        {
            return WRONG_P1P2;
        }
        if (!Aid.valueOf(Arrays.copyOfRange(abyte0, 5, UnsignedBytes.toInt(abyte0[4]) + 5)).equals(Aid.PPSE_AID))
        {
            return WRONG_DATA;
        } else
        {
            mListener.onPpseSelect(this);
            return FCI_PAYPASS;
        }
    }

    public final void setListener(Listener listener)
    {
        mListener = listener;
    }

    static 
    {
        DEDICATED_FILENAME = "2PAY.SYS.DDF01".getBytes(Charsets.US_ASCII);
        FCI_PAYPASS = createResponseApdu(Aid.MASTERCARD_AID_PREFIX_CREDIT_OR_DEBIT.array(), "MasterCard");
    }
}
