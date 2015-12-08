// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hbv extends Enum
{

    public static final int a;
    public static final int b;
    public static final int c;
    private static final int d[];

    static int a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder(33)).append("Unknown scroll state: ").append(i).toString());

        case 1: // '\001'
            return a;

        case 0: // '\0'
            return b;

        case 2: // '\002'
            return c;
        }
    }

    static 
    {
        a = 1;
        b = 2;
        c = 3;
        d = (new int[] {
            a, b, c
        });
    }
}
