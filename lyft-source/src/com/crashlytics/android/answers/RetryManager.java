// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.RetryState;

class RetryManager
{

    long a;
    private RetryState b;

    public RetryManager(RetryState retrystate)
    {
        if (retrystate == null)
        {
            throw new NullPointerException("retryState must not be null");
        } else
        {
            b = retrystate;
            return;
        }
    }

    public void a()
    {
        a = 0L;
        b = b.c();
    }

    public boolean a(long l)
    {
        long l1 = b.a();
        return l - a >= 0xf4240L * l1;
    }

    public void b(long l)
    {
        a = l;
        b = b.b();
    }
}
