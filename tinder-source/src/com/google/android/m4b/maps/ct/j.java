// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            a, x, m, z, 
//            h, i, e, q, 
//            t, w, c, v, 
//            f, r, k, s, 
//            g

public abstract class j extends com.google.android.m4b.maps.ct.a
    implements Serializable
{
    public static class a extends a.a
    {

        public j a;
        protected boolean b;
        private final j c;

        private a c(com.google.android.m4b.maps.ct.e e1, com.google.android.m4b.maps.ct.h h1)
        {
            e1 = (j)c.g().a(e1, h1);
            if (e1 != null)
            {
                a(e1);
            }
            return this;
            h1;
            e1 = (j)((m) (h1)).a;
            throw h1;
            h1;
_L2:
            if (e1 != null)
            {
                a(e1);
            }
            throw h1;
            h1;
            e1 = null;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public a.a a()
        {
            return c();
        }

        public final a.a a(com.google.android.m4b.maps.ct.e e1, com.google.android.m4b.maps.ct.h h1)
        {
            return c(e1, h1);
        }

        public final a a(j j1)
        {
            b();
            a.a(h.c, j1, null);
            return this;
        }

        public final q.a b(com.google.android.m4b.maps.ct.e e1, com.google.android.m4b.maps.ct.h h1)
        {
            return c(e1, h1);
        }

        public void b()
        {
            if (b)
            {
                j j1 = (j)a.a(h.e, null, null);
                j1.a(h.c, a, null);
                a = j1;
                b = false;
            }
        }

        public a c()
        {
            a a1 = c.i();
            a1.a(d());
            return a1;
        }

        public Object clone()
        {
            return c();
        }

        public j d()
        {
            a.a(h.d, null, null);
            b = true;
            return a;
        }

        public final j e()
        {
            j j1 = d();
            if (!j1.j())
            {
                throw new w();
            } else
            {
                return j1;
            }
        }

        public q f()
        {
            return d();
        }

        public final q g()
        {
            return e();
        }

        public final boolean j()
        {
            return j.a(a);
        }

        public a(j j1)
        {
            c = j1;
            a = (j)j1.a(h.e, null, null);
            b = false;
        }
    }

    public static final class b extends com.google.android.m4b.maps.ct.c
    {

        private j a;

        public final Object a(com.google.android.m4b.maps.ct.e e1, com.google.android.m4b.maps.ct.h h1)
        {
            return j.a(a, e1, h1);
        }

        public b(j j1)
        {
            a = j1;
        }
    }

    public static class c extends a
        implements e
    {

        private d h()
        {
            if (b)
            {
                return (d)a;
            } else
            {
                ((d)a).c.b();
                return (d)super.d();
            }
        }

        public final a.a a()
        {
            return (c)super.c();
        }

        public final void b()
        {
            if (!b)
            {
                return;
            } else
            {
                super.b();
                ((d)a).c = ((d)a).c.c();
                return;
            }
        }

        public final a c()
        {
            return (c)super.c();
        }

        public Object clone()
        {
            return (c)super.c();
        }

        public final j d()
        {
            return h();
        }

        public final q f()
        {
            return h();
        }

        public c(d d1)
        {
            super(d1);
            ((d)a).c = ((d)a).c.c();
        }
    }

    public static abstract class d extends j
        implements e
    {

        public com.google.android.m4b.maps.ct.i c;

        public final void a(d d1)
        {
            if (c.b)
            {
                c = c.c();
            }
            com.google.android.m4b.maps.ct.i i1 = c;
            d1 = d1.c;
            for (int j1 = 0; j1 < ((com.google.android.m4b.maps.ct.i) (d1)).a.b(); j1++)
            {
                i1.b(((com.google.android.m4b.maps.ct.i) (d1)).a.b(j1));
            }

            for (d1 = ((com.google.android.m4b.maps.ct.i) (d1)).a.c().iterator(); d1.hasNext(); i1.b((java.util.Map.Entry)d1.next())) { }
        }

        public final boolean b()
        {
            Object obj = c;
            for (int i1 = 0; i1 < ((com.google.android.m4b.maps.ct.i) (obj)).a.b(); i1++)
            {
                if (!com.google.android.m4b.maps.ct.i.a(((com.google.android.m4b.maps.ct.i) (obj)).a.b(i1)))
                {
                    return false;
                }
            }

            for (obj = ((com.google.android.m4b.maps.ct.i) (obj)).a.c().iterator(); ((Iterator) (obj)).hasNext();)
            {
                if (!com.google.android.m4b.maps.ct.i.a((java.util.Map.Entry)((Iterator) (obj)).next()))
                {
                    return false;
                }
            }

            return true;
        }

        public final q.a l()
        {
            return k();
        }

        public final q.a m()
        {
            return i();
        }

        public d()
        {
            c = com.google.android.m4b.maps.ct.i.a();
        }
    }

    public final class d.a
    {

        private final Iterator a;
        private java.util.Map.Entry b;
        private final boolean c;
        private d d;

        public final void a(int i1, com.google.android.m4b.maps.ct.f f1)
        {
            while (b != null && ((f)b.getKey()).b < i1) 
            {
                Object obj = (f)b.getKey();
                if (c && ((f) (obj)).c.s == z.b.i && !((f) (obj)).d)
                {
                    int j1 = ((f) (obj)).b;
                    obj = (q)b.getValue();
                    f1.a(1, 3);
                    f1.a(2, 0);
                    f1.j(j1);
                    f1.a(3, 2);
                    f1.a(((q) (obj)));
                    f1.a(1, 4);
                } else
                {
                    com.google.android.m4b.maps.ct.i.a(((i.a) (obj)), b.getValue(), f1);
                }
                if (a.hasNext())
                {
                    b = (java.util.Map.Entry)a.next();
                } else
                {
                    b = null;
                }
            }
        }

        private d.a(d d1, boolean flag)
        {
            d = d1;
            super();
            d1 = d.c;
            if (((com.google.android.m4b.maps.ct.i) (d1)).c)
            {
                d1 = new n.b(((com.google.android.m4b.maps.ct.i) (d1)).a.entrySet().iterator());
            } else
            {
                d1 = ((com.google.android.m4b.maps.ct.i) (d1)).a.entrySet().iterator();
            }
            a = d1;
            if (a.hasNext())
            {
                b = (java.util.Map.Entry)a.next();
            }
            c = flag;
        }

        public d.a(d d1, boolean flag, byte byte0)
        {
            this(d1, flag);
        }
    }

    public static interface e
        extends r
    {
    }

    static final class f
        implements i.a
    {

        final l.b a;
        final int b;
        final z.a c;
        final boolean d;
        private boolean e;

        public final int a()
        {
            return b;
        }

        public final q.a a(q.a a1, q q1)
        {
            return ((a)a1).a((j)q1);
        }

        public final s a(s s)
        {
            return ((k)s).c();
        }

        public final z.a b()
        {
            return c;
        }

        public final z.b c()
        {
            return c.s;
        }

        public final int compareTo(Object obj)
        {
            obj = (f)obj;
            return b - ((f) (obj)).b;
        }

        public final boolean d()
        {
            return d;
        }

        public final boolean e()
        {
            return e;
        }
    }

    public static final class g extends com.google.android.m4b.maps.ct.g
    {

        final q a;
        final f b;

        final Object a(Object obj)
        {
            Object obj1 = obj;
            if (b.c.s == z.b.h)
            {
                obj1 = Integer.valueOf(((l.a)obj).a());
            }
            return obj1;
        }
    }

    public static final class h extends Enum
    {

        public static final h a;
        public static final h b;
        public static final h c;
        public static final h d;
        public static final h e;
        public static final h f;
        public static final h g;
        public static final h h;
        private static final h i[];

        public static h valueOf(String s)
        {
            return (h)Enum.valueOf(com/google/android/m4b/maps/ct/j$h, s);
        }

        public static h[] values()
        {
            return (h[])i.clone();
        }

        static 
        {
            a = new h("IS_INITIALIZED", 0);
            b = new h("PARSE_PARTIAL_FROM", 1);
            c = new h("MERGE_FROM", 2);
            d = new h("MAKE_IMMUTABLE", 3);
            e = new h("NEW_INSTANCE", 4);
            f = new h("NEW_BUILDER", 5);
            g = new h("GET_DEFAULT_INSTANCE", 6);
            h = new h("GET_PARSER", 7);
            i = (new h[] {
                a, b, c, d, e, f, g, h
            });
        }

        private h(String s, int i1)
        {
            super(s, i1);
        }
    }

    static final class i
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final String a;
        private final byte b[];

        protected final Object readResolve()
        {
            Object obj;
            try
            {
                obj = Class.forName(a).getDeclaredField("DEFAULT_INSTANCE");
                ((Field) (obj)).setAccessible(true);
                obj = ((q)((Field) (obj)).get(null)).m().a(b).f();
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                String s = String.valueOf(a);
                if (s.length() != 0)
                {
                    s = "Unable to find proto buffer class: ".concat(s);
                } else
                {
                    s = new String("Unable to find proto buffer class: ");
                }
                throw new RuntimeException(s, classnotfoundexception);
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                String s1 = String.valueOf(a);
                if (s1.length() != 0)
                {
                    s1 = "Unable to find DEFAULT_INSTANCE in ".concat(s1);
                } else
                {
                    s1 = new String("Unable to find DEFAULT_INSTANCE in ");
                }
                throw new RuntimeException(s1, nosuchfieldexception);
            }
            catch (SecurityException securityexception)
            {
                String s2 = String.valueOf(a);
                if (s2.length() != 0)
                {
                    s2 = "Unable to call DEFAULT_INSTANCE in ".concat(s2);
                } else
                {
                    s2 = new String("Unable to call DEFAULT_INSTANCE in ");
                }
                throw new RuntimeException(s2, securityexception);
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                throw new RuntimeException("Unable to call parsePartialFrom", illegalaccessexception);
            }
            catch (m m1)
            {
                throw new RuntimeException("Unable to understand proto buffer", m1);
            }
            return obj;
        }

        i(q q1)
        {
            a = q1.getClass().getName();
            b = q1.f();
        }
    }


    private static final long serialVersionUID = 1L;
    public x a;
    public int b;

    public j()
    {
        a = x.a();
        b = -1;
    }

    static j a(j j1, com.google.android.m4b.maps.ct.e e1, com.google.android.m4b.maps.ct.h h1)
    {
        try
        {
            j1 = (j)j1.a(h.b, e1, h1);
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            if (j1.getCause() instanceof m)
            {
                throw (m)j1.getCause();
            } else
            {
                throw j1;
            }
        }
        return j1;
    }

    public static boolean a(com.google.android.m4b.maps.ct.i i1, q q1, com.google.android.m4b.maps.ct.e e1, x.a a1, com.google.android.m4b.maps.ct.h h1, int j1)
    {
        g g1;
        int k1;
        int l1;
        k1 = z.a(j1);
        l1 = z.b(j1);
        g1 = (g)h1.a.get(new h.a(q1, l1));
        if (g1 == null) goto _L2; else goto _L1
_L1:
        if (k1 != com.google.android.m4b.maps.ct.i.a(g1.b.c, false)) goto _L4; else goto _L3
_L3:
        boolean flag;
        k1 = 0;
        flag = false;
_L6:
        if (flag)
        {
            return a1.a(j1, e1);
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (g1.b.d && g1.b.c.a() && k1 == com.google.android.m4b.maps.ct.i.a(g1.b.c, true))
        {
            k1 = 1;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        k1 = 0;
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        if (k1 == 0) goto _L8; else goto _L7
_L7:
        j1 = e1.b(e1.e());
        if (g1.b.c == z.a.n)
        {
            for (; e1.i() > 0; i1.b(g1.b, g1.a(q1)))
            {
                e1.e();
                q1 = g1.b.a.a();
                if (q1 == null)
                {
                    return true;
                }
            }

        } else
        {
            for (; e1.i() > 0; i1.b(g1.b, q1))
            {
                q1 = ((q) (com.google.android.m4b.maps.ct.i.a(e1, g1.b.c)));
            }

        }
        e1.c(j1);
_L12:
        return true;
_L8:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[z.b.values().length];
                try
                {
                    a[z.b.i.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[z.b.h.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[g1.b.c.s.ordinal()];
        JVM INSTR tableswitch 1 2: default 300
    //                   1 342
    //                   2 556;
           goto _L9 _L10 _L11
_L9:
        q1 = ((q) (com.google.android.m4b.maps.ct.i.a(e1, g1.b.c)));
_L13:
        if (g1.b.d)
        {
            i1.b(g1.b, g1.a(q1));
        } else
        {
            i1.a(g1.b, g1.a(q1));
        }
        if (true) goto _L12; else goto _L10
_L10:
        if (g1.b.d)
        {
            break MISSING_BLOCK_LABEL_637;
        }
        q1 = (q)i1.a(g1.b);
        if (q1 == null)
        {
            break MISSING_BLOCK_LABEL_637;
        }
        q1 = q1.l();
_L14:
        a1 = q1;
        if (q1 == null)
        {
            a1 = g1.a.m();
        }
        if (g1.b.c == z.a.j)
        {
            j1 = g1.b.b;
            if (e1.a >= e1.b)
            {
                throw com.google.android.m4b.maps.ct.m.g();
            }
            e1.a = e1.a + 1;
            a1.b(e1, h1);
            e1.a(z.a(j1, 4));
            e1.a = e1.a - 1;
        } else
        {
            j1 = e1.e();
            if (e1.a >= e1.b)
            {
                throw com.google.android.m4b.maps.ct.m.g();
            }
            j1 = e1.b(j1);
            e1.a = e1.a + 1;
            a1.b(e1, h1);
            e1.a(0);
            e1.a = e1.a - 1;
            e1.c(j1);
        }
        q1 = a1.g();
          goto _L13
_L11:
        j1 = e1.e();
        e1 = g1.b.a.a();
        q1 = e1;
        if (e1 == null)
        {
            if (l1 == 0)
            {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            } else
            {
                a1.a();
                a1.a(z.a(l1, 0), Long.valueOf(j1));
                return true;
            }
        }
          goto _L13
        q1 = null;
          goto _L14
    }

    protected static final boolean a(j j1)
    {
        boolean flag = false;
        if (j1.a(h.a, Boolean.valueOf(false), null) != null)
        {
            flag = true;
        }
        return flag;
    }

    public abstract Object a(h h1, Object obj, Object obj1);

    public final void a(x x1)
    {
        a = x.a(a, x1);
    }

    public final t g()
    {
        return (t)a(h.h, null, null);
    }

    public final j h()
    {
        return (j)a(h.g, null, null);
    }

    public final a i()
    {
        return (a)a(h.f, null, null);
    }

    public final boolean j()
    {
        return a(h.a, Boolean.TRUE, null) != null;
    }

    public final a k()
    {
        a a1 = (a)a(h.f, null, null);
        a1.a(this);
        return a1;
    }

    public q.a l()
    {
        return k();
    }

    public q.a m()
    {
        return i();
    }

    protected Object writeReplace()
    {
        return new i(this);
    }
}
