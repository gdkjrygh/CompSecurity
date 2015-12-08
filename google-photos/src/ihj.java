// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihj extends Enum
{

    public static final ihj a;
    public static final ihj b;
    public static final ihj c;
    private static final ihj d[];

    private ihj(String s, int i)
    {
        super(s, i);
    }

    public static ihj valueOf(String s)
    {
        return (ihj)Enum.valueOf(ihj, s);
    }

    public static ihj[] values()
    {
        return (ihj[])d.clone();
    }

    static 
    {
        a = new ihj("ALBUM", 0);
        b = new ihj("PHOTO", 1);
        c = new ihj("STORY", 2);
        d = (new ihj[] {
            a, b, c
        });
    }
}
