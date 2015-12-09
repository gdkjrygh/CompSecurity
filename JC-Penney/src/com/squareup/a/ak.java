// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.squareup.a:
//            al, bd, n, ad, 
//            p, c, z, ah, 
//            r, an, am, a, 
//            ax, bm, q, as, 
//            ba, d, ap, k, 
//            be, af, aq

public class ak
{

    static final Handler a = new al(Looper.getMainLooper());
    static volatile ak b = null;
    final Context c;
    final r d;
    final k e;
    final be f;
    final Map g = new WeakHashMap();
    final Map h = new WeakHashMap();
    final ReferenceQueue i = new ReferenceQueue();
    final android.graphics.Bitmap.Config j;
    boolean k;
    volatile boolean l;
    boolean m;
    private final ap n;
    private final as o;
    private final an p;
    private final List q;

    ak(Context context, r r1, k k1, ap ap1, as as1, List list, be be1, 
            android.graphics.Bitmap.Config config, boolean flag, boolean flag1)
    {
        c = context;
        d = r1;
        e = k1;
        n = ap1;
        o = as1;
        j = config;
        int i1;
        if (list != null)
        {
            i1 = list.size();
        } else
        {
            i1 = 0;
        }
        k1 = new ArrayList(i1 + 7);
        k1.add(new bd(context));
        if (list != null)
        {
            k1.addAll(list);
        }
        k1.add(new n(context));
        k1.add(new ad(context));
        k1.add(new p(context));
        k1.add(new c(context));
        k1.add(new z(context));
        k1.add(new ah(r1.d, be1));
        q = Collections.unmodifiableList(k1);
        f = be1;
        k = flag;
        l = flag1;
        p = new an(i, a);
        p.start();
    }

    public static ak a(Context context)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/squareup/a/ak;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = (new am(context)).a();
        }
        com/squareup/a/ak;
        JVM INSTR monitorexit ;
_L2:
        return b;
        context;
        com/squareup/a/ak;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void a(Bitmap bitmap, aq aq1, a a1)
    {
        if (!a1.f()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!a1.g())
        {
            g.remove(a1.d());
        }
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (aq1 == null)
        {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        a1.a(bitmap, aq1);
        if (l)
        {
            bm.a("Main", "completed", a1.b.a(), (new StringBuilder()).append("from ").append(aq1).toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        a1.a();
        if (l)
        {
            bm.a("Main", "errored", a1.b.a());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void a(ak ak1, Object obj)
    {
        ak1.a(obj);
    }

    private void a(Object obj)
    {
        bm.a();
        a a1 = (a)g.remove(obj);
        if (a1 != null)
        {
            a1.b();
            d.b(a1);
        }
        if (obj instanceof ImageView)
        {
            obj = (ImageView)obj;
            obj = (q)h.remove(obj);
            if (obj != null)
            {
                ((q) (obj)).a();
            }
        }
    }

    ax a(ax ax1)
    {
        ax ax2 = o.a(ax1);
        if (ax2 == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Request transformer ").append(o.getClass().getCanonicalName()).append(" returned null for ").append(ax1).toString());
        } else
        {
            return ax2;
        }
    }

    public ba a(int i1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Resource ID must not be zero.");
        } else
        {
            return new ba(this, null, i1);
        }
    }

    public ba a(Uri uri)
    {
        return new ba(this, uri, 0);
    }

    public ba a(String s)
    {
        if (s == null)
        {
            return new ba(this, null, 0);
        }
        if (s.trim().length() == 0)
        {
            throw new IllegalArgumentException("Path must not be empty.");
        } else
        {
            return a(Uri.parse(s));
        }
    }

    List a()
    {
        return q;
    }

    public void a(ImageView imageview)
    {
        a(imageview);
    }

    void a(ImageView imageview, q q1)
    {
        h.put(imageview, q1);
    }

    void a(a a1)
    {
        Object obj = a1.d();
        if (obj != null && g.get(obj) != a1)
        {
            a(obj);
            g.put(obj, a1);
        }
        b(a1);
    }

    void a(d d1)
    {
        boolean flag2 = true;
        a a1 = d1.i();
        List list = d1.k();
        boolean flag;
        boolean flag1;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (a1 == null)
        {
            if (flag)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            Uri uri = d1.h().d;
            Exception exception = d1.l();
            Bitmap bitmap = d1.e();
            d1 = d1.m();
            if (a1 != null)
            {
                a(bitmap, ((aq) (d1)), a1);
            }
            if (flag)
            {
                int j1 = list.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    a(bitmap, ((aq) (d1)), (a)list.get(i1));
                }

            }
            if (n != null && exception != null)
            {
                n.a(this, uri, exception);
                return;
            }
        }
    }

    Bitmap b(String s)
    {
        s = e.a(s);
        if (s != null)
        {
            f.a();
            return s;
        } else
        {
            f.b();
            return s;
        }
    }

    void b(a a1)
    {
        d.a(a1);
    }

    void c(a a1)
    {
        Bitmap bitmap = null;
        if (af.a(a1.e))
        {
            bitmap = b(a1.e());
        }
        if (bitmap != null)
        {
            a(bitmap, aq.a, a1);
            if (l)
            {
                bm.a("Main", "completed", a1.b.a(), (new StringBuilder()).append("from ").append(aq.a).toString());
            }
        } else
        {
            a(a1);
            if (l)
            {
                bm.a("Main", "resumed", a1.b.a());
                return;
            }
        }
    }

}
