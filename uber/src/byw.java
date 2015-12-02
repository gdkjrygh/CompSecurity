// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class byw extends Enum
{

    public static final byw a;
    public static final byw b;
    public static final byw c;
    public static final byw d;
    private static final byw e[];

    private byw(String s, int i)
    {
        super(s, i);
    }

    public static byw valueOf(String s)
    {
        return (byw)Enum.valueOf(byw, s);
    }

    public static byw[] values()
    {
        return (byw[])e.clone();
    }

    static 
    {
        a = new byw("FUTURE_PAYMENTS", 0);
        b = new byw("FINANCIAL_INSTRUMENTS", 1);
        c = new byw("SEND_MONEY", 2);
        d = new byw("REQUEST_MONEY", 3);
        e = (new byw[] {
            a, b, c, d
        });
    }
}
