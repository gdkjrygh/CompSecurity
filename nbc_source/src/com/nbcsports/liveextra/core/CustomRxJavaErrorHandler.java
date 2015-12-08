// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.core;

import rx.plugins.RxJavaErrorHandler;
import timber.log.Timber;

public class CustomRxJavaErrorHandler extends RxJavaErrorHandler
{

    public CustomRxJavaErrorHandler()
    {
    }

    public void handleError(Throwable throwable)
    {
        Timber.e(throwable, "Uncaught RX error", new Object[0]);
    }
}
