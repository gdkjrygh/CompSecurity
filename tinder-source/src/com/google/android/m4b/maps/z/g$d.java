// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;


// Referenced classes of package com.google.android.m4b.maps.z:
//            g

static abstract class <init> extends Enum
{

    private static h a;
    private static h b;
    private static h c;
    private static h d;
    private static h e;
    private static h f;
    private static h g;
    private static h h;
    private static h i[];
    private static final h j[];

    static <init> a(<init> <init>1, boolean flag, boolean flag1)
    {
        byte byte1 = 0;
        byte byte0;
        boolean flag2;
        if (<init>1 == b)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        if (flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1)
        {
            byte1 = 2;
        }
        return i[byte1 | (flag2 | byte0)];
    }

    static void a( ,  1)
    {
        1.a(.a());
        com.google.android.m4b.maps.z.g.a(.c(), 1);
        com.google.android.m4b.maps.z.g.a(1, .b());
        com.google.android.m4b.maps.z.g.a();
    }

    static void b( ,  1)
    {
        1.b(.d());
        com.google.android.m4b.maps.z.g.b(.f(), 1);
        com.google.android.m4b.maps.z.g.b(1, .e());
        com.google.android.m4b.maps.z.g.b();
    }

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/m4b/maps/z/g$d, s);
    }

    public static [] values()
    {
        return ([])j.clone();
    }

     a( ,  1,  2)
    {
        return a(, 1.g(), 1.i(), 2);
    }

    abstract  a( , Object obj, int k,  1);

    static 
    {
        a = new g.d("STRONG") {

            final g.aa a(g.q q, Object obj, int k, g.aa aa)
            {
                return new g.ae(obj, k, aa);
            }

        };
        b = new g.d("STRONG_ACCESS") {

            final g.aa a(g.q q, g.aa aa, g.aa aa1)
            {
                q = a(q, aa, aa1);
                a(aa, ((g.aa) (q)));
                return q;
            }

            final g.aa a(g.q q, Object obj, int k, g.aa aa)
            {
                return new g.ac(obj, k, aa);
            }

        };
        c = new g.d("STRONG_WRITE") {

            final g.aa a(g.q q, g.aa aa, g.aa aa1)
            {
                q = a(q, aa, aa1);
                b(aa, q);
                return q;
            }

            final g.aa a(g.q q, Object obj, int k, g.aa aa)
            {
                return new g.ag(obj, k, aa);
            }

        };
        d = new g.d("STRONG_ACCESS_WRITE") {

            final g.aa a(g.q q, g.aa aa, g.aa aa1)
            {
                q = a(q, aa, aa1);
                a(aa, ((g.aa) (q)));
                b(aa, q);
                return q;
            }

            final g.aa a(g.q q, Object obj, int k, g.aa aa)
            {
                return new g.ad(obj, k, aa);
            }

        };
        e = new g.d("WEAK") {

            final g.aa a(g.q q, Object obj, int k, g.aa aa)
            {
                return new g.f(q.e, obj, k, aa);
            }

        };
        f = new g.d("WEAK_ACCESS") {

            final g.aa a(g.q q, g.aa aa, g.aa aa1)
            {
                q = a(q, aa, aa1);
                a(aa, ((g.aa) (q)));
                return q;
            }

            final g.aa a(g.q q, Object obj, int k, g.aa aa)
            {
                return new g.c(q.e, obj, k, aa);
            }

        };
        g = new g.d("WEAK_WRITE") {

            final g.aa a(g.q q, g.aa aa, g.aa aa1)
            {
                q = a(q, aa, aa1);
                b(aa, q);
                return q;
            }

            final g.aa a(g.q q, Object obj, int k, g.aa aa)
            {
                return new g.h(q.e, obj, k, aa);
            }

        };
        h = new g.d("WEAK_ACCESS_WRITE") {

            final g.aa a(g.q q, g.aa aa, g.aa aa1)
            {
                q = a(q, aa, aa1);
                a(aa, ((g.aa) (q)));
                b(aa, q);
                return q;
            }

            final g.aa a(g.q q, Object obj, int k, g.aa aa)
            {
                return new g.e(q.e, obj, k, aa);
            }

        };
        j = (new j[] {
            a, b, c, d, e, f, g, h
        });
        i = (new i[] {
            a, b, c, d, e, f, g, h
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
