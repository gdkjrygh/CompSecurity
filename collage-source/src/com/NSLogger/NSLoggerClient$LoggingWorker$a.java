// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.NSLogger;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.LogRecord;

// Referenced classes of package com.NSLogger:
//            NSLoggerClient

private class <init> extends Handler
{

    final a a;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 10: default 60
    //                   1 254
    //                   2 222
    //                   3 61
    //                   4 128
    //                   5 199
    //                   6 60
    //                   7 60
    //                   8 60
    //                   9 60
    //                   10 411;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L1 _L1 _L1 _L7
_L1:
        return;
_L4:
        Log.v("NSLogger", String.format("add log %d to the queue", new Object[] {
            Integer.valueOf(((<init>)message.obj).<init>())
        }));
        a.a.add((a)message.obj);
        if (a.a)
        {
            a.a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        Log.v("NSLogger", "add LogRecord to the queue");
        a.a.add(new a(a.a, (LogRecord)message.obj, a.a.h.getAndIncrement()));
        if (a.a)
        {
            a.a();
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        Log.v("NSLogger", "options change message received");
        a.a((Properties)message.obj);
        return;
_L3:
        Log.v("NSLogger", "connect complete message received");
        a.a = false;
        a.a = true;
        a.a();
        return;
_L2:
        String s;
        int i;
        if (a.a == null)
        {
            message = "null";
        } else
        {
            message = "not null";
        }
        if (a.a == null)
        {
            s = "null";
        } else
        {
            s = "not null";
        }
        if (a.a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        Log.v("NSLogger", String.format("try connect message received, remote socket is %s, writeStream is %s, connecting=%d", new Object[] {
            message, s, Integer.valueOf(i)
        }));
        a.a = false;
        if (a.a == null && a.a == null && !a.a && a.a.f != null && a.a.g != 0)
        {
            a.a();
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        Looper.myLooper().quit();
        return;
    }

    private ( )
    {
        a = ;
        super();
    }

    a(a a1, a a2)
    {
        this(a1);
    }
}
