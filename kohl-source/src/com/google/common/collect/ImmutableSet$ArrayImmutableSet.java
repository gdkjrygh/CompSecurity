// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableAsList, Iterators, ObjectArrays, 
//            ImmutableList, UnmodifiableIterator

static abstract class elements extends ImmutableSet
{

    final transient Object elements[];

    public boolean containsAll(Collection collection)
    {
        if (collection != this)
        {
            if (!(collection instanceof elements))
            {
                return super.containsAll(collection);
            }
            if (collection.size() > size())
            {
                return false;
            }
            collection = ((Collection) (((size)collection).elements));
            int j = collection.length;
            int i = 0;
            while (i < j) 
            {
                if (!contains(collection[i]))
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    ImmutableList createAsList()
    {
        return new ImmutableAsList(elements, this);
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isPartialView()
    {
        return false;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.forArray(elements);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return elements.length;
    }

    public Object[] toArray()
    {
        Object aobj[] = new Object[size()];
        System.arraycopy(((Object) (elements)), 0, ((Object) (aobj)), 0, size());
        return aobj;
    }

    public Object[] toArray(Object aobj[])
    {
        int i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = ObjectArrays.newArray(aobj, i);
_L4:
        System.arraycopy(((Object) (elements)), 0, ((Object) (aobj1)), 0, i);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (Object aobj[])
    {
        elements = aobj;
    }
}
