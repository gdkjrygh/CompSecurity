// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.cmcm.adsdk.b.a;
import com.cmcm.adsdk.b.d;
import com.picksinit.PicksMob;

// Referenced classes of package com.cmcm.adsdk:
//            c

public abstract class b
{

    private static Context a;
    private static String b;
    private static boolean c = false;
    private static boolean d = true;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = false;
    private static a h = null;
    private static int i = 0;
    private static long j = 0L;
    private static long k = 0L;
    private static long l = 0L;
    private static com.cmcm.a.a m;
    private static BroadcastReceiver n = null;
    private static d o = new c();

    static BroadcastReceiver a(BroadcastReceiver broadcastreceiver)
    {
        n = broadcastreceiver;
        return broadcastreceiver;
    }

    public static void a()
    {
        e = true;
    }

    protected static void a(Context context, String s)
    {
        s = com.cmcm.adsdk.b.a.a(s);
        h = s;
        s.a(context);
        f = true;
        h.a(o);
    }

    protected static void b(Context context, String s, String s1)
    {
        a = context;
        b = s;
        com.picksinit.b b1 = PicksMob.getInstance();
        int i1;
        if (e)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        b1.setmAdResourceRp(i1);
        PicksMob.getInstance().setmCver(f());
        c = false;
        PicksMob.getInstance().init(context, s, s1, false);
        PicksMob.getInstance().setSSPId(2);
    }

    public static boolean b()
    {
        return c;
    }

    public static boolean c()
    {
        return f;
    }

    public static boolean d()
    {
        com/cmcm/adsdk/b;
        JVM INSTR monitorenter ;
        boolean flag = d;
        com/cmcm/adsdk/b;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static String e()
    {
        return b;
    }

    public static int f()
    {
        int i1;
        try
        {
            i1 = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception.printStackTrace();
            return 0;
        }
        return i1;
    }

    public static long g()
    {
        return j;
    }

    public static long h()
    {
        return k;
    }

    public static long i()
    {
        return l;
    }

    public static int j()
    {
        return i;
    }

    public static com.cmcm.a.a k()
    {
        return m;
    }

    static BroadcastReceiver l()
    {
        return n;
    }

    static d m()
    {
        return o;
    }

    static a n()
    {
        return h;
    }

    static boolean o()
    {
        f = false;
        return false;
    }

    static boolean p()
    {
        return g;
    }

    static Context q()
    {
        return a;
    }

    static boolean r()
    {
        g = true;
        return true;
    }

}
