// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            AnalyticsMessages, MPDbAdapter, HttpPoster

class c extends Handler
{

    final a a;
    private String b;
    private final MPDbAdapter c;

    private void a()
    {
        AnalyticsMessages.a(a.a, "Sending records to Mixpanel");
        a(a, "/v1/track");
    }

    private void a(a a1, String s)
    {
        String as[] = c.a(a1);
        if (as != null)
        {
            String s1 = as[0];
            String s2 = as[1];
            a a2 = a.a.b(b).a(s2, s);
            if (a2 == b)
            {
                AnalyticsMessages.a(a.a, String.format("Posted to %s%s", new Object[] {
                    b, s
                }));
                AnalyticsMessages.a(a.a, (new StringBuilder()).append("Sent Message\n").append(s2).toString());
                c.a(s1, a1);
            } else
            if (a2 == c)
            {
                if (!hasMessages(AnalyticsMessages.c()))
                {
                    sendEmptyMessageDelayed(AnalyticsMessages.c(), sendEmptyMessageDelayed(a));
                    return;
                }
            } else
            {
                AnalyticsMessages.a(a.a, (new StringBuilder()).append("Failed to send message\n").append(s2).toString());
                c.a(s1, a1);
                return;
            }
        }
    }

    public void handleMessage(Message message)
    {
        Object obj = null;
        if (message.what != AnalyticsMessages.b()) goto _L2; else goto _L1
_L1:
        message = (Long)message.obj;
        AnalyticsMessages.a(a.a, (new StringBuilder()).append("Changing flush interval to ").append(message).toString());
        a(a, message.longValue());
        removeMessages(AnalyticsMessages.c());
        int i = -1;
_L15:
        if (i < 40) goto _L4; else goto _L3
_L3:
        AnalyticsMessages.a(a.a, "Flushing queue due to bulk upload limit");
        a(a);
        a();
        return;
_L2:
        if (message.what != AnalyticsMessages.d()) goto _L6; else goto _L5
_L5:
        if (message.obj != null) goto _L8; else goto _L7
_L7:
        message = obj;
_L9:
        b = message;
        AnalyticsMessages.a(a.a, (new StringBuilder()).append("Setting endpoint API host to ").append(b).toString());
        i = -1;
        continue; /* Loop/switch isn't completed */
_L8:
        message = message.obj.toString();
        if (true) goto _L9; else goto _L6
_L6:
        if (message.what == AnalyticsMessages.e())
        {
            message = (JSONObject)message.obj;
            AnalyticsMessages.a(a.a, "Queuing event for sending later");
            AnalyticsMessages.a(a.a, (new StringBuilder()).append("    ").append(message.toString()).toString());
            i = c.a(message, c);
            continue; /* Loop/switch isn't completed */
        }
        if (message.what != AnalyticsMessages.c())
        {
            break MISSING_BLOCK_LABEL_292;
        }
        AnalyticsMessages.a(a.a, "Flushing queue due to scheduled or forced flush");
        a(a);
        a();
        i = -1;
        continue; /* Loop/switch isn't completed */
        if (message.what != AnalyticsMessages.f()) goto _L11; else goto _L10
_L10:
        Log.w("MixpanelAPI", (new StringBuilder()).append("Worker recieved a hard kill. Dumping all events and force-killing. Thread id ").append(Thread.currentThread().getId()).toString());
        synchronized (a(a))
        {
            c.a();
            c(a, null);
            Looper.myLooper().quit();
        }
        i = -1;
        continue; /* Loop/switch isn't completed */
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        Log.e("MixpanelAPI", "Worker threw an unhandled exception- will not send any more mixpanel messages", ((Throwable) (obj1)));
        message = ((Message) (a(a)));
        message;
        JVM INSTR monitorenter ;
        a(a, null);
        Looper.myLooper().quit();
_L13:
        throw obj1;
_L11:
        Log.e("MixpanelAPI", (new StringBuilder()).append("Unexpected message recieved by Mixpanel worker: ").append(message).toString());
        i = -1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_541;
        }
        if (!hasMessages(AnalyticsMessages.c()))
        {
            AnalyticsMessages.a(a.a, (new StringBuilder()).append("Queue depth ").append(i).append(" - Adding flush in ").append(a(a)).toString());
            sendEmptyMessageDelayed(AnalyticsMessages.c(), sendEmptyMessageDelayed(a));
            return;
        }
        break MISSING_BLOCK_LABEL_541;
        Exception exception1;
        exception1;
        Log.e("MixpanelAPI", "Could not halt looper", exception1);
        if (true) goto _L13; else goto _L12
_L12:
        obj1;
        message;
        JVM INSTR monitorexit ;
        throw obj1;
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public ( )
    {
        a = ;
        super();
        c = .c.b(AnalyticsMessages.a(.c));
        c.a(System.currentTimeMillis() - 0xa4cb800L, c);
    }
}
