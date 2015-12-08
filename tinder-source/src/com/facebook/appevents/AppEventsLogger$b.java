// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.internal.h;
import com.facebook.internal.m;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger, FacebookTimeSpentData

static final class _cls1
{

    private static final Object a = new Object();
    private static boolean b = false;
    private static boolean c = false;
    private static Map d;
    private static final Runnable e = new Runnable() {

        public final void run()
        {
            AppEventsLogger.b.a(AppEventsLogger.f());
        }

    };

    private static FacebookTimeSpentData a(Context context, cessTokenAppIdPair cesstokenappidpair)
    {
        Object obj1 = null;
        Object obj2 = a;
        obj2;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Object obj = new ObjectInputStream(context.openFileInput("AppEventsLogger.persistedsessioninfo"));
        obj1 = obj;
        d = (HashMap)((ObjectInputStream) (obj)).readObject();
        obj1 = obj;
        h.a(LoggingBehavior.e, "AppEvents", "App session info loaded");
        m.a(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
_L1:
        obj2;
        JVM INSTR monitorexit ;
        obj = (FacebookTimeSpentData)d.get(cesstokenappidpair);
        context = ((Context) (obj));
        if (obj == null)
        {
            context = new FacebookTimeSpentData();
            d.put(cesstokenappidpair, context);
        }
        return context;
        obj;
        obj = obj1;
_L4:
        m.a(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
          goto _L1
        context;
        obj2;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        obj = null;
_L3:
        obj1 = obj;
        Log.d(AppEventsLogger.g(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
        m.a(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
          goto _L1
_L2:
        m.a(((java.io.Closeable) (obj1)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (d == null)
        {
            d = new HashMap();
        }
        c = true;
        b = false;
        throw cesstokenappidpair;
        cesstokenappidpair;
          goto _L2
        exception;
          goto _L3
        obj1;
          goto _L4
        cesstokenappidpair;
        obj1 = null;
          goto _L2
    }

    private static void a()
    {
        if (!b)
        {
            b = true;
            com.facebook.appevents.AppEventsLogger.h().schedule(e, 30L, TimeUnit.SECONDS);
        }
    }

    static void a(Context context)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("AppEventsLogger.persistedsessioninfo", 0)));
        context = objectoutputstream;
        objectoutputstream.writeObject(d);
        context = objectoutputstream;
        b = false;
        context = objectoutputstream;
        h.a(LoggingBehavior.e, "AppEvents", "App session info saved");
        m.a(objectoutputstream);
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
        m.a(objectoutputstream);
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        context = null;
_L3:
        m.a(context);
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
        exception1;
          goto _L4
    }

    static void a(Context context, cessTokenAppIdPair cesstokenappidpair, long l)
    {
        long l1 = 0L;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        context = a(context, cesstokenappidpair);
        if (((FacebookTimeSpentData) (context)).c) goto _L2; else goto _L1
_L1:
        h.a(LoggingBehavior.e, FacebookTimeSpentData.a, "Suspend for inactive app");
_L3:
        a();
        return;
_L2:
        long l2 = l - ((FacebookTimeSpentData) (context)).e;
        if (l2 >= 0L)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        h.a(LoggingBehavior.e, FacebookTimeSpentData.a, "Clock skew detected");
_L4:
        context.g = l1 + ((FacebookTimeSpentData) (context)).g;
        context.f = l;
        context.c = false;
          goto _L3
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        l1 = l2;
          goto _L4
    }

    static void a(Context context, cessTokenAppIdPair cesstokenappidpair, AppEventsLogger appeventslogger, long l, String s)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        context = a(context, cesstokenappidpair);
        boolean flag;
        long l1;
        long l2;
        if (!((FacebookTimeSpentData) (context)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context.b = true;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (l - ((FacebookTimeSpentData) (context)).d <= 0x493e0L)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        cesstokenappidpair = new Bundle();
        cesstokenappidpair.putString("fb_mobile_launch_source", s);
        appeventslogger.a("fb_mobile_activate_app", cesstokenappidpair);
        context.d = l;
        if (!((FacebookTimeSpentData) (context)).c) goto _L2; else goto _L1
_L1:
        h.a(LoggingBehavior.e, FacebookTimeSpentData.a, "Resume for active app");
_L7:
        a();
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (((FacebookTimeSpentData) (context)).f != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        l1 = l - ((FacebookTimeSpentData) (context)).f;
_L8:
        l2 = l1;
        if (l1 >= 0L)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        h.a(LoggingBehavior.e, FacebookTimeSpentData.a, "Clock skew detected");
        l2 = 0L;
        if (l2 <= 60000L) goto _L6; else goto _L5
_L5:
        cesstokenappidpair = new Bundle();
        cesstokenappidpair.putInt("fb_mobile_app_interruptions", ((FacebookTimeSpentData) (context)).h);
        cesstokenappidpair.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] {
            Integer.valueOf(FacebookTimeSpentData.a(l2))
        }));
        cesstokenappidpair.putString("fb_mobile_launch_source", ((FacebookTimeSpentData) (context)).i);
        appeventslogger.a("fb_mobile_deactivate_app", ((FacebookTimeSpentData) (context)).g / 1000L, cesstokenappidpair);
        context.a();
_L10:
        if (((FacebookTimeSpentData) (context)).h == 0)
        {
            context.i = s;
        }
        context.e = l;
        context.c = true;
          goto _L7
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L4:
        l1 = 0L;
          goto _L8
_L6:
        if (l2 <= 1000L) goto _L10; else goto _L9
_L9:
        context.h = ((FacebookTimeSpentData) (context)).h + 1;
          goto _L10
    }

}
