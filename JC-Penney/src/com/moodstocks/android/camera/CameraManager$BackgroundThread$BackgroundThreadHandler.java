// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.moodstocks.android.camera:
//            CameraFrame

class <init> extends Handler
{

    private thread thread;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.e("WorkerThread", (new StringBuilder()).append("handleMessage: bad message received (").append(message.what).append(")").toString());
            return;

        case 0: // '\0'
            <init>(thread, (CameraFrame)message.obj);
            return;

        case 1: // '\001'
            thread(thread);
            break;
        }
    }

    private ( )
    {
        thread = ;
    }

    thread(thread thread1, thread thread2)
    {
        this(thread1);
    }
}
