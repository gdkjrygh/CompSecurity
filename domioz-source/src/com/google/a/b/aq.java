// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            be, ae, bl, di

final class aq extends be
{

    private final transient EnumSet a;
    private transient int b;

    private aq(EnumSet enumset)
    {
        a = enumset;
    }

    static be a(EnumSet enumset)
    {
        switch (enumset.size())
        {
        default:
            return new aq(enumset);

        case 0: // '\0'
            return ae.a;

        case 1: // '\001'
            return be.a(bl.d(enumset.iterator()));
        }
    }

    public final di a()
    {
        return bl.a(a.iterator());
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
}
