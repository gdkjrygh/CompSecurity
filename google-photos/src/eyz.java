// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eyz extends Enum
{

    public static final eyz a;
    public static final eyz b;
    public static final eyz c;
    public static final eyz d;
    private static final eyz e[];

    private eyz(String s, int i)
    {
        super(s, i);
    }

    public static eyz valueOf(String s)
    {
        return (eyz)Enum.valueOf(eyz, s);
    }

    public static eyz[] values()
    {
        return (eyz[])e.clone();
    }

    static 
    {
        a = new eyz("ALL_PHOTOS_DAY", 0);
        b = new eyz("ALL_PHOTOS_MONTH", 1);
        c = new eyz("CHAPTER_MONTH", 2);
        d = new eyz("CHAPTER_YEAR", 3);
        e = (new eyz[] {
            a, b, c, d
        });
    }
}
