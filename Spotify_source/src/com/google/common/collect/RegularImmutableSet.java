// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cum;
import cuw;
import cvh;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, RegularImmutableAsList, ImmutableList

final class RegularImmutableSet extends ImmutableSet
{

    private transient Object a[];
    private final transient int b;
    private final transient int c;
    private final Object elements[];

    RegularImmutableSet(Object aobj[], int i, Object aobj1[], int j)
    {
        elements = aobj;
        a = aobj1;
        b = j;
        c = i;
    }

    final int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (elements)), 0, ((Object) (aobj)), i, elements.length);
        return elements.length + i;
    }

    public final cvh a()
    {
        return cuw.a(elements);
    }

    public final boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int i = cum.a(obj.hashCode());
        do
        {
            Object obj1 = a[b & i];
            if (obj1 == null)
            {
                return false;
            }
            if (obj1.equals(obj))
            {
                return true;
            }
            i++;
        } while (true);
    }

    final boolean e()
    {
        return false;
    }

    final ImmutableList f()
    {
        return new RegularImmutableAsList(this, elements);
    }

    public final int hashCode()
    {
        return c;
    }

    public final Iterator iterator()
    {
        return cuw.a(elements);
    }

    final boolean n_()
    {
        return true;
    }

    public final int size()
    {
        return elements.length;
    }
}
