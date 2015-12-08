// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.gcm:
//            GoogleCloudMessaging

class Ux extends Handler
{

    final GoogleCloudMessaging Ux;

    public void handleMessage(Message message)
    {
        message = (Intent)message.obj;
        Ux.Uu.add(message);
    }

    (GoogleCloudMessaging googlecloudmessaging, Looper looper)
    {
        Ux = googlecloudmessaging;
        super(looper);
    }
}
