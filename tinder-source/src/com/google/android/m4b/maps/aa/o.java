// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ao, aq, al, ae, 
//            aa

final class o extends ao
{

    private final transient aq a;

    o(Comparator comparator)
    {
        a = aq.a(comparator);
    }

    public final ao a(Object obj)
    {
        j.a(obj);
        return this;
    }

    final al b()
    {
        throw new AssertionError("should never be called");
    }

    public final ao b(Object obj)
    {
        j.a(obj);
        return this;
    }

    final boolean c()
    {
        return false;
    }

    public final Set entrySet()
    {
        return al.f();
    }

    public final al f()
    {
        return al.f();
    }

    public final al g()
    {
        return a;
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final aa h()
    {
        return ae.e();
    }

    public final aq i()
    {
        return a;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    public final Set keySet()
    {
        return a;
    }

    public final int size()
    {
        return 0;
    }

    public final String toString()
    {
        return "{}";
    }

    public final Collection values()
    {
        return ae.e();
    }
}
