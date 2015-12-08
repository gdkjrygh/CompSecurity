// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuw;
import cvh;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableList

final class EmptyImmutableSet extends ImmutableSet
{

    static final EmptyImmutableSet a = new EmptyImmutableSet();
    private static final long serialVersionUID = 0L;

    private EmptyImmutableSet()
    {
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    public final cvh a()
    {
        return cuw.a();
    }

    public final ImmutableList b()
    {
        return ImmutableList.d();
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
        return cuw.a();
    }

    final boolean n_()
    {
        return true;
    }

    final Object readResolve()
    {
        return a;
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
