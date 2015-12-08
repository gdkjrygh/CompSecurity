// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;


// Referenced classes of package com.google.android.m4b.maps.aa:
//            aw

static abstract class <init> extends Enum
{

    private static i a;
    private static i b;
    private static i c;
    private static i d;
    private static i e;
    private static i f;
    private static i g;
    private static i h;
    private static i i[][];
    private static final i j[];

    static <init> a(<init> <init>1, boolean flag, boolean flag1)
    {
        byte byte0 = 0;
        boolean flag2;
        if (flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1)
        {
            byte0 = 2;
        }
        return i[<init>1.ordinal()][byte0 | flag2];
    }

    static void a(ordinal ordinal, ordinal ordinal1)
    {
        ordinal1.a(ordinal.e());
        aw.a(ordinal.g(), ordinal1);
        aw.a(ordinal1, ordinal.f());
        aw.b(ordinal);
    }

    static void b(f f1, f f2)
    {
        aw.b(f1.i(), f2);
        aw.b(f2, f1.h());
        aw.c(f1);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/google/android/m4b/maps/aa/aw$c, s);
    }

    public static h[] values()
    {
        return (h[])j.clone();
    }

    one a(one one, one one1, one one2)
    {
        return a(one, one1.d(), one1.c(), one2);
    }

    abstract c a(c c1, Object obj, int k, c c2);

    static 
    {
        a = new aw.c("STRONG") {

            final aw.s a(aw.m m, Object obj, int k, aw.s s)
            {
                return new aw.u(obj, k, s);
            }

        };
        b = new aw.c("STRONG_EXPIRABLE") {

            final aw.s a(aw.m m, aw.s s, aw.s s1)
            {
                m = a(m, s, s1);
                a(s, ((aw.s) (m)));
                return m;
            }

            final aw.s a(aw.m m, Object obj, int k, aw.s s)
            {
                return new aw.w(obj, k, s);
            }

        };
        c = new aw.c("STRONG_EVICTABLE") {

            final aw.s a(aw.m m, aw.s s, aw.s s1)
            {
                m = a(m, s, s1);
                b(s, m);
                return m;
            }

            final aw.s a(aw.m m, Object obj, int k, aw.s s)
            {
                return new aw.v(obj, k, s);
            }

        };
        d = new aw.c("STRONG_EXPIRABLE_EVICTABLE") {

            final aw.s a(aw.m m, aw.s s, aw.s s1)
            {
                m = a(m, s, s1);
                a(s, ((aw.s) (m)));
                b(s, m);
                return m;
            }

            final aw.s a(aw.m m, Object obj, int k, aw.s s)
            {
                return new aw.x(obj, k, s);
            }

        };
        e = new aw.c("WEAK") {

            final aw.s a(aw.m m, Object obj, int k, aw.s s)
            {
                return new aw.ac(m.e, obj, k, s);
            }

        };
        f = new aw.c("WEAK_EXPIRABLE") {

            final aw.s a(aw.m m, aw.s s, aw.s s1)
            {
                m = a(m, s, s1);
                a(s, ((aw.s) (m)));
                return m;
            }

            final aw.s a(aw.m m, Object obj, int k, aw.s s)
            {
                return new aw.d(m.e, obj, k, s);
            }

        };
        g = new aw.c("WEAK_EVICTABLE") {

            final aw.s a(aw.m m, aw.s s, aw.s s1)
            {
                m = a(m, s, s1);
                b(s, m);
                return m;
            }

            final aw.s a(aw.m m, Object obj, int k, aw.s s)
            {
                return new aw.ad(m.e, obj, k, s);
            }

        };
        h = new aw.c("WEAK_EXPIRABLE_EVICTABLE") {

            final aw.s a(aw.m m, aw.s s, aw.s s1)
            {
                m = a(m, s, s1);
                a(s, ((aw.s) (m)));
                b(s, m);
                return m;
            }

            final aw.s a(aw.m m, Object obj, int k, aw.s s)
            {
                return new aw.e(m.e, obj, k, s);
            }

        };
        j = (new j[] {
            a, b, c, d, e, f, g, h
        });
        c c1 = a;
        c c2 = b;
        c c3 = c;
        c c4 = d;
        c ac[] = new d[0];
        c c5 = e;
        c c6 = f;
        c c7 = g;
        c c8 = h;
        i = (new i[][] {
            new i[] {
                c1, c2, c3, c4
            }, ac, new i[] {
                c5, c6, c7, c8
            }
        });
    }

    private _cls8(String s, int k)
    {
        super(s, k);
    }

    _cls8(String s, int k, byte byte0)
    {
        this(s, k);
    }
}
