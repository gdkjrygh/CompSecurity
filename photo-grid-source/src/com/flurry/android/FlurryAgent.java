// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.text.TextUtils;
import com.flurry.sdk.hi;
import com.flurry.sdk.jb;
import com.flurry.sdk.jo;
import com.flurry.sdk.jp;
import com.flurry.sdk.jq;
import com.flurry.sdk.jx;
import com.flurry.sdk.jy;
import com.flurry.sdk.kc;
import com.flurry.sdk.ld;
import com.flurry.sdk.lg;
import com.flurry.sdk.lp;
import com.flurry.sdk.lw;
import java.util.Date;
import java.util.Map;

// Referenced classes of package com.flurry.android:
//            FlurryEventRecordStatus, FlurrySyndicationEventName, FlurryAgentListener

public final class FlurryAgent
{

    private static final String a = com/flurry/android/FlurryAgent.getSimpleName();
    private static FlurryAgentListener b;
    private static final jx c = new _cls1();

    private FlurryAgent()
    {
    }

    static FlurryAgentListener a()
    {
        return b;
    }

    public static void addOrigin(String s, String s1)
    {
        addOrigin(s, s1, null);
    }

    public static void addOrigin(String s, String s1, Map map)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
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
            jq.a().a(s, s1, map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            kc.a(a, "", s);
        }
    }

    public static void addSessionProperty(String s, String s1)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            kc.b(a, "String name or value passed to addSessionProperty was null or empty.");
            return;
        } else
        {
            jb.a().a(s, s1);
            return;
        }
    }

    public static void clearLocation()
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            lg.a().a("ExplicitLocation", null);
            return;
        }
    }

    public static void endTimedEvent(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            kc.b(a, "String eventId passed to endTimedEvent was null.");
            return;
        }
        try
        {
            hi.a().b(s);
            return;
        }
        catch (Throwable throwable)
        {
            kc.a(a, (new StringBuilder("Failed to signify the end of event: ")).append(s).toString(), throwable);
        }
    }

    public static void endTimedEvent(String s, Map map)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            kc.b(a, "String eventId passed to endTimedEvent was null.");
            return;
        }
        if (map == null)
        {
            kc.b(a, "String eventId passed to endTimedEvent was null.");
            return;
        }
        try
        {
            hi.a().b(s, map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            kc.a(a, (new StringBuilder("Failed to signify the end of event: ")).append(s).toString(), map);
        }
    }

    public static int getAgentVersion()
    {
        return jp.a();
    }

    public static String getReleaseVersion()
    {
        return jp.f();
    }

    public static String getSessionId()
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return null;
        }
        String s;
        try
        {
            s = jb.a().c();
        }
        catch (Throwable throwable)
        {
            kc.a(a, "", throwable);
            return null;
        }
        return s;
    }

    public static void init(Context context, String s)
    {
        com/flurry/android/FlurryAgent;
        JVM INSTR monitorenter ;
        if (android.os.Build.VERSION.SDK_INT >= 10) goto _L2; else goto _L1
_L1:
        kc.b(a, "Device SDK Version older than 10");
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
        lw.a();
        jo.a(context, s);
          goto _L3
        context;
        kc.a(a, "", context);
          goto _L3
    }

    public static boolean isSessionActive()
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return false;
        }
        boolean flag;
        try
        {
            flag = ld.a().f();
        }
        catch (Throwable throwable)
        {
            kc.a(a, "", throwable);
            return false;
        }
        return flag;
    }

    public static FlurryEventRecordStatus logEvent(FlurrySyndicationEventName flurrysyndicationeventname, String s, Map map)
    {
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return flurryeventrecordstatus;
        }
        if (flurrysyndicationeventname == null)
        {
            kc.b(a, "String eventName passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        if (TextUtils.isEmpty(s))
        {
            kc.b(a, "String syndicationId passed to logEvent was null or empty.");
            return flurryeventrecordstatus;
        }
        if (map == null)
        {
            kc.b(a, "String parameters passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        try
        {
            s = hi.a().a(flurrysyndicationeventname.toString(), s, map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            kc.a(a, (new StringBuilder("Failed to log event: ")).append(flurrysyndicationeventname.toString()).toString(), s);
            return flurryeventrecordstatus;
        }
        return s;
    }

    public static FlurryEventRecordStatus logEvent(String s)
    {
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return flurryeventrecordstatus;
        }
        if (s == null)
        {
            kc.b(a, "String eventId passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        FlurryEventRecordStatus flurryeventrecordstatus1;
        try
        {
            flurryeventrecordstatus1 = hi.a().a(s);
        }
        catch (Throwable throwable)
        {
            kc.a(a, (new StringBuilder("Failed to log event: ")).append(s).toString(), throwable);
            return flurryeventrecordstatus;
        }
        return flurryeventrecordstatus1;
    }

    public static FlurryEventRecordStatus logEvent(String s, Map map)
    {
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return flurryeventrecordstatus;
        }
        if (s == null)
        {
            kc.b(a, "String eventId passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        if (map == null)
        {
            kc.b(a, "String parameters passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        try
        {
            map = hi.a().a(s, map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            kc.a(a, (new StringBuilder("Failed to log event: ")).append(s).toString(), map);
            return flurryeventrecordstatus;
        }
        return map;
    }

    public static FlurryEventRecordStatus logEvent(String s, Map map, boolean flag)
    {
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return flurryeventrecordstatus;
        }
        if (s == null)
        {
            kc.b(a, "String eventId passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        if (map == null)
        {
            kc.b(a, "String parameters passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        try
        {
            map = hi.a().a(s, map, flag);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            kc.a(a, (new StringBuilder("Failed to log event: ")).append(s).toString(), map);
            return flurryeventrecordstatus;
        }
        return map;
    }

    public static FlurryEventRecordStatus logEvent(String s, boolean flag)
    {
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return flurryeventrecordstatus;
        }
        if (s == null)
        {
            kc.b(a, "String eventId passed to logEvent was null.");
            return flurryeventrecordstatus;
        }
        FlurryEventRecordStatus flurryeventrecordstatus1;
        try
        {
            flurryeventrecordstatus1 = hi.a().a(s, flag);
        }
        catch (Throwable throwable)
        {
            kc.a(a, (new StringBuilder("Failed to log event: ")).append(s).toString(), throwable);
            return flurryeventrecordstatus;
        }
        return flurryeventrecordstatus1;
    }

    public static void onEndSession(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (context == null)
        {
            throw new NullPointerException("Null context");
        }
        if (jo.a() == null)
        {
            throw new IllegalStateException("Flurry SDK must be initialized before ending a session");
        }
        try
        {
            ld.a().c(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            kc.a(a, "", context);
        }
    }

    public static void onError(String s, String s1, String s2)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            kc.b(a, "String errorId passed to onError was null.");
            return;
        }
        if (s1 == null)
        {
            kc.b(a, "String message passed to onError was null.");
            return;
        }
        if (s2 == null)
        {
            kc.b(a, "String errorClass passed to onError was null.");
            return;
        }
        try
        {
            hi.a().a(s, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            kc.a(a, "", s);
        }
    }

    public static void onError(String s, String s1, Throwable throwable)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            kc.b(a, "String errorId passed to onError was null.");
            return;
        }
        if (s1 == null)
        {
            kc.b(a, "String message passed to onError was null.");
            return;
        }
        if (throwable == null)
        {
            kc.b(a, "Throwable passed to onError was null.");
            return;
        }
        try
        {
            hi.a().a(s, s1, throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            kc.a(a, "", s);
        }
    }

    public static void onEvent(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            kc.b(a, "String eventId passed to onEvent was null.");
            return;
        }
        try
        {
            hi.a().c(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            kc.a(a, "", s);
        }
    }

    public static void onEvent(String s, Map map)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            kc.b(a, "String eventId passed to onEvent was null.");
            return;
        }
        if (map == null)
        {
            kc.b(a, "Parameters Map passed to onEvent was null.");
            return;
        }
        try
        {
            hi.a().c(s, map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            kc.a(a, "", s);
        }
    }

    public static void onPageView()
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        try
        {
            hi.a().g();
            return;
        }
        catch (Throwable throwable)
        {
            kc.a(a, "", throwable);
        }
    }

    public static void onStartSession(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (context == null)
        {
            throw new NullPointerException("Null context");
        }
        if (jo.a() == null)
        {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        }
        try
        {
            ld.a().b(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            kc.a(a, "", context);
        }
    }

    public static void onStartSession(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (context == null)
        {
            throw new NullPointerException("Null context");
        }
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("Api key not specified");
        }
        if (jo.a() == null)
        {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        }
        try
        {
            ld.a().b(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            kc.a(a, "", context);
        }
    }

    public static void setAge(int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
        } else
        if (i > 0 && i < 110)
        {
            long l = (new Date((new Date(System.currentTimeMillis() - (long)i * 0x7528ad000L)).getYear(), 1, 1)).getTime();
            lg.a().a("Age", Long.valueOf(l));
            return;
        }
    }

    public static void setCaptureUncaughtExceptions(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            lg.a().a("CaptureUncaughtExceptions", Boolean.valueOf(flag));
            return;
        }
    }

    public static void setContinueSessionMillis(long l)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (l < 5000L)
        {
            kc.b(a, (new StringBuilder("Invalid time set for session resumption: ")).append(l).toString());
            return;
        } else
        {
            lg.a().a("ContinueSessionMillis", Long.valueOf(l));
            return;
        }
    }

    public static void setFlurryAgentListener(FlurryAgentListener flurryagentlistener)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (flurryagentlistener == null)
        {
            kc.b(a, "Listener cannot be null");
            jy.a().b("com.flurry.android.sdk.FlurrySessionEvent", c);
            return;
        } else
        {
            b = flurryagentlistener;
            jy.a().a("com.flurry.android.sdk.FlurrySessionEvent", c);
            return;
        }
    }

    public static void setGender(byte byte0)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        switch (byte0)
        {
        default:
            lg.a().a("Gender", Byte.valueOf((byte)-1));
            return;

        case 0: // '\0'
        case 1: // '\001'
            lg.a().a("Gender", Byte.valueOf(byte0));
            break;
        }
    }

    public static void setLocation(float f, float f1)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            Location location = new Location("Explicit");
            location.setLatitude(f);
            location.setLongitude(f1);
            lg.a().a("ExplicitLocation", location);
            return;
        }
    }

    public static void setLocationCriteria(Criteria criteria)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
        }
    }

    public static void setLogEnabled(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (flag)
        {
            kc.b();
            return;
        } else
        {
            kc.a();
            return;
        }
    }

    public static void setLogEvents(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            lg.a().a("LogEvents", Boolean.valueOf(flag));
            return;
        }
    }

    public static void setLogLevel(int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            kc.a(i);
            return;
        }
    }

    public static void setPulseEnabled(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
        } else
        {
            lg.a().a("ProtonEnabled", Boolean.valueOf(flag));
            if (!flag)
            {
                lg.a().a("analyticsEnabled", Boolean.valueOf(true));
                return;
            }
        }
    }

    public static void setReportLocation(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        } else
        {
            lg.a().a("ReportLocation", Boolean.valueOf(flag));
            return;
        }
    }

    public static void setSessionOrigin(String s, String s1)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            kc.b(a, "String originName passed to setSessionOrigin was null or empty.");
            return;
        } else
        {
            jb.a().a(s);
            jb.a().b(s1);
            return;
        }
    }

    public static void setUserId(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            kc.b(a, "String userId passed to setUserId was null.");
            return;
        } else
        {
            lg.a().a("UserId", lp.b(s));
            return;
        }
    }

    public static void setVersionName(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            kc.b(a, "Device SDK Version older than 10");
            return;
        }
        if (s == null)
        {
            kc.b(a, "String versionName passed to setVersionName was null.");
            return;
        } else
        {
            lg.a().a("VersionName", s);
            return;
        }
    }


    private class _cls1
        implements jx
    {

        public final void a(jw jw)
        {
            a((lc)jw);
        }

        public final void a(lc lc1)
        {
            class _cls1
                implements Runnable
            {

                final lc a;
                final _cls1 b;

                public void run()
                {
                    _cls2.a[a.c.ordinal()];
                    JVM INSTR tableswitch 1 1: default 32
                //                               1 33;
                       goto _L1 _L2
_L1:
                    return;
_L2:
                    if (FlurryAgent.a() != null)
                    {
                        FlurryAgent.a().onSessionStarted();
                        return;
                    }
                    if (true) goto _L1; else goto _L3
_L3:
                }

                _cls1(lc lc1)
                {
                    b = _cls1.this;
                    a = lc1;
                    super();
                }

                private class _cls2
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.flurry.sdk.lc.a.values().length];
                        try
                        {
                            a[com.flurry.sdk.lc.a.b.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror) { }
                    }
                }

            }

            jo.a().a(new _cls1(lc1));
        }

        _cls1()
        {
        }
    }

}
