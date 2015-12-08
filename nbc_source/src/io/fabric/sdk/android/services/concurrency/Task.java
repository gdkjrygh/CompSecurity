// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;


public interface Task
{
    public static interface OnCompletionListener
    {

        public abstract void onComplete(Object obj);
    }


    public abstract void addCompletionListener(OnCompletionListener oncompletionlistener);

    public abstract boolean canProcess();

    public abstract Throwable getError();

    public abstract boolean isFinished();

    public abstract void notifyFinished();

    public abstract void setError(Throwable throwable);
}
