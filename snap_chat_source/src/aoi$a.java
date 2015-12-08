// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    public final int e;

    static ang.Enum a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Id=")).append(i).append(" is not supported").toString());

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

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(aoi$a, s);
    }

    public static ang.String[] values()
    {
        return ([])f.clone();
    }

    static 
    {
        a = new <init>("PURCHASED", 0, 0);
        b = new <init>("CANCELLED", 1, 1);
        c = new <init>("REFUNDED", 2, 2);
        d = new <init>("EXPIRED", 3, 3);
        f = (new f[] {
            a, b, c, d
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        e = j;
    }
}
