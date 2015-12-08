// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.pandora.android.provider.b;
import com.pandora.radio.data.y;
import p.cw.c;
import p.dd.ay;
import p.dd.bh;
import p.df.a;

public class g
{
    public static class a extends com.pandora.radio.util.b
    {

        private static volatile g a;

        public static g a()
        {
            if (a == null)
            {
                a = new g();
            }
            return a;
        }
    }


    private static final Uri a;
    private static final Uri b = Uri.parse("http://www.pandora.com/station/play/");
    private static final Uri c;
    private static final Uri d = Uri.parse("http://www.pandora.com/");
    private GoogleApiClient e;
    private Action f;
    private Handler g;
    private y h;
    private Runnable i = new Runnable() {

        final g a;

        public void run()
        {
            com.pandora.android.util.g.a(a);
        }

            
            {
                a = g.this;
                super();
            }
    };

    private g()
    {
        android.app.Application application = b.a.h();
        g = new Handler(Looper.getMainLooper());
        e = (new com.google.android.gms.common.api.GoogleApiClient.Builder(application)).addApi(AppIndex.API).build();
        e.connect();
    }


    static void a(g g1)
    {
        g1.g();
    }

    private void a(y y1)
    {
        if (y1 == null)
        {
            return;
        }
        if (h != null && !y1.h().equals(h.h()))
        {
            g.removeCallbacks(i);
            g();
        }
        h = y1;
        f();
    }

    private void c()
    {
        h = null;
        g.removeCallbacks(i);
        g();
    }

    private void d()
    {
        y y1 = b.a.b().d().t();
        if (y1 != null)
        {
            if (h == null || !y1.h().equals(h.h()))
            {
                a(y1);
                return;
            }
            g.removeCallbacks(i);
            if (f == null)
            {
                f();
                return;
            }
        }
    }

    private void e()
    {
        g.removeCallbacks(i);
        g.postDelayed(i, 30000L);
    }

    private void f()
    {
        if (f != null)
        {
            g();
        }
        String s = h.d();
        p.df.a.a("AppIndexManager", (new StringBuilder()).append("Listen action started: ").append(s).toString());
        Uri uri = a.buildUpon().appendQueryParameter("stationId", h.h()).build();
        f = Action.newAction("http://schema.org/ListenAction", s, b.buildUpon().appendPath(h.h()).build(), uri);
        AppIndex.AppIndexApi.start(e, f);
    }

    private void g()
    {
        if (f != null)
        {
            p.df.a.a("AppIndexManager", "Listen action ended.");
            AppIndex.AppIndexApi.end(e, f);
            f = null;
        }
    }

    public void a()
    {
        b.a.b().b(this);
    }

    public void b()
    {
        b.a.b().c(this);
        g.removeCallbacks(i);
        g();
        e.disconnect();
    }

    public void onStationStateChange(ay ay1)
    {
        static class _cls2
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[p.cr.b.a.values().length];
                try
                {
                    c[p.cr.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    c[p.cr.b.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    c[p.cr.b.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                b = new int[p.dd.bh.a.values().length];
                try
                {
                    b[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[p.dd.bh.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.dd.bh.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.dd.bh.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[p.dd.bh.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[p.dd.ay.a.values().length];
                try
                {
                    a[p.dd.ay.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.ay.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.ay.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.ay.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.util._cls2.a[ay1.b.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown station state change type: ").append(ay1.b.name()).toString());

        case 1: // '\001'
        case 2: // '\002'
            a(ay1.a);
            // fall through

        case 3: // '\003'
            return;

        case 4: // '\004'
            c();
            break;
        }
    }

    public void onTrackState(bh bh1)
    {
        switch (com.pandora.android.util._cls2.b[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 1: // '\001'
        case 2: // '\002'
            d();
            // fall through

        case 3: // '\003'
            return;

        case 4: // '\004'
        case 5: // '\005'
            e();
            break;
        }
    }

    static 
    {
        a = Uri.parse((new StringBuilder()).append("android-app://com.pandora.android/").append(p.cr.k.b.d).append("/createStation").toString());
        c = Uri.parse((new StringBuilder()).append("android-app://com.pandora.android/").append(p.cr.k.b.d).append("/backstage/").toString());
    }
}
