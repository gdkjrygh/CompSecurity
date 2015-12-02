// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bta extends Enum
{

    public static final bta a;
    public static final bta b;
    private static final bta c[];

    private bta(String s, int i)
    {
        super(s, i);
    }

    public static bta valueOf(String s)
    {
        return (bta)Enum.valueOf(bta, s);
    }

    public static bta[] values()
    {
        return (bta[])c.clone();
    }

    static 
    {
        a = new bta("EMAIL", 0);
        b = new bta("PHONE", 1);
        c = (new bta[] {
            a, b
        });
    }
}
