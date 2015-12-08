// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mqu extends Enum
{

    public static final mqu a;
    public static final mqu b;
    public static final mqu c;
    public static final mqu d;
    public static final mqu e;
    public static final mqu f;
    private static jz h;
    private static final mqu i[];
    public final String g;

    private mqu(String s, int j, String s1)
    {
        super(s, j);
        g = s1;
    }

    public static mqu a(String s)
    {
        return (mqu)h.get(s);
    }

    public static mqu valueOf(String s)
    {
        return (mqu)Enum.valueOf(mqu, s);
    }

    public static mqu[] values()
    {
        return (mqu[])i.clone();
    }

    static 
    {
        int j = 0;
        a = new mqu("QUEUED", 0, "Queued");
        b = new mqu("IN_PROGRESS", 1, "InProgress");
        c = new mqu("COMPLETE", 2, "Complete");
        d = new mqu("ERROR", 3, "Error");
        e = new mqu("FAILED", 4, "Failed");
        f = new mqu("CANCELLED", 5, "Cancelled");
        i = (new mqu[] {
            a, b, c, d, e, f
        });
        h = new jz();
        mqu amqu[] = values();
        for (int k = amqu.length; j < k; j++)
        {
            mqu mqu1 = amqu[j];
            h.put(mqu1.g, mqu1);
        }

    }
}
