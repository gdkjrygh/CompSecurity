// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import com.android.slyce.report.b.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            l, c, a, ab, 
//            bk, b, ba, ae, 
//            ac, e, af, o

class d extends Handler
{

    final c a;
    private ac b;
    private final l c;
    private final long d;
    private final boolean e;

    public d(c c1, Looper looper)
    {
        a = c1;
        super(looper);
        b = null;
        c = new l(com.android.slyce.report.mpmetrics.a.a(c1.a), com.android.slyce.report.mpmetrics.a.b(c1.a));
        e = com.android.slyce.report.mpmetrics.a.b(c1.a).d();
        d = com.android.slyce.report.mpmetrics.a.b(c1.a).b();
        com.android.slyce.report.mpmetrics.c.a(c1, new bk(com.android.slyce.report.mpmetrics.a.a(c1.a)));
    }

    private JSONObject a()
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("mp_lib", "android");
        jsonobject.put("$lib_version", "4.5.3");
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
        i = com.google.android.gms.common.d.a(com.android.slyce.report.mpmetrics.a.a(a.a));
        i;
        JVM INSTR tableswitch 0 9: default 172
    //                   0 422
    //                   1 460
    //                   2 472
    //                   3 484
    //                   4 172
    //                   5 172
    //                   6 172
    //                   7 172
    //                   8 172
    //                   9 496;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L1 _L1 _L1 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_496;
_L7:
        obj = com.android.slyce.report.mpmetrics.c.c(a).d();
        jsonobject.put("$screen_dpi", ((DisplayMetrics) (obj)).densityDpi);
        jsonobject.put("$screen_height", ((DisplayMetrics) (obj)).heightPixels);
        jsonobject.put("$screen_width", ((DisplayMetrics) (obj)).widthPixels);
        obj = com.android.slyce.report.mpmetrics.c.c(a).a();
        if (obj != null)
        {
            jsonobject.put("$app_version", obj);
        }
        obj = Boolean.valueOf(com.android.slyce.report.mpmetrics.c.c(a).b());
        if (obj != null)
        {
            jsonobject.put("$has_nfc", ((Boolean) (obj)).booleanValue());
        }
        obj = Boolean.valueOf(com.android.slyce.report.mpmetrics.c.c(a).c());
        if (obj != null)
        {
            jsonobject.put("$has_telephone", ((Boolean) (obj)).booleanValue());
        }
        obj = com.android.slyce.report.mpmetrics.c.c(a).e();
        if (obj != null)
        {
            jsonobject.put("$carrier", obj);
        }
        obj = com.android.slyce.report.mpmetrics.c.c(a).f();
        if (obj != null)
        {
            jsonobject.put("$wifi", ((Boolean) (obj)).booleanValue());
        }
        obj = com.android.slyce.report.mpmetrics.c.c(a).g();
        if (obj != null)
        {
            jsonobject.put("$bluetooth_enabled", obj);
        }
        obj = com.android.slyce.report.mpmetrics.c.c(a).h();
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

    private JSONObject a(com.android.slyce.report.mpmetrics.b b1)
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = b1.b();
        JSONObject jsonobject2 = a();
        jsonobject2.put("token", b1.c());
        if (jsonobject1 != null)
        {
            String s;
            for (Iterator iterator = jsonobject1.keys(); iterator.hasNext(); jsonobject2.put(s, jsonobject1.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        jsonobject.put("event", b1.a());
        jsonobject.put("properties", jsonobject2);
        return jsonobject;
    }

    private void a(ac ac1)
    {
        if (!a.a.b().a(com.android.slyce.report.mpmetrics.a.a(a.a)))
        {
            com.android.slyce.report.mpmetrics.a.a(a.a, "Not flushing data to Mixpanel because the device is not connected to the internet.");
            return;
        }
        com.android.slyce.report.mpmetrics.a.a(a.a, "Sending records to Mixpanel");
        if (e)
        {
            a(ac1, ae.a, new String[] {
                com.android.slyce.report.mpmetrics.a.b(a.a).i()
            });
            a(ac1, com.android.slyce.report.mpmetrics.ae.b, new String[] {
                com.android.slyce.report.mpmetrics.a.b(a.a).j()
            });
            return;
        } else
        {
            a(ac1, ae.a, new String[] {
                com.android.slyce.report.mpmetrics.a.b(a.a).i(), com.android.slyce.report.mpmetrics.a.b(a.a).l()
            });
            a(ac1, com.android.slyce.report.mpmetrics.ae.b, new String[] {
                com.android.slyce.report.mpmetrics.a.b(a.a).j(), com.android.slyce.report.mpmetrics.a.b(a.a).m()
            });
            return;
        }
    }

    private void a(ac ac1, ae ae1, String as[])
    {
        ba ba1;
        String as1[];
        ba1 = a.a.b();
        as1 = ac1.a(ae1);
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
        String s1 = com.android.slyce.report.b.b.a(s3);
        arraylist = new ArrayList(1);
        arraylist.add(new BasicNameValuePair("data", s1));
        if (ab.a)
        {
            arraylist.add(new BasicNameValuePair("verbose", "1"));
        }
        flag = true;
        j = as.length;
        i = 0;
_L9:
        boolean flag1 = flag;
        if (i >= j) goto _L4; else goto _L3
_L3:
        String s2;
        s2 = as[i];
        flag1 = flag;
        byte abyte0[] = ba1.a(s2, arraylist);
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
        com.android.slyce.report.mpmetrics.a.a(a.a, (new StringBuilder()).append("Response was null, unexpected failure posting to ").append(s2).append(".").toString());
        flag1 = flag2;
_L4:
        if (!flag1) goto _L8; else goto _L7
_L7:
        com.android.slyce.report.mpmetrics.a.a(a.a, "Not retrying this batch of events, deleting them from DB.");
        ac1.a(s, ae1);
_L2:
        return;
_L6:
        flag1 = flag3;
        flag = flag4;
        String s4 = new String(abyte0, "UTF-8");
        flag1 = flag3;
        flag = flag4;
        com.android.slyce.report.mpmetrics.a.a(a.a, (new StringBuilder()).append("Successfully posted to ").append(s2).append(": \n").append(s3).toString());
        flag1 = flag3;
        flag = flag4;
        com.android.slyce.report.mpmetrics.a.a(a.a, (new StringBuilder()).append("Response was ").append(s4).toString());
        flag1 = flag2;
          goto _L4
        as;
        Log.e("MixpanelAPI.AnalyticsMessages", (new StringBuilder()).append("Out of memory when posting to ").append(s2).append(".").toString(), as);
          goto _L4
        Object obj;
        obj;
        flag1 = flag3;
        flag = flag4;
        throw new RuntimeException("UTF not supported on this platform?", ((Throwable) (obj)));
        as;
        Log.e("MixpanelAPI.AnalyticsMessages", (new StringBuilder()).append("Cannot interpret ").append(s2).append(" as a URL.").toString(), as);
        flag1 = flag;
          goto _L4
        obj;
        com.android.slyce.report.mpmetrics.a.a(a.a, (new StringBuilder()).append("Cannot post message to ").append(s2).append(".").toString(), ((Throwable) (obj)));
        flag = false;
        i++;
          goto _L9
_L8:
        com.android.slyce.report.mpmetrics.a.a(a.a, "Retrying this batch of events.");
        if (hasMessages(com.android.slyce.report.mpmetrics.a.e())) goto _L2; else goto _L10
_L10:
        sendEmptyMessageDelayed(com.android.slyce.report.mpmetrics.a.e(), d);
        return;
          goto _L4
    }

    private void a(String s)
    {
        if (com.google.android.gms.common.d.a(com.android.slyce.report.mpmetrics.a.a(a.a)) != 0)
        {
            Log.i("MixpanelAPI.AnalyticsMessages", "Can't register for push notifications, Google Play Services are not installed.");
            return;
        }
        break MISSING_BLOCK_LABEL_52;
        s;
        try
        {
            Log.i("MixpanelAPI.AnalyticsMessages", "Can't register for push notifications, Google Play services are not configured.");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.i("MixpanelAPI.AnalyticsMessages", "Exception when trying to register for GCM", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("MixpanelAPI.AnalyticsMessages", "Google play services were not part of this build, push notifications cannot be registered or delivered");
        }
        break MISSING_BLOCK_LABEL_101;
        s = com.google.android.gms.c.b.a(com.android.slyce.report.mpmetrics.a.a(a.a)).a(new String[] {
            s
        });
        af.a(new e(this, s));
        return;
    }

    public void handleMessage(Message message)
    {
        int i;
        if (b == null)
        {
            b = a.a.b(com.android.slyce.report.mpmetrics.a.a(a.a));
            b.a(System.currentTimeMillis() - (long)com.android.slyce.report.mpmetrics.a.b(a.a).c(), ae.a);
            b.a(System.currentTimeMillis() - (long)com.android.slyce.report.mpmetrics.a.b(a.a).c(), com.android.slyce.report.mpmetrics.ae.b);
        }
        i = -1;
        if (message.what != com.android.slyce.report.mpmetrics.a.c()) goto _L2; else goto _L1
_L1:
        message = (JSONObject)message.obj;
        com.android.slyce.report.mpmetrics.a.a(a.a, "Queuing people record for sending later");
        com.android.slyce.report.mpmetrics.a.a(a.a, (new StringBuilder()).append("    ").append(message.toString()).toString());
        i = b.a(message, com.android.slyce.report.mpmetrics.ae.b);
_L7:
        if (i >= com.android.slyce.report.mpmetrics.a.b(a.a).a())
        {
            com.android.slyce.report.mpmetrics.a.a(a.a, "Flushing queue due to bulk upload limit");
            com.android.slyce.report.mpmetrics.c.a(a);
            a(b);
            c.a(a.a.b());
            return;
        }
          goto _L3
_L2:
        if (message.what != com.android.slyce.report.mpmetrics.a.d())
        {
            break MISSING_BLOCK_LABEL_350;
        }
        message = (com.android.slyce.report.mpmetrics.b)message.obj;
        JSONObject jsonobject = a(message);
        com.android.slyce.report.mpmetrics.a.a(a.a, "Queuing event for sending later");
        com.android.slyce.report.mpmetrics.a.a(a.a, (new StringBuilder()).append("    ").append(jsonobject.toString()).toString());
        i = b.a(jsonobject, ae.a);
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        Log.e("MixpanelAPI.AnalyticsMessages", (new StringBuilder()).append("Exception tracking event ").append(message.a()).toString(), ((Throwable) (obj)));
        i = -1;
        continue; /* Loop/switch isn't completed */
        if (message.what == com.android.slyce.report.mpmetrics.a.e())
        {
            com.android.slyce.report.mpmetrics.a.a(a.a, "Flushing queue due to scheduled or forced flush");
            com.android.slyce.report.mpmetrics.c.a(a);
            a(b);
            c.a(a.a.b());
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
        obj;
        Log.e("MixpanelAPI.AnalyticsMessages", "Worker threw an unhandled exception", ((Throwable) (obj)));
        message = ((Message) (com.android.slyce.report.mpmetrics.c.b(a)));
        message;
        JVM INSTR monitorenter ;
        com.android.slyce.report.mpmetrics.c.a(a, null);
        Looper.myLooper().quit();
        Log.e("MixpanelAPI.AnalyticsMessages", "Mixpanel will not process any more analytics messages", ((Throwable) (obj)));
_L5:
        return;
        obj;
        message;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        if (message.what == com.android.slyce.report.mpmetrics.a.f())
        {
            com.android.slyce.report.mpmetrics.a.a(a.a, "Installing a check for surveys and in app notifications");
            message = (o)message.obj;
            c.a(message);
            c.a(a.a.b());
            continue; /* Loop/switch isn't completed */
        }
        if (message.what == com.android.slyce.report.mpmetrics.a.g())
        {
            a((String)message.obj);
            continue; /* Loop/switch isn't completed */
        }
        if (message.what != com.android.slyce.report.mpmetrics.a.h())
        {
            break MISSING_BLOCK_LABEL_631;
        }
        Log.w("MixpanelAPI.AnalyticsMessages", (new StringBuilder()).append("Worker received a hard kill. Dumping all events and force-killing. Thread id ").append(Thread.currentThread().getId()).toString());
        synchronized (com.android.slyce.report.mpmetrics.c.b(a))
        {
            b.a();
            com.android.slyce.report.mpmetrics.c.a(a, null);
            Looper.myLooper().quit();
        }
        continue; /* Loop/switch isn't completed */
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        Log.e("MixpanelAPI.AnalyticsMessages", (new StringBuilder()).append("Unexpected message received by Mixpanel worker: ").append(message).toString());
        continue; /* Loop/switch isn't completed */
_L3:
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_755;
        }
        if (!hasMessages(com.android.slyce.report.mpmetrics.a.e()))
        {
            com.android.slyce.report.mpmetrics.a.a(a.a, (new StringBuilder()).append("Queue depth ").append(i).append(" - Adding flush in ").append(d).toString());
            if (d >= 0L)
            {
                sendEmptyMessageDelayed(com.android.slyce.report.mpmetrics.a.e(), d);
                return;
            }
        }
        break MISSING_BLOCK_LABEL_755;
        exception;
        Log.e("MixpanelAPI.AnalyticsMessages", "Could not halt looper", exception);
          goto _L5
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
