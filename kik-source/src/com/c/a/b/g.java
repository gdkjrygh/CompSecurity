// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.c.a.b:
//            v, w, m, ao

final class g extends v
{

    static final g a = new g();

    private g()
    {
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    public final ao a()
    {
        return w.a();
    }

    final boolean b()
    {
        return false;
    }

    public final m c()
    {
        return m.f();
    }

    public final boolean contains(Object obj)
    {
        return false;
    }

    public final boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final boolean d()
    {
        return true;
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
        return w.a();
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
