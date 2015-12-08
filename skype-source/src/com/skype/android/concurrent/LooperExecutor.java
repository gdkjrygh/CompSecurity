// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class LooperExecutor
    implements Executor
{

    public static LooperExecutor a = new LooperExecutor(Looper.getMainLooper());
    private Handler b;

    private LooperExecutor(Looper looper)
    {
        this(looper, (byte)0);
    }

    private LooperExecutor(Looper looper, byte byte0)
    {
        Looper looper1 = looper;
        if (looper == null)
        {
            looper1 = Looper.getMainLooper();
        }
        b = new Handler(looper1);
    }

    public void execute(Runnable runnable)
    {
        b.post(runnable);
    }

}
