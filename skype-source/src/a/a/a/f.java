// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    private static final f g[];
    private final int f;

    private f(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(a/a/a/f, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    public final int a()
    {
        return f;
    }

    static 
    {
        a = new f("NotSet", 0, 0);
        b = new f("O365", 1, 1);
        c = new f("SkypeBI", 2, 2);
        d = new f("SkypeData", 3, 3);
        e = new f("__INVALID_ENUM_VALUE", 4, 4);
        g = (new f[] {
            a, b, c, d, e
        });
    }
}
