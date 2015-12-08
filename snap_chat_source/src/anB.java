// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class anB extends alw
{

    private final String d;
    private final int e;
    private final int f;

    public anB(String s, String s1, int i, int j)
    {
        super(s);
        d = s1;
        e = i;
        f = j;
    }

    public final String a(long l)
    {
        return d;
    }

    public final int b(long l)
    {
        return e;
    }

    public final int c(long l)
    {
        return e;
    }

    public final boolean c()
    {
        return true;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof anB)
            {
                if (!super.c.equals(((alw) (obj = (anB)obj)).c) || f != ((anB) (obj)).f || e != ((anB) (obj)).e)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final long f(long l)
    {
        return l;
    }

    public final long g(long l)
    {
        return l;
    }

    public final int hashCode()
    {
        return super.c.hashCode() + f * 37 + e * 31;
    }
}
