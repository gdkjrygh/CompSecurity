// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class osi extends Enum
{

    private static osi b;
    private static osi c;
    private static final osi d[];
    final int a;

    private osi(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static osi a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder(34)).append("Invalid channel count: ").append(i).toString());

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;
        }
    }

    public static osi valueOf(String s)
    {
        return (osi)Enum.valueOf(osi, s);
    }

    public static osi[] values()
    {
        return (osi[])d.clone();
    }

    public final boolean a()
    {
        return this == c;
    }

    static 
    {
        b = new osi("MONO", 0, 1);
        c = new osi("STEREO", 1, 2);
        d = (new osi[] {
            b, c
        });
    }
}
