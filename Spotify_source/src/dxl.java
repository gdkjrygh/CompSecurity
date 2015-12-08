// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.music.spotlets.tracking.Tracking;

final class dxl
{

    final ghm a = (ghm)dmz.a(ghm);
    final Context b;
    final Intent c;
    final SparseArray d = new SparseArray();
    int e;

    dxl(Context context, Intent intent)
    {
        dmz.a(fop);
        dmz.a(for);
        b = context;
        new foq();
        c = intent;
        d.put(1, com.spotify.music.spotlets.tracking.Tracking.SourceType.b);
        d.put(0, com.spotify.music.spotlets.tracking.Tracking.SourceType.a);
    }

    static void a(ClientEvent clientevent, int i)
    {
        switch (i)
        {
        default:
            Assertion.a((new StringBuilder("unsupported account type: ")).append(i).toString());
            return;

        case 1: // '\001'
            clientevent.a("account-type", "facebook");
            return;

        case 0: // '\0'
            clientevent.a("account-type", "spotify");
            return;

        case -1: 
            clientevent.a("account-type", "unknown");
            return;
        }
    }

    final void a(int i)
    {
        e = i;
        com.spotify.music.spotlets.tracking.Tracking.SourceType sourcetype = (com.spotify.music.spotlets.tracking.Tracking.SourceType)d.get(i);
        if (sourcetype != null)
        {
            ((Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking)).a(sourcetype);
        }
    }

    final void a(String s, String s1)
    {
        geh.a(s, "referralCode must be set");
        ContentValues contentvalues = new ContentValues();
        if (s1 != null && !s1.isEmpty())
        {
            contentvalues.put("created_by_partner", s1);
        }
        contentvalues.put("referral", s);
        b.getContentResolver().update(dtx.a, contentvalues, null, null);
    }

    // Unreferenced inner class dxl$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private dxl a;

        public final void run()
        {
            String as[] = foq.a(a.b);
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                foq.a(a.b, com.spotify.mobile.android.model.TermsAndConditionsFactory.Decision.a, "popup hard gate", s);
            }

        }

            
            {
                a = dxl.this;
                super();
            }
    }

}
