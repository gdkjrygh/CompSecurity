// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class exe extends Enum
{

    public static final exe a;
    public static final exe b;
    public static final exe c;
    public static final exe d;
    public static final exe e;
    public static final exe f;
    public static final exe g;
    public static final exe h;
    public static final exe i;
    public static final exe j;
    public static final exe k;
    private static final exe n[];
    final int l;
    final String m;

    private exe(String s, int i1, int j1, String s1)
    {
        super(s, i1);
        l = j1;
        m = s1;
    }

    public static exe valueOf(String s)
    {
        return (exe)Enum.valueOf(exe, s);
    }

    public static exe[] values()
    {
        return (exe[])n.clone();
    }

    static 
    {
        a = new exe("TIME", 0, b.nq, "h:m a");
        b = new exe("SHORT_DATE_WITH_YEAR", 1, b.nn, "MMM d, y");
        c = new exe("DAY", 2, b.nl, "EEEE, MMM d");
        d = new exe("DAY_WITH_YEAR", 3, b.nm, "EEEE, MMM d, y");
        e = new exe("DAY_OF_WEEK", 4, b.nr, "EEEE");
        f = new exe("MONTH", 5, b.ni, "LLLL");
        g = new exe("MONTH_WITH_YEAR", 6, b.nj, "MMMM y");
        h = new exe("SHORT_DATE_ONLY", 7, b.nk, "MMM d");
        i = new exe("SHORT_MONTH_ONLY", 8, b.no, "LLL");
        j = new exe("SHORT_MONTH_WITH_YEAR", 9, b.np, "MMM y");
        k = new exe("YEAR", 10, b.ns, "y");
        n = (new exe[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
