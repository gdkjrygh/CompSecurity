// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bmw extends Enum
{

    public static final bmw a;
    public static final bmw b;
    private static final bmw c[];

    private bmw(String s, int i)
    {
        super(s, i);
    }

    public static bmw valueOf(String s)
    {
        return (bmw)Enum.valueOf(bmw, s);
    }

    public static bmw[] values()
    {
        return (bmw[])c.clone();
    }

    static 
    {
        a = new bmw("LOCAL", 0);
        b = new bmw("SERVER", 1);
        c = (new bmw[] {
            a, b
        });
    }
}
