// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            RegularImmutableAsList, ImmutableList, UnmodifiableIterator, ObjectArrays

public abstract class ImmutableCollection extends AbstractCollection
    implements Serializable
{

    private transient ImmutableList asList;

    ImmutableCollection()
    {
    }

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableList asList()
    {
        ImmutableList immutablelist1 = asList;
        ImmutableList immutablelist = immutablelist1;
        if (immutablelist1 == null)
        {
            immutablelist = createAsList();
            asList = immutablelist;
        }
        return immutablelist;
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return obj != null && super.contains(obj);
    }

    int copyIntoArray(Object aobj[], int i)
    {
        for (Iterator iterator1 = iterator(); iterator1.hasNext();)
        {
            aobj[i] = iterator1.next();
            i++;
        }

        return i;
    }

    ImmutableList createAsList()
    {
        switch (size())
        {
        default:
            return new RegularImmutableAsList(this, toArray());

        case 0: // '\0'
            return ImmutableList.of();

        case 1: // '\001'
            return ImmutableList.of(iterator().next());
        }
    }

    abstract boolean isPartialView();

    public abstract UnmodifiableIterator iterator();

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public final boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray()
    {
        int i = size();
        if (i == 0)
        {
            return ObjectArrays.EMPTY_ARRAY;
        } else
        {
            Object aobj[] = new Object[i];
            copyIntoArray(aobj, 0);
            return aobj;
        }
    }

    public final Object[] toArray(Object aobj[])
    {
        int i;
        Preconditions.checkNotNull(((Object) (aobj)));
        i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = ObjectArrays.newArray(aobj, i);
_L4:
        copyIntoArray(aobj1, 0);
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

    Object writeReplace()
    {
        return new ImmutableList.SerializedForm(toArray());
    }
}
