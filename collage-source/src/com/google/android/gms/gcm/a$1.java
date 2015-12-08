// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.gcm:
//            a

class a extends Handler
{

    final a a;

    public void handleMessage(Message message)
    {
        if (message == null || !(message.obj instanceof Intent))
        {
            Log.w("GCM", "Dropping invalid message");
        }
        message = (Intent)message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
        {
            com.google.android.gms.gcm.a.a(a).add(message);
        } else
        if (!com.google.android.gms.gcm.a.a(a, message))
        {
            message.setPackage(com.google.android.gms.gcm.a.b(a).getPackageName());
            com.google.android.gms.gcm.a.b(a).sendBroadcast(message);
            return;
        }
    }

    eue(a a1, Looper looper)
    {
        a = a1;
        super(looper);
    }
}
