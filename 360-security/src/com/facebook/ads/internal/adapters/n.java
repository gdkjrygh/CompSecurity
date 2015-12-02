// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.AdSize;
import com.facebook.ads.NativeAd;
import com.facebook.ads.c;
import com.facebook.ads.internal.f.a;
import com.facebook.ads.internal.f.b;
import com.facebook.ads.internal.util.d;
import com.facebook.ads.internal.util.g;
import com.facebook.ads.internal.util.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            b, q, c, r, 
//            p, k, v, u

public class n extends com.facebook.ads.internal.adapters.b
{

    private static final String a = com/facebook/ads/internal/adapters/n.getSimpleName();
    private b b;
    private r c;
    private com.facebook.ads.internal.adapters.c d;
    private Map e;
    private p f;
    private a g;
    private Context h;
    private long i;
    private com.facebook.ads.internal.util.b.a j;

    public n()
    {
    }

    static long a(n n1, long l)
    {
        n1.i = l;
        return l;
    }

    static com.facebook.ads.internal.adapters.c a(n n1)
    {
        return n1.d;
    }

    static a a(n n1, a a1)
    {
        n1.g = a1;
        return a1;
    }

    static com.facebook.ads.internal.util.b.a a(n n1, com.facebook.ads.internal.util.b.a a1)
    {
        n1.j = a1;
        return a1;
    }

    private void a(int k)
    {
        i = 0L;
        j = null;
        q q1 = com.facebook.ads.internal.adapters.q.a((JSONObject)e.get("data"));
        if (com.facebook.ads.internal.util.g.a(h, q1))
        {
            d.a(this, c.b);
        } else
        {
            b = new b(h, new com.facebook.ads.internal.f.b.a(q1) {

                final q a;
                final n b;

                public void a()
                {
                    b.c();
                }

                public void a(int l)
                {
                    if (l == 0 && com.facebook.ads.internal.adapters.n.c(b) > 0L && com.facebook.ads.internal.adapters.n.d(b) != null)
                    {
                        com.facebook.ads.internal.util.d.a(com.facebook.ads.internal.util.b.a(com.facebook.ads.internal.adapters.n.c(b), com.facebook.ads.internal.adapters.n.d(b), a.h()));
                        com.facebook.ads.internal.adapters.n.a(b, 0L);
                        com.facebook.ads.internal.adapters.n.a(b, null);
                    }
                }

                public void a(String s)
                {
                    if (com.facebook.ads.internal.adapters.n.a(b) != null)
                    {
                        com.facebook.ads.internal.adapters.n.a(b).b(b);
                    }
                    s = Uri.parse(s);
                    s = com.facebook.ads.internal.a.b.a(com.facebook.ads.internal.adapters.n.b(b), s);
                    if (s == null)
                    {
                        break MISSING_BLOCK_LABEL_74;
                    }
                    com.facebook.ads.internal.adapters.n.a(b, s.a());
                    com.facebook.ads.internal.adapters.n.a(b, System.currentTimeMillis());
                    s.b();
                    return;
                    s;
                    Log.e(com.facebook.ads.internal.adapters.n.d(), "Error executing action", s);
                    return;
                }

            
            {
                b = n.this;
                a = q1;
                super();
            }
            }, k);
            c = new r(h, b, new k() {

                final n a;

                public void b()
                {
                    if (com.facebook.ads.internal.adapters.n.a(a) != null)
                    {
                        com.facebook.ads.internal.adapters.n.a(a).a(a);
                    }
                }

            
            {
                a = n.this;
                super();
            }
            });
            c.a(q1);
            b.loadDataWithBaseURL(com.facebook.ads.internal.util.i.a(), q1.d(), "text/html", "utf-8", null);
            if (d != null)
            {
                d.a(this, b);
                return;
            }
        }
    }

    static Context b(n n1)
    {
        return n1.h;
    }

    static long c(n n1)
    {
        return n1.i;
    }

    static com.facebook.ads.internal.util.b.a d(n n1)
    {
        return n1.j;
    }

    static String d()
    {
        return a;
    }

    static a e(n n1)
    {
        return n1.g;
    }

    private void e()
    {
        com.facebook.ads.internal.d.c c1 = (com.facebook.ads.internal.d.c)e.get("definition");
        f = new p();
        f.a(h, new v(c1) {

            final com.facebook.ads.internal.d.c a;
            final n b;

            public void a(u u)
            {
                com.facebook.ads.g g1 = new com.facebook.ads.g();
                g1.b(-1);
                g1.c(0xff8bc615);
                g1.a(0xff8bc615);
                com.facebook.ads.internal.adapters.n.a(b, new a(com.facebook.ads.internal.adapters.n.b(b), new NativeAd(com.facebook.ads.internal.adapters.n.b(b), u, a), g1, new com.facebook.ads.internal.f.a.a(this) {

                    final _cls3 a;

                    public void a()
                    {
                        if (com.facebook.ads.internal.adapters.n.a(a.b) != null)
                        {
                            com.facebook.ads.internal.adapters.n.a(a.b).a(a.b, n.e(a.b));
                        }
                    }

            
            {
                a = _pcls3;
                super();
            }
                }));
            }

            public void a(u u, c c2)
            {
                if (com.facebook.ads.internal.adapters.n.a(b) != null)
                {
                    com.facebook.ads.internal.adapters.n.a(b).a(b, c2);
                }
            }

            
            {
                b = n.this;
                a = c1;
                super();
            }
        }, e);
    }

    public void a(Context context, AdSize adsize, com.facebook.ads.internal.adapters.c c1, Map map)
    {
        h = context;
        d = c1;
        e = map;
        if (adsize == AdSize.RECTANGLE_HEIGHT_250)
        {
            e();
            return;
        } else
        {
            a(((com.facebook.ads.internal.d.c)map.get("definition")).e());
            return;
        }
    }

    public void b()
    {
        if (b != null)
        {
            com.facebook.ads.internal.util.i.a(b);
            b.destroy();
            b = null;
        }
        if (g != null)
        {
            g.b();
            g = null;
        }
        if (f != null)
        {
            f.b();
            f = null;
        }
    }

    public void c()
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
