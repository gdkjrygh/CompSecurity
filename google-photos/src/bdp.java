// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bdp extends Enum
{

    public static final bdp a;
    public static final bdp b;
    public static final bdp c;
    public static final bdp d;
    public static final bdp e;
    public static final bdp f;
    public static final bdp g;
    public static final bdp h;
    public static final bdp i;
    private static final bdp j[];

    private bdp(String s, int k)
    {
        super(s, k);
    }

    public static bdp valueOf(String s)
    {
        return (bdp)Enum.valueOf(bdp, s);
    }

    public static bdp[] values()
    {
        return (bdp[])j.clone();
    }

    static 
    {
        a = new bdp("MAIN", 0);
        b = new bdp("LOOKS", 1);
        c = new bdp("CROP_AND_ROTATE", 2);
        d = new bdp("CROP_AND_ROTATE_MODIFIED", 3);
        e = new bdp("ADJUSTMENTS", 4);
        f = new bdp("ADJUSTMENTS_LIGHT", 5);
        g = new bdp("ADJUSTMENTS_COLOR", 6);
        h = new bdp("ADJUSTMENTS_POP", 7);
        i = new bdp("ADJUSTMENTS_VIGNETTE", 8);
        j = (new bdp[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}
