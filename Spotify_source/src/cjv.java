// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class cjv
{

    public final String a;
    public final double b;
    public final int c;
    private double d;
    private double e;

    public cjv(String s, double d1, double d2, double d3, 
            int i)
    {
        a = s;
        e = d1;
        d = d2;
        b = d3;
        c = i;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof cjv)
        {
            if (btj.a(a, ((cjv) (obj = (cjv)obj)).a) && d == ((cjv) (obj)).d && e == ((cjv) (obj)).e && c == ((cjv) (obj)).c && Double.compare(b, ((cjv) (obj)).b) == 0)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, Double.valueOf(d), Double.valueOf(e), Double.valueOf(b), Integer.valueOf(c)
        });
    }

    public final String toString()
    {
        return btj.a(this).a("name", a).a("minBound", Double.valueOf(e)).a("maxBound", Double.valueOf(d)).a("percent", Double.valueOf(b)).a("count", Integer.valueOf(c)).toString();
    }
}
