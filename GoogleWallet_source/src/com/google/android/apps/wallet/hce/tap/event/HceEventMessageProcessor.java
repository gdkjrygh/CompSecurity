// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap.event;

import android.nfc.cardemulation.HostApduService;
import com.google.android.apps.wallet.hce.emv.Applet;
import com.google.android.apps.wallet.hce.iso7816.Aid;
import com.google.android.apps.wallet.hce.iso7816.ResponseApdu;
import com.google.android.apps.wallet.hce.util.Hex;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Shorts;
import java.io.EOFException;
import java.security.GeneralSecurityException;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.hce.tap.event:
//            HceEventWorkerOperation

public class HceEventMessageProcessor
{
    public static interface Listener
    {

        public abstract void onCommandApdu()
            throws GeneralSecurityException;

        public abstract void onHceReset();
    }


    private static final byte SW_FILE_NOT_FOUND[] = Shorts.toByteArray((short)27266);
    private static final byte SW_WRONG_LENGTH[] = Shorts.toByteArray((short)26368);
    private static final String TAG = com/google/android/apps/wallet/hce/tap/event/HceEventMessageProcessor.getSimpleName();
    private Applet currentApplet;
    private Listener listener;
    private Applet paymentApplet;
    private Applet ppseApplet;

    public HceEventMessageProcessor()
    {
    }

    private static boolean checkLc(byte abyte0[], int i)
    {
        int j = abyte0[4] & 0xff;
        return i == j + 5 || i == j + 5 + 1;
    }

    private static boolean checkLe(byte abyte0[], int i)
    {
        return i == (abyte0[4] & 0xff) + 5 || abyte0[i - 1] == 0;
    }

    private void processCommandApdu(byte abyte0[], int i, HostApduService hostapduservice)
        throws EOFException, GeneralSecurityException
    {
        listener.onCommandApdu();
        if (!checkLc(abyte0, i) || !checkLe(abyte0, i))
        {
            hostapduservice.sendResponseApdu(SW_WRONG_LENGTH);
            throw new EOFException("bad APDU");
        }
        if (Ints.fromByteArray(abyte0) == 0xa40400)
        {
            currentApplet = processSelect(abyte0);
        }
        if (currentApplet == null)
        {
            hostapduservice.sendResponseApdu(SW_FILE_NOT_FOUND);
            throw new EOFException("No selection context");
        } else
        {
            hostapduservice.sendResponseApdu(currentApplet.processCommand(abyte0, i).toByteArray());
            return;
        }
    }

    private Applet processSelect(byte abyte0[])
    {
        Aid aid = Aid.valueOf(Arrays.copyOfRange(abyte0, 5, abyte0[4] + 5));
        if (aid.equals(Aid.PPSE_AID))
        {
            WLog.ifmt(TAG, "Selecting PPSE", new Object[0]);
            return ppseApplet;
        }
        if (aid.hasPrefix(Aid.MASTERCARD_AID_PREFIX_CREDIT_OR_DEBIT))
        {
            String s = TAG;
            if (paymentApplet != null)
            {
                abyte0 = "available";
            } else
            {
                abyte0 = "unavailable";
            }
            WLog.ifmt(s, "Selecting PayPass (%s)", new Object[] {
                abyte0
            });
            return paymentApplet;
        } else
        {
            WLog.ifmt(TAG, "Unrecognized AID: apdu=[%s]", new Object[] {
                Hex.encode(abyte0)
            });
            return null;
        }
    }

    final void processOperation(HceEventWorkerOperation hceeventworkeroperation)
        throws EOFException, GeneralSecurityException
    {
        int i = hceeventworkeroperation.getType();
        switch (i)
        {
        default:
            throw new IllegalArgumentException(String.format("Unexpected operaton type: %s", new Object[] {
                Integer.valueOf(i)
            }));

        case 1: // '\001'
            byte abyte0[] = hceeventworkeroperation.getCommandData();
            processCommandApdu(abyte0, abyte0.length, hceeventworkeroperation.getHostApduService());
            return;

        case 2: // '\002'
            reset();
            break;
        }
        throw new EOFException("Deactivated");
    }

    final void reset()
    {
        String s1 = TAG;
        String s;
        if (currentApplet == null)
        {
            s = "null";
        } else
        {
            s = currentApplet.getClass().getSimpleName();
        }
        WLog.dfmt(s1, "reset(). Clearing selection context; last context was %s", new Object[] {
            s
        });
        if (currentApplet != null)
        {
            currentApplet = null;
            listener.onHceReset();
        }
    }

    public final HceEventMessageProcessor setListener(Listener listener1)
    {
        listener = listener1;
        return this;
    }

    public final HceEventMessageProcessor setPaymentApplet(Applet applet)
    {
        paymentApplet = applet;
        return this;
    }

    public final HceEventMessageProcessor setPpseApplet(Applet applet)
    {
        ppseApplet = applet;
        return this;
    }

}
