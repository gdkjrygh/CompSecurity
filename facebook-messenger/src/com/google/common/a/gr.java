// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            at, kl, ik, gt, 
//            gs, jf

public final class gr extends at
{

    transient int a;
    transient Collection b;

    private gr()
    {
        super(new LinkedHashMap());
        a = 8;
        b = kl.b();
    }

    public static gr m()
    {
        return new gr();
    }

    Set a()
    {
        return new LinkedHashSet(ik.b(a));
    }

    public volatile Set a(Object obj)
    {
        return super.a(obj);
    }

    public Set a(Object obj, Iterable iterable)
    {
        return super.a(obj, iterable);
    }

    public volatile boolean a(Object obj, Object obj1)
    {
        return super.a(obj, obj1);
    }

    public Collection b(Object obj, Iterable iterable)
    {
        return a(obj, iterable);
    }

    public volatile Map b()
    {
        return super.b();
    }

    public volatile Set b(Object obj)
    {
        return super.b(obj);
    }

    public volatile boolean b(Object obj, Object obj1)
    {
        return super.b(obj, obj1);
    }

    Collection c()
    {
        return a();
    }

    public volatile boolean c(Object obj, Iterable iterable)
    {
        return super.c(obj, iterable);
    }

    public volatile boolean c(Object obj, Object obj1)
    {
        return super.c(obj, obj1);
    }

    public volatile int d()
    {
        return super.d();
    }

    Collection e(Object obj)
    {
        return new gt(this, obj, a());
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile void f()
    {
        super.f();
    }

    public volatile boolean f(Object obj)
    {
        return super.f(obj);
    }

    public volatile Set g()
    {
        return super.g();
    }

    public volatile jf h()
    {
        return super.h();
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public Collection i()
    {
        return l();
    }

    Iterator k()
    {
        return new gs(this, b.iterator());
    }

    public Set l()
    {
        return super.l();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
