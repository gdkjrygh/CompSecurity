// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package a.a:
//            ge, du

final class ej extends ge
    implements Serializable
{

    final Comparator a;

    ej(Comparator comparator)
    {
        a = (Comparator)du.a(comparator);
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
        if (obj instanceof ej)
        {
            obj = (ej)obj;
            return a.equals(((ej) (obj)).a);
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
