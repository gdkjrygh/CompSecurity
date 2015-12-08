// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters.view;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.internal.adapters.l;
import com.facebook.ads.internal.adapters.m;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.c;
import com.facebook.ads.internal.util.h;

// Referenced classes of package com.facebook.ads.internal.adapters.view:
//            b

public class a
    implements com.facebook.ads.internal.adapters.view.b
{

    private static final String a = com/facebook/ads/internal/adapters/view/a.getSimpleName();
    private b.a b;
    private com.facebook.ads.internal.view.a c;
    private l d;
    private m e;
    private long f;
    private long g;
    private com.facebook.ads.internal.util.b.a h;

    public a(InterstitialAdActivity interstitialadactivity, b.a a1)
    {
        b = a1;
        f = System.currentTimeMillis();
        c = new com.facebook.ads.internal.view.a(interstitialadactivity, new _cls1(interstitialadactivity), 1);
        c.setId(0x186a1);
        c.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        e = new m(interstitialadactivity, c, new _cls2());
        e.d();
        a1.a(c);
    }

    static long a(a a1, long l1)
    {
        a1.g = l1;
        return l1;
    }

    static b.a a(a a1)
    {
        return a1.b;
    }

    static com.facebook.ads.internal.util.b.a a(a a1, com.facebook.ads.internal.util.b.a a2)
    {
        a1.h = a2;
        return a2;
    }

    static m b(a a1)
    {
        return a1.e;
    }

    static String d()
    {
        return a;
    }

    public void a()
    {
        if (c != null)
        {
            c.onPause();
        }
    }

    public void a(Intent intent, Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("dataModel"))
        {
            d = l.a(bundle.getBundle("dataModel"));
            if (d != null)
            {
                c.loadDataWithBaseURL(com.facebook.ads.internal.util.h.a(), d.d(), "text/html", "utf-8", null);
                c.a(d.j(), d.k());
            }
        } else
        {
            d = l.b(intent);
            if (d != null)
            {
                e.a(d);
                c.loadDataWithBaseURL(com.facebook.ads.internal.util.h.a(), d.d(), "text/html", "utf-8", null);
                c.a(d.j(), d.k());
                return;
            }
        }
    }

    public void a(Bundle bundle)
    {
        if (d != null)
        {
            bundle.putBundle("dataModel", d.l());
        }
    }

    public void b()
    {
        if (g > 0L && h != null && d != null)
        {
            com.facebook.ads.internal.util.c.a(com.facebook.ads.internal.util.b.a(g, h, d.i()));
        }
        if (c != null)
        {
            c.onResume();
        }
    }

    public void c()
    {
        if (d != null)
        {
            com.facebook.ads.internal.util.c.a(com.facebook.ads.internal.util.b.a(f, com.facebook.ads.internal.util.b.a.c, d.i()));
        }
        if (c != null)
        {
            com.facebook.ads.internal.util.h.a(c);
            c.destroy();
            c = null;
        }
    }


    private class _cls1
        implements com.facebook.ads.internal.view.a
    {

        final InterstitialAdActivity a;
        final a b;

        public void a()
        {
            com.facebook.ads.internal.adapters.view.a.b(b).c();
        }

        public void a(int i)
        {
        }

        public void a(String s)
        {
            s = Uri.parse(s);
            if ("fbad".equals(s.getScheme()) && "close".equals(s.getAuthority()))
            {
                a.finish();
            } else
            {
                a.a(b).a("com.facebook.ads.interstitial.clicked");
                s = com.facebook.ads.internal.action.b.a(a, s);
                if (s != null)
                {
                    try
                    {
                        a.a(b, s.a());
                        a.a(b, System.currentTimeMillis());
                        s.b();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        Log.e(a.d(), "Error executing action", s);
                    }
                    return;
                }
            }
        }

        public void b()
        {
            com.facebook.ads.internal.adapters.view.a.b(b).a();
        }

        _cls1(InterstitialAdActivity interstitialadactivity)
        {
            b = a.this;
            a = interstitialadactivity;
            super();
        }
    }


    private class _cls2 extends com.facebook.ads.internal.adapters.c
    {

        final a a;

        public void d()
        {
            a.a(a).a("com.facebook.ads.interstitial.impression.logged");
        }

        _cls2()
        {
            a = a.this;
            super();
        }
    }

}
