// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package bo.app:
//            hi, fa

final class fo extends hi
    implements Serializable
{

    final Comparator a;

    fo(Comparator comparator)
    {
        a = (Comparator)fa.a(comparator);
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
        if (obj instanceof fo)
        {
            obj = (fo)obj;
            return a.equals(((fo) (obj)).a);
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
