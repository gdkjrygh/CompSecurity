// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package bo.app:
//            hh, ez

final class fn extends hh
    implements Serializable
{

    final Comparator a;

    fn(Comparator comparator)
    {
        a = (Comparator)ez.a(comparator);
    }

    public final int compare(Object obj, Object obj1)
    {
        return a.compare(obj, obj1);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof fn)
        {
            obj = (fn)obj;
            return a.equals(((fn) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return a.toString();
    }
}
