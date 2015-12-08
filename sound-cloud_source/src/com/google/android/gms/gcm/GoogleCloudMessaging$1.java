// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.gcm:
//            GoogleCloudMessaging

class zzaAa extends Handler
{

    final GoogleCloudMessaging zzaAa;

    public void handleMessage(Message message)
    {
        Object obj;
        if (message != null)
        {
            obj = message.obj;
        }
        message = (Intent)message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
        {
            GoogleCloudMessaging.zza(zzaAa).add(message);
        } else
        if (!GoogleCloudMessaging.zza(zzaAa, message))
        {
            message.setPackage(GoogleCloudMessaging.zzb(zzaAa).getPackageName());
            GoogleCloudMessaging.zzb(zzaAa).sendBroadcast(message);
            return;
        }
    }

    (GoogleCloudMessaging googlecloudmessaging, Looper looper)
    {
        zzaAa = googlecloudmessaging;
        super(looper);
    }
}
