// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.mixpanel.android.mpmetrics.DecideChecker;
import com.mixpanel.android.mpmetrics.MPDbAdapter;
import com.mixpanel.android.util.RemoteService;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class cwy extends Handler
{

    private MPDbAdapter a;
    private final DecideChecker b;
    private final long c;
    private final boolean d;
    private long e;
    private cwx f;

    public cwy(cwx cwx1, Looper looper)
    {
        f = cwx1;
        super(looper);
        a = null;
        b = new DecideChecker(f.d.b, f.d.c);
        d = cwx1.d.c.e;
        c = cwx1.d.c.b(cwx1.d.b);
        cwx1.c = new cyc(cwx1.d.b);
        e = -1L;
    }

    private JSONObject a()
    {
        Object obj;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("mp_lib", "android");
        jsonobject.put("$lib_version", "4.7.0");
        jsonobject.put("$os", "Android");
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
        i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(f.d.b);
        i;
        JVM INSTR tableswitch 0 9: default 176
    //                   0 529
    //                   1 567
    //                   2 580
    //                   3 593
    //                   4 176
    //                   5 176
    //                   6 176
    //                   7 176
    //                   8 176
    //                   9 606;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L1 _L1 _L1 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_606;
_L7:
        obj = f.c.d;
        jsonobject.put("$screen_dpi", ((DisplayMetrics) (obj)).densityDpi);
        jsonobject.put("$screen_height", ((DisplayMetrics) (obj)).heightPixels);
        jsonobject.put("$screen_width", ((DisplayMetrics) (obj)).widthPixels);
        obj = f.c.e;
        if (obj != null)
        {
            jsonobject.put("$app_version", obj);
        }
        obj = Boolean.valueOf(f.c.b.booleanValue());
        if (obj != null)
        {
            jsonobject.put("$has_nfc", ((Boolean) (obj)).booleanValue());
        }
        obj = Boolean.valueOf(f.c.c.booleanValue());
        if (obj != null)
        {
            jsonobject.put("$has_telephone", ((Boolean) (obj)).booleanValue());
        }
        obj = (TelephonyManager)f.c.a.getSystemService("phone");
        cyc cyc1;
        if (obj != null)
        {
            obj = ((TelephonyManager) (obj)).getNetworkOperatorName();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            jsonobject.put("$carrier", obj);
        }
        obj = f.c;
        if (((cyc) (obj)).a.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            obj = ((ConnectivityManager)((cyc) (obj)).a.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean flag;
            if (obj != null && ((NetworkInfo) (obj)).getType() == 1 && ((NetworkInfo) (obj)).isConnected())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            jsonobject.put("$wifi", ((Boolean) (obj)).booleanValue());
        }
        obj = cyc.a();
        if (obj != null)
        {
            jsonobject.put("$bluetooth_enabled", obj);
        }
        cyc1 = f.c;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            obj = "none";
            if (android.os.Build.VERSION.SDK_INT >= 18 && cyc1.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))
            {
                obj = "ble";
            } else
            if (cyc1.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth"))
            {
                obj = "classic";
            }
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            jsonobject.put("$bluetooth_version", obj);
        }
        return jsonobject;
_L2:
        jsonobject.put("$google_play_services", "available");
          goto _L7
        obj;
        try
        {
            jsonobject.put("$google_play_services", "not configured");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
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

    private JSONObject a(cww cww1)
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = cww1.b;
        JSONObject jsonobject2 = a();
        jsonobject2.put("token", cww1.c);
        if (jsonobject1 != null)
        {
            String s;
            for (Iterator iterator = jsonobject1.keys(); iterator.hasNext(); jsonobject2.put(s, jsonobject1.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        jsonobject.put("event", cww1.a);
        jsonobject.put("properties", jsonobject2);
        return jsonobject;
    }

    private void a(MPDbAdapter mpdbadapter)
    {
        if (!cwv.a().a(f.d.b))
        {
            cwv.a("Not flushing data to Mixpanel because the device is not connected to the internet.");
            return;
        }
        cwv.a("Sending records to Mixpanel");
        if (d)
        {
            a(mpdbadapter, com.mixpanel.android.mpmetrics.MPDbAdapter.Table.a, new String[] {
                f.d.c.j
            });
            a(mpdbadapter, com.mixpanel.android.mpmetrics.MPDbAdapter.Table.b, new String[] {
                f.d.c.l
            });
            return;
        } else
        {
            a(mpdbadapter, com.mixpanel.android.mpmetrics.MPDbAdapter.Table.a, new String[] {
                f.d.c.j, f.d.c.k
            });
            a(mpdbadapter, com.mixpanel.android.mpmetrics.MPDbAdapter.Table.b, new String[] {
                f.d.c.l, f.d.c.m
            });
            return;
        }
    }

    private void a(MPDbAdapter mpdbadapter, com.mixpanel.android.mpmetrics.MPDbAdapter.Table table, String as[])
    {
        RemoteService remoteservice;
        String as1[];
        remoteservice = cwv.a();
        as1 = mpdbadapter.a(table);
        if (as1 == null) goto _L2; else goto _L1
_L1:
        String s;
        String s3;
        HashMap hashmap;
        boolean flag;
        int i;
        int j;
        s = as1[0];
        s3 = as1[1];
        String s1 = cyl.a(s3);
        hashmap = new HashMap();
        hashmap.put("data", s1);
        if (cxi.a)
        {
            hashmap.put("verbose", "1");
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
        byte abyte0[] = remoteservice.a(s2, hashmap, f.d.c.a());
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
        cwv.a((new StringBuilder("Response was null, unexpected failure posting to ")).append(s2).append(".").toString());
        flag1 = flag2;
_L4:
        if (!flag1) goto _L8; else goto _L7
_L7:
        cwv.a("Not retrying this batch of events, deleting them from DB.");
        table = table.mTableName;
        mpdbadapter.a.getWritableDatabase().delete(table, (new StringBuilder("_id <= ")).append(s).toString(), null);
        mpdbadapter.a.close();
_L2:
        return;
_L6:
        flag1 = flag3;
        flag = flag4;
        String s4 = new String(abyte0, "UTF-8");
        flag1 = flag3;
        flag = flag4;
        cwv.a((new StringBuilder("Successfully posted to ")).append(s2).append(": \n").append(s3).toString());
        flag1 = flag3;
        flag = flag4;
        cwv.a((new StringBuilder("Response was ")).append(s4).toString());
        flag1 = flag2;
          goto _L4
        as;
        Log.e("MixpanelAPI.Messages", (new StringBuilder("Out of memory when posting to ")).append(s2).append(".").toString(), as);
          goto _L4
        Object obj;
        obj;
        flag1 = flag3;
        flag = flag4;
        throw new RuntimeException("UTF not supported on this platform?", ((Throwable) (obj)));
        as;
        Log.e("MixpanelAPI.Messages", (new StringBuilder("Cannot interpret ")).append(s2).append(" as a URL.").toString(), as);
        flag1 = flag;
          goto _L4
        obj;
        cwv.a((new StringBuilder("Cannot post message to ")).append(s2).append(".").toString(), ((Throwable) (obj)));
        flag = false;
        i++;
          goto _L9
        as;
        Log.e("MixpanelAPI.Database", (new StringBuilder("Could not clean sent Mixpanel records from ")).append(table).append(". Re-initializing database.").toString(), as);
        mpdbadapter.a.a();
        mpdbadapter.a.close();
        return;
        table;
        mpdbadapter.a.close();
        throw table;
_L8:
        cwv.a("Retrying this batch of events.");
        if (hasMessages(2)) goto _L2; else goto _L10
_L10:
        sendEmptyMessageDelayed(2, c);
        return;
          goto _L4
    }

    public final void handleMessage(Message message)
    {
        if (a == null)
        {
            a = cwv.b(f.d.b);
            a.a(System.currentTimeMillis() - (long)f.d.c.c, com.mixpanel.android.mpmetrics.MPDbAdapter.Table.a);
            a.a(System.currentTimeMillis() - (long)f.d.c.c, com.mixpanel.android.mpmetrics.MPDbAdapter.Table.b);
        }
        if (message.what != 0) goto _L2; else goto _L1
_L1:
        int i;
        message = (JSONObject)message.obj;
        cwv.a("Queuing people record for sending later");
        cwv.a((new StringBuilder("    ")).append(message.toString()).toString());
        i = a.a(message, com.mixpanel.android.mpmetrics.MPDbAdapter.Table.b);
_L21:
        if (i < f.d.c.b && i != -2) goto _L4; else goto _L3
_L3:
        if (SystemClock.elapsedRealtime() < e) goto _L4; else goto _L5
_L5:
        cwv.a("Flushing queue due to bulk upload limit");
        cwx.a(f);
        a(a);
        b.a(cwv.a());
_L17:
        return;
_L2:
        if (message.what != 1)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        message = (cww)message.obj;
        JSONObject jsonobject = a(message);
        cwv.a("Queuing event for sending later");
        cwv.a((new StringBuilder("    ")).append(jsonobject.toString()).toString());
        i = a.a(jsonobject, com.mixpanel.android.mpmetrics.MPDbAdapter.Table.a);
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        Log.e("MixpanelAPI.Messages", (new StringBuilder("Exception tracking event ")).append(((cww) (message)).a).toString(), ((Throwable) (obj)));
        i = -3;
        continue; /* Loop/switch isn't completed */
        if (message.what != 2) goto _L7; else goto _L6
_L6:
        long l;
        long l3;
        cwv.a("Flushing queue due to scheduled or forced flush");
        cwx.a(f);
        l = SystemClock.elapsedRealtime();
        l3 = e;
        if (l < l3) goto _L9; else goto _L8
_L8:
        a(a);
        b.a(cwv.a());
        i = -3;
        continue; /* Loop/switch isn't completed */
        message;
        l = SystemClock.elapsedRealtime();
        e = (long)(((com.mixpanel.android.util.RemoteService.ServiceUnavailableException) (message)).mRetryAfter * 1000) + l;
        i = -3;
        continue; /* Loop/switch isn't completed */
_L7:
        if (message.what != 12) goto _L11; else goto _L10
_L10:
        cwv.a("Installing a check for surveys and in-app notifications");
        message = (cxe)message.obj;
        b.a.add(message);
        l = SystemClock.elapsedRealtime();
        l3 = e;
        if (l < l3) goto _L13; else goto _L12
_L12:
        b.a(cwv.a());
        i = -3;
        continue; /* Loop/switch isn't completed */
        message;
        long l1 = SystemClock.elapsedRealtime();
        e = (long)(((com.mixpanel.android.util.RemoteService.ServiceUnavailableException) (message)).mRetryAfter * 1000) + l1;
          goto _L13
_L11:
        if (message.what != 13)
        {
            break MISSING_BLOCK_LABEL_635;
        }
        message = (String)message.obj;
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(f.d.b) == 0)
        {
            break MISSING_BLOCK_LABEL_558;
        }
        Log.i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play Services are not installed.");
        i = -3;
        continue; /* Loop/switch isn't completed */
        message;
        Log.i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play services are not configured.");
        i = -3;
        continue; /* Loop/switch isn't completed */
        message = byg.a(f.d.b).a(new String[] {
            message
        });
        cxk.a(new cxl(message) {

            private String a;

            public final void a(cxk cxk1)
            {
                if (cxi.a)
                {
                    Log.v("MixpanelAPI.Messages", (new StringBuilder("Using existing pushId ")).append(a).toString());
                }
                cxk1.b.b(a);
            }

            
            {
                a = s;
                super();
            }
        });
        i = -3;
        continue; /* Loop/switch isn't completed */
        message;
        Log.i("MixpanelAPI.Messages", "Exception when trying to register for GCM", message);
        i = -3;
        continue; /* Loop/switch isn't completed */
        message;
        Log.w("MixpanelAPI.Messages", "Google play services were not part of this build, push notifications cannot be registered or delivered");
        i = -3;
        continue; /* Loop/switch isn't completed */
        if (message.what != 5) goto _L15; else goto _L14
_L14:
        Log.w("MixpanelAPI.Messages", (new StringBuilder("Worker received a hard kill. Dumping all events and force-killing. Thread id ")).append(Thread.currentThread().getId()).toString());
        synchronized (f.a)
        {
            a.a.a();
            f.b = null;
            Looper.myLooper().quit();
        }
        i = -3;
        continue; /* Loop/switch isn't completed */
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        Log.e("MixpanelAPI.Messages", "Worker threw an unhandled exception", exception);
        message = ((Message) (f.a));
        message;
        JVM INSTR monitorenter ;
        f.b = null;
        Looper.myLooper().quit();
        Log.e("MixpanelAPI.Messages", "Mixpanel will not process any more analytics messages", exception);
_L19:
        return;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
_L15:
        Log.e("MixpanelAPI.Messages", (new StringBuilder("Unexpected message received by Mixpanel worker: ")).append(message).toString());
          goto _L9
        message;
        long l2 = SystemClock.elapsedRealtime();
        e = (long)(((com.mixpanel.android.util.RemoteService.ServiceUnavailableException) (message)).mRetryAfter * 1000) + l2;
        return;
_L4:
        if (i <= 0) goto _L17; else goto _L16
_L16:
        if (hasMessages(2)) goto _L17; else goto _L18
_L18:
        cwv.a((new StringBuilder("Queue depth ")).append(i).append(" - Adding flush in ").append(c).toString());
        if (c >= 0L)
        {
            sendEmptyMessageDelayed(2, c);
            return;
        }
          goto _L17
        exception;
        Log.e("MixpanelAPI.Messages", "Could not halt looper", exception);
          goto _L19
_L13:
        i = -3;
        continue; /* Loop/switch isn't completed */
_L9:
        i = -3;
        if (true) goto _L21; else goto _L20
_L20:
    }
}
