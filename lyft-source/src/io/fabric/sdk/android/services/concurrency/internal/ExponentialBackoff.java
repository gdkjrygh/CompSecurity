// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.internal;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//            Backoff

public class ExponentialBackoff
    implements Backoff
{

    private final long a;
    private final int b;

    public ExponentialBackoff(long l, int i)
    {
        a = l;
        b = i;
    }

    public long a(int i)
    {
        return (long)((double)a * Math.pow(b, i));
    }
}
