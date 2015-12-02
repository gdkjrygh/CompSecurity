// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.internal.adapters.k;
import com.facebook.ads.internal.adapters.q;
import com.facebook.ads.internal.adapters.r;
import com.facebook.ads.internal.f.b;
import com.facebook.ads.internal.util.d;
import com.facebook.ads.internal.util.i;

// Referenced classes of package com.facebook.ads.internal.adapters.view:
//            b

public class a
    implements com.facebook.ads.internal.adapters.view.b
{

    private static final String a = com/facebook/ads/internal/adapters/view/a.getSimpleName();
    private b.a b;
    private b c;
    private q d;
    private r e;
    private long f;
    private long g;
    private com.facebook.ads.internal.util.b.a h;

    public a(InterstitialAdActivity interstitialadactivity, b.a a1)
    {
        b = a1;
        f = System.currentTimeMillis();
        c = new b(interstitialadactivity, new com.facebook.ads.internal.f.b.a(interstitialadactivity) {

            final InterstitialAdActivity a;
            final a b;

            public void a()
            {
                com.facebook.ads.internal.adapters.view.a.b(b).a();
            }

            public void a(int j)
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
                    s = com.facebook.ads.internal.a.b.a(a, s);
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
                            Log.e(com.facebook.ads.internal.adapters.view.a.d(), "Error executing action", s);
                        }
                        return;
                    }
                }
            }

            
            {
                b = a.this;
                a = interstitialadactivity;
                super();
            }
        }, 1);
        c.setId(0x186a1);
        c.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        e = new r(interstitialadactivity, c, new k() {

            final a a;

            public void b()
            {
                a.a(a).a("com.facebook.ads.interstitial.impression.logged");
            }

            
            {
                a = a.this;
                super();
            }
        });
        e.c();
        a1.a(c);
    }

    static long a(a a1, long l)
    {
        a1.g = l;
        return l;
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

    static r b(a a1)
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
            d = q.a(bundle.getBundle("dataModel"));
            if (d != null)
            {
                c.loadDataWithBaseURL(i.a(), d.d(), "text/html", "utf-8", null);
            }
        } else
        {
            d = q.b(intent);
            if (d != null)
            {
                e.a(d);
                c.loadDataWithBaseURL(i.a(), d.d(), "text/html", "utf-8", null);
                return;
            }
        }
    }

    public void a(Bundle bundle)
    {
        if (d != null)
        {
            bundle.putBundle("dataModel", d.i());
        }
    }

    public void b()
    {
        if (g > 0L && h != null)
        {
            com.facebook.ads.internal.util.d.a(com.facebook.ads.internal.util.b.a(g, h, d.h()));
        }
        if (c != null)
        {
            c.onResume();
        }
    }

    public void c()
    {
        com.facebook.ads.internal.util.d.a(com.facebook.ads.internal.util.b.a(f, com.facebook.ads.internal.util.b.a.c, d.h()));
        if (c != null)
        {
            i.a(c);
            c.destroy();
            c = null;
        }
    }

}
