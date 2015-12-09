// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class azo
{

    public final long a;
    public final long b;

    public azo(long l, long l1)
    {
        a = l;
        b = l1;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof azo)
            {
                if (((azo) (obj = (azo)obj)).a != a || ((azo) (obj)).b != b)
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

    public final int hashCode()
    {
        return (int)(0L | (a + b) / 1000L & 0x3fffffffL);
    }
}
