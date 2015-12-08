// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package bo.app:
//            gq, gx, hv

final class ge extends gq
{

    private final transient EnumSet a;
    private transient int b;

    ge(EnumSet enumset)
    {
        a = enumset;
    }

    public final hv a()
    {
        return gx.a(a.iterator());
    }

    public final boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    final boolean e()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        return obj == this || a.equals(obj);
    }

    public final int hashCode()
    {
        int j = b;
        int i = j;
        if (j == 0)
        {
            i = a.hashCode();
            b = i;
        }
        return i;
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return a();
    }

    public final int size()
    {
        return a.size();
    }

    public final String toString()
    {
        return a.toString();
    }
}
