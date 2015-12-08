// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.mixpanel.android.a.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            a, ak, g, t, 
//            ae, u, h, b, 
//            v

private final class a
{
    private final class a extends Handler
    {

        final a.b a;
        private u b;
        private long c;
        private boolean d;
        private final g e;

        private JSONObject a()
        {
            JSONObject jsonobject;
            jsonobject = new JSONObject();
            jsonobject.put("mp_lib", "android");
            jsonobject.put("$lib_version", "4.4.1");
            jsonobject.put("$os", "Android");
            Object obj;
            int i;
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
            i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(com.mixpanel.android.mpmetrics.a.a(a.a));
            i;
            JVM INSTR tableswitch 0 9: default 172
        //                       0 415
        //                       1 440
        //                       2 452
        //                       3 464
        //                       4 172
        //                       5 172
        //                       6 172
        //                       7 172
        //                       8 172
        //                       9 476;
               goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L1 _L1 _L1 _L6
_L1:
            break; /* Loop/switch isn't completed */
_L6:
            break MISSING_BLOCK_LABEL_476;
_L7:
            obj = a.b.d(a).d();
            jsonobject.put("$screen_dpi", ((DisplayMetrics) (obj)).densityDpi);
            jsonobject.put("$screen_height", ((DisplayMetrics) (obj)).heightPixels);
            jsonobject.put("$screen_width", ((DisplayMetrics) (obj)).widthPixels);
            obj = a.b.d(a).a();
            if (obj != null)
            {
                jsonobject.put("$app_version", obj);
            }
            obj = Boolean.valueOf(a.b.d(a).b());
            if (obj != null)
            {
                jsonobject.put("$has_nfc", ((Boolean) (obj)).booleanValue());
            }
            obj = Boolean.valueOf(a.b.d(a).c());
            if (obj != null)
            {
                jsonobject.put("$has_telephone", ((Boolean) (obj)).booleanValue());
            }
            obj = a.b.d(a).e();
            if (obj != null)
            {
                jsonobject.put("$carrier", obj);
            }
            obj = a.b.d(a).f();
            if (obj != null)
            {
                jsonobject.put("$wifi", ((Boolean) (obj)).booleanValue());
            }
            obj = ak.g();
            if (obj != null)
            {
                jsonobject.put("$bluetooth_enabled", obj);
            }
            obj = a.b.d(a).h();
            if (obj != null)
            {
                jsonobject.put("$bluetooth_version", obj);
            }
            return jsonobject;
_L2:
            try
            {
                jsonobject.put("$google_play_services", "available");
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

        private JSONObject a(a.a a1)
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

        private void a(u u1)
        {
            com.mixpanel.android.mpmetrics.a.b();
            if (!ae.a(com.mixpanel.android.mpmetrics.a.a(a.a)))
            {
                com.mixpanel.android.mpmetrics.a.a("Not flushing data to Mixpanel because the device is not connected to the internet.");
                return;
            }
            com.mixpanel.android.mpmetrics.a.a("Sending records to Mixpanel");
            if (d)
            {
                a(u1, u.b.a, new String[] {
                    com.mixpanel.android.mpmetrics.a.b(a.a).f()
                });
                a(u1, com.mixpanel.android.mpmetrics.u.b.b, new String[] {
                    com.mixpanel.android.mpmetrics.a.b(a.a).g()
                });
                return;
            } else
            {
                a(u1, u.b.a, new String[] {
                    com.mixpanel.android.mpmetrics.a.b(a.a).f(), com.mixpanel.android.mpmetrics.a.b(a.a).i()
                });
                a(u1, com.mixpanel.android.mpmetrics.u.b.b, new String[] {
                    com.mixpanel.android.mpmetrics.a.b(a.a).g(), com.mixpanel.android.mpmetrics.a.b(a.a).j()
                });
                return;
            }
        }

        private void a(u u1, u.b b1, String as[])
        {
            String as1[];
            boolean flag1;
            boolean flag2;
            boolean flag3;
            flag2 = true;
            flag3 = true;
            flag1 = true;
            com.mixpanel.android.mpmetrics.a.b();
            as1 = u1.a(b1);
            if (as1 == null) goto _L2; else goto _L1
_L1:
            String s;
            String s3;
            ArrayList arraylist;
            boolean flag;
            int i;
            int j;
            s = as1[0];
            s3 = as1[1];
            String s1 = com.mixpanel.android.a.b.a(s3);
            arraylist = new ArrayList(1);
            arraylist.add(new BasicNameValuePair("data", s1));
            if (t.a)
            {
                arraylist.add(new BasicNameValuePair("verbose", "1"));
            }
            j = as.length;
            i = 0;
            flag = true;
_L10:
            if (i >= j) goto _L4; else goto _L3
_L3:
            String s2 = as[i];
            byte abyte0[] = ae.a(s2, arraylist, a.b.d(a).a());
            if (abyte0 != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (!t.a) goto _L4; else goto _L7
_L7:
            (new StringBuilder("Response was null, unexpected failure posting to ")).append(s2).append(".");
            flag = flag1;
_L4:
            if (!flag) goto _L9; else goto _L8
_L8:
            com.mixpanel.android.mpmetrics.a.a("Not retrying this batch of events, deleting them from DB.");
            u1.a(s, b1);
_L2:
            return;
_L6:
            String s4 = new String(abyte0, "UTF-8");
            com.mixpanel.android.mpmetrics.a.a((new StringBuilder("Successfully posted to ")).append(s2).append(": \n").append(s3).toString());
            com.mixpanel.android.mpmetrics.a.a((new StringBuilder("Response was ")).append(s4).toString());
            flag = flag1;
              goto _L4
            as;
            flag = flag2;
_L13:
            Log.e("MixpanelAPI", (new StringBuilder("Out of memory when posting to ")).append(s2).append(".").toString(), as);
              goto _L4
            Object obj;
            obj;
            throw new RuntimeException("UTF not supported on this platform?", ((Throwable) (obj)));
            as;
            flag = flag3;
_L12:
            Log.e("MixpanelAPI", (new StringBuilder("Cannot interpret ")).append(s2).append(" as a URL.").toString(), as);
              goto _L4
            obj;
            if (t.a)
            {
                (new StringBuilder("Cannot post message to ")).append(s2).append(".");
            }
            i++;
            flag = false;
              goto _L10
_L9:
            com.mixpanel.android.mpmetrics.a.a("Retrying this batch of events.");
            if (hasMessages(com.mixpanel.android.mpmetrics.a.d())) goto _L2; else goto _L11
_L11:
            sendEmptyMessageDelayed(com.mixpanel.android.mpmetrics.a.d(), c);
            return;
            as;
              goto _L12
            as;
              goto _L13
        }

        public final void handleMessage(Message message)
        {
            if (b == null)
            {
                b = com.mixpanel.android.mpmetrics.a.b(com.mixpanel.android.mpmetrics.a.a(a.a));
                b.a(System.currentTimeMillis() - (long)com.mixpanel.android.mpmetrics.a.b(a.a).c(), u.b.a);
                b.a(System.currentTimeMillis() - (long)com.mixpanel.android.mpmetrics.a.b(a.a).c(), com.mixpanel.android.mpmetrics.u.b.b);
            }
            if (message.what != com.mixpanel.android.mpmetrics.a.c()) goto _L2; else goto _L1
_L1:
            message = (Long)message.obj;
            com.mixpanel.android.mpmetrics.a.a((new StringBuilder("Changing flush interval to ")).append(message).toString());
            c = message.longValue();
            removeMessages(com.mixpanel.android.mpmetrics.a.d());
            int i = -1;
_L8:
            if (i >= com.mixpanel.android.mpmetrics.a.b(a.a).a())
            {
                com.mixpanel.android.mpmetrics.a.a("Flushing queue due to bulk upload limit");
                a.b.a(a);
                a(b);
                return;
            }
              goto _L3
_L2:
            if (message.what != com.mixpanel.android.mpmetrics.a.e())
            {
                break MISSING_BLOCK_LABEL_225;
            }
            message = (Boolean)message.obj;
            com.mixpanel.android.mpmetrics.a.a((new StringBuilder("Setting fallback to ")).append(message).toString());
            d = message.booleanValue();
            i = -1;
            continue; /* Loop/switch isn't completed */
            if (message.what == com.mixpanel.android.mpmetrics.a.f())
            {
                message = (JSONObject)message.obj;
                com.mixpanel.android.mpmetrics.a.a("Queuing people record for sending later");
                com.mixpanel.android.mpmetrics.a.a((new StringBuilder("    ")).append(message.toString()).toString());
                i = b.a(message, com.mixpanel.android.mpmetrics.u.b.b);
                continue; /* Loop/switch isn't completed */
            }
            if (message.what != com.mixpanel.android.mpmetrics.a.g())
            {
                break MISSING_BLOCK_LABEL_389;
            }
            message = (a.a)message.obj;
            JSONObject jsonobject = a(message);
            com.mixpanel.android.mpmetrics.a.a("Queuing event for sending later");
            com.mixpanel.android.mpmetrics.a.a((new StringBuilder("    ")).append(jsonobject.toString()).toString());
            i = b.a(jsonobject, u.b.a);
            continue; /* Loop/switch isn't completed */
            Object obj;
            obj;
            Log.e("MixpanelAPI", (new StringBuilder("Exception tracking event ")).append(message.a()).toString(), ((Throwable) (obj)));
            i = -1;
            continue; /* Loop/switch isn't completed */
            if (message.what != com.mixpanel.android.mpmetrics.a.d())
            {
                break MISSING_BLOCK_LABEL_438;
            }
            com.mixpanel.android.mpmetrics.a.a("Flushing queue due to scheduled or forced flush");
            a.b.a(a);
            message = e;
            com.mixpanel.android.mpmetrics.a.b();
            message.a();
            a(b);
            i = -1;
            continue; /* Loop/switch isn't completed */
            if (message.what != com.mixpanel.android.mpmetrics.a.h())
            {
                break MISSING_BLOCK_LABEL_488;
            }
            com.mixpanel.android.mpmetrics.a.a("Installing a check for surveys and in app notifications");
            message = (h)message.obj;
            e.a(message);
            message = e;
            com.mixpanel.android.mpmetrics.a.b();
            message.a();
            i = -1;
            continue; /* Loop/switch isn't completed */
            if (message.what != com.mixpanel.android.mpmetrics.a.i())
            {
                break MISSING_BLOCK_LABEL_585;
            }
            message = (String)message.obj;
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(com.mixpanel.android.mpmetrics.a.a(a.a)) != 0)
            {
                i = -1;
                continue; /* Loop/switch isn't completed */
            }
            message = GoogleCloudMessaging.getInstance(com.mixpanel.android.mpmetrics.a.a(a.a)).register(new String[] {
                message
            });
            v.a(new com.mixpanel.android.mpmetrics.b(this, message));
            i = -1;
            continue; /* Loop/switch isn't completed */
            message;
            Log.w("MixpanelAPI", "Google play services were not part of this build, push notifications cannot be registered or delivered");
            i = -1;
            continue; /* Loop/switch isn't completed */
            if (message.what != com.mixpanel.android.mpmetrics.a.j()) goto _L5; else goto _L4
_L4:
            Log.w("MixpanelAPI", (new StringBuilder("Worker received a hard kill. Dumping all events and force-killing. Thread id ")).append(Thread.currentThread().getId()).toString());
            synchronized (com.mixpanel.android.mpmetrics.a.b.b(a))
            {
                b.a();
                a.b.c(a);
                Looper.myLooper().quit();
            }
            i = -1;
            continue; /* Loop/switch isn't completed */
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
            exception;
            Log.e("MixpanelAPI", "Worker threw an unhandled exception", exception);
            message = ((Message) (com.mixpanel.android.mpmetrics.a.b.b(a)));
            message;
            JVM INSTR monitorenter ;
            a.b.c(a);
            Looper.myLooper().quit();
            Log.e("MixpanelAPI", "Mixpanel will not process any more analytics messages", exception);
_L6:
            return;
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
_L5:
            Log.e("MixpanelAPI", (new StringBuilder("Unexpected message received by Mixpanel worker: ")).append(message).toString());
            i = -1;
            continue; /* Loop/switch isn't completed */
_L3:
            if (i <= 0)
            {
                break MISSING_BLOCK_LABEL_835;
            }
            if (!hasMessages(com.mixpanel.android.mpmetrics.a.d()))
            {
                com.mixpanel.android.mpmetrics.a.a((new StringBuilder("Queue depth ")).append(i).append(" - Adding flush in ").append(c).toString());
                if (c >= 0L)
                {
                    sendEmptyMessageDelayed(com.mixpanel.android.mpmetrics.a.d(), c);
                    return;
                }
            }
            break MISSING_BLOCK_LABEL_835;
            exception;
            Log.e("MixpanelAPI", "Could not halt looper", exception);
              goto _L6
            return;
            message;
            i = -1;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public a(Looper looper)
        {
            a = a.b.this;
            super(looper);
            b = null;
            e = new g(com.mixpanel.android.mpmetrics.a.a(a.b.this.a), com.mixpanel.android.mpmetrics.a.b(a.b.this.a));
            d = com.mixpanel.android.mpmetrics.a.b(a.b.this.a).d();
            c = com.mixpanel.android.mpmetrics.a.b(a.b.this.a).b();
            a.b.a(a.b.this, new ak(com.mixpanel.android.mpmetrics.a.a(a.b.this.a)));
        }
    }


    final com.mixpanel.android.mpmetrics.a a;
    private final Object b = new Object();
    private Handler c;
    private long d;
    private long e;
    private long f;
    private ak g;

    static ak a(a.c c1, ak ak)
    {
        c1.g = ak;
        return ak;
    }

    static void a(g g1)
    {
        long l = System.currentTimeMillis();
        long l1 = g1.d + 1L;
        if (g1.f > 0L)
        {
            g1.e = ((l - g1.f) + g1.e * g1.d) / l1;
            long l2 = g1.e / 1000L;
            com.mixpanel.android.mpmetrics.a.a((new StringBuilder("Average send frequency approximately ")).append(l2).append(" seconds.").toString());
        }
        g1.f = l;
        g1.d = l1;
    }

    static Object b(d d1)
    {
        return d1.b;
    }

    static Handler c(b b1)
    {
        b1.c = null;
        return null;
    }

    static ak d(c c1)
    {
        return c1.g;
    }

    public final void a(Message message)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        com.mixpanel.android.mpmetrics.a.a((new StringBuilder("Dead mixpanel worker dropping a message: ")).append(message.what).toString());
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

    public a(com.mixpanel.android.mpmetrics.a a1)
    {
        a = a1;
        super();
        d = 0L;
        e = 0L;
        f = -1L;
        a1 = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 1);
        a1.start();
        c = new a(a1.getLooper());
    }
}
