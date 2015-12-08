// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

final class kpd extends Handler
{

    private kpc a;

    kpd(kpc kpc1, Looper looper)
    {
        a = kpc1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (message == null || !(message.obj instanceof Intent))
        {
            Log.w("GCM", "Dropping invalid message");
        }
        message = (Intent)message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
        {
            kpc.a(a).add(message);
        } else
        if (!kpc.a(a, message))
        {
            message.setPackage(kpc.b(a).getPackageName());
            kpc.b(a).sendBroadcast(message);
            return;
        }
    }
}
