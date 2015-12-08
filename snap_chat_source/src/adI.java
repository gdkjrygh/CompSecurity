// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class adI
    implements Comparable
{

    public final aey a;
    public final aec b;

    public final int a(adI adi)
    {
        int i = a.a(adi.a);
        if (i != 0)
        {
            return i;
        } else
        {
            return b.a(adi.b);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((adI)obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof adI)
        {
            if (a.equals(((adI) (obj = (adI)obj)).a) && b.equals(((adI) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a.hashCode() * 31 + b.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a.ag_()).append(":").append(b).toString();
    }
}
