// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bqp extends Enum
{

    public static final bqp a;
    public static final bqp b;
    private static final bqp c[];

    private bqp(String s, int i)
    {
        super(s, i);
    }

    public static bqp valueOf(String s)
    {
        return (bqp)Enum.valueOf(bqp, s);
    }

    public static bqp[] values()
    {
        return (bqp[])c.clone();
    }

    static 
    {
        a = new bqp("token", 0);
        b = new bqp("code", 1);
        c = (new bqp[] {
            a, b
        });
    }
}
