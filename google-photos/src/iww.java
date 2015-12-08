// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iww extends Enum
{

    public static final iww a;
    public static final iww b;
    private static final iww c[];

    private iww(String s, int i)
    {
        super(s, i);
    }

    public static iww valueOf(String s)
    {
        return (iww)Enum.valueOf(iww, s);
    }

    public static iww[] values()
    {
        return (iww[])c.clone();
    }

    static 
    {
        a = new iww("SELECTION", 0);
        b = new iww("LOCAL", 1);
        c = (new iww[] {
            a, b
        });
    }
}
