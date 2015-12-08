// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class k extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    private static final k f[];
    private final int e;

    private k(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static k a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;
        }
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(b/a/k, s);
    }

    public static k[] values()
    {
        return (k[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new k("ACCESS_TYPE_UNKNOWN", 0, 0);
        b = new k("ACCESS_TYPE_2G_3G", 1, 1);
        c = new k("ACCESS_TYPE_WIFI", 2, 2);
        d = new k("ACCESS_TYPE_ETHERNET", 3, 3);
        f = (new k[] {
            a, b, c, d
        });
    }
}
