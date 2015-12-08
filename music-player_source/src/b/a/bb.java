// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class bb extends Enum
{

    public static final bb a;
    public static final bb b;
    private static final bb d[];
    private final int c;

    private bb(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    public static bb a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;
        }
    }

    public static bb valueOf(String s)
    {
        return (bb)Enum.valueOf(b/a/bb, s);
    }

    public static bb[] values()
    {
        return (bb[])d.clone();
    }

    public final int a()
    {
        return c;
    }

    static 
    {
        a = new bb("LEGIT", 0, 1);
        b = new bb("ALIEN", 1, 2);
        d = (new bb[] {
            a, b
        });
    }
}
