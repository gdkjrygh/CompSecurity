// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.SynchronousQueue;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            AnalyticsMessages

class b
{

    final AnalyticsMessages a;
    private final Object b = new Object();
    private Handler c;
    private long d;
    private long e;
    private long f;
    private long g;

    static long a(b b1, long l)
    {
        b1.d = l;
        return l;
    }

    static Handler a(d d1, Handler handler)
    {
        d1.c = handler;
        return handler;
    }

    static void a(c c1)
    {
        c1.c();
    }

    private Handler b()
    {
        Object obj = new SynchronousQueue();
        Thread thread = new Thread(((SynchronousQueue) (obj))) {

            final SynchronousQueue a;
            final AnalyticsMessages.Worker b;

            public void run()
            {
                Looper.prepare();
                class AnalyticsMessageHandler extends Handler
                {

                    final AnalyticsMessages.Worker a;
                    private String b;
                    private final MPDbAdapter c;

                    private void a()
                    {
                        AnalyticsMessages.a(a.a, "Sending records to Mixpanel");
                        a(MPDbAdapter.Table.a, "/v1/track");
                    }

                    private void a(MPDbAdapter.Table table, String s)
                    {
                        String as[] = c.a(table);
                        if (as != null)
                        {
                            String s1 = as[0];
                            String s2 = as[1];
                            HttpPoster.PostResult postresult = a.a.b(b).a(s2, s);
                            if (postresult == HttpPoster.PostResult.a)
                            {
                                AnalyticsMessages.a(a.a, String.format("Posted to %s%s", new Object[] {
                                    b, s
                                }));
                                AnalyticsMessages.a(a.a, (new StringBuilder()).append("Sent Message\n").append(s2).toString());
                                c.a(s1, table);
                            } else
                            if (postresult == HttpPoster.PostResult.b)
                            {
                                if (!hasMessages(AnalyticsMessages.c()))
                                {
                                    sendEmptyMessageDelayed(AnalyticsMessages.c(), AnalyticsMessages.Worker.c(a));
                                    return;
                                }
                            } else
                            {
                                AnalyticsMessages.a(a.a, (new StringBuilder()).append("Failed to send message\n").append(s2).toString());
                                c.a(s1, table);
                                return;
                            }
                        }
                    }

                    public void handleMessage(Message message)
                    {
                        Object obj1 = null;
                        if (message.what != AnalyticsMessages.b()) goto _L2; else goto _L1
_L1:
                        message = (Long)message.obj;
                        AnalyticsMessages.a(a.a, (new StringBuilder()).append("Changing flush interval to ").append(message).toString());
                        AnalyticsMessages.Worker.a(a, message.longValue());
                        removeMessages(AnalyticsMessages.c());
                        int i = -1;
_L15:
                        if (i < 40) goto _L4; else goto _L3
_L3:
                        AnalyticsMessages.a(a.a, "Flushing queue due to bulk upload limit");
                        AnalyticsMessages.Worker.a(a);
                        a();
                        return;
_L2:
                        if (message.what != AnalyticsMessages.d()) goto _L6; else goto _L5
_L5:
                        if (message.obj != null) goto _L8; else goto _L7
_L7:
                        message = obj1;
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
                            i = c.a(message, MPDbAdapter.Table.a);
                            continue; /* Loop/switch isn't completed */
                        }
                        if (message.what != AnalyticsMessages.c())
                        {
                            break MISSING_BLOCK_LABEL_292;
                        }
                        AnalyticsMessages.a(a.a, "Flushing queue due to scheduled or forced flush");
                        AnalyticsMessages.Worker.a(a);
                        a();
                        i = -1;
                        continue; /* Loop/switch isn't completed */
                        if (message.what != AnalyticsMessages.f()) goto _L11; else goto _L10
_L10:
                        Log.w("MixpanelAPI", (new StringBuilder()).append("Worker recieved a hard kill. Dumping all events and force-killing. Thread id ").append(Thread.currentThread().getId()).toString());
                        synchronized (AnalyticsMessages.Worker.b(a))
                        {
                            c.a();
                            AnalyticsMessages.Worker.a(a, null);
                            Looper.myLooper().quit();
                        }
                        i = -1;
                        continue; /* Loop/switch isn't completed */
                        exception;
                        message;
                        JVM INSTR monitorexit ;
                        throw exception;
                        Object obj2;
                        obj2;
                        Log.e("MixpanelAPI", "Worker threw an unhandled exception- will not send any more mixpanel messages", ((Throwable) (obj2)));
                        message = ((Message) (AnalyticsMessages.Worker.b(a)));
                        message;
                        JVM INSTR monitorenter ;
                        AnalyticsMessages.Worker.a(a, null);
                        Looper.myLooper().quit();
_L13:
                        throw obj2;
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
                            AnalyticsMessages.a(a.a, (new StringBuilder()).append("Queue depth ").append(i).append(" - Adding flush in ").append(AnalyticsMessages.Worker.c(a)).toString());
                            sendEmptyMessageDelayed(AnalyticsMessages.c(), AnalyticsMessages.Worker.c(a));
                            return;
                        }
                        break MISSING_BLOCK_LABEL_541;
                        Exception exception1;
                        exception1;
                        Log.e("MixpanelAPI", "Could not halt looper", exception1);
                        if (true) goto _L13; else goto _L12
_L12:
                        obj2;
                        message;
                        JVM INSTR monitorexit ;
                        throw obj2;
                        return;
                        if (true) goto _L15; else goto _L14
_L14:
                    }

                        public AnalyticsMessageHandler()
                        {
                            a = AnalyticsMessages.Worker.this;
                            super();
                            c = AnalyticsMessages.Worker.this.a.b(AnalyticsMessages.a(AnalyticsMessages.Worker.this.a));
                            c.a(System.currentTimeMillis() - 0xa4cb800L, MPDbAdapter.Table.a);
                        }
                }

                try
                {
                    a.put(b. new AnalyticsMessageHandler());
                }
                catch (InterruptedException interruptedexception1)
                {
                    throw new RuntimeException("Couldn't build worker thread for Analytics Messages", interruptedexception1);
                }
                try
                {
                    Looper.loop();
                    return;
                }
                catch (RuntimeException runtimeexception)
                {
                    Log.e("MixpanelAPI", "Mixpanel Thread dying from RuntimeException", runtimeexception);
                }
            }

            
            {
                b = AnalyticsMessages.Worker.this;
                a = synchronousqueue;
                super();
            }
        };
        thread.setPriority(1);
        thread.start();
        try
        {
            obj = (Handler)((SynchronousQueue) (obj)).take();
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException("Couldn't retrieve handler fromGooglePlayPlace worker thread");
        }
        return ((Handler) (obj));
    }

    static Object b(AnalyticsMessageHandler analyticsmessagehandler)
    {
        return analyticsmessagehandler.b;
    }

    static long c(b b1)
    {
        return b1.d;
    }

    private void c()
    {
        long l = System.currentTimeMillis();
        long l1 = e + 1L;
        if (g > 0L)
        {
            f = ((l - g) + f * e) / l1;
            long l2 = f / 1000L;
            AnalyticsMessages.a(a, (new StringBuilder()).append("Average send frequency approximately ").append(l2).append(" seconds.").toString());
        }
        g = l;
        e = l1;
    }

    public void a(Message message)
    {
        if (a())
        {
            AnalyticsMessages.a(a, (new StringBuilder()).append("Dead mixpanel worker dropping a message: ").append(message).toString());
            return;
        }
        synchronized (b)
        {
            if (c != null)
            {
                c.sendMessage(message);
            }
        }
        return;
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
    }

    public boolean a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (c == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public _cls1.a(AnalyticsMessages analyticsmessages)
    {
        a = analyticsmessages;
        super();
        d = 60000L;
        e = 0L;
        f = 0L;
        g = -1L;
        c = b();
    }
}
