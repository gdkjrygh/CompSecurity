// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, Iterators, UnmodifiableIterator

final class ImmutableEnumSet extends ImmutableSet
{
    private static class EnumSerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final EnumSet _flddelegate;

        Object readResolve()
        {
            return new ImmutableEnumSet(_flddelegate.clone());
        }

        EnumSerializedForm(EnumSet enumset)
        {
            _flddelegate = enumset;
        }
    }


    private final transient EnumSet _flddelegate;
    private transient int hashCode;

    ImmutableEnumSet(EnumSet enumset)
    {
        _flddelegate = enumset;
    }

    public boolean contains(Object obj)
    {
        return _flddelegate.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return _flddelegate.containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return obj == this || _flddelegate.equals(obj);
    }

    public int hashCode()
    {
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            i = _flddelegate.hashCode();
            hashCode = i;
        }
        return i;
    }

    public boolean isEmpty()
    {
        return _flddelegate.isEmpty();
    }

    boolean isPartialView()
    {
        return false;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.unmodifiableIterator(_flddelegate.iterator());
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return _flddelegate.size();
    }

    public Object[] toArray()
    {
        return _flddelegate.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return _flddelegate.toArray(aobj);
    }

    public String toString()
    {
        return _flddelegate.toString();
    }

    Object writeReplace()
    {
        return new EnumSerializedForm(_flddelegate);
    }
}
