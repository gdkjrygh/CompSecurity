// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.internal;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//            Backoff

public class ExponentialBackoff
    implements Backoff
{

    private final long constant;

    public ExponentialBackoff(long l)
    {
        constant = l;
    }

    public long getDelayMillis(int i)
    {
        return (long)((double)constant * Math.pow(2D, i));
    }
}
