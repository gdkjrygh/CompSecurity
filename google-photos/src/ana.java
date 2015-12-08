// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ana extends Enum
{

    public static final ana a;
    public static final ana b;
    private static ana c;
    private static final ana d[];

    private ana(String s, int i)
    {
        super(s, i);
    }

    public static ana valueOf(String s)
    {
        return (ana)Enum.valueOf(ana, s);
    }

    public static ana[] values()
    {
        return (ana[])d.clone();
    }

    static 
    {
        a = new ana("PREFER_ARGB_8888", 0);
        c = new ana("PREFER_RGB_565", 1);
        d = (new ana[] {
            a, c
        });
        b = a;
    }
}
