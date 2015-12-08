// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;

// Referenced classes of package bo.app:
//            hi, fa

final class hq extends hi
    implements Serializable
{

    final hi a;

    hq(hi hi1)
    {
        a = (hi)fa.a(hi1);
    }

    public final hi a()
    {
        return a;
    }

    public final int compare(Object obj, Object obj1)
    {
        return a.compare(obj1, obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof hq)
        {
            obj = (hq)obj;
            return a.equals(((hq) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return -a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(".reverse()").toString();
    }
}
