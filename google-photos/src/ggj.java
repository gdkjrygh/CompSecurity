// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.nfc.NfcEvent;
import java.util.List;

final class ggj
    implements android.nfc.NfcAdapter.CreateBeamUrisCallback
{

    private ggi a;

    ggj(ggi ggi1)
    {
        a = ggi1;
        super();
    }

    public final Uri[] createBeamUris(NfcEvent nfcevent)
    {
        nfcevent = a;
        if (((ggi) (nfcevent)).b != null && ((ggi) (nfcevent)).b.b() != null)
        {
            nfcevent = (ggk)((ggi) (nfcevent)).b.ai_().a(ggk);
        } else
        {
            nfcevent = ((ggi) (nfcevent)).c;
        }
        if (nfcevent == null)
        {
            return null;
        } else
        {
            nfcevent = nfcevent.a();
            a.a.a("com.android.bluetooth", nfcevent);
            return (Uri[])nfcevent.toArray(new Uri[nfcevent.size()]);
        }
    }
}
