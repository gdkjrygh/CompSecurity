// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ose extends Enum
{

    public static final ose a;
    public static final ose b;
    public static final ose c;
    private static final ose d[];

    private ose(String s, int i)
    {
        super(s, i);
    }

    public static ose valueOf(String s)
    {
        return (ose)Enum.valueOf(ose, s);
    }

    public static ose[] values()
    {
        return (ose[])d.clone();
    }

    static 
    {
        a = new ose("NOT_STARTED", 0);
        b = new ose("STARTED", 1);
        c = new ose("FINISHED", 2);
        d = (new ose[] {
            a, b, c
        });
    }
}
