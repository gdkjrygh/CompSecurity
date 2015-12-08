// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mobileapptracker:
//            MATParameters, MATEvent, MATFBBridge, MATUrlBuilder, 
//            MATEventItem, MATTestRequest, MATResponse, MATUrlRequester, 
//            MATEncryption, MATDeferredDplinkr, MATEventQueue, MATPreloadData

public class MobileAppTracker
{

    private static volatile MobileAppTracker x = null;
    protected BroadcastReceiver a;
    protected Context b;
    protected ExecutorService c;
    protected MATEventQueue d;
    protected MATParameters e;
    protected MATTestRequest f;
    protected boolean g;
    protected boolean h;
    boolean i;
    boolean j;
    boolean k;
    ExecutorService l;
    private final String m = "heF9BATUfWuISyO8";
    private MATDeferredDplinkr n;
    private MATPreloadData o;
    private MATUrlRequester p;
    private MATEncryption q;
    private MATResponse r;
    private boolean s;
    private boolean t;
    private boolean u;
    private long v;
    private long w;

    protected MobileAppTracker()
    {
    }

    public static MobileAppTracker a()
    {
        com/mobileapptracker/MobileAppTracker;
        JVM INSTR monitorenter ;
        MobileAppTracker mobileapptracker = x;
        com/mobileapptracker/MobileAppTracker;
        JVM INSTR monitorexit ;
        return mobileapptracker;
        Exception exception;
        exception;
        throw exception;
    }

    public static MobileAppTracker a(Context context, String s1, String s2)
    {
        com/mobileapptracker/MobileAppTracker;
        JVM INSTR monitorenter ;
        if (x == null)
        {
            x = new MobileAppTracker();
            x.b = context.getApplicationContext();
            x.c = Executors.newSingleThreadExecutor();
            x.a(s1, s2);
        }
        context = x;
        com/mobileapptracker/MobileAppTracker;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static void a(MobileAppTracker mobileapptracker, MATEvent matevent)
    {
        mobileapptracker.b(matevent);
    }

    public static boolean a(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    private void b(MATEvent matevent)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = g;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        String s2;
        Object obj1;
        b();
        e.a("conversion");
        obj = new Date();
        if (matevent.a() != null)
        {
            String s1 = matevent.a();
            if (u)
            {
                MATFBBridge.a(matevent);
            }
            if (s1.equals("close"))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (s1.equals("open") || s1.equals("install") || s1.equals("update") || s1.equals("session"))
            {
                e.a("session");
                new Date(((Date) (obj)).getTime() + 60000L);
            }
        }
        if (matevent.c() > 0.0D)
        {
            e.u("1");
        }
        obj = MATUrlBuilder.a(matevent, o, s);
        s2 = MATUrlBuilder.a(matevent);
        obj1 = new JSONArray();
        if (matevent.f() == null) goto _L4; else goto _L3
_L3:
        int i1 = 0;
_L5:
        if (i1 >= matevent.f().size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((JSONArray) (obj1)).put(((MATEventItem)matevent.f().get(i1)).a());
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
        obj1 = MATUrlBuilder.a(((JSONArray) (obj1)), matevent.g(), matevent.h(), e.ap());
        if (f != null)
        {
            f.a(((String) (obj)), s2, ((JSONObject) (obj1)));
        }
        a(((String) (obj)), s2, ((JSONObject) (obj1)), t);
        t = false;
        b();
        if (r != null)
        {
            r.a(matevent.e());
        }
        if (true) goto _L1; else goto _L6
_L6:
        matevent;
        throw matevent;
    }

    private void d(String s1)
    {
        l = Executors.newSingleThreadExecutor();
        p = new MATUrlRequester();
        q = new MATEncryption(s1.trim(), "heF9BATUfWuISyO8");
        v = System.currentTimeMillis();
        boolean flag;
        if (!b.getSharedPreferences("com.mobileapptracking", 0).getString("mat_referrer", "").equals(""))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        t = true;
        g = false;
        h = false;
        s = false;
        u = false;
    }

    private void f()
    {
        if (n.i())
        {
            n.a(e.al());
            n.a(b, p);
        }
    }

    public void a(Activity activity)
    {
        c.execute(new Runnable(activity) {

            final Activity a;
            final MobileAppTracker b;

            public void run()
            {
                b.e.D(a.getCallingPackage());
                Object obj = a.getIntent();
                if (obj != null)
                {
                    obj = ((Intent) (obj)).getData();
                    if (obj != null)
                    {
                        b.e.E(((Uri) (obj)).toString());
                    }
                }
            }

            
            {
                b = MobileAppTracker.this;
                a = activity;
                super();
            }
        });
    }

    public void a(MATEvent matevent)
    {
        c.execute(new Runnable(matevent) {

            final MATEvent a;
            final MobileAppTracker b;

            public void run()
            {
                MobileAppTracker.a(b, a);
            }

            
            {
                b = MobileAppTracker.this;
                a = matevent;
                super();
            }
        });
    }

    public void a(String s1)
    {
        if (n != null)
        {
            n.b(s1);
            f();
        }
        if (e != null)
        {
            e.c(s1);
        }
    }

    protected void a(String s1, String s2)
    {
        n = MATDeferredDplinkr.a(s1, s2, b.getPackageName());
        e = MATParameters.a(this, b, s1, s2);
        d(s2);
        d = new MATEventQueue(b, this);
        b();
        a = new BroadcastReceiver() {

            final MobileAppTracker a;

            public void onReceive(Context context, Intent intent)
            {
                if (a.h)
                {
                    a.b();
                }
            }

            
            {
                a = MobileAppTracker.this;
                super();
            }
        };
        if (h)
        {
            try
            {
                b.unregisterReceiver(a);
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            h = false;
        }
        s1 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        b.registerReceiver(a, s1);
        h = true;
        g = true;
    }

    protected void a(String s1, String s2, JSONObject jsonobject, boolean flag)
    {
        ExecutorService executorservice = l;
        MATEventQueue mateventqueue = d;
        mateventqueue.getClass();
        executorservice.execute(new MATEventQueue.Add(mateventqueue, s1, s2, jsonobject, flag));
    }

    public void a(String s1, boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (n != null)
        {
            n.a(s1, i1);
            f();
        }
        if (e != null)
        {
            e.p(s1);
            e.q(Integer.toString(i1));
        }
        i = true;
        if (j && !k)
        {
            synchronized (l)
            {
                l.notifyAll();
                k = true;
            }
            return;
        } else
        {
            return;
        }
        exception;
        s1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(boolean flag)
    {
        c.execute(new Runnable(flag) {

            final boolean a;
            final MobileAppTracker b;

            public void run()
            {
                if (a)
                {
                    b.e.o(Integer.toString(1));
                    return;
                } else
                {
                    b.e.o(Integer.toString(0));
                    return;
                }
            }

            
            {
                b = MobileAppTracker.this;
                a = flag;
                super();
            }
        });
    }

    protected boolean a(String s1, String s2, JSONObject jsonobject)
    {
        boolean flag;
        flag = false;
        if (s)
        {
            Log.d("MobileAppTracker", "Sending event to server...");
        }
        s2 = MATUrlBuilder.a(s2, q);
        s1 = MATUrlRequester.a((new StringBuilder()).append(s1).append("&data=").append(s2).toString(), jsonobject, s);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        if (r != null)
        {
            r.b(s1);
        }
_L4:
        return true;
_L2:
        if (!s1.has("success"))
        {
            if (s)
            {
                Log.d("MobileAppTracker", "Request failed, event will remain in queue");
            }
            return false;
        }
        if (r == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag1;
        try
        {
            flag1 = s1.getString("success").equals("true");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return false;
        }
        if (flag1)
        {
            flag = true;
        }
        if (flag)
        {
            r.a(s1);
        } else
        {
            r.b(s1);
        }
        if (!s1.getString("site_event_type").equals("open")) goto _L4; else goto _L3
_L3:
        s1 = s1.getString("log_id");
        if (e().equals(""))
        {
            e.A(s1);
        }
        e.w(s1);
        return true;
        s1;
        return true;
    }

    protected void b()
    {
        if (!a(b))
        {
            return;
        } else
        {
            ExecutorService executorservice = l;
            MATEventQueue mateventqueue = d;
            mateventqueue.getClass();
            executorservice.execute(new MATEventQueue.Dump(mateventqueue));
            return;
        }
    }

    public void b(String s1)
    {
        j = true;
        w = System.currentTimeMillis();
        if (e != null)
        {
            e.a(w - v);
        }
        c.execute(new Runnable(s1) {

            final String a;
            final MobileAppTracker b;

            public void run()
            {
                b.e.t(a);
            }

            
            {
                b = MobileAppTracker.this;
                a = s1;
                super();
            }
        });
    }

    public void c()
    {
        k = false;
        a(new MATEvent("session"));
    }

    public void c(String s1)
    {
        c.execute(new Runnable(s1) {

            final String a;
            final MobileAppTracker b;

            public void run()
            {
                b.e.J(a);
            }

            
            {
                b = MobileAppTracker.this;
                a = s1;
                super();
            }
        });
    }

    public String d()
    {
        return e.O();
    }

    public String e()
    {
        return e.R();
    }

}
