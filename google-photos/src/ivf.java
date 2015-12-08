// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ivf
    implements ivd
{

    private final long a;
    private final long b;

    ivf(long l, long l1)
    {
        a = l;
        b = l1;
    }

    public final long a()
    {
        return a;
    }

    public final boolean a(long l)
    {
        return l >= a && l <= b;
    }

    public final long b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ivf)
        {
            obj = (ivf)obj;
            flag = flag1;
            if (a == ((ivf) (obj)).a)
            {
                flag = flag1;
                if (b == ((ivf) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (int)(a ^ a >>> 32) + (int)(b ^ b >>> 32) * 31;
    }
}
