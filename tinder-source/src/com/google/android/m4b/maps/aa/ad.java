// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            al, m, d, e, 
//            x

final class ad extends al
{
    static final class a
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private EnumSet a;

        final Object readResolve()
        {
            return new ad(a.clone(), (byte)0);
        }

        a(EnumSet enumset)
        {
            a = enumset;
        }
    }


    private final transient EnumSet a;
    private transient int b;

    private ad(EnumSet enumset)
    {
        a = enumset;
    }

    ad(EnumSet enumset, byte byte0)
    {
        this(enumset);
    }

    static al a(EnumSet enumset)
    {
        switch (enumset.size())
        {
        default:
            return new ad(enumset);

        case 0: // '\0'
            return m.a;

        case 1: // '\001'
            return al.a(com.google.android.m4b.maps.aa.d.a(enumset));
        }
    }

    public final x a()
    {
        return e.a(a.iterator());
    }

    public final boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    final boolean d()
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
        return new a(a);
    }
}
