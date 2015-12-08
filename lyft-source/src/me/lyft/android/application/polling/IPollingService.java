// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import rx.functions.Action1;

public interface IPollingService
{

    public abstract void setErrorHandler(Action1 action1);

    public abstract void start();

    public abstract void stop();
}
