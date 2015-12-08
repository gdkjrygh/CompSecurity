// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//            gr, gy, gg, hw

final class fr extends gr
{

    static final fr a = new fr();

    private fr()
    {
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    public final hw a()
    {
        return gy.a();
    }

    public final gg b()
    {
        return gg.d();
    }

    final boolean b_()
    {
        return true;
    }

    public final boolean contains(Object obj)
    {
        return false;
    }

    public final boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final boolean e()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return 0;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    public final Iterator iterator()
    {
        return gy.a();
    }

    public final int size()
    {
        return 0;
    }

    public final String toString()
    {
        return "[]";
    }

}
