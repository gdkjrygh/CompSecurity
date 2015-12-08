// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils.os;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;

public abstract class AviaryIntentService extends Service
{
    private final class a extends Handler
    {

        final AviaryIntentService a;

        public void handleMessage(Message message)
        {
            a.a((Intent)message.obj);
            a.stopSelf(message.arg1);
        }

        public a(Looper looper)
        {
            a = AviaryIntentService.this;
            super(looper);
        }
    }


    private volatile Looper a;
    private volatile a b;
    private String c;
    private boolean d;

    public AviaryIntentService(String s)
    {
        c = s;
    }

    protected abstract void a(Intent intent);

    public void h()
    {
        b.removeCallbacksAndMessages(null);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        HandlerThread handlerthread = new HandlerThread((new StringBuilder()).append("IntentService[").append(c).append("]").toString());
        handlerthread.start();
        a = handlerthread.getLooper();
        b = new a(a);
    }

    public void onDestroy()
    {
        a.quit();
    }

    public void onStart(Intent intent, int i)
    {
        Message message = b.obtainMessage();
        message.arg1 = i;
        message.obj = intent;
        b.sendMessage(message);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        onStart(intent, j);
        return !d ? 2 : 3;
    }
}
