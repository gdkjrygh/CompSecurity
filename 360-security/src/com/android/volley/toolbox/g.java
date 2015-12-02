// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            h

public class g
{
    private class a
    {

        final g a;
        private final Request b;
        private Bitmap c;
        private VolleyError d;
        private final LinkedList e = new LinkedList();

        static LinkedList a(a a1)
        {
            return a1.e;
        }

        static void a(a a1, Bitmap bitmap)
        {
            a1.c = bitmap;
        }

        static Bitmap b(a a1)
        {
            return a1.c;
        }

        public VolleyError a()
        {
            return d;
        }

        public void a(VolleyError volleyerror)
        {
            d = volleyerror;
        }

        public void a(c c1)
        {
            e.add(c1);
        }

        public boolean b(c c1)
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

        public a(Request request, c c1)
        {
            a = g.this;
            super();
            b = request;
            e.add(c1);
        }
    }

    public static interface b
    {

        public abstract Bitmap a(String s);

        public abstract void a(String s, Bitmap bitmap);
    }

    public class c
    {

        final g a;
        private Bitmap b;
        private final d c;
        private final String d;
        private final String e;

        static d a(c c1)
        {
            return c1.c;
        }

        static void a(c c1, Bitmap bitmap)
        {
            c1.b = bitmap;
        }

        public void a()
        {
            if (c != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            a a1 = (a)g.a(a).get(d);
            if (a1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (a1.b(this))
            {
                g.a(a).remove(d);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            a a2 = (a)g.b(a).get(d);
            if (a2 != null)
            {
                a2.b(this);
                if (a.a(a2).size() == 0)
                {
                    g.b(a).remove(d);
                    return;
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public Bitmap b()
        {
            return b;
        }

        public String c()
        {
            return e;
        }

        public c(Bitmap bitmap, String s, String s1, d d1)
        {
            a = g.this;
            super();
            b = bitmap;
            e = s;
            d = s1;
            c = d1;
        }
    }

    public static interface d
        extends com.android.volley.k.a
    {

        public abstract void a(c c1, boolean flag);
    }


    private final j a;
    private int b;
    private final b c;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();
    private final Handler f = new Handler(Looper.getMainLooper());
    private Runnable g;

    public g(j j1, b b1)
    {
        b = 100;
        a = j1;
        c = b1;
    }

    static HashMap a(g g1)
    {
        return g1.d;
    }

    private void a()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        } else
        {
            return;
        }
    }

    static void a(g g1, Runnable runnable)
    {
        g1.g = runnable;
    }

    static void a(g g1, String s, Bitmap bitmap)
    {
        g1.a(s, bitmap);
    }

    static void a(g g1, String s, VolleyError volleyerror)
    {
        g1.a(s, volleyerror);
    }

    private void a(String s, Bitmap bitmap)
    {
        c.a(s, bitmap);
        a a1 = (a)d.remove(s);
        if (a1 != null)
        {
            a.a(a1, bitmap);
            a(s, a1);
        }
    }

    private void a(String s, VolleyError volleyerror)
    {
        a a1 = (a)d.remove(s);
        if (a1 != null)
        {
            a1.a(volleyerror);
            a(s, a1);
        }
    }

    private void a(String s, a a1)
    {
        e.put(s, a1);
        if (g == null)
        {
            g = new Runnable() {

                final g a;

                public void run()
                {
                    Iterator iterator = g.b(a).values().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            g.b(a).clear();
                            g.a(a, null);
                            return;
                        }
                        a a2 = (a)iterator.next();
                        Iterator iterator1 = a.a(a2).iterator();
                        while (iterator1.hasNext()) 
                        {
                            c c1 = (c)iterator1.next();
                            if (c.a(c1) != null)
                            {
                                if (a2.a() == null)
                                {
                                    c.a(c1, a.b(a2));
                                    c.a(c1).a(c1, false);
                                } else
                                {
                                    c.a(c1).a(a2.a());
                                }
                            }
                        }
                    } while (true);
                }

            
            {
                a = g.this;
                super();
            }
            };
            f.postDelayed(g, b);
        }
    }

    private static String b(String s, int i, int k)
    {
        return (new StringBuilder(s.length() + 12)).append("#W").append(i).append("#H").append(k).append(s).toString();
    }

    static HashMap b(g g1)
    {
        return g1.e;
    }

    public c a(String s, d d1)
    {
        return a(s, d1, 0, 0);
    }

    public c a(String s, d d1, int i, int k)
    {
        a();
        String s1 = b(s, i, k);
        Object obj = c.a(s1);
        if (obj != null)
        {
            s = new c(((Bitmap) (obj)), s, null, null);
            d1.a(s, true);
            return s;
        }
        obj = new c(null, s, s1, d1);
        d1.a(((c) (obj)), true);
        d1 = (a)d.get(s1);
        if (d1 != null)
        {
            d1.a(((c) (obj)));
            return ((c) (obj));
        } else
        {
            s = new h(s, new com.android.volley.k.b(s1) {

                final g a;
                private final String b;

                public void a(Bitmap bitmap)
                {
                    g.a(a, b, bitmap);
                }

                public volatile void a(Object obj1)
                {
                    a((Bitmap)obj1);
                }

            
            {
                a = g.this;
                b = s;
                super();
            }
            }, i, k, android.graphics.Bitmap.Config.RGB_565, new com.android.volley.k.a(s1) {

                final g a;
                private final String b;

                public void a(VolleyError volleyerror)
                {
                    g.a(a, b, volleyerror);
                }

            
            {
                a = g.this;
                b = s;
                super();
            }
            });
            a.a(s);
            d.put(s1, new a(s, ((c) (obj))));
            return ((c) (obj));
        }
    }

    public boolean a(String s, int i, int k)
    {
        a();
        s = b(s, i, k);
        return c.a(s) != null;
    }
}
