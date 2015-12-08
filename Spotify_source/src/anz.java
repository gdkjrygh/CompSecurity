// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookTimeSpentData;
import com.facebook.LoggingBehavior;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class anz
{

    private static final Object a = new Object();
    private static boolean b = false;
    private static boolean c = false;
    private static Map d;
    private static final Runnable e = new Runnable() {

        public final void run()
        {
            anz.a(AppEventsLogger.f());
        }

    };

    static void a(Context context)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("AppEventsLogger.persistedsessioninfo", 0)));
        context = objectoutputstream;
        objectoutputstream.writeObject(d);
        context = objectoutputstream;
        b = false;
        context = objectoutputstream;
        LoggingBehavior loggingbehavior = LoggingBehavior.e;
        context = objectoutputstream;
        arb.a();
        arp.a(objectoutputstream);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        objectoutputstream = null;
_L4:
        context = objectoutputstream;
        Log.d(AppEventsLogger.g(), (new StringBuilder("Got unexpected exception: ")).append(exception1.toString()).toString());
        arp.a(objectoutputstream);
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        context = null;
_L3:
        arp.a(context);
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
        exception1;
          goto _L4
    }

    public static void a(Context context, com.facebook.AppEventsLogger.AccessTokenAppIdPair accesstokenappidpair, AppEventsLogger appeventslogger, long l, String s)
    {
        Object obj2 = a;
        obj2;
        JVM INSTR monitorenter ;
        Object obj1 = null;
        Object obj3 = a;
        obj3;
        JVM INSTR monitorenter ;
        boolean flag2 = c;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        Object obj = new ObjectInputStream(context.openFileInput("AppEventsLogger.persistedsessioninfo"));
        obj1 = obj;
        d = (HashMap)((ObjectInputStream) (obj)).readObject();
        obj1 = obj;
        LoggingBehavior loggingbehavior = LoggingBehavior.e;
        obj1 = obj;
        arb.a();
        arp.a(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
_L3:
        obj3;
        JVM INSTR monitorexit ;
        context = (FacebookTimeSpentData)d.get(accesstokenappidpair);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        context = new FacebookTimeSpentData();
        d.put(accesstokenappidpair, context);
        Exception exception;
        boolean flag;
        if (!((FacebookTimeSpentData) (context)).isWarmLaunch)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context.isWarmLaunch = true;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        if (l - ((FacebookTimeSpentData) (context)).lastActivateEventLoggedTime <= 0x493e0L)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        accesstokenappidpair = new Bundle();
        accesstokenappidpair.putString("fb_mobile_launch_source", s);
        appeventslogger.a("fb_mobile_activate_app", accesstokenappidpair);
        context.lastActivateEventLoggedTime = l;
        if (!((FacebookTimeSpentData) (context)).isAppActive) goto _L2; else goto _L1
_L1:
        context = LoggingBehavior.e;
        context = FacebookTimeSpentData.a;
        arb.a();
_L6:
        if (!b)
        {
            b = true;
            AppEventsLogger.h().schedule(e, 30L, TimeUnit.SECONDS);
        }
        obj2;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj = obj1;
_L11:
        arp.a(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
          goto _L3
        context;
        obj3;
        JVM INSTR monitorexit ;
        throw context;
        context;
        obj2;
        JVM INSTR monitorexit ;
        throw context;
        exception;
        obj = null;
_L10:
        obj1 = obj;
        Log.d(AppEventsLogger.g(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
        arp.a(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
          goto _L3
_L9:
        arp.a(((java.io.Closeable) (obj1)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
        throw accesstokenappidpair;
_L2:
        long l1;
        boolean flag1;
        long l2;
        if (((FacebookTimeSpentData) (context)).lastSuspendTime != -1L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_652;
        }
        l1 = l - ((FacebookTimeSpentData) (context)).lastSuspendTime;
_L12:
        l2 = l1;
        if (l1 >= 0L)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        accesstokenappidpair = LoggingBehavior.e;
        accesstokenappidpair = FacebookTimeSpentData.a;
        arb.a();
        l2 = 0L;
        if (l2 <= 60000L) goto _L5; else goto _L4
_L4:
        accesstokenappidpair = new Bundle();
        accesstokenappidpair.putInt("fb_mobile_app_interruptions", ((FacebookTimeSpentData) (context)).interruptionCount);
        accesstokenappidpair.putString("fb_mobile_time_between_sessions", String.format("session_quanta_%d", new Object[] {
            Integer.valueOf(FacebookTimeSpentData.a(l2))
        }));
        accesstokenappidpair.putString("fb_mobile_launch_source", ((FacebookTimeSpentData) (context)).firstOpenSourceApplication);
        appeventslogger.a("fb_mobile_deactivate_app", Double.valueOf(((FacebookTimeSpentData) (context)).millisecondsSpentInSession / 1000L), accesstokenappidpair, false);
        context.a();
_L8:
        if (((FacebookTimeSpentData) (context)).interruptionCount == 0)
        {
            context.firstOpenSourceApplication = s;
        }
        context.lastResumeTime = l;
        context.isAppActive = true;
          goto _L6
_L5:
        if (l2 <= 1000L) goto _L8; else goto _L7
_L7:
        context.interruptionCount = ((FacebookTimeSpentData) (context)).interruptionCount + 1;
          goto _L8
        accesstokenappidpair;
          goto _L9
        exception;
          goto _L10
        obj1;
          goto _L11
        accesstokenappidpair;
        obj1 = null;
          goto _L9
        l1 = 0L;
          goto _L12
    }

}
