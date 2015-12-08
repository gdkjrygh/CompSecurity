// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bgm extends Enum
{

    public static final bgm a;
    public static final bgm b;
    private static final bgm c[];

    private bgm(String s, int i)
    {
        super(s, i);
    }

    public static bgm valueOf(String s)
    {
        return (bgm)Enum.valueOf(bgm, s);
    }

    public static bgm[] values()
    {
        return (bgm[])c.clone();
    }

    static 
    {
        a = new bgm("ERROR", 0);
        b = new bgm("WARNING", 1);
        c = (new bgm[] {
            a, b
        });
    }
}
