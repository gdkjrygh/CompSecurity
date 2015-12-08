// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bk:
//            j, b, m, d, 
//            g, k, c

public final class e
{
    public static final class a extends b
    {

        public a(String s)
        {
            super(s, null);
        }
    }

    public static class b extends Exception
    {

        d a;

        public b(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

    static final class c
    {

        public a a;
        public j b;
        public com.google.android.m4b.maps.bk.b c;
        public int d;
        public int e;
        public a.b f;
        public List g;
        public int h[];
        public int i;

        public final c a(a a1, j j1, com.google.android.m4b.maps.bk.b b1, int l, int i1, a.b b2, List list)
        {
            a = a1;
            b = j1;
            c = b1;
            d = l;
            e = i1;
            f = b2;
            g = list;
            return this;
        }

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }

    public static final class c.a extends Enum
    {

        public static final c.a a;
        public static final c.a b;
        public static final c.a c;
        private static final c.a d[];

        public static c.a valueOf(String s)
        {
            return (c.a)Enum.valueOf(com/google/android/m4b/maps/bk/e$c$a, s);
        }

        public static c.a[] values()
        {
            return (c.a[])d.clone();
        }

        static 
        {
            a = new c.a("EMPTY_MESH", 0);
            b = new c.a("TESSELLATE_MONOTONE", 1);
            c = new c.a("CUT_AND_TESSELLATE", 2);
            d = (new c.a[] {
                a, b, c
            });
        }

        private c.a(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        private static final d e[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/google/android/m4b/maps/bk/e$d, s);
        }

        public static d[] values()
        {
            return (d[])e.clone();
        }

        static 
        {
            a = new d("CCW_OUTLINE", 0);
            b = new d("CW_HOLES", 1);
            c = new d("NON_SELF_INTERSECTING", 2);
            d = new d("NO_LINES_STICKING_OUT", 3);
            e = (new d[] {
                a, b, c, d
            });
        }

        private d(String s, int i)
        {
            super(s, i);
        }
    }


    private static c a(j j1, com.google.android.m4b.maps.bk.b b1, int i, List list, c c1)
    {
        if (c1 == null)
        {
            c1 = new c((byte)0);
        }
        if (j1.e() < 3)
        {
            return c1.a(c.a.a, null, null, 0, 0, null, null);
        }
_L9:
        a.b b2;
        int l;
        int i1;
        int k1;
        if (i >= j1.c)
        {
            break MISSING_BLOCK_LABEL_501;
        }
        l = j1.j(i);
        i1 = j1.d(l);
        k1 = j1.e(l);
        b2 = j1.f(l);
        static final class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[c.a.values().length];
                try
                {
                    b[c.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[c.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[c.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                a = new int[com.google.android.m4b.maps.bk.a.b.values().length];
                try
                {
                    a[a.b.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[a.b.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.b.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.b.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.b.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[b2.ordinal()];
        JVM INSTR tableswitch 1 6: default 124
    //                   1 144
    //                   2 216
    //                   3 288
    //                   4 357
    //                   5 131
    //                   6 429;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L10:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        b1.a(i1, l, k1);
          goto _L10
_L2:
        i1 = b1.a(i1, l, b2);
        if (i1 != -1)
        {
            return c1.a(c.a.c, j1, b1, l, i1, b2, list);
        }
        i1 = b1.b(l, k1, b2);
        if (i1 != -1)
        {
            return c1.a(c.a.c, j1, b1, l, i1, b2, list);
        }
          goto _L10
_L3:
        k1 = b1.a(l, k1, b2);
        if (k1 != -1)
        {
            return c1.a(c.a.c, j1, b1, l, k1, b2, list);
        }
        i1 = b1.b(i1, l, b2);
        if (i1 != -1)
        {
            return c1.a(c.a.c, j1, b1, l, i1, b2, list);
        }
          goto _L10
_L4:
        i1 = b1.a(l);
        if (b1.c.i(i1))
        {
            i = b1.f(i1, l);
        } else
        {
            i = b1.c.j(i1);
        }
        b1.c.f(i1, -1);
        return c1.a(c.a.c, j1, b1, l, i, b2, list);
_L5:
        k1 = b1.b(l, k1, b2);
        if (k1 != -1)
        {
            return c1.a(c.a.c, j1, b1, l, k1, b2, list);
        }
        i1 = b1.b(i1, l, b2);
        if (i1 != -1)
        {
            return c1.a(c.a.c, j1, b1, l, i1, b2, list);
        }
          goto _L10
_L7:
        i1 = b1.b(i1, l, b2);
        if (i1 != -1)
        {
            return c1.a(c.a.c, j1, b1, l, i1, b2, list);
        }
        i1 = b1.b(l, k1, b2);
        if (i1 == -1) goto _L10; else goto _L11
_L11:
        return c1.a(c.a.c, j1, b1, l, i1, b2, list);
        return c1.a(c.a.b, j1, null, 0, 0, null, null);
    }

    public static k a(com.google.android.m4b.maps.bk.d d1)
    {
        int l = 0;
        d1 = d1.a;
        if (d1.a() != 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (((g) (d1)).a < 3)
        {
            return k.a();
        }
        if (((g) (d1)).a != 3)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        d1 = k.a(d1.b());
        d1.a(0, 1, 2);
        return d1;
        return a(d1.c());
        int j1;
        d1 = new com.google.android.m4b.maps.bk.c(d1);
        j1 = d1.d();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        return a(((j) (d1)));
_L2:
        Object obj;
        int ai[];
        obj = new com.google.android.m4b.maps.bk.b(d1);
        ai = new int[j1 * 2];
        int i1 = 0;
_L12:
        if (i1 >= ((com.google.android.m4b.maps.bk.c) (d1)).c) goto _L4; else goto _L3
_L3:
        a.b b1;
        int k1;
        int l1;
        int i2;
        k1 = d1.j(i1);
        l1 = d1.d(k1);
        i2 = d1.e(k1);
        b1 = d1.f(k1);
        _cls1.a[b1.ordinal()];
        JVM INSTR tableswitch 1 6: default 529
    //                   1 196
    //                   2 256
    //                   3 283
    //                   4 435
    //                   5 462
    //                   6 479;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L6:
        ((com.google.android.m4b.maps.bk.b) (obj)).a(l1, k1, b1);
        ((com.google.android.m4b.maps.bk.b) (obj)).b(k1, i2, b1);
        int i;
        i = l;
        break MISSING_BLOCK_LABEL_533;
_L7:
        try
        {
            ((com.google.android.m4b.maps.bk.b) (obj)).a(k1, i2, b1);
            ((com.google.android.m4b.maps.bk.b) (obj)).b(l1, k1, b1);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.m4b.maps.bk.d d1)
        {
            throw d1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d1 = String.valueOf(((Exception) (obj)).getMessage());
            int j2;
            if (d1.length() != 0)
            {
                d1 = "Error when tessellating polygon: ".concat(d1);
            } else
            {
                d1 = new String("Error when tessellating polygon: ");
            }
            throw new b(d1, ((Throwable) (obj)));
        }
        i = l;
        break MISSING_BLOCK_LABEL_533;
_L8:
        j2 = ((com.google.android.m4b.maps.bk.b) (obj)).f(((com.google.android.m4b.maps.bk.b) (obj)).a(k1), k1);
        i = l;
        if (!d1.c(k1, j2))
        {
            break MISSING_BLOCK_LABEL_354;
        }
        ai[l] = k1;
        ai[l + 1] = j2;
        l += 2;
        i = l;
        if (l != j1 * 2)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        d1 = d1.a(ai);
          goto _L1
        l = ((com.google.android.m4b.maps.bk.b) (obj)).b(k1, i2, k1);
        j2 = ((com.google.android.m4b.maps.bk.b) (obj)).c(((com.google.android.m4b.maps.bk.b) (obj)).a.j(l - 1), ((com.google.android.m4b.maps.bk.b) (obj)).b.j(l - 1), k1);
        ((com.google.android.m4b.maps.bk.b) (obj)).e(((com.google.android.m4b.maps.bk.b) (obj)).a(k1), k1);
        ((com.google.android.m4b.maps.bk.b) (obj)).a(l, k1, i2, j2);
        ((com.google.android.m4b.maps.bk.b) (obj)).a(l, k1, l1, -1);
        break MISSING_BLOCK_LABEL_533;
_L9:
        ((com.google.android.m4b.maps.bk.b) (obj)).b(k1, i2, b1);
        ((com.google.android.m4b.maps.bk.b) (obj)).b(l1, k1, b1);
        i = l;
        break MISSING_BLOCK_LABEL_533;
_L10:
        ((com.google.android.m4b.maps.bk.b) (obj)).a(l1, k1, i2);
        i = l;
        break MISSING_BLOCK_LABEL_533;
_L11:
        ((com.google.android.m4b.maps.bk.b) (obj)).b(l1, k1, b1);
        ((com.google.android.m4b.maps.bk.b) (obj)).b(k1, i2, b1);
        i = l;
        break MISSING_BLOCK_LABEL_533;
_L4:
        throw new NullPointerException("Tesselation could not cut all holes open.");
_L5:
        i = l;
        i1++;
        l = i;
          goto _L12
    }

    private static k a(j j1)
    {
        Object obj3;
        Object obj4;
        int ai[];
        List list;
        a.b b1;
        com.google.android.m4b.maps.bk.b b2;
        j j2;
        k k2;
        LinkedList linkedlist;
        int i1;
        int l1;
        int i4;
        boolean flag1;
        j1 = a(j1, new com.google.android.m4b.maps.bk.b(j1), 0, null, null);
        switch (_cls1.b[((c) (j1)).a.ordinal()])
        {
        default:
            throw new a("Unknown subdivide result in tessellation");

        case 1: // '\001'
            return k.a();

        case 2: // '\002'
            k k1 = k.a(((c) (j1)).b);
            a(((c) (j1)).b, k1, null, 0);
            return k1;

        case 3: // '\003'
            j2 = ((c) (j1)).b;
            break;
        }
        b2 = ((c) (j1)).c;
        i1 = ((c) (j1)).d;
        l1 = ((c) (j1)).e;
        b1 = ((c) (j1)).f;
        list = ((c) (j1)).g;
        k2 = k.a(j2);
        linkedlist = new LinkedList();
        flag1 = false;
        i4 = 0;
        ai = null;
        obj3 = null;
        obj4 = null;
_L10:
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (list != null)
        {
            list.add(new double[] {
                j2.b(i1), j2.c(i1), j2.b(l1), j2.c(l1)
            });
        }
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        int l;
        int i2;
        int l2;
        int i3;
        boolean flag;
        int l3;
        int k4;
        int l4;
        if (i1 > l1)
        {
            i = l1;
        } else
        {
            i = i1;
        }
        if (i1 > l1)
        {
            l = i1;
        } else
        {
            l = l1;
        }
        l4 = 0;
        k4 = 0;
        flag = false;
        int k3;
        int i5;
        int k5;
        int l5;
        if (j2.g(i, l) == 0)
        {
            flag = true;
            l3 = j2.d(l);
            l2 = j2.e(l);
            i2 = i;
            i3 = i;
        } else
        if (j2.g(i, j2.d(l)) == 0)
        {
            flag = true;
            l3 = j2.d(l);
            i2 = i;
            l2 = l;
            i3 = i;
        } else
        if (j2.g(i, j2.e(l)) == 0)
        {
            flag = true;
            l2 = j2.e(l);
            i2 = i;
            i3 = i;
            l3 = l;
        } else
        if (j2.g(j2.d(i), l) == 0)
        {
            flag = true;
            i2 = j2.d(i);
            l2 = l;
            i3 = i;
            l3 = l;
        } else
        if (j2.g(j2.e(i), l) == 0)
        {
            flag = true;
            i3 = j2.e(i);
            i2 = i;
            l2 = l;
            l3 = l;
        } else
        {
            i2 = i;
            l2 = l;
            l3 = l;
            i3 = i;
        }
        if (flag)
        {
            obj2 = j2.d(i3, l3);
            obj1 = j2.d(l2, i2);
            obj = new com.google.android.m4b.maps.bk.b(((m) (obj2)));
            j1 = new com.google.android.m4b.maps.bk.b(((m) (obj1)));
            k2.b = k2.b + 1;
            l = l4;
            i = k4;
            break MISSING_BLOCK_LABEL_349;
        }
        j1 = j2.d(i, l);
        obj2 = b2.a(j1, i, l);
        k3 = j1.h(i1 - i, 0);
        obj1 = j2.d(l, i);
        obj = b2.a(((j) (obj1)), l, i);
        k5 = l - i - 1;
        if (l1 <= i)
        {
            i5 = l1;
        } else
        {
            i5 = l1 - k5;
        }
        if (i1 <= i)
        {
            k4 = i1;
        } else
        {
            k4 = i1 - k5;
        }
        l3 = ((j) (obj1)).h(k4, 0);
        l5 = j2.d(i1);
        l4 = j2.e(i1);
        switch (_cls1.a[b1.ordinal()])
        {
        default:
            j j3 = j1;
            i = l3;
            l = k3;
            j1 = ((j) (obj));
            obj = obj2;
            obj2 = j3;
            break;

        case 5: // '\005'
            throw new NullPointerException("Impossible case in cutAndTessellate.");

        case 3: // '\003'
            ((com.google.android.m4b.maps.bk.b) (obj2)).d(l1 - i, i1 - i);
            ((com.google.android.m4b.maps.bk.b) (obj)).d(i5, k4);
            j j4 = j1;
            i = l3;
            l = k3;
            j1 = ((j) (obj));
            obj = obj2;
            obj2 = j4;
            break;

        case 1: // '\001'
            if (l5 >= i && l5 <= l)
            {
                if (((j) (obj1)).f(k4) != a.b.f)
                {
                    throw new NullPointerException("Impossible case in cutAndTessellate.");
                }
                i = l3 + 1;
                j j5 = j1;
                l = k3 + 1;
                j1 = ((j) (obj));
                obj = obj2;
                obj2 = j5;
            } else
            {
                if (j1.f(i1 - i) != a.b.f)
                {
                    throw new NullPointerException("Impossible case in cutAndTessellate.");
                }
                l = k3 + 1;
                i = l3 + 1;
                j j6 = j1;
                j1 = ((j) (obj));
                obj = obj2;
                obj2 = j6;
            }
            break;

        case 2: // '\002'
            if (l5 >= i && l5 <= l)
            {
                if (j1.f(i1 - i) != a.b.f)
                {
                    throw new NullPointerException("Impossible case in cutAndTessellate.");
                }
                l = k3 + 1;
                i = l3 + 1;
                j j7 = j1;
                j1 = ((j) (obj));
                obj = obj2;
                obj2 = j7;
            } else
            {
                if (((j) (obj1)).f(k4) != a.b.f)
                {
                    throw new NullPointerException("Impossible case in cutAndTessellate.");
                }
                i = l3 + 1;
                j j8 = j1;
                l = k3 + 1;
                j1 = ((j) (obj));
                obj = obj2;
                obj2 = j8;
            }
            break;

        case 4: // '\004'
            if (l5 >= i && l5 <= l)
            {
                if (b2.c(l5, i1))
                {
                    ((com.google.android.m4b.maps.bk.b) (obj2)).d(l1 - i, i1 - i);
                    if (((j) (obj1)).f(k4) != a.b.f)
                    {
                        throw new NullPointerException("Impossible case in cutAndTessellate.");
                    }
                    i = l3 + 1;
                    l = k3;
                    j j9 = j1;
                    j1 = ((j) (obj));
                    obj = obj2;
                    obj2 = j9;
                } else
                {
                    if (j1.f(i1 - i) != a.b.f)
                    {
                        throw new NullPointerException("Impossible case in cutAndTessellate.");
                    }
                    l = k3 + 1;
                    i = l3 + 1;
                    j j10 = j1;
                    j1 = ((j) (obj));
                    obj = obj2;
                    obj2 = j10;
                }
            } else
            if (b2.c(l5, i1))
            {
                if (j1.f(i1 - i) != a.b.f)
                {
                    throw new NullPointerException("Impossible case in cutAndTessellate.");
                }
                ((com.google.android.m4b.maps.bk.b) (obj)).d(i5, k4);
                i = l3;
                l = k3 + 1;
                j j11 = j1;
                j1 = ((j) (obj));
                obj = obj2;
                obj2 = j11;
            } else
            {
                if (((j) (obj1)).f(k4) != a.b.f)
                {
                    throw new NullPointerException("Impossible case in cutAndTessellate.");
                }
                l = k3 + 1;
                i = l3 + 1;
                j j12 = j1;
                j1 = ((j) (obj));
                obj = obj2;
                obj2 = j12;
            }
            break;

        case 6: // '\006'
            if (l4 >= i && l4 <= l)
            {
                if (((com.google.android.m4b.maps.bk.b) (obj2)).c(l4 - i, i1 - i))
                {
                    if (((com.google.android.m4b.maps.bk.b) (obj2)).b(l4 - i, i1 - i, a.b.f) != -1)
                    {
                        throw new NullPointerException("Impossible case in cutAndTessellate.");
                    }
                } else
                {
                    throw new NullPointerException("Impossible case in cutAndTessellate.");
                }
            } else
            {
                if (l4 <= i)
                {
                    l = l4;
                } else
                {
                    l = l4 - k5;
                }
                if (((com.google.android.m4b.maps.bk.b) (obj)).c(l, k4))
                {
                    if (l4 > i)
                    {
                        l4 -= k5;
                    }
                    if (((com.google.android.m4b.maps.bk.b) (obj)).b(l4, k4, a.b.f) != -1)
                    {
                        throw new NullPointerException("Impossible case in cutAndTessellate.");
                    }
                } else
                {
                    throw new NullPointerException("Impossible case in cutAndTessellate.");
                }
            }
            l = k3 + 1;
            i = l3 + 1;
            j j13 = j1;
            j1 = ((j) (obj));
            obj = obj2;
            obj2 = j13;
            break;
        }
          goto _L1
_L8:
        obj = a(((j) (obj2)), ((com.google.android.m4b.maps.bk.b) (obj)), l, list, ((c) (obj4)));
        j1 = a(((j) (obj1)), ((com.google.android.m4b.maps.bk.b) (j1)), i, list, ((c) (obj3)));
        if (ai != null)
        {
            l = ((j) (obj2)).e();
            if (((c) (obj)).h == null || ((c) (obj)).h.length < l)
            {
                obj.h = new int[l];
            }
            for (i = 0; i < l; i++)
            {
                ((c) (obj)).h[i] = ai[i3 + i];
            }

        } else
        {
            obj.h = null;
            obj.i = i4 + i3;
        }
        l = ((j) (obj1)).e();
        if (((c) (j1)).h == null || ((c) (j1)).h.length < l)
        {
            j1.h = new int[l];
        }
        if (ai != null)
        {
            System.arraycopy(ai, 0, ((c) (j1)).h, 0, i2 + 1);
            if (l2 < ai.length)
            {
                System.arraycopy(ai, l2, ((c) (j1)).h, i2 + 1, l - i2 - 1);
            }
        } else
        {
            for (i = 0; i < i2 + 1; i++)
            {
                ((c) (j1)).h[i] = i + i4;
            }

            i = i2 + 1;
            while (i < l) 
            {
                ((c) (j1)).h[i] = i + ((l2 - i2 - 1) + i4);
                i++;
            }
        }
        if (((c) (obj)).a != c.a.c || ((c) (j1)).a == c.a.c)
        {
            obj1 = j1;
            j1 = ((j) (obj));
            obj = obj1;
        }
        _cls1.b[((c) (j1)).a.ordinal()];
        JVM INSTR tableswitch 1 3: default 1704
    //                   1 1789
    //                   2 1838
    //                   3 1858;
           goto _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_1858;
_L3:
        break MISSING_BLOCK_LABEL_1789;
_L2:
        throw new a("Unknown subdivide result in tessellation");
_L6:
        switch (_cls1.b[((c) (obj)).a.ordinal()])
        {
        default:
            throw new a("Unknown subdivide result in tessellation");

        case 3: // '\003'
            j2 = ((c) (obj)).b;
            b2 = ((c) (obj)).c;
            i1 = ((c) (obj)).d;
            l1 = ((c) (obj)).e;
            b1 = ((c) (obj)).f;
            list = ((c) (obj)).g;
            ai = ((c) (obj)).h;
            i4 = ((c) (obj)).i;
            obj3 = obj;
            obj4 = j1;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            a(((c) (obj)).b, k2, ((c) (obj)).h, 0);
            // fall through

        case 1: // '\001'
            if (!linkedlist.isEmpty())
            {
                obj1 = (c)linkedlist.poll();
                j2 = ((c) (obj1)).b;
                b2 = ((c) (obj1)).c;
                i1 = ((c) (obj1)).d;
                l1 = ((c) (obj1)).e;
                b1 = ((c) (obj1)).f;
                list = ((c) (obj1)).g;
                ai = ((c) (obj1)).h;
                i4 = ((c) (obj1)).i;
                obj3 = obj;
                obj4 = j1;
            } else
            {
                flag1 = true;
                obj3 = obj;
                obj4 = j1;
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a(((c) (j1)).b, k2, ((c) (j1)).h, ((c) (j1)).i);
          goto _L6
        linkedlist.add(j1);
        j1 = null;
          goto _L6
_L1:
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L9:
        return k2;
    }

    private static void a(j j1, k k1, int ai[], int i)
    {
        int j4 = j1.e();
        if (j4 >= 3)
        {
            m m1 = j1.c();
            int i2 = j1.j(0);
            int l = j1.j(1);
            m1.b(new int[] {
                i2
            });
            m1.b(new int[] {
                l
            });
            int i3 = 2;
            while (i3 < j4) 
            {
                int j3 = j1.j(i3);
                if (j1.k(i3))
                {
                    int k3;
                    for (int j2 = m1.f(); m1.c > 1 && j1.a(j3, l, j2) > 0.0D; j2 = k3)
                    {
                        a(k1, j3, l, j2, ai, i);
                        m1.b();
                        k3 = m1.f();
                        l = j2;
                    }

                    m1.b(new int[] {
                        j3
                    });
                } else
                if (j1.l(i3))
                {
                    int l3 = m1.f();
                    int k2 = l;
                    for (int i1 = l3; m1.c > 1 && j1.a(i1, k2, j3) > 0.0D; i1 = l3)
                    {
                        a(k1, i1, k2, j3, ai, i);
                        m1.b();
                        l3 = m1.f();
                        k2 = i1;
                    }

                    m1.b(new int[] {
                        j3
                    });
                } else
                {
                    int l1 = m1.j(0);
                    int l2 = 1;
                    while (l2 < m1.c) 
                    {
                        int i4 = m1.j(l2);
                        if (j1.a(l1, i4, j3) < 0.0D)
                        {
                            a(k1, j3, i4, l1, ai, i);
                        } else
                        {
                            a(k1, l1, i4, j3, ai, i);
                        }
                        l2++;
                        l1 = i4;
                    }
                    m1.a();
                    m1.b(new int[] {
                        l1
                    });
                    m1.b(new int[] {
                        j3
                    });
                }
                i3++;
                l = j3;
            }
        }
    }

    private static void a(k k1, int i, int l, int i1, int ai[], int j1)
    {
        if (ai != null)
        {
            k1.a(ai[i], ai[l], ai[i1]);
            return;
        } else
        {
            k1.a(i + j1, l + j1, i1 + j1);
            return;
        }
    }

    public static d b(com.google.android.m4b.maps.bk.d d1)
    {
        g g1;
        int i;
        boolean flag1;
        flag1 = true;
        boolean flag;
        if (d1.a.i(0) <= 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return d.a;
        }
        g1 = d1.a;
        i = 1;
_L8:
        if (i >= g1.a() + 1) goto _L2; else goto _L1
_L1:
        if (g1.i(i) < 0.0D) goto _L4; else goto _L3
_L3:
        i = ((flag1) ? 1 : 0);
_L6:
        if (i != 0)
        {
            return d.b;
        }
        break; /* Loop/switch isn't completed */
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
        if (true) goto _L6; else goto _L5
_L5:
        if (d1.a.d())
        {
            return d.d;
        }
        if (d1.a.e())
        {
            return d.c;
        }
        return null;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
