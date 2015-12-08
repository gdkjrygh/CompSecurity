// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bwt
    implements Comparable
{

    public cqc a;
    public int b;

    public bwt(cqc cqc1)
    {
        a = cqc1;
    }

    public final int compareTo(Object obj)
    {
        obj = (bwt)obj;
        if (((bwt) (obj)).b < b)
        {
            return -1;
        }
        return ((bwt) (obj)).b != b ? 1 : 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof bwt))
        {
            obj = (bwt)obj;
            if (a.equals(((bwt) (obj)).a) && b == ((bwt) (obj)).b)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return b.h(a, b);
    }
}
