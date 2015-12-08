// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableList, bl, ej

final class EmptyImmutableSet extends ImmutableSet
{

    static final EmptyImmutableSet INSTANCE = new EmptyImmutableSet();
    private static final long serialVersionUID = 0L;

    private EmptyImmutableSet()
    {
    }

    public final ImmutableList asList()
    {
        return ImmutableList.of();
    }

    public final boolean contains(Object obj)
    {
        return false;
    }

    public final boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final int copyIntoArray(Object aobj[], int i)
    {
        return i;
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

    final boolean isHashCodeFast()
    {
        return true;
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final ej iterator()
    {
        return bl.a();
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    final Object readResolve()
    {
        return INSTANCE;
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
