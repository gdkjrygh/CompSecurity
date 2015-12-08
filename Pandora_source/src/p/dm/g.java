// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    private static final g f[];
    private int e;

    private g(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static g a(int i)
    {
        switch (i)
        {
        default:
            return a;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;
        }
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(p/dm/g, s);
    }

    public static g[] values()
    {
        return (g[])f.clone();
    }

    static 
    {
        a = new g("NO_FRAME_LOGGING", 0, 0);
        b = new g("BYTES", 1, 1);
        c = new g("NAMES", 2, 2);
        d = new g("DIAGRAM", 3, 2);
        f = (new g[] {
            a, b, c, d
        });
    }
}
