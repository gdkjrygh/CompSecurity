// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hbq extends Enum
{

    public static final hbq a;
    public static final hbq b;
    private static final hbq c[];

    private hbq(String s, int i)
    {
        super(s, i);
    }

    public static hbq valueOf(String s)
    {
        return (hbq)Enum.valueOf(hbq, s);
    }

    public static hbq[] values()
    {
        return (hbq[])c.clone();
    }

    static 
    {
        a = new hbq("PHOTO", 0);
        b = new hbq("HEADER", 1);
        c = (new hbq[] {
            a, b
        });
    }
}
