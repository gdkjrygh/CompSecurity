// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gas extends Enum
{

    public static final gas a;
    public static final gas b;
    private static final gas c[];

    private gas(String s, int i)
    {
        super(s, i);
    }

    public static gas valueOf(String s)
    {
        return (gas)Enum.valueOf(gas, s);
    }

    public static gas[] values()
    {
        return (gas[])c.clone();
    }

    static 
    {
        a = new gas("REMOTE", 0);
        b = new gas("LOCAL", 1);
        c = (new gas[] {
            a, b
        });
    }
}
