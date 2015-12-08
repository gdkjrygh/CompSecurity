// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class njx extends Enum
{

    public static final njx a;
    public static final njx b;
    public static final njx c;
    public static final njx d;
    private static final njx f[];
    final int e;

    private njx(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static njx a(int i)
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

    public static njx valueOf(String s)
    {
        return (njx)Enum.valueOf(njx, s);
    }

    public static njx[] values()
    {
        return (njx[])f.clone();
    }

    static 
    {
        a = new njx("IMAGE", 0, 0);
        b = new njx("VIDEO", 1, 1);
        c = new njx("PANORAMA", 2, 2);
        d = new njx("ANIMATION", 3, 3);
        f = (new njx[] {
            a, b, c, d
        });
    }
}
