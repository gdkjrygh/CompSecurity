// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.facebook.ads.AdSize;
import com.facebook.ads.e;
import com.facebook.ads.internal.adapters.f;
import com.facebook.ads.internal.adapters.m;
import com.facebook.ads.internal.adapters.u;
import com.facebook.ads.internal.adapters.v;
import com.facebook.ads.internal.b.a;
import com.facebook.ads.internal.d.b;
import com.facebook.ads.internal.d.c;
import com.facebook.ads.internal.d.d;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.util.t;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal:
//            AdErrorType, a, b, e, 
//            c

public class h extends a
    implements com.facebook.ads.internal.server.a.a
{

    private static final String b = com/facebook/ads/internal/h.getSimpleName();
    private final Context c;
    private final String d;
    private final com.facebook.ads.internal.server.a e = new com.facebook.ads.internal.server.a();
    private final Handler f = new Handler();
    private final Runnable g = new Runnable() {

        final h a;

        public void run()
        {
            com.facebook.ads.internal.h.a(a, false);
            com.facebook.ads.internal.h.a(a);
        }

            
            {
                a = h.this;
                super();
            }
    };
    private final Runnable h = new Runnable() {

        final h a;

        public void run()
        {
            com.facebook.ads.internal.h.b(a);
        }

            
            {
                a = h.this;
                super();
            }
    };
    private volatile boolean i;
    private boolean j;
    private volatile boolean k;
    private com.facebook.ads.internal.adapters.a l;
    private View m;
    private b n;
    private d o;
    private com.facebook.ads.internal.e p;
    private com.facebook.ads.internal.c q;
    private AdSize r;
    private int s;

    public h(Context context, String s1, com.facebook.ads.internal.e e1, AdSize adsize, com.facebook.ads.internal.c c1, int i1)
    {
        c = context;
        d = s1;
        p = e1;
        r = adsize;
        q = c1;
        s = i1;
        e.a(this);
    }

    static View a(h h1, View view)
    {
        h1.m = view;
        return view;
    }

    private void a(com.facebook.ads.internal.adapters.a a1)
    {
        if (a1 != null)
        {
            a1.b();
        }
    }

    static void a(h h1)
    {
        h1.g();
    }

    static void a(h h1, com.facebook.ads.internal.adapters.a a1)
    {
        h1.a(a1);
    }

    static boolean a(h h1, boolean flag)
    {
        h1.i = flag;
        return flag;
    }

    static com.facebook.ads.internal.adapters.a b(h h1, com.facebook.ads.internal.adapters.a a1)
    {
        h1.l = a1;
        return a1;
    }

    static void b(h h1)
    {
        h1.i();
    }

    static void c(h h1)
    {
        h1.h();
    }

    static void d(h h1)
    {
        h1.e();
    }

    static Handler e(h h1)
    {
        return h1.f;
    }

    private void e()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("Adapter listener must be called on the main thread.");
        } else
        {
            return;
        }
    }

    static com.facebook.ads.internal.adapters.a f(h h1)
    {
        return h1.l;
    }

    private AdPlacementType f()
    {
        if (r == null)
        {
            return AdPlacementType.NATIVE;
        }
        if (r == AdSize.INTERSTITIAL)
        {
            return AdPlacementType.INTERSTITIAL;
        } else
        {
            return AdPlacementType.BANNER;
        }
    }

    private void g()
    {
        o = new d(c, d, r, p, q, s, com.facebook.ads.e.a(c));
        e.a(c, o);
    }

    static boolean g(h h1)
    {
        return h1.k;
    }

    static com.facebook.ads.internal.a h(h h1)
    {
        return h1.a;
    }

    private void h()
    {
        Object obj3 = n;
        Object obj1 = ((b) (obj3)).b();
        if (obj1 == null)
        {
            a.a(AdErrorType.NO_FILL.getAdErrorWrapper(""));
            i();
            return;
        }
        Object obj = ((com.facebook.ads.internal.d.a) (obj1)).b;
        Object obj2 = com.facebook.ads.internal.adapters.m.a(((String) (obj)), ((b) (obj3)).a().a());
        if (obj2 == null)
        {
            Log.e(b, (new StringBuilder()).append("Adapter does not exist: ").append(((String) (obj))).toString());
            h();
            return;
        }
        if (f() != ((com.facebook.ads.internal.adapters.a) (obj2)).a())
        {
            a.a(AdErrorType.INTERNAL_ERROR.getAdErrorWrapper(""));
            return;
        }
        obj = new HashMap();
        obj3 = ((b) (obj3)).a();
        ((Map) (obj)).put("data", ((com.facebook.ads.internal.d.a) (obj1)).c);
        ((Map) (obj)).put("definition", obj3);
        if (o == null)
        {
            a.a(AdErrorType.UNKNOWN_ERROR.getAdErrorWrapper("environment is empty"));
        }
        static class _cls9
        {

            static final int a[];

            static 
            {
                a = new int[AdPlacementType.values().length];
                try
                {
                    a[AdPlacementType.INTERSTITIAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AdPlacementType.BANNER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AdPlacementType.NATIVE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.facebook.ads.internal._cls9.a[((com.facebook.ads.internal.adapters.a) (obj2)).a().ordinal()])
        {
        default:
            Log.e(b, "attempt unexpected adapter type");
            return;

        case 2: // '\002'
            obj1 = (com.facebook.ads.internal.adapters.b)obj2;
            obj2 = new Runnable(((com.facebook.ads.internal.adapters.b) (obj1))) {

                final com.facebook.ads.internal.adapters.b a;
                final h b;

                public void run()
                {
                    com.facebook.ads.internal.h.a(b, a);
                    com.facebook.ads.internal.h.c(b);
                }

            
            {
                b = h.this;
                a = b1;
                super();
            }
            };
            f.postDelayed(((Runnable) (obj2)), 10000L);
            ((com.facebook.ads.internal.adapters.b) (obj1)).a(c, r, new com.facebook.ads.internal.adapters.c(((Runnable) (obj2))) {

                final Runnable a;
                final h b;

                public void a(com.facebook.ads.internal.adapters.b b1)
                {
                    com.facebook.ads.internal.h.d(b);
                    h.j(b).c();
                }

                public void a(com.facebook.ads.internal.adapters.b b1, View view)
                {
                    com.facebook.ads.internal.h.d(b);
                    com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                    com.facebook.ads.internal.adapters.a a1 = com.facebook.ads.internal.h.f(b);
                    com.facebook.ads.internal.h.b(b, b1);
                    com.facebook.ads.internal.h.a(b, view);
                    if (!h.g(b))
                    {
                        h.h(b).a();
                        return;
                    } else
                    {
                        h.i(b).a(view);
                        com.facebook.ads.internal.h.a(b, a1);
                        com.facebook.ads.internal.h.b(b);
                        return;
                    }
                }

                public void a(com.facebook.ads.internal.adapters.b b1, com.facebook.ads.c c1)
                {
                    com.facebook.ads.internal.h.d(b);
                    com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                    com.facebook.ads.internal.h.a(b, b1);
                    com.facebook.ads.internal.h.c(b);
                }

                public void b(com.facebook.ads.internal.adapters.b b1)
                {
                    com.facebook.ads.internal.h.d(b);
                    h.k(b).b();
                }

            
            {
                b = h.this;
                a = runnable;
                super();
            }
            }, ((Map) (obj)));
            return;

        case 1: // '\001'
            obj1 = (com.facebook.ads.internal.adapters.e)obj2;
            obj2 = new Runnable(((com.facebook.ads.internal.adapters.e) (obj1))) {

                final com.facebook.ads.internal.adapters.e a;
                final h b;

                public void run()
                {
                    com.facebook.ads.internal.h.a(b, a);
                    com.facebook.ads.internal.h.c(b);
                }

            
            {
                b = h.this;
                a = e1;
                super();
            }
            };
            f.postDelayed(((Runnable) (obj2)), 10000L);
            ((com.facebook.ads.internal.adapters.e) (obj1)).a(c, new f(((Runnable) (obj2))) {

                final Runnable a;
                final h b;

                public void a(com.facebook.ads.internal.adapters.e e1)
                {
                    com.facebook.ads.internal.h.d(b);
                    com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                    com.facebook.ads.internal.h.b(b, e1);
                    h.l(b).a();
                    com.facebook.ads.internal.h.b(b);
                }

                public void a(com.facebook.ads.internal.adapters.e e1, com.facebook.ads.c c1)
                {
                    com.facebook.ads.internal.h.d(b);
                    com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                    com.facebook.ads.internal.h.a(b, e1);
                    com.facebook.ads.internal.h.c(b);
                }

                public void a(com.facebook.ads.internal.adapters.e e1, String s1, boolean flag)
                {
                    com.facebook.ads.internal.h.d(b);
                    h.n(b).b();
                    StringBuilder stringbuilder;
                    boolean flag1;
                    if (!t.a(s1))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    stringbuilder = (new StringBuilder()).append("Clickthrough event with playerHandles=").append(flag).append(" and url ");
                    if (flag1)
                    {
                        e1 = "defined";
                    } else
                    {
                        e1 = "not defined";
                    }
                    com.facebook.ads.internal.c.a.b(stringbuilder.append(e1).toString());
                    if (!flag)
                    {
                        com.facebook.ads.internal.c.a.a("Adapter handles click, ignoring click url.");
                    } else
                    if (flag1)
                    {
                        com.facebook.ads.internal.c.a.b((new StringBuilder()).append("Intent url=").append(s1).toString());
                        e1 = new Intent("android.intent.action.VIEW");
                        if (!(h.o(b).f instanceof Activity))
                        {
                            com.facebook.ads.internal.c.a.b("Context is not instance of Activity");
                            e1.addFlags(0x10000000);
                        }
                        e1.setData(Uri.parse(s1));
                        h.o(b).f.startActivity(e1);
                        return;
                    }
                }

                public void b(com.facebook.ads.internal.adapters.e e1)
                {
                    com.facebook.ads.internal.h.d(b);
                    com.facebook.ads.internal.h.m(b).c();
                }

                public void c(com.facebook.ads.internal.adapters.e e1)
                {
                    com.facebook.ads.internal.h.d(b);
                    h.p(b).e();
                }

                public void d(com.facebook.ads.internal.adapters.e e1)
                {
                    com.facebook.ads.internal.h.d(b);
                    h.q(b).d();
                }

            
            {
                b = h.this;
                a = runnable;
                super();
            }
            }, ((Map) (obj)));
            return;

        case 3: // '\003'
            obj1 = (u)obj2;
            break;
        }
        obj2 = new Runnable(((u) (obj1))) {

            final u a;
            final h b;

            public void run()
            {
                com.facebook.ads.internal.h.a(b, a);
                com.facebook.ads.internal.h.c(b);
            }

            
            {
                b = h.this;
                a = u1;
                super();
            }
        };
        f.postDelayed(((Runnable) (obj2)), 10000L);
        ((u) (obj1)).a(c, new v(((Runnable) (obj2))) {

            final Runnable a;
            final h b;

            public void a(u u1)
            {
                com.facebook.ads.internal.h.d(b);
                com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                com.facebook.ads.internal.h.b(b, u1);
                h.r(b).a();
            }

            public void a(u u1, com.facebook.ads.c c1)
            {
                com.facebook.ads.internal.h.d(b);
                com.facebook.ads.internal.h.e(b).removeCallbacks(a);
                com.facebook.ads.internal.h.a(b, u1);
                com.facebook.ads.internal.h.c(b);
            }

            
            {
                b = h.this;
                a = runnable;
                super();
            }
        }, ((Map) (obj)));
    }

    static com.facebook.ads.internal.a i(h h1)
    {
        return h1.a;
    }

    private void i()
    {
        if (!j && !i) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        long l1;
        if ((obj = n) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((b) (obj)).a();
        l1 = ((c) (obj)).b();
        com.facebook.ads.internal._cls9.a[f().ordinal()];
        JVM INSTR tableswitch 1 2: default 68
    //                   1 69
    //                   2 119;
           goto _L3 _L4 _L5
_L3:
        return;
_L4:
        if (!com.facebook.ads.internal.util.h.a(c))
        {
            f.postDelayed(h, 1000L);
        }
_L7:
        if (l1 > 0L)
        {
            f.postDelayed(g, l1);
            i = true;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (m == null || com.facebook.ads.internal.util.h.a(c, m, ((c) (obj)).e())) goto _L7; else goto _L6
_L6:
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L8
_L8:
        f.postDelayed(h, 1000L);
        return;
    }

    static com.facebook.ads.internal.a j(h h1)
    {
        return h1.a;
    }

    private void j()
    {
        if (!i)
        {
            return;
        } else
        {
            f.removeCallbacks(g);
            i = false;
            return;
        }
    }

    static com.facebook.ads.internal.a k(h h1)
    {
        return h1.a;
    }

    static com.facebook.ads.internal.a l(h h1)
    {
        return h1.a;
    }

    static com.facebook.ads.internal.a m(h h1)
    {
        return h1.a;
    }

    static com.facebook.ads.internal.a n(h h1)
    {
        return h1.a;
    }

    static d o(h h1)
    {
        return h1.o;
    }

    static com.facebook.ads.internal.a p(h h1)
    {
        return h1.a;
    }

    static com.facebook.ads.internal.a q(h h1)
    {
        return h1.a;
    }

    static com.facebook.ads.internal.a r(h h1)
    {
        return h1.a;
    }

    public c a()
    {
        if (n == null)
        {
            return null;
        } else
        {
            return n.a();
        }
    }

    public void a(com.facebook.ads.internal.b b1)
    {
        a.a(b1);
        int i1 = b1.().getErrorCode();
        if (!i && (i1 == 1002 || i1 == 1000))
        {
            f.postDelayed(g, 30000L);
            i = true;
        }
    }

    public void a(com.facebook.ads.internal.server.d d1)
    {
        d1 = d1.b();
        if (d1 == null || d1.a() == null)
        {
            throw new IllegalStateException("invalid placement in response");
        } else
        {
            n = d1;
            h();
            return;
        }
    }

    public void b()
    {
        g();
    }

    public void c()
    {
        if (l == null)
        {
            throw new IllegalStateException("no adapter ready to start");
        }
        if (k)
        {
            throw new IllegalStateException("ad already started");
        }
        k = true;
        Object obj = l.a();
        switch (com.facebook.ads.internal._cls9.a[((AdPlacementType) (obj)).ordinal()])
        {
        default:
            Log.e(b, "start unexpected adapter type");
            return;

        case 1: // '\001'
            ((com.facebook.ads.internal.adapters.e)l).c();
            return;

        case 2: // '\002'
            if (m == null)
            {
                throw new IllegalStateException("ad is not ready");
            } else
            {
                a.a(m);
                i();
                return;
            }

        case 3: // '\003'
            obj = (u)l;
            break;
        }
        if (!((u) (obj)).n())
        {
            throw new IllegalStateException("ad is not ready or already displayed");
        } else
        {
            a.a(((u) (obj)));
            return;
        }
    }

    public void d()
    {
        if (!k)
        {
            return;
        } else
        {
            j();
            a(l);
            m = null;
            k = false;
            return;
        }
    }

}
