// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import com.google.android.m4b.maps.d.a;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            k

public abstract class e
{

    private static final String a = com/google/android/m4b/maps/ay/e.getSimpleName();
    private a b;
    private long c;
    private final long d;
    private final k e;

    public e(long l)
    {
        this(l, new k());
    }

    private e(long l, k k1)
    {
        b = null;
        d = l;
        e = k1;
    }

    public abstract a a();

    public final a b()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        long l;
        l = k.c();
        if (b != null && l < c)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        a1 = a();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        b = a1;
        c = l + d;
        a1 = b;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

}
