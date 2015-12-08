// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.k;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            dl, Multisets, bl, dm, 
//            ab, ac

abstract class aa extends AbstractCollection
    implements dl
{

    private transient Set a;
    private transient Set b;

    aa()
    {
    }

    public int add(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean add(Object obj)
    {
        add(obj, 1);
        return true;
    }

    public boolean addAll(Collection collection)
    {
        return Multisets.a(this, collection);
    }

    public void clear()
    {
        bl.d(entryIterator());
    }

    public boolean contains(Object obj)
    {
        return count(obj) > 0;
    }

    public int count(Object obj)
    {
        for (Iterator iterator1 = entrySet().iterator(); iterator1.hasNext();)
        {
            dm dm1 = (dm)iterator1.next();
            if (k.a(dm1.getElement(), obj))
            {
                return dm1.getCount();
            }
        }

        return 0;
    }

    Set createElementSet()
    {
        return new ab(this);
    }

    Set createEntrySet()
    {
        return new ac(this);
    }

    abstract int distinctElements();

    public Set elementSet()
    {
        Set set1 = a;
        Set set = set1;
        if (set1 == null)
        {
            set = createElementSet();
            a = set;
        }
        return set;
    }

    abstract Iterator entryIterator();

    public Set entrySet()
    {
        Set set1 = b;
        Set set = set1;
        if (set1 == null)
        {
            set = createEntrySet();
            b = set;
        }
        return set;
    }

    public boolean equals(Object obj)
    {
        return Multisets.a(this, obj);
    }

    public int hashCode()
    {
        return entrySet().hashCode();
    }

    public boolean isEmpty()
    {
        return entrySet().isEmpty();
    }

    public Iterator iterator()
    {
        return Multisets.a(this);
    }

    public int remove(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj)
    {
        return remove(obj, 1) > 0;
    }

    public boolean removeAll(Collection collection)
    {
        return Multisets.b(this, collection);
    }

    public boolean retainAll(Collection collection)
    {
        return Multisets.c(this, collection);
    }

    public int setCount(Object obj, int i)
    {
        return Multisets.a(this, obj, i);
    }

    public boolean setCount(Object obj, int i, int j)
    {
        return Multisets.a(this, obj, i, j);
    }

    public int size()
    {
        return Multisets.b(this);
    }

    public String toString()
    {
        return entrySet().toString();
    }
}
