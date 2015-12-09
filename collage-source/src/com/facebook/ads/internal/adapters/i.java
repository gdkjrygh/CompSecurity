// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dto.d;
import com.facebook.ads.internal.util.b;
import com.facebook.ads.internal.util.c;
import com.facebook.ads.internal.util.f;
import com.facebook.ads.internal.util.h;
import com.facebook.ads.internal.view.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            BannerAdapter, l, BannerAdapterListener, m, 
//            k, c

public class i extends BannerAdapter
{

    private static final String a = com/facebook/ads/internal/adapters/i.getSimpleName();
    private a b;
    private m c;
    private BannerAdapterListener d;
    private Map e;
    private k f;
    private Context g;
    private long h;
    private com.facebook.ads.internal.util.b.a i;

    public i()
    {
    }

    static long a(i j, long l1)
    {
        j.h = l1;
        return l1;
    }

    static BannerAdapterListener a(i j)
    {
        return j.d;
    }

    static com.facebook.ads.internal.util.b.a a(i j, com.facebook.ads.internal.util.b.a a1)
    {
        j.i = a1;
        return a1;
    }

    static String a()
    {
        return a;
    }

    private void a(d d1)
    {
        h = 0L;
        i = null;
        l l1 = com.facebook.ads.internal.adapters.l.a((JSONObject)e.get("data"));
        if (com.facebook.ads.internal.util.f.a(g, l1))
        {
            d.onBannerError(this, AdError.NO_FILL);
        } else
        {
            b = new a(g, new com.facebook.ads.internal.view.a.a(l1) {

                final l a;
                final i b;

                public void a()
                {
                    com.facebook.ads.internal.adapters.i.c(b).c();
                }

                public void a(int j)
                {
                    if (j == 0 && com.facebook.ads.internal.adapters.i.d(b) > 0L && i.e(b) != null)
                    {
                        com.facebook.ads.internal.util.c.a(com.facebook.ads.internal.util.b.a(com.facebook.ads.internal.adapters.i.d(b), i.e(b), a.i()));
                        com.facebook.ads.internal.adapters.i.a(b, 0L);
                        com.facebook.ads.internal.adapters.i.a(b, null);
                    }
                }

                public void a(String s)
                {
                    if (com.facebook.ads.internal.adapters.i.a(b) != null)
                    {
                        com.facebook.ads.internal.adapters.i.a(b).onBannerAdClicked(b);
                    }
                    s = Uri.parse(s);
                    s = com.facebook.ads.internal.action.b.a(com.facebook.ads.internal.adapters.i.b(b), s);
                    if (s == null)
                    {
                        break MISSING_BLOCK_LABEL_74;
                    }
                    com.facebook.ads.internal.adapters.i.a(b, s.a());
                    com.facebook.ads.internal.adapters.i.a(b, System.currentTimeMillis());
                    s.b();
                    return;
                    s;
                    Log.e(com.facebook.ads.internal.adapters.i.a(), "Error executing action", s);
                    return;
                }

                public void b()
                {
                    b.onViewableImpression();
                }

            
            {
                b = i.this;
                a = l1;
                super();
            }
            }, d1.e());
            b.a(d1.f(), d1.g());
            c = new m(g, b, new com.facebook.ads.internal.adapters.c() {

                final i a;

                public void d()
                {
                    if (com.facebook.ads.internal.adapters.i.a(a) != null)
                    {
                        com.facebook.ads.internal.adapters.i.a(a).onBannerLoggingImpression(a);
                    }
                }

            
            {
                a = i.this;
                super();
            }
            });
            c.a(l1);
            b.loadDataWithBaseURL(com.facebook.ads.internal.util.h.a(), l1.d(), "text/html", "utf-8", null);
            if (d != null)
            {
                d.onBannerAdLoaded(this, b);
                return;
            }
        }
    }

    static Context b(i j)
    {
        return j.g;
    }

    static m c(i j)
    {
        return j.c;
    }

    static long d(i j)
    {
        return j.h;
    }

    static com.facebook.ads.internal.util.b.a e(i j)
    {
        return j.i;
    }

    public void loadBannerAd(Context context, AdSize adsize, BannerAdapterListener banneradapterlistener, Map map)
    {
        g = context;
        d = banneradapterlistener;
        e = map;
        a((d)map.get("definition"));
    }

    public void onDestroy()
    {
        if (b != null)
        {
            com.facebook.ads.internal.util.h.a(b);
            b.destroy();
            b = null;
        }
        if (f != null)
        {
            f.onDestroy();
            f = null;
        }
    }

    public void onViewableImpression()
    {
        if (c != null)
        {
            c.a();
        } else
        if (f != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("mil", Boolean.valueOf(false));
            f.a(hashmap);
            return;
        }
    }

}
