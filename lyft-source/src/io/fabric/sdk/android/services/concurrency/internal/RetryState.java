// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.internal;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//            Backoff, RetryPolicy

public class RetryState
{

    private final int a;
    private final Backoff b;
    private final RetryPolicy c;

    public RetryState(int i, Backoff backoff, RetryPolicy retrypolicy)
    {
        a = i;
        b = backoff;
        c = retrypolicy;
    }

    public RetryState(Backoff backoff, RetryPolicy retrypolicy)
    {
        this(0, backoff, retrypolicy);
    }

    public long a()
    {
        return b.a(a);
    }

    public RetryState b()
    {
        return new RetryState(a + 1, b, c);
    }

    public RetryState c()
    {
        return new RetryState(b, c);
    }
}
