// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            al, e, ae, x

final class m extends al
{

    static final m a = new m();
    private static final long serialVersionUID = 0L;

    private m()
    {
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    public final x a()
    {
        return e.a();
    }

    public final ae b()
    {
        return ae.e();
    }

    public final boolean contains(Object obj)
    {
        return false;
    }

    public final boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final boolean d()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    final boolean g()
    {
        return true;
    }

    public final int hashCode()
    {
        return 0;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    public final Iterator iterator()
    {
        return e.a();
    }

    final Object readResolve()
    {
        return a;
    }

    public final int size()
    {
        return 0;
    }

    public final String toString()
    {
        return "[]";
    }

}
