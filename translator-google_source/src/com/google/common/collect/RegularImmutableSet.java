// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, an, RegularImmutableAsList, bl, 
//            ImmutableList, ej

final class RegularImmutableSet extends ImmutableSet
{

    private final transient int a;
    private final transient int b;
    private final Object elements[];
    final transient Object table[];

    RegularImmutableSet(Object aobj[], int i, Object aobj1[], int j)
    {
        elements = aobj;
        table = aobj1;
        a = j;
        b = i;
    }

    public final boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int i = an.a(obj.hashCode());
        do
        {
            Object obj1 = table[a & i];
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

    final int copyIntoArray(Object aobj[], int i)
    {
        System.arraycopy(((Object) (elements)), 0, ((Object) (aobj)), i, elements.length);
        return elements.length + i;
    }

    final ImmutableList createAsList()
    {
        return new RegularImmutableAsList(this, elements);
    }

    public final int hashCode()
    {
        return b;
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
        return bl.a(elements);
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int size()
    {
        return elements.length;
    }
}
