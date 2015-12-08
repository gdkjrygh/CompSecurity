// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;


public interface Task
{

    public abstract Throwable getError();

    public abstract boolean isFinished();

    public abstract void setError(Throwable throwable);

    public abstract void setFinished(boolean flag);
}
