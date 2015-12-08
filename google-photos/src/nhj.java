// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nhj extends Enum
    implements qwc
{

    private static nhj a;
    private static final nhj b[];

    private nhj(String s, int i)
    {
        super(s, 0);
    }

    public static qwc b()
    {
        return a;
    }

    public static nhj valueOf(String s)
    {
        return (nhj)Enum.valueOf(nhj, s);
    }

    public static nhj[] values()
    {
        return (nhj[])b.clone();
    }

    public final Object a()
    {
        return new nia();
    }

    static 
    {
        a = new nhj("INSTANCE", 0);
        b = (new nhj[] {
            a
        });
    }
}
