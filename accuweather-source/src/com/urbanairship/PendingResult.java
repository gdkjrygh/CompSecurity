// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;


public interface PendingResult
{
    public static interface ResultCallback
    {

        public abstract void onResult(Object obj);
    }


    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract boolean isDone();

    public abstract void onResult(ResultCallback resultcallback);
}
