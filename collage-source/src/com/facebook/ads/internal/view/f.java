// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.internal.action.a;
import com.facebook.ads.internal.adapters.l;
import com.facebook.ads.internal.adapters.m;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.c;
import com.facebook.ads.internal.util.h;

// Referenced classes of package com.facebook.ads.internal.view:
//            h, a

public class f
    implements com.facebook.ads.internal.view.h
{

    private static final String a = com/facebook/ads/internal/view/f.getSimpleName();
    private h.a b;
    private com.facebook.ads.internal.view.a c;
    private l d;
    private m e;
    private long f;
    private long g;
    private com.facebook.ads.internal.util.b.a h;

    public f(InterstitialAdActivity interstitialadactivity, h.a a1)
    {
        b = a1;
        f = System.currentTimeMillis();
        c = new com.facebook.ads.internal.view.a(interstitialadactivity, new a.a(interstitialadactivity) {

            final InterstitialAdActivity a;
            final f b;

            public void a()
            {
                com.facebook.ads.internal.view.f.b(b).c();
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
                    com.facebook.ads.internal.view.f.a(b).a("com.facebook.ads.interstitial.clicked");
                    s = com.facebook.ads.internal.action.b.a(a, s);
                    if (s != null)
                    {
                        try
                        {
                            com.facebook.ads.internal.view.f.a(b, s.a());
                            com.facebook.ads.internal.view.f.a(b, System.currentTimeMillis());
                            s.b();
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            Log.e(f.d(), "Error executing action", s);
                        }
                        return;
                    }
                }
            }

            public void b()
            {
                com.facebook.ads.internal.view.f.b(b).a();
            }

            
            {
                b = f.this;
                a = interstitialadactivity;
                super();
            }
        }, 1);
        c.setId(0x186a1);
        c.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        e = new m(interstitialadactivity, c, new com.facebook.ads.internal.adapters.c() {

            final f a;

            public void d()
            {
                com.facebook.ads.internal.view.f.a(a).a("com.facebook.ads.interstitial.impression.logged");
            }

            
            {
                a = f.this;
                super();
            }
        });
        e.d();
        a1.a(c);
    }

    static long a(f f1, long l1)
    {
        f1.g = l1;
        return l1;
    }

    static com.facebook.ads.internal.util.b.a a(f f1, com.facebook.ads.internal.util.b.a a1)
    {
        f1.h = a1;
        return a1;
    }

    static h.a a(f f1)
    {
        return f1.b;
    }

    static m b(f f1)
    {
        return f1.e;
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

}
