// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;


// Referenced classes of package org.c.e.b:
//            i, k, l, m, 
//            n, o, p, q, 
//            r, j

abstract class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    public static final h i;
    public static final h j;
    private static final h k[];

    private h(String s, int i1)
    {
        super(s, i1);
    }

    h(String s, int i1, byte byte0)
    {
        this(s, i1);
    }

    protected static boolean b(int i1)
    {
        return i1 >= 97 && i1 <= 122 || i1 >= 65 && i1 <= 90;
    }

    protected static boolean c(int i1)
    {
        return i1 >= 48 && i1 <= 57;
    }

    protected static boolean d(int i1)
    {
        return 33 == i1 || 36 == i1 || 38 == i1 || 39 == i1 || 40 == i1 || 41 == i1 || 42 == i1 || 43 == i1 || 44 == i1 || 59 == i1 || 61 == i1;
    }

    protected static boolean e(int i1)
    {
        return b(i1) || c(i1) || 45 == i1 || 46 == i1 || 95 == i1 || 126 == i1;
    }

    protected static boolean f(int i1)
    {
        return e(i1) || d(i1) || 58 == i1 || 64 == i1;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(org/c/e/b/h, s);
    }

    public static h[] values()
    {
        return (h[])k.clone();
    }

    public abstract boolean a(int i1);

    static 
    {
        a = new i("SCHEME");
        b = new k("AUTHORITY");
        c = new l("USER_INFO");
        d = new m("HOST");
        e = new n("PORT");
        f = new o("PATH");
        g = new p("PATH_SEGMENT");
        h = new q("QUERY");
        i = new r("QUERY_PARAM");
        j = new j("FRAGMENT");
        k = (new h[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
