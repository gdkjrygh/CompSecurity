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

final class d.os.Looper extends Handler
{

    private byg a;

    public final void handleMessage(Message message)
    {
        if (message == null || !(message.obj instanceof Intent))
        {
            Log.w("GCM", "Dropping invalid message");
        }
        message = (Intent)message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
        {
            byg.a(a).add(message);
        } else
        if (!byg.a(a, message))
        {
            message.setPackage(byg.b(a).getPackageName());
            byg.b(a).sendBroadcast(message);
            return;
        }
    }

    (byg byg1, Looper looper)
    {
        a = byg1;
        super(looper);
    }
}
