// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.concurrent.ThreadFactory;
import rx.internal.schedulers.NewThreadWorker;

final class expirationTime extends NewThreadWorker
{

    private long expirationTime;

    public long getExpirationTime()
    {
        return expirationTime;
    }

    public void setExpirationTime(long l)
    {
        expirationTime = l;
    }

    (ThreadFactory threadfactory)
    {
        super(threadfactory);
        expirationTime = 0L;
    }
}
