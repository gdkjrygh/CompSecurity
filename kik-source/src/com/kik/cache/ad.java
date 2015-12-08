// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.b;
import com.android.volley.l;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.w;
import com.kik.g.e;
import com.kik.g.k;
import java.util.HashMap;
import java.util.LinkedList;
import kik.android.util.bx;

// Referenced classes of package com.kik.cache:
//            ae, z, af, ag, 
//            ap, ah

public final class ad
{
    private final class a
    {

        final ad a;
        private final n b;
        private Bitmap c;
        private w d;
        private final LinkedList e = new LinkedList();

        static Bitmap a(a a1, Bitmap bitmap)
        {
            a1.c = bitmap;
            return bitmap;
        }

        static n a(a a1)
        {
            return a1.b;
        }

        static LinkedList b(a a1)
        {
            return a1.e;
        }

        static Bitmap c(a a1)
        {
            return a1.c;
        }

        public final w a()
        {
            return d;
        }

        public final void a(w w)
        {
            d = w;
        }

        public final void a(c c1)
        {
            e.add(c1);
        }

        public final boolean b(c c1)
        {
            e.remove(c1);
            if (e.size() == 0)
            {
                b.g();
                return true;
            } else
            {
                return false;
            }
        }

        public a(n n1, c c1)
        {
            a = ad.this;
            super();
            b = n1;
            e.add(c1);
        }
    }

    public static interface b
    {

        public abstract Bitmap a(String s);

        public abstract void a(String s, Bitmap bitmap);
    }

    public final class c
    {

        final ad a;
        private Bitmap b;
        private final d c;
        private final String d;
        private final String e;
        private final int f;
        private final int g;

        static Bitmap a(c c1, Bitmap bitmap)
        {
            c1.b = bitmap;
            return bitmap;
        }

        static d a(c c1)
        {
            return c1.c;
        }

        public final void a()
        {
            if (c != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            a a1 = (a)com.kik.cache.ad.b(a).get(d);
            if (a1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (a1.b(this))
            {
                com.kik.cache.ad.b(a).remove(d);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            a a2 = (a)ad.c(a).get(d);
            if (a2 != null)
            {
                a2.b(this);
                if (com.kik.cache.a.b(a2).size() == 0)
                {
                    ad.c(a).remove(d);
                    return;
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public final Bitmap b()
        {
            return b;
        }

        public final int c()
        {
            return f;
        }

        public final int d()
        {
            return g;
        }

        public final String e()
        {
            return d;
        }

        public c(Bitmap bitmap, String s, String s1, d d1, int i1, int j1)
        {
            a = ad.this;
            super();
            b = bitmap;
            e = s;
            d = s1;
            c = d1;
            f = i1;
            g = j1;
        }
    }

    public static interface d
        extends com.android.volley.r.a
    {

        public abstract void a(c c1, boolean flag);
    }


    public static final d a = new ae();
    private final p b;
    private final ap c;
    private int d;
    private final b e;
    private final HashMap f = new HashMap();
    private final HashMap g = new HashMap();
    private final Handler h = new Handler(Looper.getMainLooper());
    private Runnable i;
    private k j;

    public ad(p p1, b b1, ap ap1)
    {
        d = 100;
        j = new k(this);
        c = ap1;
        b = p1;
        e = b1;
    }

    private c a(z z1, d d1, int i1, int j1, boolean flag, boolean flag1)
    {
        Object obj;
        String s;
        String s1;
        if (!flag1)
        {
            d();
        }
        s1 = z1.d();
        s = z1.a(i1, j1);
        obj = e.a(s);
        if (obj != null)
        {
            z1 = new c(((Bitmap) (obj)), s1, s, null, i1, j1);
            d1.a(z1, true);
            return z1;
        }
        obj = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj1;
        Bitmap bitmap;
        com.android.volley.b.a a1;
        try
        {
            obj1 = z1.e();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        a1 = b.c().a(((String) (obj1)));
        if (a1 == null) goto _L2; else goto _L4
_L4:
        if (a1.a == null) goto _L2; else goto _L5
_L5:
        bitmap = z1.b(BitmapFactory.decodeByteArray(a1.a, 0, a1.a.length));
        if (bitmap == null) goto _L2; else goto _L6
_L6:
        obj1 = new c(bitmap, s1, s, d1, i1, j1);
        boolean flag2;
        if (!a1.a() && !a1.b())
        {
            flag2 = false;
        } else
        {
            flag2 = true;
        }
        obj = obj1;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        e.a(s, bitmap);
        d1.a(((c) (obj1)), true);
        return ((c) (obj1));
        obj;
        obj = obj1;
_L8:
        if (obj == null)
        {
            obj = new c(null, s1, s, d1, i1, j1);
        }
        d1.a(((c) (obj)), true);
        d1 = (a)f.get(s);
        if (d1 != null)
        {
            d1.a(((c) (obj)));
            return ((c) (obj));
        }
        z1.c = new af(this, s, z1.e());
        z1.b = new ag(this, s, z1);
        if (z1.w())
        {
            b.a(z1);
        } else
        if (c != null)
        {
            c.a(z1);
        } else
        {
            bx.a(new IllegalStateException("attempted to queue offline request to Loader with no offline queue"));
        }
        f.put(s, new a(z1, ((c) (obj))));
        return ((c) (obj));
_L2:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static k a(ad ad1)
    {
        return ad1.j;
    }

    static void a(ad ad1, String s, Bitmap bitmap)
    {
        a a1;
        if (bitmap != null && s != null)
        {
            ad1.e.a(s, bitmap);
        } else
        {
            bx.a(new IllegalArgumentException("attempted to add a null item to our memory cache!"));
        }
        a1 = (a)ad1.f.remove(s);
        if (a1 != null)
        {
            a.a(a1, bitmap);
            ad1.a(s, a1);
        }
    }

    static void a(ad ad1, String s, String s1, w w)
    {
        a a2 = (a)ad1.f.remove(s);
        if (a2 != null)
        {
            if (a.a(a2) != null && (a.a(a2) instanceof z))
            {
                z z1 = (z)a.a(a2);
                if (z1.e_())
                {
                    com.android.volley.b.a a1;
                    if (s1 == null || ad1.b == null || ad1.b.c() == null)
                    {
                        a1 = null;
                    } else
                    {
                        a1 = ad1.b.c().a(s1);
                    }
                    a1 = z1.b(a1);
                    if (!(w instanceof l) && s1 != null && a1 != null)
                    {
                        ad1.b.c().a(s1, a1);
                    }
                }
            }
            a2.a(w);
            ad1.a(s, a2);
        }
    }

    private void a(String s, a a1)
    {
        g.put(s, a1);
        if (i == null)
        {
            i = new ah(this);
            h.postDelayed(i, d);
        }
    }

    static HashMap b(ad ad1)
    {
        return ad1.f;
    }

    static HashMap c(ad ad1)
    {
        return ad1.g;
    }

    static Runnable d(ad ad1)
    {
        ad1.i = null;
        return null;
    }

    private static void d()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        } else
        {
            return;
        }
    }

    public final c a(z z1, d d1)
    {
        return a(z1, d1, 0, 0, false, false);
    }

    public final c a(z z1, d d1, int i1, int j1, boolean flag)
    {
        return a(z1, d1, i1, j1, flag, false);
    }

    public final c a(z z1, d d1, boolean flag)
    {
        return a(z1, d1, 0, 0, flag, true);
    }

    public final e a()
    {
        return j.a();
    }

    public final void a(Bitmap bitmap, z z1)
    {
        z1 = z1.a(0, 0);
        e.a(z1, bitmap);
    }

    public final boolean a(z z1)
    {
        boolean flag = false;
        d();
        z1 = z1.a(0, 0);
        if (e.a(z1) != null)
        {
            flag = true;
        }
        return flag;
    }

    public final void b()
    {
        d = 0;
    }

    public final p c()
    {
        return b;
    }

}
