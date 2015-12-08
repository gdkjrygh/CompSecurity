// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;

public class ghc
    implements dmx
{

    public NfcAdapter a;

    public ghc(Context context)
    {
        a = NfcAdapter.getDefaultAdapter(context);
    }

    // Unreferenced inner class ghc$1

/* anonymous class */
    public final class _cls1
        implements android.nfc.NfcAdapter.CreateNdefMessageCallback
    {

        private ghd a;
        private Activity b;

        public final NdefMessage createNdefMessage(NfcEvent nfcevent)
        {
            nfcevent = a.a();
            if (nfcevent == null)
            {
                return null;
            } else
            {
                return new NdefMessage(new NdefRecord[] {
                    NdefRecord.createUri(nfcevent), NdefRecord.createApplicationRecord(b.getApplication().getApplicationInfo().packageName)
                });
            }
        }

            public 
            {
                a = ghd1;
                b = activity;
                super();
            }
    }

}
