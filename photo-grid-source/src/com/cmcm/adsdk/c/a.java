// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.c;

import android.os.AsyncTask;
import android.os.HandlerThread;

public final class a
{

    private static HandlerThread a;

    public static transient void a(AsyncTask asynctask, Object aobj[])
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
            return;
        } else
        {
            asynctask.execute(aobj);
            return;
        }
    }

    static 
    {
        HandlerThread handlerthread = new HandlerThread("BackgroundHandler", 1);
        a = handlerthread;
        handlerthread.start();
    }
}
