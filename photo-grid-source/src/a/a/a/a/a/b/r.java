// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;


public final class r extends Enum
{

    public static final r a;
    public static final r b;
    public static final r c;
    public static final r d;
    private static final r f[];
    private final int e;

    private r(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static r a(String s)
    {
        if ("io.crash.air".equals(s))
        {
            return c;
        }
        if (s != null)
        {
            return d;
        } else
        {
            return a;
        }
    }

    public static r valueOf(String s)
    {
        return (r)Enum.valueOf(a/a/a/a/a/b/r, s);
    }

    public static r[] values()
    {
        return (r[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    public final String toString()
    {
        return Integer.toString(e);
    }

    static 
    {
        a = new r("DEVELOPER", 0, 1);
        b = new r("USER_SIDELOAD", 1, 2);
        c = new r("TEST_DISTRIBUTION", 2, 3);
        d = new r("APP_STORE", 3, 4);
        f = (new r[] {
            a, b, c, d
        });
    }
}
