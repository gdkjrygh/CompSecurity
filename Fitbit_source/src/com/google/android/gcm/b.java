// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gcm:
//            GCMBroadcastReceiver

public final class b
{

    public static final long a = 0x240c8400L;
    private static final String b = "GCMRegistrar";
    private static final String c = "backoff_ms";
    private static final String d = "com.google.android.gsf";
    private static final String e = "com.google.android.gcm";
    private static final int f = 3000;
    private static final String g = "regId";
    private static final String h = "appVersion";
    private static final String i = "onServer";
    private static final String j = "onServerExpirationTime";
    private static final String k = "onServerLifeSpan";
    private static GCMBroadcastReceiver l;
    private static String m;

    private b()
    {
        throw new UnsupportedOperationException();
    }

    static String a(Context context, String s)
    {
        SharedPreferences sharedpreferences = o(context);
        String s1 = sharedpreferences.getString("regId", "");
        int i1 = n(context);
        Log.v("GCMRegistrar", (new StringBuilder()).append("Saving regId on app version ").append(i1).toString());
        context = sharedpreferences.edit();
        context.putString("regId", s);
        context.putInt("appVersion", i1);
        context.commit();
        return s1;
    }

    static transient String a(String as[])
    {
        if (as == null || as.length == 0)
        {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringbuilder = new StringBuilder(as[0]);
        for (int i1 = 1; i1 < as.length; i1++)
        {
            stringbuilder.append(',').append(as[i1]);
        }

        return stringbuilder.toString();
    }

    public static void a(Context context)
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 < 8)
        {
            throw new UnsupportedOperationException((new StringBuilder()).append("Device must be at least API Level 8 (instead of ").append(i1).append(")").toString());
        }
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo("com.google.android.gsf", 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
        }
    }

    static void a(Context context, int i1)
    {
        context = o(context).edit();
        context.putInt("backoff_ms", i1);
        context.commit();
    }

    public static void a(Context context, long l1)
    {
        context = o(context).edit();
        context.putLong("onServerLifeSpan", l1);
        context.commit();
    }

    private static void a(Context context, Set set, String s)
    {
        PackageManager packagemanager = context.getPackageManager();
        context = context.getPackageName();
        Intent intent = new Intent(s);
        intent.setPackage(context);
        context = packagemanager.queryBroadcastReceivers(intent, 32);
        if (context.isEmpty())
        {
            throw new IllegalStateException((new StringBuilder()).append("No receivers for action ").append(s).toString());
        }
        if (Log.isLoggable("GCMRegistrar", 2))
        {
            Log.v("GCMRegistrar", (new StringBuilder()).append("Found ").append(context.size()).append(" receivers for action ").append(s).toString());
        }
        for (context = context.iterator(); context.hasNext();)
        {
            s = ((ResolveInfo)context.next()).activityInfo.name;
            if (!set.contains(s))
            {
                throw new IllegalStateException((new StringBuilder()).append("Receiver ").append(s).append(" is not set with permission ").append("com.google.android.c2dm.permission.SEND").toString());
            }
        }

    }

    public static void a(Context context, boolean flag)
    {
        android.content.SharedPreferences.Editor editor = o(context).edit();
        editor.putBoolean("onServer", flag);
        long l1 = k(context) + System.currentTimeMillis();
        Log.v("GCMRegistrar", (new StringBuilder()).append("Setting registeredOnServer status as ").append(flag).append(" until ").append(new Timestamp(l1)).toString());
        editor.putLong("onServerExpirationTime", l1);
        editor.commit();
    }

    public static transient void a(Context context, String as[])
    {
        l(context);
        b(context, as);
    }

    static void a(String s)
    {
        Log.v("GCMRegistrar", (new StringBuilder()).append("Setting the name of retry receiver class to ").append(s).toString());
        m = s;
    }

    public static void b(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        Object obj = context.getPackageName();
        Object obj1 = (new StringBuilder()).append(((String) (obj))).append(".permission.C2D_MESSAGE").toString();
        try
        {
            packagemanager.getPermissionInfo(((String) (obj1)), 4096);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append("Application does not define permission ").append(((String) (obj1))).toString());
        }
        try
        {
            obj1 = packagemanager.getPackageInfo(((String) (obj)), 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append("Could not get receivers for package ").append(((String) (obj))).toString());
        }
        obj1 = ((PackageInfo) (obj1)).receivers;
        if (obj1 == null || obj1.length == 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("No receiver for package ").append(((String) (obj))).toString());
        }
        if (Log.isLoggable("GCMRegistrar", 2))
        {
            Log.v("GCMRegistrar", (new StringBuilder()).append("number of receivers for ").append(((String) (obj))).append(": ").append(obj1.length).toString());
        }
        obj = new HashSet();
        int j1 = obj1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Object obj2 = obj1[i1];
            if ("com.google.android.c2dm.permission.SEND".equals(((ActivityInfo) (obj2)).permission))
            {
                ((Set) (obj)).add(((ActivityInfo) (obj2)).name);
            }
        }

        if (((Set) (obj)).isEmpty())
        {
            throw new IllegalStateException("No receiver allowed to receive com.google.android.c2dm.permission.SEND");
        } else
        {
            a(context, ((Set) (obj)), "com.google.android.c2dm.intent.REGISTRATION");
            a(context, ((Set) (obj)), "com.google.android.c2dm.intent.RECEIVE");
            return;
        }
    }

    static transient void b(Context context, String as[])
    {
        as = a(as);
        Log.v("GCMRegistrar", (new StringBuilder()).append("Registering app ").append(context.getPackageName()).append(" of senders ").append(as).toString());
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.putExtra("sender", as);
        context.startService(intent);
    }

    public static void c(Context context)
    {
        l(context);
        e(context);
    }

    public static void d(Context context)
    {
        com/google/android/gcm/b;
        JVM INSTR monitorenter ;
        if (l != null)
        {
            Log.v("GCMRegistrar", "Unregistering receiver");
            context.unregisterReceiver(l);
            l = null;
        }
        com/google/android/gcm/b;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    static void e(Context context)
    {
        Log.v("GCMRegistrar", (new StringBuilder()).append("Unregistering app ").append(context.getPackageName()).toString());
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        context.startService(intent);
    }

    static void f(Context context)
    {
        com/google/android/gcm/b;
        JVM INSTR monitorenter ;
        if (l != null) goto _L2; else goto _L1
_L1:
        if (m != null) goto _L4; else goto _L3
_L3:
        Log.e("GCMRegistrar", "internal error: retry receiver class not set yet");
        l = new GCMBroadcastReceiver();
_L5:
        String s = context.getPackageName();
        IntentFilter intentfilter = new IntentFilter("com.google.android.gcm.intent.RETRY");
        intentfilter.addCategory(s);
        s = (new StringBuilder()).append(s).append(".permission.C2D_MESSAGE").toString();
        Log.v("GCMRegistrar", "Registering receiver");
        context.registerReceiver(l, intentfilter, s, null);
_L2:
        com/google/android/gcm/b;
        JVM INSTR monitorexit ;
        return;
_L4:
        l = (GCMBroadcastReceiver)Class.forName(m).newInstance();
          goto _L5
        Exception exception;
        exception;
        Log.e("GCMRegistrar", (new StringBuilder()).append("Could not create instance of ").append(m).append(". Using ").append(com/google/android/gcm/GCMBroadcastReceiver.getName()).append(" directly.").toString());
        l = new GCMBroadcastReceiver();
          goto _L5
        context;
        throw context;
    }

    public static String g(Context context)
    {
        Object obj = o(context);
        String s = ((SharedPreferences) (obj)).getString("regId", "");
        int i1 = ((SharedPreferences) (obj)).getInt("appVersion", 0x80000000);
        int j1 = n(context);
        obj = s;
        if (i1 != 0x80000000)
        {
            obj = s;
            if (i1 != j1)
            {
                Log.v("GCMRegistrar", (new StringBuilder()).append("App version changed from ").append(i1).append(" to ").append(j1).append("; resetting registration id").toString());
                i(context);
                obj = "";
            }
        }
        return ((String) (obj));
    }

    public static boolean h(Context context)
    {
        return g(context).length() > 0;
    }

    static String i(Context context)
    {
        return a(context, "");
    }

    public static boolean j(Context context)
    {
        context = o(context);
        boolean flag = context.getBoolean("onServer", false);
        Log.v("GCMRegistrar", (new StringBuilder()).append("Is registered on server: ").append(flag).toString());
        if (flag)
        {
            long l1 = context.getLong("onServerExpirationTime", -1L);
            if (System.currentTimeMillis() > l1)
            {
                Log.v("GCMRegistrar", (new StringBuilder()).append("flag expired on: ").append(new Timestamp(l1)).toString());
                return false;
            }
        }
        return flag;
    }

    public static long k(Context context)
    {
        return o(context).getLong("onServerLifeSpan", 0x240c8400L);
    }

    static void l(Context context)
    {
        Log.d("GCMRegistrar", (new StringBuilder()).append("resetting backoff for ").append(context.getPackageName()).toString());
        a(context, 3000);
    }

    static int m(Context context)
    {
        return o(context).getInt("backoff_ms", 3000);
    }

    private static int n(Context context)
    {
        int i1;
        try
        {
            i1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Coult not get package name: ").append(context).toString());
        }
        return i1;
    }

    private static SharedPreferences o(Context context)
    {
        return context.getSharedPreferences("com.google.android.gcm", 0);
    }
}
