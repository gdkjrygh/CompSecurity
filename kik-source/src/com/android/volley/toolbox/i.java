// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.w;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            l, m, j, k

public final class i
{
    protected final class a
    {

        final i a;
        private final n b;
        private Bitmap c;
        private w d;
        private final LinkedList e = new LinkedList();

        static Bitmap a(a a1, Bitmap bitmap)
        {
            a1.c = bitmap;
            return bitmap;
        }

        static LinkedList a(a a1)
        {
            return a1.e;
        }

        static Bitmap b(a a1)
        {
            return a1.c;
        }

        public final w a()
        {
            return d;
        }

        public final void a(c c1)
        {
            e.add(c1);
        }

        public final void a(w w)
        {
            d = w;
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
            a = i.this;
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

        final i a;
        private Bitmap b;
        private final d c;
        private final String d;
        private final String e;

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
            a a1 = (a)a.c.get(d);
            if (a1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (a1.b(this))
            {
                a.c.remove(d);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            a a2 = (a)i.a(a).get(d);
            if (a2 != null)
            {
                a2.b(this);
                if (a.a(a2).size() == 0)
                {
                    i.a(a).remove(d);
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

        public final String c()
        {
            return e;
        }

        public c(Bitmap bitmap, String s, String s1, d d1)
        {
            a = i.this;
            super();
            b = bitmap;
            e = s;
            d = s1;
            c = d1;
        }
    }

    public static interface d
        extends com.android.volley.r.a
    {

        public abstract void a(c c1, boolean flag);
    }


    protected final p a;
    protected final b b;
    protected final HashMap c;
    private int d;
    private final HashMap e;
    private final Handler f;
    private Runnable g;

    static HashMap a(i i1)
    {
        return i1.e;
    }

    private void a(String s, a a1)
    {
        e.put(s, a1);
        if (g == null)
        {
            g = new l(this);
            f.postDelayed(g, d);
        }
    }

    static Runnable b(i i1)
    {
        i1.g = null;
        return null;
    }

    public final c a(String s, d d1, int i1, int j1)
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
        String s1 = (new StringBuilder(s.length() + 12)).append("#W").append(i1).append("#H").append(j1).append(s).toString();
        Object obj = b.a(s1);
        if (obj != null)
        {
            s = new c(((Bitmap) (obj)), s, null, null);
            d1.a(s, true);
            return s;
        }
        obj = new c(null, s, s1, d1);
        d1.a(((c) (obj)), true);
        d1 = (a)c.get(s1);
        if (d1 != null)
        {
            d1.a(((c) (obj)));
            return ((c) (obj));
        } else
        {
            s = new m(s, new j(this, s1), i1, j1, android.graphics.Bitmap.Config.RGB_565, new k(this, s1));
            a.a(s);
            c.put(s1, new a(s, ((c) (obj))));
            return ((c) (obj));
        }
    }

    protected final void a(String s, Bitmap bitmap)
    {
        b.a(s, bitmap);
        a a1 = (a)c.remove(s);
        if (a1 != null)
        {
            a.a(a1, bitmap);
            a(s, a1);
        }
    }

    protected final void a(String s, w w)
    {
        a a1 = (a)c.remove(s);
        a1.a(w);
        if (a1 != null)
        {
            a(s, a1);
        }
    }
}
