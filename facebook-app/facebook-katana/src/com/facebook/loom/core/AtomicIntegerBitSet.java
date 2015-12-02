// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.core;

import java.util.concurrent.atomic.AtomicInteger;

final class AtomicIntegerBitSet
{

    private final AtomicInteger a = new AtomicInteger(0);

    AtomicIntegerBitSet()
    {
    }

    final void a(int i)
    {
        int j;
        int k;
        do
        {
            j = a.get();
            k = j | i;
        } while (j != k && !a.compareAndSet(j, k));
    }

    final void b(int i)
    {
        int j;
        int k;
        do
        {
            j = a.get();
            k = j & ~i;
        } while (j != k && !a.compareAndSet(j, k));
    }

    final boolean c(int i)
    {
        return (a.get() & i) == i;
    }
}
