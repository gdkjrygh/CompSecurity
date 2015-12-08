// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuv;
import cuw;
import cvh;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, EmptyImmutableSet

final class ImmutableEnumSet extends ImmutableSet
{

    private final transient EnumSet a;
    private transient int b;

    private ImmutableEnumSet(EnumSet enumset)
    {
        a = enumset;
    }

    ImmutableEnumSet(EnumSet enumset, byte byte0)
    {
        this(enumset);
    }

    static ImmutableSet a(EnumSet enumset)
    {
        switch (enumset.size())
        {
        default:
            return new ImmutableEnumSet(enumset);

        case 0: // '\0'
            return EmptyImmutableSet.a;

        case 1: // '\001'
            return ImmutableSet.b(cuv.a(enumset));
        }
    }

    public final cvh a()
    {
        return cuw.a(a.iterator());
    }

    public final boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    final boolean e()
    {
        return false;
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

    public final Iterator iterator()
    {
        return a();
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
            return new ImmutableEnumSet(_flddelegate.clone(), (byte)0);
        }

        EnumSerializedForm(EnumSet enumset)
        {
            _flddelegate = enumset;
        }
    }

}
