// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            oo, nr

public final class mr
    implements Comparable
{

    public final oo a;
    public final nr b;

    public final int a(mr mr1)
    {
        int i = a.a(mr1.a);
        if (i != 0)
        {
            return i;
        } else
        {
            return b.a(mr1.b);
        }
    }

    public final oo a()
    {
        return a;
    }

    public final nr b()
    {
        return b;
    }

    public final int compareTo(Object obj)
    {
        return a((mr)obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mr)
        {
            if (a.equals(((mr) (obj = (mr)obj)).a) && b.equals(((mr) (obj)).b))
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
        return (new StringBuilder()).append(a.h_()).append(":").append(b).toString();
    }
}
