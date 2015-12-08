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

public final class GCMRegistrar
{

    private static final String BACKOFF_MS = "backoff_ms";
    private static final int DEFAULT_BACKOFF_MS = 3000;
    public static final long DEFAULT_ON_SERVER_LIFESPAN_MS = 0x240c8400L;
    private static final String GSF_PACKAGE = "com.google.android.gsf";
    private static final String PREFERENCES = "com.google.android.gcm";
    private static final String PROPERTY_APP_VERSION = "appVersion";
    private static final String PROPERTY_ON_SERVER = "onServer";
    private static final String PROPERTY_ON_SERVER_EXPIRATION_TIME = "onServerExpirationTime";
    private static final String PROPERTY_ON_SERVER_LIFESPAN = "onServerLifeSpan";
    private static final String PROPERTY_REG_ID = "regId";
    private static final String TAG = "GCMRegistrar";
    private static GCMBroadcastReceiver sRetryReceiver;
    private static String sRetryReceiverClassName;

    private GCMRegistrar()
    {
        throw new UnsupportedOperationException();
    }

    public static void checkDevice(Context context)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 8)
        {
            throw new UnsupportedOperationException((new StringBuilder()).append("Device must be at least API Level 8 (instead of ").append(i).append(")").toString());
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

    public static void checkManifest(Context context)
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
        int j = obj1.length;
        for (int i = 0; i < j; i++)
        {
            Object obj2 = obj1[i];
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
            checkReceiver(context, ((Set) (obj)), "com.google.android.c2dm.intent.REGISTRATION");
            checkReceiver(context, ((Set) (obj)), "com.google.android.c2dm.intent.RECEIVE");
            return;
        }
    }

    private static void checkReceiver(Context context, Set set, String s)
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

    static String clearRegistrationId(Context context)
    {
        return setRegistrationId(context, "");
    }

    private static int getAppVersion(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Coult not get package name: ").append(context).toString());
        }
        return i;
    }

    static int getBackoff(Context context)
    {
        return getGCMPreferences(context).getInt("backoff_ms", 3000);
    }

    static transient String getFlatSenderIds(String as[])
    {
        if (as == null || as.length == 0)
        {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringbuilder = new StringBuilder(as[0]);
        for (int i = 1; i < as.length; i++)
        {
            stringbuilder.append(',').append(as[i]);
        }

        return stringbuilder.toString();
    }

    private static SharedPreferences getGCMPreferences(Context context)
    {
        return context.getSharedPreferences("com.google.android.gcm", 0);
    }

    public static long getRegisterOnServerLifespan(Context context)
    {
        return getGCMPreferences(context).getLong("onServerLifeSpan", 0x240c8400L);
    }

    public static String getRegistrationId(Context context)
    {
        Object obj = getGCMPreferences(context);
        String s = ((SharedPreferences) (obj)).getString("regId", "");
        int i = ((SharedPreferences) (obj)).getInt("appVersion", 0x80000000);
        int j = getAppVersion(context);
        obj = s;
        if (i != 0x80000000)
        {
            obj = s;
            if (i != j)
            {
                Log.v("GCMRegistrar", (new StringBuilder()).append("App version changed from ").append(i).append(" to ").append(j).append("; resetting registration id").toString());
                clearRegistrationId(context);
                obj = "";
            }
        }
        return ((String) (obj));
    }

    static transient void internalRegister(Context context, String as[])
    {
        as = getFlatSenderIds(as);
        Log.v("GCMRegistrar", (new StringBuilder()).append("Registering app ").append(context.getPackageName()).append(" of senders ").append(as).toString());
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.putExtra("sender", as);
        context.startService(intent);
    }

    static void internalUnregister(Context context)
    {
        Log.v("GCMRegistrar", (new StringBuilder()).append("Unregistering app ").append(context.getPackageName()).toString());
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        context.startService(intent);
    }

    public static boolean isRegistered(Context context)
    {
        return getRegistrationId(context).length() > 0;
    }

    public static boolean isRegisteredOnServer(Context context)
    {
        context = getGCMPreferences(context);
        boolean flag1 = context.getBoolean("onServer", false);
        Log.v("GCMRegistrar", (new StringBuilder()).append("Is registered on server: ").append(flag1).toString());
        boolean flag = flag1;
        if (flag1)
        {
            long l = context.getLong("onServerExpirationTime", -1L);
            flag = flag1;
            if (System.currentTimeMillis() > l)
            {
                Log.v("GCMRegistrar", (new StringBuilder()).append("flag expired on: ").append(new Timestamp(l)).toString());
                flag = false;
            }
        }
        return flag;
    }

    public static void onDestroy(Context context)
    {
        com/google/android/gcm/GCMRegistrar;
        JVM INSTR monitorenter ;
        if (sRetryReceiver != null)
        {
            Log.v("GCMRegistrar", "Unregistering receiver");
            context.unregisterReceiver(sRetryReceiver);
            sRetryReceiver = null;
        }
        com/google/android/gcm/GCMRegistrar;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static transient void register(Context context, String as[])
    {
        resetBackoff(context);
        internalRegister(context, as);
    }

    static void resetBackoff(Context context)
    {
        Log.d("GCMRegistrar", (new StringBuilder()).append("resetting backoff for ").append(context.getPackageName()).toString());
        setBackoff(context, 3000);
    }

    static void setBackoff(Context context, int i)
    {
        context = getGCMPreferences(context).edit();
        context.putInt("backoff_ms", i);
        context.commit();
    }

    public static void setRegisterOnServerLifespan(Context context, long l)
    {
        context = getGCMPreferences(context).edit();
        context.putLong("onServerLifeSpan", l);
        context.commit();
    }

    public static void setRegisteredOnServer(Context context, boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getGCMPreferences(context).edit();
        editor.putBoolean("onServer", flag);
        long l = getRegisterOnServerLifespan(context);
        l = System.currentTimeMillis() + l;
        Log.v("GCMRegistrar", (new StringBuilder()).append("Setting registeredOnServer status as ").append(flag).append(" until ").append(new Timestamp(l)).toString());
        editor.putLong("onServerExpirationTime", l);
        editor.commit();
    }

    static String setRegistrationId(Context context, String s)
    {
        SharedPreferences sharedpreferences = getGCMPreferences(context);
        String s1 = sharedpreferences.getString("regId", "");
        int i = getAppVersion(context);
        Log.v("GCMRegistrar", (new StringBuilder()).append("Saving regId on app version ").append(i).toString());
        context = sharedpreferences.edit();
        context.putString("regId", s);
        context.putInt("appVersion", i);
        context.commit();
        return s1;
    }

    static void setRetryBroadcastReceiver(Context context)
    {
        com/google/android/gcm/GCMRegistrar;
        JVM INSTR monitorenter ;
        if (sRetryReceiver != null) goto _L2; else goto _L1
_L1:
        if (sRetryReceiverClassName != null) goto _L4; else goto _L3
_L3:
        Log.e("GCMRegistrar", "internal error: retry receiver class not set yet");
        sRetryReceiver = new GCMBroadcastReceiver();
_L5:
        String s = context.getPackageName();
        IntentFilter intentfilter = new IntentFilter("com.google.android.gcm.intent.RETRY");
        intentfilter.addCategory(s);
        s = (new StringBuilder()).append(s).append(".permission.C2D_MESSAGE").toString();
        Log.v("GCMRegistrar", "Registering receiver");
        context.registerReceiver(sRetryReceiver, intentfilter, s, null);
_L2:
        com/google/android/gcm/GCMRegistrar;
        JVM INSTR monitorexit ;
        return;
_L4:
        sRetryReceiver = (GCMBroadcastReceiver)Class.forName(sRetryReceiverClassName).newInstance();
          goto _L5
        Exception exception;
        exception;
        Log.e("GCMRegistrar", (new StringBuilder()).append("Could not create instance of ").append(sRetryReceiverClassName).append(". Using ").append(com/google/android/gcm/GCMBroadcastReceiver.getName()).append(" directly.").toString());
        sRetryReceiver = new GCMBroadcastReceiver();
          goto _L5
        context;
        throw context;
    }

    static void setRetryReceiverClassName(String s)
    {
        Log.v("GCMRegistrar", (new StringBuilder()).append("Setting the name of retry receiver class to ").append(s).toString());
        sRetryReceiverClassName = s;
    }

    public static void unregister(Context context)
    {
        resetBackoff(context);
        internalUnregister(context);
    }
}
