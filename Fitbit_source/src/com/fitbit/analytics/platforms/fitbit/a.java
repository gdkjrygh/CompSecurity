// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.platforms.fitbit;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.fitbit.analytics.core.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.analytics.platforms.fitbit:
//            b, DbAdapter, c, d

public final class com.fitbit.analytics.platforms.fitbit.a
{
    private class a
    {

        final com.fitbit.analytics.platforms.fitbit.a a;
        private final Object b = new Object();
        private Handler c;
        private long d;
        private long e;
        private long f;

        static long a(a a1, long l1)
        {
            a1.e = l1;
            return l1;
        }

        private Handler a()
        {
            HandlerThread handlerthread = new HandlerThread("com.fitbit.analytics.AnalyticsWorker", 1);
            handlerthread.start();
            return new a(this, handlerthread.getLooper());
        }

        static Handler a(a a1, Handler handler)
        {
            a1.c = handler;
            return handler;
        }

        static Object a(a a1)
        {
            return a1.b;
        }

        static long b(a a1)
        {
            return a1.d;
        }

        static long b(a a1, long l1)
        {
            a1.f = l1;
            return l1;
        }

        static long c(a a1)
        {
            return a1.f;
        }

        static long c(a a1, long l1)
        {
            a1.d = l1;
            return l1;
        }

        static long d(a a1)
        {
            return a1.e;
        }

        public void a(Message message)
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            if (c != null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            com.fitbit.analytics.platforms.fitbit.a.a(a, (new StringBuilder()).append("Dead FitbitAnalytics worker dropping a message: ").append(message.what).toString());
_L2:
            return;
            c.sendMessage(message);
            if (true) goto _L2; else goto _L1
_L1:
            message;
            obj;
            JVM INSTR monitorexit ;
            throw message;
        }

        public a()
        {
            a = com.fitbit.analytics.platforms.fitbit.a.this;
            super();
            d = 0L;
            e = 0L;
            f = -1L;
            c = a();
        }
    }

    private class a.a extends Handler
    {

        final a a;
        private DbAdapter b;
        private long c;

        private void a()
        {
            com.fitbit.analytics.platforms.fitbit.c.a((new GregorianCalendar()).getTimeInMillis() + c);
        }

        private void a(DbAdapter dbadapter)
        {
            this;
            JVM INSTR monitorenter ;
            if (com.fitbit.analytics.platforms.fitbit.d.a(com.fitbit.analytics.platforms.fitbit.a.b(a.a))) goto _L2; else goto _L1
_L1:
            com.fitbit.analytics.platforms.fitbit.a.a(a.a, "Not flushing data to FitbitAnalytics because the device is not connected to the internet.");
_L3:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            if (com.fitbit.analytics.platforms.fitbit.c.a() <= (new GregorianCalendar()).getTimeInMillis())
            {
                break MISSING_BLOCK_LABEL_70;
            }
            com.fitbit.analytics.platforms.fitbit.a.a(a.a, "Not flushing data to FitbitAnalytics because the library in backoff state.");
              goto _L3
            dbadapter;
            throw dbadapter;
            com.fitbit.analytics.platforms.fitbit.a.a(a.a, "Sending records to FitbitAnalytics");
            a(dbadapter, DbAdapter.Table.a);
              goto _L3
        }

        private void a(DbAdapter dbadapter, DbAdapter.Table table)
        {
            Object obj = dbadapter.a(table);
            if (obj == null) goto _L2; else goto _L1
_L1:
            List list;
            boolean flag;
            int i1;
            int j1;
            int k1;
            list = (List)((Pair) (obj)).second;
            j1 = ((Integer)((Pair) (obj)).first).intValue();
            flag = true;
            k1 = list.size();
            i1 = 0;
_L16:
            if (i1 >= k1) goto _L4; else goto _L3
_L3:
            String s;
            obj = (String)list.get(i1);
            s = String.valueOf((j1 - k1) + 1 + i1);
            HttpURLConnection httpurlconnection;
            String s1;
            int l1;
            httpurlconnection = (HttpURLConnection)(new URL(((String) (obj)))).openConnection();
            l1 = httpurlconnection.getResponseCode();
            s1 = httpurlconnection.getContentType();
            if (l1 != 200) goto _L6; else goto _L5
_L5:
            if (!TextUtils.equals(s1, "text/plain")) goto _L6; else goto _L7
_L7:
            boolean flag2 = true;
_L17:
            boolean flag1 = flag2;
            if (!flag2) goto _L9; else goto _L8
_L8:
            Uri uri;
            s1 = (new BufferedReader(new InputStreamReader(httpurlconnection.getInputStream()))).readLine();
            uri = Uri.parse(((String) (obj)));
            if (!uri.getPathSegments().contains("v0") && !uri.getPathSegments().contains("v1")) goto _L11; else goto _L10
_L10:
            flag1 = TextUtils.equals(s1, "F");
_L9:
            httpurlconnection.disconnect();
            if (!flag1) goto _L13; else goto _L12
_L12:
            com.fitbit.analytics.platforms.fitbit.a.a(a.a, "Not retrying this batch of events, deleting them from DB.");
            dbadapter.a(s, table);
            a(true);
              goto _L14
_L11:
            if (!uri.getPathSegments().contains("v2"))
            {
                break MISSING_BLOCK_LABEL_472;
            }
            flag1 = TextUtils.equals(s1, "2");
              goto _L9
_L13:
            a(false);
            a();
            flag = false;
              goto _L14
            Object obj1;
            obj1;
            Log.e("FitbitAnalytics", (new StringBuilder()).append("Out of memory when posting to ").append(((String) (obj))).append(".").toString(), ((Throwable) (obj1)));
            dbadapter.a(s, table);
_L4:
            if (!flag)
            {
                com.fitbit.analytics.platforms.fitbit.a.a(a.a, "Retrying not successfull batch of events.");
                if (!hasMessages(com.fitbit.analytics.platforms.fitbit.a.d()))
                {
                    sendEmptyMessageDelayed(com.fitbit.analytics.platforms.fitbit.a.d(), c);
                }
            }
_L2:
            return;
            obj1;
            Log.e("FitbitAnalytics", (new StringBuilder()).append("Cannot interpret ").append(((String) (obj))).append(" as a URL.").toString(), ((Throwable) (obj1)));
            dbadapter.a(s, table);
            if (true) goto _L4; else goto _L15
_L15:
            IOException ioexception;
            ioexception;
            if (b.a)
            {
                Log.d("FitbitAnalytics", (new StringBuilder()).append("Cannot post message to ").append(((String) (obj))).append(".").toString(), ioexception);
            }
            flag = false;
_L14:
            i1++;
              goto _L16
_L6:
            flag2 = false;
              goto _L17
            flag1 = false;
              goto _L9
        }

        private void b()
        {
            long l1 = System.currentTimeMillis();
            long l2 = a.b(a) + 1L;
            if (com.fitbit.analytics.platforms.fitbit.a.c(a) > 0L)
            {
                long l3 = com.fitbit.analytics.platforms.fitbit.a.c(a);
                long l4 = a.d(a);
                long l5 = a.b(a);
                a.a(a, ((l1 - l3) + l4 * l5) / l2);
                l3 = a.d(a) / 1000L;
                com.fitbit.analytics.platforms.fitbit.a.a(a.a, (new StringBuilder()).append("Average send frequency approximately ").append(l3).append(" seconds.").toString());
            }
            a.b(a, l1);
            com.fitbit.analytics.platforms.fitbit.a.c(a, l2);
        }

        void a(boolean flag)
        {
            if (flag)
            {
                c = com.fitbit.analytics.platforms.fitbit.a.a(a.a).a();
                return;
            }
            long l1;
            if (c * 2L > 0xea600L)
            {
                l1 = c;
            } else
            {
                l1 = c * 2L;
            }
            c = l1;
            com.fitbit.analytics.platforms.fitbit.a.a(a.a, (new StringBuilder()).append("Flush interval = ").append(c / 1000L).append(" seconds").toString());
        }

        public void handleMessage(Message message)
        {
            if (b == null)
            {
                b = a.a.b(com.fitbit.analytics.platforms.fitbit.a.b(a.a));
                b.a(System.currentTimeMillis() - (long)com.fitbit.analytics.platforms.fitbit.a.a(a.a).b(), DbAdapter.Table.a);
            }
            if (message.what != com.fitbit.analytics.platforms.fitbit.a.c()) goto _L2; else goto _L1
_L1:
            message = ((c)message.obj).a();
            com.fitbit.analytics.platforms.fitbit.a.a(a.a, "Queuing event for sending later");
            b.a(message);
_L5:
            b();
            return;
_L2:
            if (message.what != com.fitbit.analytics.platforms.fitbit.a.d()) goto _L4; else goto _L3
_L3:
            com.fitbit.analytics.platforms.fitbit.a.a(a.a, "Flushing queue due to scheduled or forced flush");
            b();
            a(b);
              goto _L5
            Object obj;
            obj;
            Log.e("FitbitAnalytics", "Worker threw an unhandled exception", ((Throwable) (obj)));
            message = ((Message) (a.a(a)));
            message;
            JVM INSTR monitorenter ;
            a.a(a, null);
            Looper.myLooper().quit();
            Log.e("FitbitAnalytics", "FitbitAnalytics will not process any more analytics messages", ((Throwable) (obj)));
_L6:
            return;
            obj;
            message;
            JVM INSTR monitorexit ;
            throw obj;
_L4:
            if (message.what != com.fitbit.analytics.platforms.fitbit.a.e())
            {
                break MISSING_BLOCK_LABEL_282;
            }
            Log.w("FitbitAnalytics", (new StringBuilder()).append("Worker received a hard kill. Dumping all events and force-killing. Thread id ").append(Thread.currentThread().getId()).toString());
            synchronized (a.a(a))
            {
                b.a();
                a.a(a, null);
                Looper.myLooper().quit();
            }
              goto _L5
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
            Log.e("FitbitAnalytics", (new StringBuilder()).append("Unexpected message received by FitbitAnalytics worker: ").append(message).toString());
              goto _L5
            exception;
            Log.e("FitbitAnalytics", "Could not halt looper", exception);
              goto _L6
        }

        public a.a(a a1, Looper looper)
        {
            a = a1;
            super(looper);
            b = null;
            c = com.fitbit.analytics.platforms.fitbit.a.a(a1.a).a();
        }
    }


    private static final String a = "v0";
    private static final String b = "v1";
    private static final String c = "v2";
    private static final String d = "F";
    private static final String e = "2";
    private static int f = 1;
    private static int g = 2;
    private static int h = 5;
    private static final Map l = new HashMap();
    private final a i = new a();
    private final Context j;
    private final b k;

    private com.fitbit.analytics.platforms.fitbit.a(Context context)
    {
        j = context;
        k = c(context);
        a();
    }

    public static com.fitbit.analytics.platforms.fitbit.a a(Context context)
    {
        Map map = l;
        map;
        JVM INSTR monitorenter ;
        Context context1;
        context1 = context.getApplicationContext();
        if (l.containsKey(context1))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        context = new com.fitbit.analytics.platforms.fitbit.a(context1);
        l.put(context1, context);
_L2:
        return context;
        context = (com.fitbit.analytics.platforms.fitbit.a)l.get(context1);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    static b a(com.fitbit.analytics.platforms.fitbit.a a1)
    {
        return a1.k;
    }

    static void a(com.fitbit.analytics.platforms.fitbit.a a1, String s)
    {
        a1.a(s);
    }

    private void a(String s)
    {
        if (b.a)
        {
            Log.d("FitbitAnalytics", (new StringBuilder()).append(s).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString());
        }
    }

    static Context b(com.fitbit.analytics.platforms.fitbit.a a1)
    {
        return a1.j;
    }

    static int c()
    {
        return f;
    }

    static int d()
    {
        return g;
    }

    static int e()
    {
        return h;
    }

    public void a()
    {
        Message message = Message.obtain();
        message.what = g;
        i.a(message);
    }

    public void a(c c1)
    {
        Message message = Message.obtain();
        message.what = f;
        message.obj = c1;
        i.a(message);
    }

    protected DbAdapter b(Context context)
    {
        return new DbAdapter(context);
    }

    public void b()
    {
        Message message = Message.obtain();
        message.what = h;
        i.a(message);
    }

    protected b c(Context context)
    {
        return com.fitbit.analytics.platforms.fitbit.b.a(context);
    }

}
