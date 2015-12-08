// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihq extends Enum
{

    public static final ihq a;
    public static final ihq b;
    private static final ihq c[];

    private ihq(String s, int i)
    {
        super(s, i);
    }

    public static ihq valueOf(String s)
    {
        return (ihq)Enum.valueOf(ihq, s);
    }

    public static ihq[] values()
    {
        return (ihq[])c.clone();
    }

    static 
    {
        a = new ihq("ORIGINAL", 0);
        b = new ihq("EDITED", 1);
        c = (new ihq[] {
            a, b
        });
    }
}
