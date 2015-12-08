// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

// Referenced classes of package com.skype.android.ads:
//            AdManager, ConfigManager, SkypeAdProperties, SkypeAdControlManager, 
//            SkypeAdTrackingManager, SkypeAdWorker, SkypeAdPlacer

public class SkypeAdManager
    implements AdManager
{

    private static SkypeAdManager g;
    int a;
    int b;
    long c;
    String d;
    String e;
    String f;
    private Context h;
    private String i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private BroadcastReceiver r;
    private BroadcastReceiver s;

    public SkypeAdManager()
    {
        f = "0";
        j = true;
        k = true;
        l = true;
        m = 100;
        n = false;
        o = false;
        p = false;
        q = false;
        r = new BroadcastReceiver() {

            final SkypeAdManager a;

            public final void onReceive(Context context, Intent intent)
            {
                SkypeAdManager.a(a, intent);
            }

            
            {
                a = SkypeAdManager.this;
                super();
            }
        };
        s = new BroadcastReceiver() {

            final SkypeAdManager a;

            public final void onReceive(Context context, Intent intent)
            {
label0:
                {
                    if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
                    {
                        boolean flag = intent.getBooleanExtra("noConnectivity", false);
                        if (SkypeAdManager.a(a) != flag)
                        {
                            SkypeAdManager.a(a, flag);
                            context = SkypeAdPlacer.a();
                            if (context == null || !context.e())
                            {
                                break label0;
                            }
                        }
                    }
                    return;
                }
                SkypeAdManager.b(a);
            }

            
            {
                a = SkypeAdManager.this;
                super();
            }
        };
        g = this;
    }

    private void a(Intent intent)
    {
        boolean flag = false;
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction()))
        {
            int i1 = intent.getIntExtra("level", 0);
            int j1 = intent.getIntExtra("scale", 100);
            m = (i1 * 100) / j1;
            (new StringBuilder("level: ")).append(i1).append(" scale: ").append(j1).append(" batteryLifePercent: ").append(m);
            i1 = ConfigManager.m();
            if (m <= i1)
            {
                flag = true;
            }
            if (o != flag)
            {
                o = flag;
                l();
                return;
            }
        }
    }

    static void a(SkypeAdManager skypeadmanager, Intent intent)
    {
        skypeadmanager.a(intent);
    }

    private void a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag2;
        (new StringBuilder("handleAccountChange with isPremium = ")).append(flag).append(" and hasCredit ").append(flag1).append(".");
        flag2 = SkypeAdProperties.a;
        if (!flag2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        j = flag;
        k = flag1;
        if (!n) goto _L1; else goto _L3
_L3:
        (new StringBuilder("'")).append(i).append("' premium changed ").append(j).append(" -) ").append(flag).append(" and credit ").append(k).append(" -) ").append(flag1);
        Object obj;
        StringBuilder stringbuilder;
        if (!j && !k)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (SkypeAdControlManager.a().f() == flag) goto _L1; else goto _L4
_L4:
        stringbuilder = new StringBuilder("Ads disabled status changed from ");
        if (SkypeAdControlManager.a().f())
        {
            obj = "DISABLED";
        } else
        {
            obj = "ENABLED";
        }
        stringbuilder = stringbuilder.append(((String) (obj))).append(" to ");
        if (flag)
        {
            obj = "DISABLED";
        } else
        {
            obj = "ENABLED";
        }
        stringbuilder.append(((String) (obj))).append(" for ").append(i);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        SkypeAdControlManager.a().c();
          goto _L1
        obj;
        throw obj;
        SkypeAdControlManager.a().d();
          goto _L1
    }

    static boolean a(SkypeAdManager skypeadmanager)
    {
        return skypeadmanager.p;
    }

    static boolean a(SkypeAdManager skypeadmanager, boolean flag)
    {
        skypeadmanager.p = flag;
        return flag;
    }

    static void b(SkypeAdManager skypeadmanager)
    {
        skypeadmanager.l();
    }

    public static SkypeAdManager d()
    {
        return g;
    }

    private void l()
    {
        if (j())
        {
            SkypeAdControlManager.a().g();
            return;
        } else
        {
            SkypeAdControlManager.a().h();
            return;
        }
    }

    public final void a()
    {
        if (!l)
        {
            l = true;
            l();
        }
    }

    public final void a(int i1)
    {
        if (b != i1)
        {
            b = i1;
            ConfigManager.c();
            SkypeAdControlManager.a().e();
        }
    }

    public final void a(long l1)
    {
        if (c != l1)
        {
            c = l1;
            ConfigManager.c();
            SkypeAdControlManager.a().e();
        }
    }

    public final void a(Context context)
    {
        h = context;
        SkypeAdTrackingManager.a().b();
        SkypeAdWorker.a().a(context);
        ConfigManager.a(context);
    }

    public final void a(Context context, String s1, int i1, int j1, long l1, String s2, 
            String s3)
    {
        (new StringBuilder("SkypeAdManager create is called for user('")).append(s1).append("')");
        l = false;
        h = context;
        i = s1;
        a = i1;
        b = j1;
        c = l1;
        d = s2;
        e = s3;
        n = true;
        s1 = e;
        try
        {
            f = s1.split("/")[1].split("\\.")[2];
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e("SkypeAdManager", (new StringBuilder("parse version to get partner id failed with exception ")).append(s1).toString());
        }
        SkypeAdTrackingManager.a().b();
        SkypeAdWorker.a().a(context);
        ConfigManager.a(context);
        s1 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        s1 = context.registerReceiver(r, s1);
        if (s1 != null)
        {
            a(((Intent) (s1)));
        }
        s1 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        context = context.registerReceiver(s, s1);
        if (context != null && context.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            p = context.getBooleanExtra("noConnectivity", false);
        }
        if (!j && !k)
        {
            a(j, k);
        }
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (j != flag)
        {
            a(flag, k);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        if (l)
        {
            l = false;
            l();
        }
    }

    public final void b(int i1)
    {
        if (a != i1)
        {
            a = i1;
            ConfigManager.c();
            SkypeAdControlManager.a().e();
        }
    }

    public final void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (flag != k)
        {
            a(j, flag);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        (new StringBuilder("Loging out '")).append(i).append("' user.");
        l = true;
        SkypeAdControlManager.a().c();
        SkypeAdTrackingManager.a().a(true);
        i = "";
        a = 0;
        b = 0;
        c = 0L;
        j = true;
        k = true;
        n = false;
        (new StringBuilder("'")).append(i).append("' user successfully loging out.");
    }

    public final void c(boolean flag)
    {
        if (q != flag)
        {
            q = flag;
            ConfigManager.c();
            SkypeAdControlManager.a().e();
        }
    }

    public final Context e()
    {
        return h;
    }

    public final String f()
    {
        return i;
    }

    public final boolean g()
    {
        return q;
    }

    public final long h()
        throws Exception
    {
        long l1 = 0L;
        if (h != null)
        {
            l1 = h.getPackageManager().getPackageInfo(h.getPackageName(), 0).lastUpdateTime;
        }
        return l1;
    }

    public final boolean i()
    {
        while (SkypeAdProperties.a || !j && !k) 
        {
            return false;
        }
        return true;
    }

    public final boolean j()
    {
        return l || p || o;
    }

    public final void k()
    {
        if (!j())
        {
            Object obj = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            obj = h.registerReceiver(null, ((IntentFilter) (obj)));
            if (obj != null)
            {
                a(((Intent) (obj)));
                return;
            }
        }
    }
}
