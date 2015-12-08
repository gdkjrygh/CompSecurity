// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.e;
import com.mixpanel.android.util.RemoteService;
import com.mixpanel.android.util.c;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            g, MPDbAdapter, d, r, 
//            DecideChecker, h

class com.mixpanel.android.mpmetrics.a
{
    static class a
    {

        private final String a;
        private final JSONObject b;
        private final String c;

        public String a()
        {
            return a;
        }

        public JSONObject b()
        {
            return b;
        }

        public String c()
        {
            return c;
        }

        public a(String s, JSONObject jsonobject, String s1)
        {
            a = s;
            b = jsonobject;
            c = s1;
        }
    }

    private class b
    {

        final com.mixpanel.android.mpmetrics.a a;
        private final Object b = new Object();
        private Handler c;
        private long d;
        private long e;
        private long f;
        private r g;

        static Handler a(b b1, Handler handler)
        {
            b1.c = handler;
            return handler;
        }

        static r a(b b1, r r)
        {
            b1.g = r;
            return r;
        }

        static void a(b b1)
        {
            b1.c();
        }

        private Handler b()
        {
            HandlerThread handlerthread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 1);
            handlerthread.start();
            return new a(this, handlerthread.getLooper());
        }

        static Object b(b b1)
        {
            return b1.b;
        }

        static r c(b b1)
        {
            return b1.g;
        }

        private void c()
        {
            long l = System.currentTimeMillis();
            long l1 = d + 1L;
            if (f > 0L)
            {
                e = ((l - f) + e * d) / l1;
                long l2 = e / 1000L;
                com.mixpanel.android.mpmetrics.a.a(a, (new StringBuilder()).append("Average send frequency approximately ").append(l2).append(" seconds.").toString());
            }
            f = l;
            d = l1;
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
            com.mixpanel.android.mpmetrics.a.a(a, (new StringBuilder()).append("Dead mixpanel worker dropping a message: ").append(message.what).toString());
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

        public b()
        {
            a = com.mixpanel.android.mpmetrics.a.this;
            super();
            d = 0L;
            e = 0L;
            f = -1L;
            c = b();
        }
    }

    private class b.a extends Handler
    {

        final b a;
        private MPDbAdapter b;
        private final DecideChecker c;
        private final long d;
        private final boolean e;
        private long f;

        private JSONObject a()
            throws JSONException
        {
            JSONObject jsonobject;
            jsonobject = new JSONObject();
            jsonobject.put("mp_lib", "android");
            jsonobject.put("$lib_version", "4.6.0");
            jsonobject.put("$os", "Android");
            Object obj;
            int l;
            if (android.os.Build.VERSION.RELEASE == null)
            {
                obj = "UNKNOWN";
            } else
            {
                obj = android.os.Build.VERSION.RELEASE;
            }
            jsonobject.put("$os_version", obj);
            if (Build.MANUFACTURER == null)
            {
                obj = "UNKNOWN";
            } else
            {
                obj = Build.MANUFACTURER;
            }
            jsonobject.put("$manufacturer", obj);
            if (Build.BRAND == null)
            {
                obj = "UNKNOWN";
            } else
            {
                obj = Build.BRAND;
            }
            jsonobject.put("$brand", obj);
            if (Build.MODEL == null)
            {
                obj = "UNKNOWN";
            } else
            {
                obj = Build.MODEL;
            }
            jsonobject.put("$model", obj);
            l = com.google.android.gms.common.e.a(com.mixpanel.android.mpmetrics.a.a(a.a));
            l;
            JVM INSTR tableswitch 0 9: default 172
        //                       0 422
        //                       1 460
        //                       2 472
        //                       3 484
        //                       4 172
        //                       5 172
        //                       6 172
        //                       7 172
        //                       8 172
        //                       9 496;
               goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L1 _L1 _L1 _L6
_L1:
            break; /* Loop/switch isn't completed */
_L6:
            break MISSING_BLOCK_LABEL_496;
_L7:
            obj = com.mixpanel.android.mpmetrics.b.c(a).e();
            jsonobject.put("$screen_dpi", ((DisplayMetrics) (obj)).densityDpi);
            jsonobject.put("$screen_height", ((DisplayMetrics) (obj)).heightPixels);
            jsonobject.put("$screen_width", ((DisplayMetrics) (obj)).widthPixels);
            obj = com.mixpanel.android.mpmetrics.b.c(a).a();
            if (obj != null)
            {
                jsonobject.put("$app_version", obj);
            }
            obj = Boolean.valueOf(com.mixpanel.android.mpmetrics.b.c(a).c());
            if (obj != null)
            {
                jsonobject.put("$has_nfc", ((Boolean) (obj)).booleanValue());
            }
            obj = Boolean.valueOf(com.mixpanel.android.mpmetrics.b.c(a).d());
            if (obj != null)
            {
                jsonobject.put("$has_telephone", ((Boolean) (obj)).booleanValue());
            }
            obj = com.mixpanel.android.mpmetrics.b.c(a).g();
            if (obj != null)
            {
                jsonobject.put("$carrier", obj);
            }
            obj = com.mixpanel.android.mpmetrics.b.c(a).h();
            if (obj != null)
            {
                jsonobject.put("$wifi", ((Boolean) (obj)).booleanValue());
            }
            obj = com.mixpanel.android.mpmetrics.b.c(a).i();
            if (obj != null)
            {
                jsonobject.put("$bluetooth_enabled", obj);
            }
            obj = com.mixpanel.android.mpmetrics.b.c(a).j();
            if (obj != null)
            {
                jsonobject.put("$bluetooth_version", obj);
            }
            return jsonobject;
_L2:
            jsonobject.put("$google_play_services", "available");
              goto _L7
            RuntimeException runtimeexception;
            runtimeexception;
            try
            {
                jsonobject.put("$google_play_services", "not configured");
            }
            catch (NoClassDefFoundError noclassdeffounderror)
            {
                jsonobject.put("$google_play_services", "not included");
            }
              goto _L7
_L3:
            jsonobject.put("$google_play_services", "missing");
              goto _L7
_L4:
            jsonobject.put("$google_play_services", "out of date");
              goto _L7
_L5:
            jsonobject.put("$google_play_services", "disabled");
              goto _L7
            jsonobject.put("$google_play_services", "invalid");
              goto _L7
        }

        private JSONObject a(a a1)
            throws JSONException
        {
            JSONObject jsonobject = new JSONObject();
            JSONObject jsonobject1 = a1.b();
            JSONObject jsonobject2 = a();
            jsonobject2.put("token", a1.c());
            if (jsonobject1 != null)
            {
                String s;
                for (Iterator iterator = jsonobject1.keys(); iterator.hasNext(); jsonobject2.put(s, jsonobject1.get(s)))
                {
                    s = (String)iterator.next();
                }

            }
            jsonobject.put("event", a1.a());
            jsonobject.put("properties", jsonobject2);
            return jsonobject;
        }

        private void a(MPDbAdapter mpdbadapter)
            throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
        {
            if (!a.a.d().a(com.mixpanel.android.mpmetrics.a.a(a.a)))
            {
                com.mixpanel.android.mpmetrics.a.a(a.a, "Not flushing data to Mixpanel because the device is not connected to the internet.");
                return;
            }
            com.mixpanel.android.mpmetrics.a.a(a.a, "Sending records to Mixpanel");
            if (e)
            {
                a(mpdbadapter, MPDbAdapter.Table.a, new String[] {
                    com.mixpanel.android.mpmetrics.a.b(a.a).j()
                });
                a(mpdbadapter, MPDbAdapter.Table.b, new String[] {
                    com.mixpanel.android.mpmetrics.a.b(a.a).k()
                });
                return;
            } else
            {
                a(mpdbadapter, MPDbAdapter.Table.a, new String[] {
                    com.mixpanel.android.mpmetrics.a.b(a.a).j(), com.mixpanel.android.mpmetrics.a.b(a.a).m()
                });
                a(mpdbadapter, MPDbAdapter.Table.b, new String[] {
                    com.mixpanel.android.mpmetrics.a.b(a.a).k(), com.mixpanel.android.mpmetrics.a.b(a.a).n()
                });
                return;
            }
        }

        private void a(MPDbAdapter mpdbadapter, MPDbAdapter.Table table, String as[])
            throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
        {
            RemoteService remoteservice;
            String as1[];
            remoteservice = a.a.d();
            as1 = mpdbadapter.a(table);
            if (as1 == null) goto _L2; else goto _L1
_L1:
            String s;
            String s3;
            ArrayList arraylist;
            boolean flag;
            int l;
            int i1;
            s = as1[0];
            s3 = as1[1];
            String s1 = com.mixpanel.android.util.b.a(s3);
            arraylist = new ArrayList(1);
            arraylist.add(new BasicNameValuePair("data", s1));
            if (g.b)
            {
                arraylist.add(new BasicNameValuePair("verbose", "1"));
            }
            flag = true;
            i1 = as.length;
            l = 0;
_L9:
            boolean flag1 = flag;
            if (l >= i1) goto _L4; else goto _L3
_L3:
            String s2;
            s2 = as[l];
            flag1 = flag;
            byte abyte0[] = remoteservice.a(s2, arraylist);
            boolean flag2;
            boolean flag3;
            boolean flag4;
            flag3 = true;
            flag4 = true;
            flag2 = true;
            if (abyte0 != null) goto _L6; else goto _L5
_L5:
            flag1 = flag3;
            flag = flag4;
            com.mixpanel.android.mpmetrics.a.a(a.a, (new StringBuilder()).append("Response was null, unexpected failure posting to ").append(s2).append(".").toString());
            flag1 = flag2;
_L4:
            if (!flag1) goto _L8; else goto _L7
_L7:
            com.mixpanel.android.mpmetrics.a.a(a.a, "Not retrying this batch of events, deleting them from DB.");
            mpdbadapter.a(s, table);
_L2:
            return;
_L6:
            flag1 = flag3;
            flag = flag4;
            String s4 = new String(abyte0, "UTF-8");
            flag1 = flag3;
            flag = flag4;
            com.mixpanel.android.mpmetrics.a.a(a.a, (new StringBuilder()).append("Successfully posted to ").append(s2).append(": \n").append(s3).toString());
            flag1 = flag3;
            flag = flag4;
            com.mixpanel.android.mpmetrics.a.a(a.a, (new StringBuilder()).append("Response was ").append(s4).toString());
            flag1 = flag2;
              goto _L4
            as;
            Log.e("MixpanelAPI.Messages", (new StringBuilder()).append("Out of memory when posting to ").append(s2).append(".").toString(), as);
              goto _L4
            Object obj;
            obj;
            flag1 = flag3;
            flag = flag4;
            throw new RuntimeException("UTF not supported on this platform?", ((Throwable) (obj)));
            as;
            Log.e("MixpanelAPI.Messages", (new StringBuilder()).append("Cannot interpret ").append(s2).append(" as a URL.").toString(), as);
            flag1 = flag;
              goto _L4
            obj;
            com.mixpanel.android.mpmetrics.a.a(a.a, (new StringBuilder()).append("Cannot post message to ").append(s2).append(".").toString(), ((Throwable) (obj)));
            flag = false;
            l++;
              goto _L9
_L8:
            com.mixpanel.android.mpmetrics.a.a(a.a, "Retrying this batch of events.");
            if (hasMessages(2)) goto _L2; else goto _L10
_L10:
            sendEmptyMessageDelayed(2, d);
            return;
              goto _L4
        }

        private void a(String s)
        {
            if (com.google.android.gms.common.e.a(com.mixpanel.android.mpmetrics.a.a(a.a)) != 0)
            {
                Log.i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play Services are not installed.");
                return;
            }
            break MISSING_BLOCK_LABEL_52;
            s;
            try
            {
                Log.i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play services are not configured.");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.i("MixpanelAPI.Messages", "Exception when trying to register for GCM", s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("MixpanelAPI.Messages", "Google play services were not part of this build, push notifications cannot be registered or delivered");
            }
            break MISSING_BLOCK_LABEL_101;
            s = com.google.android.gms.d.a.a(com.mixpanel.android.mpmetrics.a.a(a.a)).a(new String[] {
                s
            });
            com.mixpanel.android.mpmetrics.h.a(new h.a(this, s) {

                final String a;
                final b.a b;

                public void a(h h1)
                {
                    if (g.b)
                    {
                        Log.v("MixpanelAPI.Messages", (new StringBuilder()).append("Using existing pushId ").append(a).toString());
                    }
                    h1.e().d(a);
                }

            
            {
                b = a1;
                a = s;
                super();
            }
            });
            return;
        }

        public void handleMessage(Message message)
        {
            byte byte0;
            if (b == null)
            {
                b = a.a.b(com.mixpanel.android.mpmetrics.a.a(a.a));
                b.a(System.currentTimeMillis() - (long)com.mixpanel.android.mpmetrics.a.b(a.a).c(), MPDbAdapter.Table.a);
                b.a(System.currentTimeMillis() - (long)com.mixpanel.android.mpmetrics.a.b(a.a).c(), MPDbAdapter.Table.b);
            }
            byte0 = -3;
            if (message.what != 0) goto _L2; else goto _L1
_L1:
            int l;
            message = (JSONObject)message.obj;
            com.mixpanel.android.mpmetrics.a.a(a.a, "Queuing people record for sending later");
            com.mixpanel.android.mpmetrics.a.a(a.a, (new StringBuilder()).append("    ").append(message.toString()).toString());
            l = b.a(message, MPDbAdapter.Table.b);
_L6:
            if (l < com.mixpanel.android.mpmetrics.a.b(a.a).a() && l != -2) goto _L4; else goto _L3
_L3:
            if (SystemClock.elapsedRealtime() < f) goto _L4; else goto _L5
_L5:
            com.mixpanel.android.mpmetrics.a.a(a.a, "Flushing queue due to bulk upload limit");
            b.a(a);
            a(b);
            c.a(a.a.d());
_L12:
            return;
_L2:
            if (message.what != 1)
            {
                break MISSING_BLOCK_LABEL_365;
            }
            message = (a)message.obj;
            JSONObject jsonobject = a(message);
            com.mixpanel.android.mpmetrics.a.a(a.a, "Queuing event for sending later");
            com.mixpanel.android.mpmetrics.a.a(a.a, (new StringBuilder()).append("    ").append(jsonobject.toString()).toString());
            l = b.a(jsonobject, MPDbAdapter.Table.a);
              goto _L6
            Object obj;
            obj;
            Log.e("MixpanelAPI.Messages", (new StringBuilder()).append("Exception tracking event ").append(message.a()).toString(), ((Throwable) (obj)));
            l = -3;
              goto _L6
            if (message.what != 2) goto _L8; else goto _L7
_L7:
            long l1;
            long l3;
            com.mixpanel.android.mpmetrics.a.a(a.a, "Flushing queue due to scheduled or forced flush");
            b.a(a);
            l1 = SystemClock.elapsedRealtime();
            l3 = f;
            l = byte0;
            if (l1 < l3) goto _L6; else goto _L9
_L9:
            a(b);
            c.a(a.a.d());
            l = byte0;
              goto _L6
            message;
            f = SystemClock.elapsedRealtime() + (long)(message.a() * 1000);
            l = byte0;
              goto _L6
            obj;
            Log.e("MixpanelAPI.Messages", "Worker threw an unhandled exception", ((Throwable) (obj)));
            message = ((Message) (b.b(a)));
            message;
            JVM INSTR monitorenter ;
            b.a(a, null);
            Looper.myLooper().quit();
            Log.e("MixpanelAPI.Messages", "Mixpanel will not process any more analytics messages", ((Throwable) (obj)));
_L14:
            return;
            obj;
            message;
            JVM INSTR monitorexit ;
            throw obj;
_L8:
            if (message.what != 12)
            {
                break MISSING_BLOCK_LABEL_633;
            }
            com.mixpanel.android.mpmetrics.a.a(a.a, "Installing a check for surveys and in-app notifications");
            message = (d)message.obj;
            c.a(message);
            l1 = SystemClock.elapsedRealtime();
            l3 = f;
            l = byte0;
            if (l1 < l3) goto _L6; else goto _L10
_L10:
            c.a(a.a.d());
            l = byte0;
              goto _L6
            message;
            f = SystemClock.elapsedRealtime() + (long)(message.a() * 1000);
            l = byte0;
              goto _L6
            if (message.what != 13)
            {
                break MISSING_BLOCK_LABEL_659;
            }
            a((String)message.obj);
            l = byte0;
              goto _L6
            if (message.what != 5)
            {
                break MISSING_BLOCK_LABEL_744;
            }
            Log.w("MixpanelAPI.Messages", (new StringBuilder()).append("Worker received a hard kill. Dumping all events and force-killing. Thread id ").append(Thread.currentThread().getId()).toString());
            synchronized (b.b(a))
            {
                b.a();
                b.a(a, null);
                Looper.myLooper().quit();
            }
            l = byte0;
              goto _L6
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
            Log.e("MixpanelAPI.Messages", (new StringBuilder()).append("Unexpected message received by Mixpanel worker: ").append(message).toString());
            l = byte0;
              goto _L6
            message;
            long l2 = SystemClock.elapsedRealtime();
            f = (long)(message.a() * 1000) + l2;
            return;
_L4:
            if (l <= 0) goto _L12; else goto _L11
_L11:
            if (hasMessages(2)) goto _L12; else goto _L13
_L13:
            com.mixpanel.android.mpmetrics.a.a(a.a, (new StringBuilder()).append("Queue depth ").append(l).append(" - Adding flush in ").append(d).toString());
            if (d >= 0L)
            {
                sendEmptyMessageDelayed(2, d);
                return;
            }
              goto _L12
            exception;
            Log.e("MixpanelAPI.Messages", "Could not halt looper", exception);
              goto _L14
        }

        public b.a(b b1, Looper looper)
        {
            a = b1;
            super(looper);
            b = null;
            c = new DecideChecker(com.mixpanel.android.mpmetrics.a.a(b1.a), com.mixpanel.android.mpmetrics.a.b(b1.a));
            e = com.mixpanel.android.mpmetrics.a.b(b1.a).e();
            d = com.mixpanel.android.mpmetrics.a.b(b1.a).b(com.mixpanel.android.mpmetrics.a.a(b1.a));
            b.a(b1, new r(com.mixpanel.android.mpmetrics.a.a(b1.a)));
            f = -1L;
        }
    }


    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 5;
    private static final int h = 12;
    private static final int i = 13;
    private static final String j = "MixpanelAPI.Messages";
    private static final Map k = new HashMap();
    private final b a = new b();
    private final Context b;
    private final g c;

    com.mixpanel.android.mpmetrics.a(Context context)
    {
        b = context;
        c = c(context);
    }

    static Context a(com.mixpanel.android.mpmetrics.a a1)
    {
        return a1.b;
    }

    public static com.mixpanel.android.mpmetrics.a a(Context context)
    {
        Map map = k;
        map;
        JVM INSTR monitorenter ;
        Context context1;
        context1 = context.getApplicationContext();
        if (k.containsKey(context1))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        context = new com.mixpanel.android.mpmetrics.a(context1);
        k.put(context1, context);
_L2:
        return context;
        context = (com.mixpanel.android.mpmetrics.a)k.get(context1);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(com.mixpanel.android.mpmetrics.a a1, String s)
    {
        a1.b(s);
    }

    static void a(com.mixpanel.android.mpmetrics.a a1, String s, Throwable throwable)
    {
        a1.a(s, throwable);
    }

    private void a(String s, Throwable throwable)
    {
        if (g.b)
        {
            Log.v("MixpanelAPI.Messages", (new StringBuilder()).append(s).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString(), throwable);
        }
    }

    static g b(com.mixpanel.android.mpmetrics.a a1)
    {
        return a1.c;
    }

    private void b(String s)
    {
        if (g.b)
        {
            Log.v("MixpanelAPI.Messages", (new StringBuilder()).append(s).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString());
        }
    }

    public void a()
    {
        Message message = Message.obtain();
        message.what = 2;
        a.a(message);
    }

    public void a(a a1)
    {
        Message message = Message.obtain();
        message.what = 1;
        message.obj = a1;
        a.a(message);
    }

    public void a(d d1)
    {
        Message message = Message.obtain();
        message.what = 12;
        message.obj = d1;
        a.a(message);
    }

    public void a(String s)
    {
        Message message = Message.obtain();
        message.what = 13;
        message.obj = s;
        a.a(message);
    }

    public void a(JSONObject jsonobject)
    {
        Message message = Message.obtain();
        message.what = 0;
        message.obj = jsonobject;
        a.a(message);
    }

    protected MPDbAdapter b(Context context)
    {
        return new MPDbAdapter(context);
    }

    public void b()
    {
        Message message = Message.obtain();
        message.what = 5;
        a.a(message);
    }

    protected g c(Context context)
    {
        return com.mixpanel.android.mpmetrics.g.a(context);
    }

    boolean c()
    {
        return a.a();
    }

    protected RemoteService d()
    {
        return new c();
    }

}
