// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.c.j;
import java.util.concurrent.CountDownLatch;

final class ew
    implements j
{

    private final CountDownLatch a;

    ew(CountDownLatch countdownlatch)
    {
        a = countdownlatch;
    }

    public final void a(Object obj)
    {
        a.countDown();
    }
}
