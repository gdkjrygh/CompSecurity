// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.core;

import rx.Observable;
import rx.plugins.RxJavaObservableExecutionHook;

public class CustomRxExecutionHook extends RxJavaObservableExecutionHook
{

    public CustomRxExecutionHook()
    {
    }

    public rx.Observable.OnSubscribe onSubscribeStart(Observable observable, rx.Observable.OnSubscribe onsubscribe)
    {
        return super.onSubscribeStart(observable, onsubscribe);
    }
}
