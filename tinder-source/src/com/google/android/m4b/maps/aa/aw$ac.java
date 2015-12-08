// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aw

static class b extends WeakReference
    implements b
{

    private int a;
    private on b;
    private volatile on c;

    public final b a()
    {
        return c;
    }

    public void a(long l)
    {
        throw new UnsupportedOperationException();
    }

    public final void a(on on)
    {
        on on1 = c;
        c = on;
        on1.b();
    }

    public void a(b b1)
    {
        throw new UnsupportedOperationException();
    }

    public final on b()
    {
        return b;
    }

    public void b(b b1)
    {
        throw new UnsupportedOperationException();
    }

    public final int c()
    {
        return a;
    }

    public void c(a a1)
    {
        throw new UnsupportedOperationException();
    }

    public final Object d()
    {
        return get();
    }

    public void d(get get)
    {
        throw new UnsupportedOperationException();
    }

    public long e()
    {
        throw new UnsupportedOperationException();
    }

    public on f()
    {
        throw new UnsupportedOperationException();
    }

    public on g()
    {
        throw new UnsupportedOperationException();
    }

    public on h()
    {
        throw new UnsupportedOperationException();
    }

    public on i()
    {
        throw new UnsupportedOperationException();
    }

    on(ReferenceQueue referencequeue, Object obj, int j, on on)
    {
        super(obj, referencequeue);
        c = aw.f();
        a = j;
        b = on;
    }
}
