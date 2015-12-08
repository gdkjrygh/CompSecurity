// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import Bm;
import IE;
import Lw;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.snapchat.android.Timber;
import fY;
import fZ;
import ga;
import gr;
import hm;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kk;
import kl;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pi;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            BlizzardEndpointManager, UserPropertiesProvider, WorkerThread, Constants, 
//            DatabaseHelper, UploadUsageAnalyticsTask

public class BlizzardEventLogger
{
    public static interface UserPropertiesInterface
    {

        public abstract String a();

        public abstract String b();

        public abstract Long c();

        public abstract boolean d();

        public abstract gr e();
    }


    private static BlizzardEventLogger f = new BlizzardEventLogger(new UserPropertiesProvider());
    public boolean a;
    public Runnable b;
    public Context c;
    public SharedPreferences d;
    public WorkerThread e;
    private final Gson g;
    private long h;
    private AtomicBoolean i;
    private AtomicBoolean j;
    private UserPropertiesInterface k;
    private WorkerThread l;
    private boolean m;

    private BlizzardEventLogger(UserPropertiesInterface userpropertiesinterface)
    {
        g = (new GsonBuilder()).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        a = false;
        h = -1L;
        i = new AtomicBoolean(false);
        j = new AtomicBoolean(false);
        e = new WorkerThread("mLogThread");
        l = new WorkerThread("mHttpThread");
        e.start();
        l.start();
        k = userpropertiesinterface;
    }

    static long a(long l1)
    {
        return c(l1);
    }

    static long a(BlizzardEventLogger blizzardeventlogger, long l1)
    {
        blizzardeventlogger.h = l1;
        return l1;
    }

    static long a(BlizzardEventLogger blizzardeventlogger, hm hm1, long l1)
    {
        return blizzardeventlogger.a(hm1, l1);
    }

    private long a(hm hm1, long l1)
    {
        Object obj = d.getString(Constants.i, null);
        hm1.clientTs = Double.valueOf((double)l1 / 1000D);
        hm1.sessionId = ((String) (obj));
        hm1.userAgent = k.b();
        hm1.friendCount = k.c();
        hm1.appTravelMode = Boolean.valueOf(k.d());
        hm1.deviceConnectivity = k.e();
        hm1 = hm1.a();
        Lw.a(String.format("Blizzard Event:%s", new Object[] {
            (String)hm1.get("event_name")
        }));
        hm1 = g.toJson(hm1);
        obj = DatabaseHelper.a(c);
        long l3 = ((DatabaseHelper) (obj)).a(hm1);
        if (((DatabaseHelper) (obj)).a() >= 1000L)
        {
            if (!c())
            {
                b(System.currentTimeMillis());
            }
            ((DatabaseHelper) (obj)).a(((DatabaseHelper) (obj)).b());
            long l2 = f();
            l1 = l2;
            if (l2 == 0L)
            {
                l1 = 0L;
            }
            d.edit().putLong(Constants.k, l1 + 20L).commit();
        }
        if (((DatabaseHelper) (obj)).a() >= 30L)
        {
            a(true);
        } else
        if (!i.getAndSet(true))
        {
            e.a(new Runnable() {

                private BlizzardEventLogger a;

                public void run()
                {
                    BlizzardEventLogger.h(a).set(false);
                    BlizzardEventLogger.g(a);
                }

            
            {
                a = BlizzardEventLogger.this;
                super();
            }
            }, 30000L);
            return l3;
        }
        return l3;
    }

    static UserPropertiesInterface a(BlizzardEventLogger blizzardeventlogger)
    {
        return blizzardeventlogger.k;
    }

    public static BlizzardEventLogger a()
    {
        return f;
    }

    private static Integer a(JSONArray jsonarray)
    {
        DefaultHttpClient defaulthttpclient;
        Object obj = new HttpPost(BlizzardEndpointManager.b());
        int i1;
        try
        {
            ((HttpPost) (obj)).setEntity(new StringEntity(jsonarray.toString(), "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", jsonarray.toString(), new Object[0]);
        }
        jsonarray = new BasicHttpParams();
        HttpConnectionParams.setSoTimeout(jsonarray, 60000);
        defaulthttpclient = new DefaultHttpClient(jsonarray);
        defaulthttpclient.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        jsonarray = null;
        i1 = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj))).getStatusLine().getStatusCode();
        obj = Integer.valueOf(i1);
        jsonarray = ((JSONArray) (obj));
        if (defaulthttpclient.getConnectionManager() != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
            jsonarray = ((JSONArray) (obj));
        }
_L2:
        return jsonarray;
        Object obj1;
        obj1;
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "No service, will attempt to re-upload events later.", new Object[0]);
        if (defaulthttpclient.getConnectionManager() == null) goto _L2; else goto _L1
_L1:
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        obj1;
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "No service, will attempt to re-upload events later.", new Object[0]);
        if (defaulthttpclient.getConnectionManager() == null) goto _L2; else goto _L3
_L3:
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        obj1;
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", ((ClientProtocolException) (obj1)).toString(), new Object[0]);
        if (defaulthttpclient.getConnectionManager() == null) goto _L2; else goto _L4
_L4:
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        obj1;
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", ((IOException) (obj1)).toString(), new Object[0]);
        if (defaulthttpclient.getConnectionManager() == null) goto _L2; else goto _L5
_L5:
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        obj1;
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "Exception:", new Object[] {
            obj1
        });
        if (defaulthttpclient.getConnectionManager() == null) goto _L2; else goto _L6
_L6:
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        obj1;
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "Exception:", new Object[] {
            obj1
        });
        if (defaulthttpclient.getConnectionManager() == null) goto _L2; else goto _L7
_L7:
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        jsonarray;
        if (defaulthttpclient.getConnectionManager() != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
        }
        throw jsonarray;
    }

    static void a(BlizzardEventLogger blizzardeventlogger, long l1, long l2)
    {
        if (blizzardeventlogger.d.getBoolean(Constants.f, false))
        {
            blizzardeventlogger.b();
        }
        Object obj = UUID.randomUUID().toString();
        long l3 = blizzardeventlogger.d.getLong(Constants.h, 0L) + 1L;
        l1 = c(l1 - blizzardeventlogger.d.getLong(Constants.e, -1L));
        blizzardeventlogger.d.edit().putLong(Constants.h, l3).putString(Constants.i, ((String) (obj))).putLong(Constants.c, l2).commit();
        obj = new ga();
        obj.sessionSeqNum = Long.valueOf(l3);
        obj.sinceLastSessionSec = Long.valueOf(l1);
        blizzardeventlogger.a(((kl) (obj)));
    }

    static void a(BlizzardEventLogger blizzardeventlogger, JSONArray jsonarray, long l1, long l2)
    {
        int i1;
        boolean flag;
        long l3;
        flag = true;
        l3 = System.currentTimeMillis();
        i1 = 0;
_L2:
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray.getJSONObject(i1).put("client_upload_ts", l3);
        i1++;
        if (true) goto _L2; else goto _L1
        blizzardeventlogger;
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", blizzardeventlogger.toString(), new Object[0]);
_L4:
        return;
_L1:
        float f1 = Bm.a().a("ANALYTICS_MIGRATION", "AUTH_ENDPOINT_PERCENT", 0.0F);
        int j1;
        boolean flag1;
        if ((double)IE.a().nextFloat() * 100D < (double)f1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        blizzardeventlogger.m = flag1;
        if (blizzardeventlogger.m)
        {
            jsonarray.toString();
            j1 = (new UploadUsageAnalyticsTask(BlizzardEndpointManager.a())).executeSynchronously().mResponseCode;
            if (j1 == 0)
            {
                Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "Failed to obtain a response from server.  Will retry later.", new Object[0]);
                jsonarray = null;
            } else
            {
                jsonarray = Integer.valueOf(j1);
            }
        } else
        {
            jsonarray = a(jsonarray);
        }
        if (jsonarray != null)
        {
            j1 = jsonarray.intValue();
            if (j1 >= 500 && j1 <= 599 || j1 == 401)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0)
            {
                Timber.d("com.snapchat.android.analaytics.framework.BlizzardEventLogger", (new StringBuilder("Event upload failed, with code ")).append(jsonarray).append(", will attempt to re-upload later").toString(), new Object[0]);
                j1 = 0;
            } else
            {
                j1 = jsonarray.intValue();
                blizzardeventlogger.e.a(blizzardeventlogger. new Runnable(j1, l2, l1) {

                    final BlizzardEventLogger a;
                    private int b;
                    private long c;
                    private long d;

                    public void run()
                    {
                        DatabaseHelper databasehelper = DatabaseHelper.a(BlizzardEventLogger.i(a));
                        if (b == 200)
                        {
                            if (BlizzardEventLogger.j(a))
                            {
                                BlizzardEventLogger.k(a);
                            }
                        } else
                        if (c > 0L)
                        {
                            if (!BlizzardEventLogger.j(a))
                            {
                                BlizzardEventLogger.c(a, System.currentTimeMillis());
                            }
                            BlizzardEventLogger.d(a, c);
                        } else
                        {
                            Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "Uploaded to server with 0 events.", new Object[0]);
                        }
                        databasehelper.a(d);
                        BlizzardEventLogger.l(a).set(false);
                        if (databasehelper.a() > 30L)
                        {
                            a.e.a(new Runnable(this) {

                                private _cls9 a;

                                public void run()
                                {
                                    BlizzardEventLogger.m(a.a);
                                }

            
            {
                a = _pcls9;
                super();
            }
                            });
                        }
                    }

            
            {
                a = BlizzardEventLogger.this;
                b = i1;
                c = l1;
                d = l2;
                super();
            }
                });
                j1 = ((flag) ? 1 : 0);
            }
        } else
        {
            j1 = 0;
        }
        if (j1 == 0)
        {
            blizzardeventlogger.j.set(false);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(boolean flag)
    {
        if (!j.getAndSet(true)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = DatabaseHelper.a(c);
        fY fy;
        byte byte0;
        long l1;
        long l2;
        if (flag)
        {
            byte0 = 100;
        } else
        {
            byte0 = -1;
        }
        obj = ((DatabaseHelper) (obj)).a(byte0);
        l1 = ((Long)((Pair) (obj)).first).longValue();
        obj = (JSONArray)((Pair) (obj)).second;
        l2 = ((JSONArray) (obj)).length();
        if (l2 <= 0L)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        if (!c())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        double d1 = (double)System.currentTimeMillis() / 1000D;
        fy = new fY();
        fy.userId = k.a();
        fy.userAgent = k.b();
        fy.friendCount = k.c();
        fy.clientTs = Double.valueOf(d1);
        fy.clientUploadTs = Double.valueOf(d1);
        fy.firstFailureTs = Double.valueOf((double)d() / 1000D);
        fy.rejectedEventCount = Long.valueOf(e());
        fy.overflowedEventCount = Long.valueOf(f());
        ((JSONArray) (obj)).put(new JSONObject(g.toJson(fy)));
_L3:
        obj = new Runnable(((JSONArray) (obj)), l1, l2) {

            private JSONArray a;
            private long b;
            private long c;
            private BlizzardEventLogger d;

            public void run()
            {
                BlizzardEventLogger.a(d, a, b, c);
            }

            
            {
                d = BlizzardEventLogger.this;
                a = jsonarray;
                b = l1;
                c = l2;
                super();
            }
        };
        if (!l.isAlive())
        {
            l = new WorkerThread("mHttpThread");
            l.start();
        }
        l.a(((Runnable) (obj)));
        byte0 = 1;
_L4:
        if (byte0 == 0)
        {
            j.set(false);
            return;
        }
          goto _L1
        JSONException jsonexception;
        jsonexception;
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "Unable to add failure event to upload event list.", new Object[0]);
          goto _L3
        Object obj1;
        obj1;
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", ((Exception) (obj1)).toString(), new Object[0]);
        j.set(false);
        return;
        obj1;
        j.set(false);
        throw obj1;
        byte0 = 0;
          goto _L4
    }

    static boolean a(BlizzardEventLogger blizzardeventlogger, boolean flag)
    {
        blizzardeventlogger.a = flag;
        return flag;
    }

    private void b()
    {
        if (d.getBoolean(Constants.f, false))
        {
            long l1 = d.getLong(Constants.c, -1L);
            l1 = c(d.getLong(Constants.d, -1L) - l1);
            long l2 = d.getLong(Constants.e, -1L);
            long l3 = d.getLong(Constants.g, -1L);
            fZ fz = new fZ();
            fz.userId = k.a();
            fz.sessionTimeSec = Long.valueOf(l1);
            fz.sessionActiveTimeSec = Long.valueOf(l3);
            a(fz, l2);
            d.edit().remove(Constants.g).putBoolean(Constants.f, false).commit();
            if (a("uploadEvents()"))
            {
                e.a(new Runnable() {

                    private BlizzardEventLogger a;

                    public void run()
                    {
                        BlizzardEventLogger.g(a);
                    }

            
            {
                a = BlizzardEventLogger.this;
                super();
            }
                });
                return;
            }
        }
    }

    private void b(long l1)
    {
        if (c())
        {
            Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "First failure has already occurred - aborting overwrite of first failure timestamp.", new Object[0]);
            return;
        } else
        {
            d.edit().putLong(Constants.l, l1).commit();
            return;
        }
    }

    static boolean b(BlizzardEventLogger blizzardeventlogger)
    {
        return blizzardeventlogger.a;
    }

    static boolean b(BlizzardEventLogger blizzardeventlogger, long l1)
    {
        if (blizzardeventlogger.d.contains(Constants.d))
        {
            if ((l1 -= blizzardeventlogger.d.getLong(Constants.d, -1L)) > 0L && l1 < 15000L)
            {
                return false;
            }
        }
        return true;
    }

    private static long c(long l1)
    {
        return Math.round((double)l1 / 1000D);
    }

    static void c(BlizzardEventLogger blizzardeventlogger)
    {
        blizzardeventlogger.d.edit().putBoolean(Constants.f, false).commit();
        blizzardeventlogger.e.b(blizzardeventlogger.b);
    }

    static void c(BlizzardEventLogger blizzardeventlogger, long l1)
    {
        blizzardeventlogger.b(l1);
    }

    private boolean c()
    {
        return d() != -1L;
    }

    private long d()
    {
        return d.getLong(Constants.l, -1L);
    }

    static SharedPreferences d(BlizzardEventLogger blizzardeventlogger)
    {
        return blizzardeventlogger.d;
    }

    static void d(BlizzardEventLogger blizzardeventlogger, long l1)
    {
        long l2 = 0L;
        long l3 = blizzardeventlogger.e();
        if (l3 != 0L)
        {
            l2 = l3;
        }
        blizzardeventlogger.d.edit().putLong(Constants.j, l2 + l1).commit();
    }

    private long e()
    {
        return d.getLong(Constants.j, 0L);
    }

    static long e(BlizzardEventLogger blizzardeventlogger)
    {
        return blizzardeventlogger.h;
    }

    private long f()
    {
        return d.getLong(Constants.k, 0L);
    }

    static void f(BlizzardEventLogger blizzardeventlogger)
    {
        blizzardeventlogger.b();
    }

    static void g(BlizzardEventLogger blizzardeventlogger)
    {
        blizzardeventlogger.a(true);
    }

    static AtomicBoolean h(BlizzardEventLogger blizzardeventlogger)
    {
        return blizzardeventlogger.i;
    }

    static Context i(BlizzardEventLogger blizzardeventlogger)
    {
        return blizzardeventlogger.c;
    }

    static boolean j(BlizzardEventLogger blizzardeventlogger)
    {
        return blizzardeventlogger.c();
    }

    static void k(BlizzardEventLogger blizzardeventlogger)
    {
        blizzardeventlogger.d.edit().putLong(Constants.l, -1L).putLong(Constants.j, 0L).putLong(Constants.k, 0L).commit();
    }

    static AtomicBoolean l(BlizzardEventLogger blizzardeventlogger)
    {
        return blizzardeventlogger.j;
    }

    static void m(BlizzardEventLogger blizzardeventlogger)
    {
        blizzardeventlogger.a(false);
    }

    public final void a(Runnable runnable)
    {
        if (!e.isAlive())
        {
            e = new WorkerThread("mLogThread");
            e.start();
        }
        if (Thread.currentThread() != e)
        {
            e.a(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    public final void a(kk kk)
    {
        if (!a("logEvent()"))
        {
            return;
        } else
        {
            a(new Runnable(kk, System.currentTimeMillis()) {

                private kk a;
                private long b;
                private BlizzardEventLogger c;

                public void run()
                {
                    BlizzardEventLogger.a(c, a, b);
                }

            
            {
                c = BlizzardEventLogger.this;
                a = kk;
                b = l1;
                super();
            }
            });
            return;
        }
    }

    public final void a(kl kl1)
    {
        if (!a("logEvent()"))
        {
            return;
        } else
        {
            a(new Runnable(kl1, System.currentTimeMillis()) {

                private kl a;
                private long b;
                private BlizzardEventLogger c;

                public void run()
                {
                    Boolean boolean1 = a.userNotTracked;
                    if (boolean1 == null || !boolean1.booleanValue())
                    {
                        a.userId = BlizzardEventLogger.a(c).a();
                    }
                    BlizzardEventLogger.a(c, a, b);
                }

            
            {
                c = BlizzardEventLogger.this;
                a = kl1;
                b = l1;
                super();
            }
            });
            return;
        }
    }

    public final boolean a(String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (c != null) goto _L2; else goto _L1
_L1:
        Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", (new StringBuilder("context cannot be null, set context with initialize() before calling ")).append(s).toString(), new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (k == null)
        {
            Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", (new StringBuilder("userPropss cannot be null, set userPropss with initialize() before calling ")).append(s).toString(), new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_84;
        s;
        throw s;
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        new BlizzardEndpointManager();
    }

    // Unreferenced inner class com/snapchat/android/analytics/framework/BlizzardEventLogger$3

/* anonymous class */
    public class _cls3
        implements Runnable
    {

        private long a;
        private long b;
        private BlizzardEventLogger c;

        public void run()
        {
            if (BlizzardEventLogger.b(c))
            {
                return;
            }
            BlizzardEventLogger.a(c, true);
            BlizzardEventLogger.a(c, a);
            if (BlizzardEventLogger.b(c, a))
            {
                BlizzardEventLogger.a(c, b, a);
                return;
            } else
            {
                BlizzardEventLogger.c(c);
                return;
            }
        }

            public 
            {
                c = BlizzardEventLogger.this;
                a = l1;
                b = l2;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/analytics/framework/BlizzardEventLogger$4

/* anonymous class */
    public class _cls4
        implements Runnable
    {

        private long a;
        private long b;
        private BlizzardEventLogger c;

        public void run()
        {
            if (!BlizzardEventLogger.b(c))
            {
                return;
            } else
            {
                long l1 = BlizzardEventLogger.d(c).getLong(Constants.g, 0L);
                long l2 = BlizzardEventLogger.a(a - BlizzardEventLogger.e(c));
                BlizzardEventLogger.d(c).edit().putLong(Constants.d, a).putLong(Constants.e, b).putLong(Constants.g, l1 + l2).putBoolean(Constants.f, true).commit();
                BlizzardEventLogger.a(c, -1L);
                BlizzardEventLogger.a(c, false);
                return;
            }
        }

            public 
            {
                c = BlizzardEventLogger.this;
                a = l1;
                b = l2;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/analytics/framework/BlizzardEventLogger$5

/* anonymous class */
    public class _cls5
        implements Runnable
    {

        private BlizzardEventLogger a;

        public void run()
        {
            BlizzardEventLogger.f(a);
        }

            public 
            {
                a = BlizzardEventLogger.this;
                super();
            }
    }

}
