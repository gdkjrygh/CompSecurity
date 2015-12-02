// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.core;


// Referenced classes of package com.facebook.loom.core:
//            AtomicIntegerBitSet

public final class TraceEvents
{

    private static final AtomicIntegerBitSet a = new AtomicIntegerBitSet();

    public TraceEvents()
    {
    }

    public static boolean a(int i)
    {
        return a.c(i);
    }

    static void b(int i)
    {
        a.a(i);
    }

    static void c(int i)
    {
        a.b(i);
    }

}
