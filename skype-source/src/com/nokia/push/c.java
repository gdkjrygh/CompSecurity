// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nokia.push;

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

// Referenced classes of package com.nokia.push:
//            a, PushBroadcastReceiver

public final class c
{

    private static PushBroadcastReceiver a;
    private static Context b;
    private static String c;
    private static PendingIntent d;

    static transient String a(String as[])
    {
        if (as == null || as.length == 0)
        {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringbuilder = new StringBuilder(as[0]);
        for (int l = 1; l < as.length; l++)
        {
            stringbuilder.append(',').append(as[l]);
        }

        return stringbuilder.toString();
    }

    static void a()
    {
        com/nokia/push/c;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            d.cancel();
            d = null;
        }
        com/nokia/push/c;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(Context context)
    {
        int l = android.os.Build.VERSION.SDK_INT;
        if (l < 16)
        {
            throw new UnsupportedOperationException((new StringBuilder("Device must be at least API Level 16 (instead of ")).append(l).append(")").toString());
        }
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo(a.a, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new UnsupportedOperationException((new StringBuilder("Device does not have package ")).append(a.a).toString());
        }
    }

    static void a(Context context, int l)
    {
        context = k(context).edit();
        context.putInt("backoff_ms", l);
        context.commit();
    }

    private static transient void a(Context context, int l, String s, Object aobj[])
    {
        if (Log.isLoggable("PushRegistrar", l))
        {
            s = String.format(s, aobj);
            Log.println(l, "PushRegistrar", (new StringBuilder("[")).append(context.getPackageName()).append("]: ").append(s).toString());
        }
    }

    private static void a(Context context, Intent intent)
    {
        com/nokia/push/c;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            a(context, 2, "Creating pending intent to get package name", new Object[0]);
            d = PendingIntent.getBroadcast(context, 0, new Intent(), 0);
        }
        intent.putExtra("app", d);
        com/nokia/push/c;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    static void a(Context context, String s)
    {
        com/nokia/push/c;
        JVM INSTR monitorenter ;
        a(context, 2, "Setting the name of retry receiver class to %s", new Object[] {
            s
        });
        c = s;
        com/nokia/push/c;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void a(Context context, Set set, String s)
    {
        Object obj = context.getPackageManager();
        String s1 = context.getPackageName();
        Intent intent = new Intent(s);
        intent.setPackage(s1);
        obj = ((PackageManager) (obj)).queryBroadcastReceivers(intent, 32);
        if (((List) (obj)).isEmpty())
        {
            throw new IllegalStateException((new StringBuilder("No receivers for action ")).append(s).toString());
        }
        a(context, 2, "Found %d receivers for action %s", new Object[] {
            Integer.valueOf(((List) (obj)).size()), s
        });
        for (context = ((List) (obj)).iterator(); context.hasNext();)
        {
            s = ((ResolveInfo)context.next()).activityInfo.name;
            if (!set.contains(s))
            {
                throw new IllegalStateException((new StringBuilder("Receiver ")).append(s).append(" is not set with permission ").append(a.g).toString());
            }
        }

    }

    public static transient void a(Context context, String as[])
    {
        h(context);
        b(context, as);
    }

    static String b(Context context, String s)
    {
        SharedPreferences sharedpreferences = k(context);
        String s1 = sharedpreferences.getString("regId", "");
        int l = j(context);
        a(context, 2, "Saving regId on app version %d", new Object[] {
            Integer.valueOf(l)
        });
        context = sharedpreferences.edit();
        context.putString("regId", s);
        context.putInt("appVersion", l);
        context.commit();
        return s1;
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
            throw new IllegalStateException((new StringBuilder("Application does not define permission ")).append(((String) (obj1))).toString());
        }
        try
        {
            obj1 = packagemanager.getPackageInfo(((String) (obj)), 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder("Could not get receivers for package ")).append(((String) (obj))).toString());
        }
        obj1 = ((PackageInfo) (obj1)).receivers;
        if (obj1 == null || obj1.length == 0)
        {
            throw new IllegalStateException((new StringBuilder("No receiver for package ")).append(((String) (obj))).toString());
        }
        a(context, 2, "number of receivers for %s: %d", new Object[] {
            obj, Integer.valueOf(obj1.length)
        });
        obj = new HashSet();
        int i1 = obj1.length;
        for (int l = 0; l < i1; l++)
        {
            Object obj2 = obj1[l];
            if (a.g.equals(((ActivityInfo) (obj2)).permission))
            {
                ((Set) (obj)).add(((ActivityInfo) (obj2)).name);
            }
        }

        if (((Set) (obj)).isEmpty())
        {
            throw new IllegalStateException((new StringBuilder("No receiver specifies required permission ")).append(a.g).toString());
        } else
        {
            a(context, ((Set) (obj)), a.e);
            a(context, ((Set) (obj)), a.f);
            return;
        }
    }

    static transient void b(Context context, String as[])
    {
        as = a(as);
        a(context, 2, "Registering app for senders %s", new Object[] {
            as
        });
        Intent intent = new Intent(a.c);
        intent.setPackage(a.a);
        a(context, intent);
        intent.putExtra("sender", as);
        context.startService(intent);
    }

    public static void c(Context context)
    {
        h(context);
        d(context);
    }

    static void d(Context context)
    {
        a(context, 2, "Unregistering app", new Object[0]);
        Intent intent = new Intent(a.d);
        intent.setPackage(a.a);
        a(context, intent);
        context.startService(intent);
    }

    static void e(Context context)
    {
        com/nokia/push/c;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        if (c != null) goto _L4; else goto _L3
_L3:
        a(context, 6, "internal error: retry receiver class not set yet", new Object[0]);
        a = new PushBroadcastReceiver();
_L5:
        String s = context.getPackageName();
        IntentFilter intentfilter = new IntentFilter("com.nokia.push.intent.RETRY");
        intentfilter.addCategory(s);
        a(context, 2, "Registering retry receiver", new Object[0]);
        b = context;
        context.registerReceiver(a, intentfilter);
_L2:
        com/nokia/push/c;
        JVM INSTR monitorexit ;
        return;
_L4:
        a = (PushBroadcastReceiver)Class.forName(c).newInstance();
          goto _L5
        Exception exception;
        exception;
        a(context, 6, "Could not create instance of %s. Using %s directly.", new Object[] {
            c, com/nokia/push/PushBroadcastReceiver.getName()
        });
        a = new PushBroadcastReceiver();
          goto _L5
        context;
        throw context;
    }

    public static String f(Context context)
    {
        Object obj = k(context);
        String s = ((SharedPreferences) (obj)).getString("regId", "");
        int l = ((SharedPreferences) (obj)).getInt("appVersion", 0x80000000);
        int i1 = j(context);
        obj = s;
        if (l != 0x80000000)
        {
            obj = s;
            if (l != i1)
            {
                a(context, 2, "App version changed from %d to %d;resetting registration id", new Object[] {
                    Integer.valueOf(l), Integer.valueOf(i1)
                });
                g(context);
                obj = "";
            }
        }
        return ((String) (obj));
    }

    static String g(Context context)
    {
        android.content.SharedPreferences.Editor editor = k(context).edit();
        a(context, 2, "Setting registeredOnServer expiration to %s", new Object[] {
            new Timestamp(0L)
        });
        editor.putLong("onServerExpirationTime", 0L);
        editor.commit();
        return b(context, "");
    }

    static void h(Context context)
    {
        a(context, 2, "Resetting backoff", new Object[0]);
        a(context, 3000);
    }

    static int i(Context context)
    {
        return k(context).getInt("backoff_ms", 3000);
    }

    private static int j(Context context)
    {
        int l;
        try
        {
            l = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder("Coult not get package name: ")).append(context).toString());
        }
        return l;
    }

    private static SharedPreferences k(Context context)
    {
        return context.getSharedPreferences(a.b, 0);
    }
}
