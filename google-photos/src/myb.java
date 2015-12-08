// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class myb
{

    final long a;
    final long b;

    public myb(long l, long l1)
    {
        a = l;
        b = l1;
    }

    public myb(myb myb1)
    {
        a = myb1.a;
        b = myb1.b;
    }

    public final double a()
    {
        return (double)a / (double)b;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj instanceof myb)
            {
                obj = (myb)obj;
                if (a == ((myb) (obj)).a && b == ((myb) (obj)).b)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return ((int)(a ^ a >>> 32) + 527) * 31 + (int)(b ^ b >>> 32);
    }

    public final String toString()
    {
        long l = a;
        long l1 = b;
        return (new StringBuilder(41)).append(l).append("/").append(l1).toString();
    }
}
