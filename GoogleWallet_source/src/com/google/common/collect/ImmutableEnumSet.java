// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, Iterables, Iterators, UnmodifiableIterator

final class ImmutableEnumSet extends ImmutableSet
{
    static final class EnumSerializedForm
        implements Serializable
    {

        final EnumSet _flddelegate;

        EnumSerializedForm(EnumSet enumset)
        {
            _flddelegate = enumset;
        }
    }


    private final transient EnumSet _flddelegate;
    private transient int hashCode;

    private ImmutableEnumSet(EnumSet enumset)
    {
        _flddelegate = enumset;
    }

    static ImmutableSet asImmutable(EnumSet enumset)
    {
        switch (enumset.size())
        {
        default:
            return new ImmutableEnumSet(enumset);

        case 0: // '\0'
            return ImmutableSet.of();

        case 1: // '\001'
            return ImmutableSet.of(Iterables.getOnlyElement(enumset));
        }
    }

    public final boolean contains(Object obj)
    {
        return _flddelegate.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return _flddelegate.containsAll(collection);
    }

    public final boolean equals(Object obj)
    {
        return obj == this || _flddelegate.equals(obj);
    }

    public final int hashCode()
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

    public final boolean isEmpty()
    {
        return _flddelegate.isEmpty();
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final UnmodifiableIterator iterator()
    {
        return Iterators.unmodifiableIterator(_flddelegate.iterator());
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int size()
    {
        return _flddelegate.size();
    }

    public final String toString()
    {
        return _flddelegate.toString();
    }

    final Object writeReplace()
    {
        return new EnumSerializedForm(_flddelegate);
    }
}
