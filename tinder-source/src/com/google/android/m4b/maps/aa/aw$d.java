// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aw

static final class c extends 
    implements 
{

    private volatile long a;
    private c b;
    private c c;

    public final void a(long l)
    {
        a = l;
    }

    public final void a(a a1)
    {
        b = a1;
    }

    public final void b(b b1)
    {
        c = b1;
    }

    public final long e()
    {
        return a;
    }

    public final a f()
    {
        return b;
    }

    public final b g()
    {
        return c;
    }

    (ReferenceQueue referencequeue, Object obj, int i,  )
    {
        super(referencequeue, obj, i, );
        a = 0x7fffffffffffffffL;
        b = aw.g();
        c = aw.g();
    }
}
