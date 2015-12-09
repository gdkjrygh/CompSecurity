// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            v, y, bu, bx, 
//            bv

public final class bt extends v
{

    transient int a;
    private transient bu b;

    private bt()
    {
        super(new LinkedHashMap(16));
        a = 2;
        y.a(2, "expectedValuesPerKey");
        a = 2;
        b = new bu(null, null, 0, null);
        b(b, b);
    }

    static bu a(bt bt1)
    {
        return bt1.b;
    }

    static void a(bu bu1)
    {
        b(bu1.g, bu1.h);
    }

    static void a(bu bu1, bu bu2)
    {
        b(bu1, bu2);
    }

    static void a(bx bx1)
    {
        b(bx1.a(), bx1.b());
    }

    static void a(bx bx1, bx bx2)
    {
        b(bx1, bx2);
    }

    private static void b(bu bu1, bu bu2)
    {
        bu1.h = bu2;
        bu2.g = bu1;
    }

    private static void b(bx bx1, bx bx2)
    {
        bx1.b(bx2);
        bx2.a(bx1);
    }

    public static bt h()
    {
        return new bt();
    }

    final Collection a()
    {
        return g();
    }

    final Collection a(Object obj)
    {
        return new bv(this, obj, a);
    }

    public final volatile boolean a(Object obj, Object obj1)
    {
        return super.a(obj, obj1);
    }

    public final void b()
    {
        super.b();
        b(b, b);
    }

    public final volatile Set c(Object obj)
    {
        return super.c(obj);
    }

    public final volatile Set e()
    {
        return super.e();
    }

    public final volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final volatile Map f()
    {
        return super.f();
    }

    final Set g()
    {
        return new LinkedHashSet(a);
    }

    public final volatile int hashCode()
    {
        return super.hashCode();
    }

    public final volatile String toString()
    {
        return super.toString();
    }
}
