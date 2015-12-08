// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;


public final class n extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    private static final n f[];
    public final int e;

    private n(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static n a(String s)
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

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(b/a/a/a/a/b/n, s);
    }

    public static n[] values()
    {
        return (n[])f.clone();
    }

    public final String toString()
    {
        return Integer.toString(e);
    }

    static 
    {
        a = new n("DEVELOPER", 0, 1);
        b = new n("USER_SIDELOAD", 1, 2);
        c = new n("TEST_DISTRIBUTION", 2, 3);
        d = new n("APP_STORE", 3, 4);
        f = (new n[] {
            a, b, c, d
        });
    }
}
