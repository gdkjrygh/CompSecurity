// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.b:
//            bd, h, ar, by, 
//            bg, cd, g, ap, 
//            aq, aw, f

final class bh
{
    static final class a
        implements c
    {

        private final bd.a a;

        private Object c(ak.f f)
        {
            return a.b(f);
        }

        public final int a()
        {
            return c.a.a;
        }

        public final ap.b a(ap ap1, ak.a a1, int i)
        {
            return ap1.a(a1, i);
        }

        public final c a(ak.f f, Object obj)
        {
            a.b(f, obj);
            return this;
        }

        public final Object a(f f, aq aq1, ak.f f1, bd bd1)
        {
            if (bd1 != null)
            {
                bd1 = bd1.u();
            } else
            {
                bd1 = a.c(f1);
            }
            if (!f1.o())
            {
                f1 = (bd)c(f1);
                if (f1 != null)
                {
                    bd1.c(f1);
                }
            }
            bd1.b(f, aq1);
            return bd1.h();
        }

        public final Object a(g g1, aq aq1, ak.f f, bd bd1)
        {
            if (bd1 != null)
            {
                bd1 = bd1.u();
            } else
            {
                bd1 = a.c(f);
            }
            if (!f.o())
            {
                bd bd2 = (bd)c(f);
                if (bd2 != null)
                {
                    bd1.c(bd2);
                }
            }
            g1.a(f.e(), bd1, aq1);
            return bd1.h();
        }

        public final boolean a(ak.f f)
        {
            return a.a(f);
        }

        public final c b(ak.f f, Object obj)
        {
            a.a(f, obj);
            return this;
        }

        public final cd.c b(ak.f f)
        {
            if (f.k())
            {
                return cd.c.b;
            }
            if (!f.o() && (a instanceof as.a))
            {
                return cd.c.c;
            } else
            {
                return cd.c.a;
            }
        }

        public final Object b(g g1, aq aq1, ak.f f, bd bd1)
        {
            if (bd1 != null)
            {
                bd1 = bd1.u();
            } else
            {
                bd1 = a.c(f);
            }
            if (!f.o())
            {
                f = (bd)c(f);
                if (f != null)
                {
                    bd1.c(f);
                }
            }
            g1.a(bd1, aq1);
            return bd1.h();
        }

        public a(bd.a a1)
        {
            a = a1;
        }
    }

    static final class b
        implements c
    {

        private final ar a;

        private Object c(ak.f f)
        {
            return a.b(f);
        }

        public final int a()
        {
            return c.a.b;
        }

        public final ap.b a(ap ap1, ak.a a1, int i)
        {
            return ap1.a(a1, i);
        }

        public final c a(ak.f f, Object obj)
        {
            a.a(f, obj);
            return this;
        }

        public final Object a(f f, aq aq1, ak.f f1, bd bd1)
        {
            bd1 = bd1.u();
            if (!f1.o())
            {
                f1 = (bd)c(f1);
                if (f1 != null)
                {
                    bd1.c(f1);
                }
            }
            bd1.b(f, aq1);
            return bd1.h();
        }

        public final Object a(g g1, aq aq1, ak.f f, bd bd1)
        {
            bd1 = bd1.u();
            if (!f.o())
            {
                bd bd2 = (bd)c(f);
                if (bd2 != null)
                {
                    bd1.c(bd2);
                }
            }
            g1.a(f.e(), bd1, aq1);
            return bd1.h();
        }

        public final boolean a(ak.f f)
        {
            return a.a(f);
        }

        public final c b(ak.f f, Object obj)
        {
            a.b(f, obj);
            return this;
        }

        public final cd.c b(ak.f f)
        {
            if (f.k())
            {
                return cd.c.b;
            } else
            {
                return cd.c.a;
            }
        }

        public final Object b(g g1, aq aq1, ak.f f, bd bd1)
        {
            bd1 = bd1.u();
            if (!f.o())
            {
                f = (bd)c(f);
                if (f != null)
                {
                    bd1.c(f);
                }
            }
            g1.a(bd1, aq1);
            return bd1.h();
        }

        b(ar ar1)
        {
            a = ar1;
        }
    }

    static interface c
    {

        public abstract int a();

        public abstract ap.b a(ap ap1, ak.a a1, int i);

        public abstract c a(ak.f f, Object obj);

        public abstract Object a(f f, aq aq1, ak.f f1, bd bd1);

        public abstract Object a(g g1, aq aq1, ak.f f, bd bd1);

        public abstract boolean a(ak.f f);

        public abstract c b(ak.f f, Object obj);

        public abstract cd.c b(ak.f f);

        public abstract Object b(g g1, aq aq1, ak.f f, bd bd1);
    }

    public static final class c.a extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }


    static int a(bd bd1, Map map)
    {
        boolean flag = bd1.e().e().i();
        map = map.entrySet().iterator();
        int i = 0;
        while (map.hasNext()) 
        {
            Object obj = (java.util.Map.Entry)map.next();
            ak.f f = (ak.f)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (flag && f.s() && f.h() == ak.f.b.k && !f.o())
            {
                i = h.e(f.e(), (bd)obj) + i;
            } else
            {
                i = ar.c(f, obj) + i;
            }
        }
        bd1 = bd1.f();
        if (flag)
        {
            return bd1.g() + i;
        } else
        {
            return bd1.b() + i;
        }
    }

    private static String a(String s, ak.f f, int i)
    {
        s = new StringBuilder(s);
        if (f.s())
        {
            s.append('(').append(f.c()).append(')');
        } else
        {
            s.append(f.b());
        }
        if (i != -1)
        {
            s.append('[').append(i).append(']');
        }
        s.append('.');
        return s.toString();
    }

    static List a(bg bg1)
    {
        ArrayList arraylist = new ArrayList();
        a(bg1, "", ((List) (arraylist)));
        return arraylist;
    }

    static void a(bd bd1, Map map, h h1)
    {
        boolean flag = bd1.e().e().i();
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            Object obj = (java.util.Map.Entry)map.next();
            ak.f f = (ak.f)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (flag && f.s() && f.h() == ak.f.b.k && !f.o())
            {
                h1.c(f.e(), (bd)obj);
            } else
            {
                ar.a(f, obj, h1);
            }
        }

        bd1 = bd1.f();
        if (flag)
        {
            bd1.b(h1);
            return;
        } else
        {
            bd1.a(h1);
            return;
        }
    }

    private static void a(bg bg1, String s, List list)
    {
        Iterator iterator = bg1.e().f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ak.f f = (ak.f)iterator.next();
            if (f.m() && !bg1.a(f))
            {
                list.add((new StringBuilder()).append(s).append(f.b()).toString());
            }
        } while (true);
        iterator = bg1.d_().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            ak.f f1 = (ak.f)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (f1.f() == ak.f.a.i)
            {
                if (f1.o())
                {
                    int i = 0;
                    obj = ((List)obj).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        a((bg)((Iterator) (obj)).next(), a(s, f1, i), list);
                        i++;
                    }
                } else
                if (bg1.a(f1))
                {
                    a((bg)obj, a(s, f1, -1), list);
                }
            }
        } while (true);
    }

    static boolean a(g g1, by.a a1, aq aq1, ak.a a2, c c1, int i)
    {
        Object obj;
        boolean flag;
        flag = false;
        obj = null;
        if (!a2.e().i() || i != cd.a) goto _L2; else goto _L1
_L1:
        ap.b b1;
        b1 = null;
        i = 0;
        obj = null;
        int j;
label0:
        do
        {
            do
            {
                j = g1.a();
                if (j == 0)
                {
                    break label0;
                }
                if (j == cd.c)
                {
                    j = g1.m();
                    i = j;
                    if (j != 0)
                    {
                        i = j;
                        if (aq1 instanceof ap)
                        {
                            b1 = c1.a((ap)aq1, a2, j);
                            i = j;
                        }
                    }
                } else
                {
                    if (j != cd.d)
                    {
                        continue label0;
                    }
                    if (i != 0 && b1 != null && aq.c())
                    {
                        obj = b1.a;
                        c1.a(((ak.f) (obj)), c1.b(g1, aq1, ((ak.f) (obj)), b1.b));
                        obj = null;
                    } else
                    {
                        obj = g1.l();
                    }
                }
            } while (true);
        } while (g1.b(j));
        g1.a(cd.b);
        if (obj == null || i == 0) goto _L4; else goto _L3
_L3:
        if (b1 == null) goto _L6; else goto _L5
_L5:
        g1 = b1.a;
        if (c1.a(g1) || aq.c())
        {
            c1.a(g1, c1.a(((f) (obj)), aq1, g1, b1.b));
        } else
        {
            c1.a(g1, new aw(b1.b, aq1, ((f) (obj))));
        }
_L4:
        return true;
_L6:
        if (obj != null)
        {
            a1.a(i, by.b.a().a(((f) (obj))).a());
        }
        if (true) goto _L4; else goto _L2
_L2:
        int k;
        int i1;
        k = cd.a(i);
        i1 = cd.b(i);
        if (!a2.a(i1)) goto _L8; else goto _L7
_L7:
        if (!(aq1 instanceof ap)) goto _L10; else goto _L9
_L9:
        b1 = c1.a((ap)aq1, a2, i1);
        if (b1 == null) goto _L12; else goto _L11
_L11:
        a2 = b1.a;
        obj = b1.b;
        if (obj == null && a2.f() == ak.f.a.i)
        {
            throw new IllegalStateException((new StringBuilder("Message-typed extension lacked default instance: ")).append(a2.c()).toString());
        }
_L29:
        if (a2 == null) goto _L14; else goto _L13
_L13:
        if (k != ar.a(a2.j(), false)) goto _L16; else goto _L15
_L15:
        k = 0;
_L18:
        if (k != 0)
        {
            return a1.a(i, g1);
        }
        break; /* Loop/switch isn't completed */
_L10:
        a2 = null;
        continue; /* Loop/switch isn't completed */
_L8:
        if (c1.a() == c.a.a)
        {
            a2 = a2.b(i1);
            continue; /* Loop/switch isn't completed */
        }
_L12:
        a2 = null;
        continue; /* Loop/switch isn't completed */
_L16:
        if (a2.q() && k == ar.a(a2.j(), true))
        {
            k = 0;
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L14:
        k = 1;
        if (true) goto _L18; else goto _L17
_L17:
        if (!flag) goto _L20; else goto _L19
_L19:
        i = g1.c(g1.s());
        if (a2.j() == cd.a.n)
        {
            while (g1.t() > 0) 
            {
                int l = g1.n();
                if (a2.d().l())
                {
                    c1.b(a2, a2.x().b(l));
                } else
                {
                    a1 = a2.x().a(l);
                    if (a1 == null)
                    {
                        return true;
                    }
                    c1.b(a2, a1);
                }
            }
        } else
        {
            for (; g1.t() > 0; c1.b(a2, cd.a(g1, a2.j(), c1.b(a2)))) { }
        }
        g1.d(i);
_L25:
        return true;
_L20:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ak.f.b.values().length];
                try
                {
                    a[ak.f.b.j.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ak.f.b.k.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ak.f.b.n.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a2.h().ordinal()];
        JVM INSTR tableswitch 1 3: default 692
    //                   1 729
    //                   2 745
    //                   3 761;
           goto _L21 _L22 _L23 _L24
_L21:
        g1 = ((g) (cd.a(g1, a2.j(), c1.b(a2))));
_L26:
        if (a2.o())
        {
            c1.b(a2, g1);
        } else
        {
            c1.a(a2, g1);
        }
        if (true) goto _L25; else goto _L22
_L22:
        g1 = ((g) (c1.a(g1, aq1, a2, ((bd) (obj)))));
          goto _L26
_L23:
        g1 = ((g) (c1.b(g1, aq1, a2, ((bd) (obj)))));
          goto _L26
_L24:
label1:
        {
            i = g1.n();
            if (!a2.d().l())
            {
                break label1;
            }
            g1 = a2.x().b(i);
        }
          goto _L26
        aq1 = a2.x().a(i);
        g1 = aq1;
        if (aq1 != null) goto _L26; else goto _L27
_L27:
        a1.a(i1, i);
        return true;
        if (true) goto _L29; else goto _L28
_L28:
    }
}
