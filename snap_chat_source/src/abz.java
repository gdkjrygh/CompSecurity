// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abz
{

    public final abB a;
    private final abs b;
    private int c;
    private adS d;

    private abz(abs abs1, abB abb)
    {
        c = -1;
        b = abs1;
        a = abb;
    }

    static abz a(abs abs1, abB abb)
    {
        return new abz(abs1, abb);
    }

    final int a()
    {
        return a.l.e();
    }

    final int a(int i)
    {
        c = i;
        d = adS.a(i, a.l);
        return a();
    }

    public final adS b()
    {
        if (d == null)
        {
            b.a();
            if (d == null)
            {
                throw new AssertionError();
            }
        }
        return d;
    }

    public final String toString()
    {
        return (new StringBuilder("v")).append(c).append("(").append(a).append(")").toString();
    }
}
