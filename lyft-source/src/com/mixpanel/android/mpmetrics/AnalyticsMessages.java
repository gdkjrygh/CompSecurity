// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            HttpPoster, MPDbAdapter

class AnalyticsMessages
{

    private static int d = 1;
    private static int e = 2;
    private static int f = 4;
    private static int g = 5;
    private static int h = 6;
    private static int i = 7;
    private static final Map j = new HashMap();
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final Worker b = new Worker();
    private final Context c;

    AnalyticsMessages(Context context)
    {
        c = context;
    }

    static Context a(AnalyticsMessages analyticsmessages)
    {
        return analyticsmessages.c;
    }

    public static AnalyticsMessages a(Context context)
    {
        Map map = j;
        map;
        JVM INSTR monitorenter ;
        Context context1;
        context1 = context.getApplicationContext();
        if (j.containsKey(context1))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        context = new AnalyticsMessages(context1);
        j.put(context1, context);
_L2:
        return context;
        context = (AnalyticsMessages)j.get(context1);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(AnalyticsMessages analyticsmessages, String s)
    {
        analyticsmessages.c(s);
    }

    static int b()
    {
        return f;
    }

    static int c()
    {
        return e;
    }

    private void c(String s)
    {
        if (!a.get())
        {
            return;
        } else
        {
            Log.i("MixpanelAPI", (new StringBuilder()).append(s).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString());
            return;
        }
    }

    static int d()
    {
        return h;
    }

    static int e()
    {
        return d;
    }

    static int f()
    {
        return g;
    }

    public void a()
    {
        Message message = Message.obtain();
        message.what = e;
        b.a(message);
    }

    public void a(String s)
    {
        Message message = Message.obtain();
        message.what = h;
        message.obj = s;
        b.a(message);
    }

    public void a(JSONObject jsonobject)
    {
        Message message = Message.obtain();
        message.what = d;
        message.obj = jsonobject;
        b.a(message);
    }

    protected HttpPoster b(String s)
    {
        return new HttpPoster(s, null);
    }

    protected MPDbAdapter b(Context context)
    {
        return new MPDbAdapter(context);
    }


    private class Worker
    {

        final AnalyticsMessages a;
        private final Object b = new Object();
        private Handler c;
        private long d;
        private long e;
        private long f;
        private long g;

        static long a(Worker worker, long l)
        {
            worker.d = l;
            return l;
        }

        static Handler a(Worker worker, Handler handler)
        {
            worker.c = handler;
            return handler;
        }

        static void a(Worker worker)
        {
            worker.c();
        }

        private Handler b()
        {
            Object obj = new SynchronousQueue();
            Thread thread = new Thread(((SynchronousQueue) (obj))) {

                final SynchronousQueue a;
                final Worker b;

                public void run()
                {
                    Looper.prepare();
                    class AnalyticsMessageHandler extends Handler
                    {

                        final Worker a;
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
                                        sendEmptyMessageDelayed(AnalyticsMessages.c(), Worker.c(a));
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
                            Worker.a(a, message.longValue());
                            removeMessages(AnalyticsMessages.c());
                            int k = -1;
_L15:
                            if (k < 40) goto _L4; else goto _L3
_L3:
                            AnalyticsMessages.a(a.a, "Flushing queue due to bulk upload limit");
                            Worker.a(a);
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
                            k = -1;
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
                                k = c.a(message, MPDbAdapter.Table.a);
                                continue; /* Loop/switch isn't completed */
                            }
                            if (message.what != AnalyticsMessages.c())
                            {
                                break MISSING_BLOCK_LABEL_292;
                            }
                            AnalyticsMessages.a(a.a, "Flushing queue due to scheduled or forced flush");
                            Worker.a(a);
                            a();
                            k = -1;
                            continue; /* Loop/switch isn't completed */
                            if (message.what != AnalyticsMessages.f()) goto _L11; else goto _L10
_L10:
                            Log.w("MixpanelAPI", (new StringBuilder()).append("Worker recieved a hard kill. Dumping all events and force-killing. Thread id ").append(Thread.currentThread().getId()).toString());
                            synchronized (Worker.b(a))
                            {
                                c.a();
                                Worker.a(a, null);
                                Looper.myLooper().quit();
                            }
                            k = -1;
                            continue; /* Loop/switch isn't completed */
                            exception;
                            message;
                            JVM INSTR monitorexit ;
                            throw exception;
                            Object obj2;
                            obj2;
                            Log.e("MixpanelAPI", "Worker threw an unhandled exception- will not send any more mixpanel messages", ((Throwable) (obj2)));
                            message = ((Message) (Worker.b(a)));
                            message;
                            JVM INSTR monitorenter ;
                            Worker.a(a, null);
                            Looper.myLooper().quit();
_L13:
                            throw obj2;
_L11:
                            Log.e("MixpanelAPI", (new StringBuilder()).append("Unexpected message recieved by Mixpanel worker: ").append(message).toString());
                            k = -1;
                            continue; /* Loop/switch isn't completed */
_L4:
                            if (k <= 0)
                            {
                                break MISSING_BLOCK_LABEL_541;
                            }
                            if (!hasMessages(AnalyticsMessages.c()))
                            {
                                AnalyticsMessages.a(a.a, (new StringBuilder()).append("Queue depth ").append(k).append(" - Adding flush in ").append(Worker.c(a)).toString());
                                sendEmptyMessageDelayed(AnalyticsMessages.c(), Worker.c(a));
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
                                a = Worker.this;
                                super();
                                c = Worker.this.a.b(AnalyticsMessages.a(Worker.this.a));
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
                    b = Worker.this;
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

        static Object b(Worker worker)
        {
            return worker.b;
        }

        static long c(Worker worker)
        {
            return worker.d;
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

        public Worker()
        {
            a = AnalyticsMessages.this;
            super();
            d = 60000L;
            e = 0L;
            f = 0L;
            g = -1L;
            c = b();
        }
    }

}
