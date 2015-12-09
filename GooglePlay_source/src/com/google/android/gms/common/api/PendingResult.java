// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Result, ResultCallback, Status

public abstract class PendingResult
{
    public static interface StatusListener
    {

        public abstract void onComplete(Status status);
    }


    public PendingResult()
    {
    }

    public void addStatusListener(StatusListener statuslistener)
    {
        throw new UnsupportedOperationException();
    }

    public abstract Result await();

    public abstract Result await(long l, TimeUnit timeunit);

    public abstract void cancel();

    public Integer getResultId()
    {
        throw new UnsupportedOperationException();
    }

    public abstract void setResultCallback(ResultCallback resultcallback);
}
