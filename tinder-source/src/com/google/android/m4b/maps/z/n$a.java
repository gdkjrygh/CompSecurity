// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import sun.misc.Unsafe;

// Referenced classes of package com.google.android.m4b.maps.z:
//            n

static final class a
{

    private static final Unsafe b;
    private static final long c;
    volatile long a;

    final boolean a(long l, long l1)
    {
        return b.compareAndSwapLong(this, c, l, l1);
    }

    static 
    {
        try
        {
            b = n.c();
            c = b.objectFieldOffset(com/google/android/m4b/maps/z/n$a.getDeclaredField("value"));
        }
        catch (Exception exception)
        {
            throw new Error(exception);
        }
    }

    (long l)
    {
        a = l;
    }
}
