// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bil extends Enum
{

    public static final bil a;
    private static bil c;
    private static bil d;
    private static bil e;
    private static bil f;
    private static final bil g[];
    public final boolean b;

    private bil(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        b = flag1;
    }

    public static bil valueOf(String s)
    {
        return (bil)Enum.valueOf(bil, s);
    }

    public static bil[] values()
    {
        return (bil[])g.clone();
    }

    static 
    {
        c = new bil("POST_CAPTURE", 0, true, false);
        a = new bil("PLUGGED_IN", 1, true, false);
        d = new bil("PRE_PREVIEW", 2, false, true);
        e = new bil("LATE_ANALYSIS", 3, false, true);
        f = new bil("POST_SYNC", 4, true, false);
        g = (new bil[] {
            c, a, d, e, f
        });
    }
}
