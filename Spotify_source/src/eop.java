// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.ArrayList;
import java.util.List;

public final class eop
{

    public static final gip a = gip.b("albums_show_only_offlined_content");
    public static final gip b = gip.b("artists_show_only_offlined_content");
    public static final gip c = gip.b("tracks_show_only_offlined_content");
    public static final gip d = gip.b("playlists_show_only_offlined_content");
    public final List e = new ArrayList();
    public eoq f;
    private final gdk g;
    private final Verified h;
    private final String i;
    private final gin j;
    private final gip k;
    private final Context l;
    private final boolean m;
    private BroadcastReceiver n;
    private gdl o;

    public eop(Context context, Verified verified, String s, boolean flag, gin gin1, gip gip1)
    {
        n = new BroadcastReceiver() {

            private eop a;

            public final void onReceive(Context context1, Intent intent)
            {
                eop.c(a).a = eop.b(a).a(eop.a(a), false);
                if (eop.d(a) != null)
                {
                    eop.d(a).a();
                }
            }

            
            {
                a = eop.this;
                super();
            }
        };
        o = new gdl() {

            private eop a;

            public final void a(Context context1, gdk gdk1)
            {
                eop.b(a).b().a(eop.a(a), gdk1.a).b();
                if (gdk1.a)
                {
                    gdk1 = com.spotify.mobile.android.util.ClientEvent.SubEvent.bK;
                    dmz.a(ggc);
                    ggc.a(context1, 0x7f08056f, 0, new Object[0]);
                } else
                {
                    gdk1 = com.spotify.mobile.android.util.ClientEvent.SubEvent.bL;
                    dmz.a(ggc);
                    ggc.a(context1, 0x7f08056e, 0, new Object[0]);
                }
                dmz.a(fop);
                fop.a(context1, eop.e(a), ClientEventFactory.a(eop.f(a), gdk1, null, null));
                if (eop.d(a) != null)
                {
                    eop.d(a).a();
                }
            }

            
            {
                a = eop.this;
                super();
            }
        };
        g = new gdk(o, 0x7f0802cc);
        m = flag;
        if (flag)
        {
            e.add(g);
        }
        l = context;
        h = verified;
        i = s;
        j = gin1;
        k = gip1;
        g.a = j.a(gip1, false);
        context.registerReceiver(n, new IntentFilter("com.spotify.mobile.android.spotlets.collection.util.OFFLINE_MODE_CHANGED"));
    }

    static gip a(eop eop1)
    {
        return eop1.k;
    }

    public static void a(Context context, boolean flag)
    {
        ((giq)dmz.a(giq)).b(context).b().a(a, flag).a(b, flag).a(c, flag).a(d, flag).b();
        context.sendBroadcast(new Intent("com.spotify.mobile.android.spotlets.collection.util.OFFLINE_MODE_CHANGED"));
    }

    static gin b(eop eop1)
    {
        return eop1.j;
    }

    static gdk c(eop eop1)
    {
        return eop1.g;
    }

    static eoq d(eop eop1)
    {
        return eop1.f;
    }

    static Verified e(eop eop1)
    {
        return eop1.h;
    }

    static String f(eop eop1)
    {
        return eop1.i;
    }

    public final void a()
    {
        l.unregisterReceiver(n);
    }

    public final void a(Context context)
    {
        j.b().a(k, false).b();
        g.a = false;
        dmz.a(fop);
        fop.a(context, h, ClientEventFactory.a(i, com.spotify.mobile.android.util.ClientEvent.SubEvent.bL, null, null));
        if (f != null)
        {
            f.a();
        }
    }

    public final void a(gdk gdk1)
    {
        e.add(gdk1);
    }

    public final boolean b()
    {
        return m && g.a;
    }

}
