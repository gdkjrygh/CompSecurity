// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, bk, bl, as, 
//            ej

final class ImmutableEnumSet extends ImmutableSet
{

    private final transient EnumSet a;
    private transient int b;

    private ImmutableEnumSet(EnumSet enumset)
    {
        a = enumset;
    }

    ImmutableEnumSet(EnumSet enumset, as as)
    {
        this(enumset);
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
            return ImmutableSet.of(bk.a(enumset));
        }
    }

    public final boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    public final boolean equals(Object obj)
    {
        return obj == this || a.equals(obj);
    }

    public final int hashCode()
    {
        int j = b;
        int i = j;
        if (j == 0)
        {
            i = a.hashCode();
            b = i;
        }
        return i;
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final ej iterator()
    {
        return bl.a(a.iterator());
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int size()
    {
        return a.size();
    }

    public final String toString()
    {
        return a.toString();
    }

    final Object writeReplace()
    {
        return new EnumSerializedForm(a);
    }

    private class EnumSerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final EnumSet _flddelegate;

        Object readResolve()
        {
            return new ImmutableEnumSet(_flddelegate.clone(), null);
        }

        EnumSerializedForm(EnumSet enumset)
        {
            _flddelegate = enumset;
        }
    }

}
