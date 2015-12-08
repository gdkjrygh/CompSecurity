// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g

static final class c extends c
{

    private volatile long a;
    private  b;
    private  c;

    public final void b(long l)
    {
        a = l;
    }

    public final void c( )
    {
        b = ;
    }

    public final long d()
    {
        return a;
    }

    public final void d( )
    {
        c = ;
    }

    public final  e()
    {
        return b;
    }

    public final  f()
    {
        return c;
    }

    (ReferenceQueue referencequeue, Object obj, int i,  )
    {
        super(referencequeue, obj, i, );
        a = 0x7fffffffffffffffL;
        b = g.k();
        c = g.k();
    }
}
