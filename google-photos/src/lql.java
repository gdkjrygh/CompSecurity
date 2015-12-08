// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lql extends Enum
{

    public static final lql a;
    public static final lql b;
    public static final lql c;
    private static final lql d[];

    private lql(String s, int i)
    {
        super(s, i);
    }

    public static lql valueOf(String s)
    {
        return (lql)Enum.valueOf(lql, s);
    }

    public static lql[] values()
    {
        return (lql[])d.clone();
    }

    static 
    {
        a = new lql("NONE", 0);
        b = new lql("CONTAINER", 1);
        c = new lql("CONTAINER_DEBUG", 2);
        d = (new lql[] {
            a, b, c
        });
    }
}
