// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fbn extends Enum
{

    public static final fbn a;
    public static final fbn b;
    public static final fbn c;
    private static final fbn d[];

    private fbn(String s, int i)
    {
        super(s, i);
    }

    static fbn a(fbn fbn1, fbn fbn2)
    {
        if (fbn1 == null || fbn1 == fbn2)
        {
            return fbn2;
        } else
        {
            return c;
        }
    }

    static fbn a(fco fco1)
    {
        switch (fbo.a[fco1.ordinal()])
        {
        default:
            return c;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;
        }
    }

    public static fbn valueOf(String s)
    {
        return (fbn)Enum.valueOf(fbn, s);
    }

    public static fbn[] values()
    {
        return (fbn[])d.clone();
    }

    static 
    {
        a = new fbn("ALL_ORIGINAL", 0);
        b = new fbn("ALL_HIGH", 1);
        c = new fbn("ORIGINAL_HIGH_MIXED", 2);
        d = (new fbn[] {
            a, b, c
        });
    }
}
