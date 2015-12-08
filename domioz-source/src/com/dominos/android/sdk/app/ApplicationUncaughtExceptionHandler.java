// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.app;

import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;

public class ApplicationUncaughtExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler mUncaughtExceptionHandler;

    public ApplicationUncaughtExceptionHandler(Context context)
    {
        mUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        LogUtil.e("Domino's", "UncaughtExceptionHandler", new Object[] {
            throwable
        });
        mUncaughtExceptionHandler.uncaughtException(thread, throwable);
    }
}
