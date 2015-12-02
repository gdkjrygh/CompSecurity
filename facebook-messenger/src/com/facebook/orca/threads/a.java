// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import java.util.concurrent.atomic.AtomicLong;

public class a
{

    public static AtomicLong a = new AtomicLong(0L);

    public a()
    {
    }

    public long a(long l)
    {
        return 0xf4240L * l + a.incrementAndGet();
    }

}
