// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hsw extends Enum
{

    public static final hsw a;
    public static final hsw b;
    public static final hsw c;
    public static final hsw d;
    public static final hsw e;
    public static final hsw f;
    public static final hsw g;
    public static final hsw h;
    public static final hsw i;
    private static final hsw l[];
    public final int j;
    private final int k;

    private hsw(String s, int i1, int j1)
    {
        super(s, i1);
        j = j1;
        k = 0;
    }

    private hsw(String s, int i1, int j1, int k1)
    {
        super(s, i1);
        j = j1;
        k = k1;
    }

    public static hsw valueOf(String s)
    {
        return (hsw)Enum.valueOf(hsw, s);
    }

    public static hsw[] values()
    {
        return (hsw[])l.clone();
    }

    public final int a()
    {
        if (k == 0)
        {
            String s = String.valueOf(name());
            if (s.length() != 0)
            {
                s = "No dbIndex for category: ".concat(s);
            } else
            {
                s = new String("No dbIndex for category: ");
            }
            throw new UnsupportedOperationException(s);
        } else
        {
            return k;
        }
    }

    public final boolean b()
    {
        return j != 0;
    }

    static 
    {
        a = new hsw("PEOPLE", 0, b.xq, 1);
        b = new hsw("PLACES", 1, b.xr, 2);
        c = new hsw("THINGS", 2, b.xs, 3);
        d = new hsw("TYPES", 3, b.xt);
        e = new hsw("ALBUM", 4, 0);
        f = new hsw("ALL", 5, 0, 4);
        g = new hsw("LOCAL", 6, 0);
        h = new hsw("TEXT", 7, 0);
        i = new hsw("UNKNOWN", 8, 0);
        l = (new hsw[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}
