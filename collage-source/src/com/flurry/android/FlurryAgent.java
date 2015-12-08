// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;

import android.app.Application;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import com.flurry.sdk.eq;
import com.flurry.sdk.fp;
import com.flurry.sdk.fq;
import com.flurry.sdk.fr;
import com.flurry.sdk.gd;
import com.flurry.sdk.hc;
import com.flurry.sdk.hg;
import com.flurry.sdk.hp;
import com.flurry.sdk.hu;
import java.util.Date;
import java.util.Map;

// Referenced classes of package com.flurry.android:
//            FlurryEventRecordStatus

public final class FlurryAgent
{

    private static final String a = com/flurry/android/FlurryAgent.getSimpleName();

    private FlurryAgent()
    {
    }

    public static void addOrigin(String s, String s1)
    {
        addOrigin(s, s1, null);
    }

    public static void addOrigin(String s, String s1, Map map)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("originName not specified");
        }
        if (s1 == null || s1.length() == 0)
        {
            throw new IllegalArgumentException("originVersion not specified");
        }
        try
        {
            fr.a().a(s, s1, map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gd.a(a, "", s);
        }
    }

    public static void clearLocation()
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            hg.a().a("ExplicitLocation", null);
            return;
        }
    }

    public static void endTimedEvent(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            gd.b(a, "String eventId passed to endTimedEvent was null.");
            return;
        }
        try
        {
            eq.a().b(s);
            return;
        }
        catch (Throwable throwable)
        {
            gd.a(a, (new StringBuilder()).append("Failed to signify the end of event: ").append(s).toString(), throwable);
        }
    }

    public static void endTimedEvent(String s, Map map)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            gd.b(a, "String eventId passed to endTimedEvent was null.");
            return;
        }
        if (map == null)
        {
            gd.b(a, "String eventId passed to endTimedEvent was null.");
            return;
        }
        try
        {
            eq.a().b(s, map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            gd.a(a, (new StringBuilder()).append("Failed to signify the end of event: ").append(s).toString(), map);
        }
    }

    public static int getAgentVersion()
    {
        return fq.a();
    }

    public static String getReleaseVersion()
    {
        return fq.f();
    }

    public static void init(Context context, String s)
    {
        com/flurry/android/FlurryAgent;
        JVM INSTR monitorenter ;
        if (android.os.Build.VERSION.SDK_INT >= 10) goto _L2; else goto _L1
_L1:
        gd.b(a, "Device SDK Version older than 10");
_L3:
        com/flurry/android/FlurryAgent;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        throw new NullPointerException("Null context");
        context;
        com/flurry/android/FlurryAgent;
        JVM INSTR monitorexit ;
        throw context;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (s.length() != 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        throw new IllegalArgumentException("apiKey not specified");
        hu.a();
        fp.a(context, s);
          goto _L3
        context;
        gd.a(a, "", context);
          goto _L3
    }

    public static boolean isSessionActive()
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return false;
        }
        boolean flag;
        try
        {
            flag = hc.a().f();
        }
        catch (Throwable throwable)
        {
            gd.a(a, "", throwable);
            return false;
        }
        return flag;
    }

    public static FlurryEventRecordStatus logEvent(String s)
    {
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return flurryeventrecordstatus;
        }
        if (s == null)
        {
            gd.b(a, "String eventId passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        FlurryEventRecordStatus flurryeventrecordstatus1;
        try
        {
            flurryeventrecordstatus1 = eq.a().a(s);
        }
        catch (Throwable throwable)
        {
            gd.a(a, (new StringBuilder()).append("Failed to log event: ").append(s).toString(), throwable);
            return flurryeventrecordstatus;
        }
        return flurryeventrecordstatus1;
    }

    public static FlurryEventRecordStatus logEvent(String s, Map map)
    {
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return flurryeventrecordstatus;
        }
        if (s == null)
        {
            gd.b(a, "String eventId passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        if (map == null)
        {
            gd.b(a, "String parameters passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        try
        {
            map = eq.a().a(s, map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            gd.a(a, (new StringBuilder()).append("Failed to log event: ").append(s).toString(), map);
            return flurryeventrecordstatus;
        }
        return map;
    }

    public static FlurryEventRecordStatus logEvent(String s, Map map, boolean flag)
    {
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return flurryeventrecordstatus;
        }
        if (s == null)
        {
            gd.b(a, "String eventId passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        if (map == null)
        {
            gd.b(a, "String parameters passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        try
        {
            map = eq.a().a(s, map, flag);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            gd.a(a, (new StringBuilder()).append("Failed to log event: ").append(s).toString(), map);
            return flurryeventrecordstatus;
        }
        return map;
    }

    public static FlurryEventRecordStatus logEvent(String s, boolean flag)
    {
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return flurryeventrecordstatus;
        }
        if (s == null)
        {
            gd.b(a, "String eventId passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        FlurryEventRecordStatus flurryeventrecordstatus1;
        try
        {
            flurryeventrecordstatus1 = eq.a().a(s, flag);
        }
        catch (Throwable throwable)
        {
            gd.a(a, (new StringBuilder()).append("Failed to log event: ").append(s).toString(), throwable);
            return flurryeventrecordstatus;
        }
        return flurryeventrecordstatus1;
    }

    public static void onEndSession(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (context == null)
        {
            throw new NullPointerException("Null context");
        }
        if (context instanceof Application)
        {
            throw new IllegalArgumentException("Cannot end a session with an Application context");
        }
        if (fp.a() == null)
        {
            throw new IllegalStateException("Flurry SDK must be initialized before ending a session");
        }
        try
        {
            hc.a().c(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gd.a(a, "", context);
        }
    }

    public static void onError(String s, String s1, String s2)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            gd.b(a, "String errorId passed to onError was null.");
            return;
        }
        if (s1 == null)
        {
            gd.b(a, "String message passed to onError was null.");
            return;
        }
        if (s2 == null)
        {
            gd.b(a, "String errorClass passed to onError was null.");
            return;
        }
        try
        {
            eq.a().a(s, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gd.a(a, "", s);
        }
    }

    public static void onError(String s, String s1, Throwable throwable)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            gd.b(a, "String errorId passed to onError was null.");
            return;
        }
        if (s1 == null)
        {
            gd.b(a, "String message passed to onError was null.");
            return;
        }
        if (throwable == null)
        {
            gd.b(a, "Throwable passed to onError was null.");
            return;
        }
        try
        {
            eq.a().a(s, s1, throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gd.a(a, "", s);
        }
    }

    public static void onEvent(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            gd.b(a, "String eventId passed to onEvent was null.");
            return;
        }
        try
        {
            eq.a().c(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gd.a(a, "", s);
        }
    }

    public static void onEvent(String s, Map map)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            gd.b(a, "String eventId passed to onEvent was null.");
            return;
        }
        if (map == null)
        {
            gd.b(a, "Parameters Map passed to onEvent was null.");
            return;
        }
        try
        {
            eq.a().c(s, map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gd.a(a, "", s);
        }
    }

    public static void onPageView()
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        try
        {
            eq.a().e();
            return;
        }
        catch (Throwable throwable)
        {
            gd.a(a, "", throwable);
        }
    }

    public static void onStartSession(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (context == null)
        {
            throw new NullPointerException("Null context");
        }
        if (context instanceof Application)
        {
            throw new NullPointerException("Cannot start a session with an Application context");
        }
        if (fp.a() == null)
        {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        }
        try
        {
            hc.a().b(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gd.a(a, "", context);
        }
    }

    public static void onStartSession(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (context == null)
        {
            throw new NullPointerException("Null context");
        }
        if (context instanceof Application)
        {
            throw new NullPointerException("Cannot start a session with an Application context");
        }
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("Api key not specified");
        }
        if (fp.a() == null)
        {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        }
        try
        {
            hc.a().b(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gd.a(a, "", context);
        }
    }

    public static void setAge(int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
        } else
        if (i > 0 && i < 110)
        {
            long l = (new Date((new Date(System.currentTimeMillis() - (long)i * 0x7528ad000L)).getYear(), 1, 1)).getTime();
            hg.a().a("Age", Long.valueOf(l));
            return;
        }
    }

    public static void setCaptureUncaughtExceptions(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            hg.a().a("CaptureUncaughtExceptions", Boolean.valueOf(flag));
            return;
        }
    }

    public static void setContinueSessionMillis(long l)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (l < 5000L)
        {
            gd.b(a, (new StringBuilder()).append("Invalid time set for session resumption: ").append(l).toString());
            return;
        } else
        {
            hg.a().a("ContinueSessionMillis", Long.valueOf(l));
            return;
        }
    }

    public static void setGender(byte byte0)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        switch (byte0)
        {
        default:
            hg.a().a("Gender", Byte.valueOf((byte)-1));
            return;

        case 0: // '\0'
        case 1: // '\001'
            hg.a().a("Gender", Byte.valueOf(byte0));
            break;
        }
    }

    public static void setLocation(float f, float f1)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            Location location = new Location("Explicit");
            location.setLatitude(f);
            location.setLongitude(f1);
            hg.a().a("ExplicitLocation", location);
            return;
        }
    }

    public static void setLocationCriteria(Criteria criteria)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
        }
    }

    public static void setLogEnabled(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (flag)
        {
            gd.b();
            return;
        } else
        {
            gd.a();
            return;
        }
    }

    public static void setLogEvents(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            hg.a().a("LogEvents", Boolean.valueOf(flag));
            return;
        }
    }

    public static void setLogLevel(int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            gd.a(i);
            return;
        }
    }

    public static void setReportLocation(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            hg.a().a("ReportLocation", Boolean.valueOf(flag));
            return;
        }
    }

    public static void setUserId(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            gd.b(a, "String userId passed to setUserId was null.");
            return;
        } else
        {
            hg.a().a("UserId", hp.b(s));
            return;
        }
    }

    public static void setVersionName(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            gd.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            gd.b(a, "String versionName passed to setVersionName was null.");
            return;
        } else
        {
            hg.a().a("VersionName", s);
            return;
        }
    }

}
