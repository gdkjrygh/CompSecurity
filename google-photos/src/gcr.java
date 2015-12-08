// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gcr extends Enum
{

    public static final gcr a;
    public static final gcr b;
    public static final gcr c;
    public static final gcr d;
    private static final gcr e[];

    private gcr(String s, int i)
    {
        super(s, i);
    }

    public static gcr valueOf(String s)
    {
        return (gcr)Enum.valueOf(gcr, s);
    }

    public static gcr[] values()
    {
        return (gcr[])e.clone();
    }

    static 
    {
        a = new gcr("CURRENT_SYNC", 0);
        b = new gcr("NEXT_SYNC", 1);
        c = new gcr("INITIAL_RESUME", 2);
        d = new gcr("DELTA_RESUME", 3);
        e = (new gcr[] {
            a, b, c, d
        });
    }
}
