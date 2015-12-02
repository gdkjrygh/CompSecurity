// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cbw extends Enum
{

    public static final cbw a;
    public static final cbw b;
    public static final cbw c;
    private static final cbw d[];

    private cbw(String s, int i)
    {
        super(s, i);
    }

    public static cbw valueOf(String s)
    {
        return (cbw)Enum.valueOf(cbw, s);
    }

    public static cbw[] values()
    {
        return (cbw[])d.clone();
    }

    static 
    {
        a = new cbw("PayPal", 0);
        b = new cbw("CreditCard", 1);
        c = new cbw("CreditCardToken", 2);
        d = (new cbw[] {
            a, b, c
        });
    }
}
