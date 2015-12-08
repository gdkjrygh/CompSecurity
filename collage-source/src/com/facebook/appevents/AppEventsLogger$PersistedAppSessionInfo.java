// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger, FacebookTimeSpentData

static class _cls1
{

    private static final String PERSISTED_SESSION_INFO_FILENAME = "AppEventsLogger.persistedsessioninfo";
    private static final Runnable appSessionInfoFlushRunnable = new Runnable() {

        public void run()
        {
            AppEventsLogger.PersistedAppSessionInfo.saveAppSessionInformation(AppEventsLogger.access$1100());
        }

    };
    private static Map appSessionInfoMap;
    private static boolean hasChanges = false;
    private static boolean isLoaded = false;
    private static final Object staticLock = new Object();

    private static FacebookTimeSpentData getTimeSpentData(Context context, _cls1 _pcls1)
    {
        restoreAppSessionInformation(context);
        FacebookTimeSpentData facebooktimespentdata = (FacebookTimeSpentData)appSessionInfoMap.get(_pcls1);
        context = facebooktimespentdata;
        if (facebooktimespentdata == null)
        {
            context = new FacebookTimeSpentData();
            appSessionInfoMap.put(_pcls1, context);
        }
        return context;
    }

    static void onResume(Context context, appSessionInfoMap appsessioninfomap, AppEventsLogger appeventslogger, long l, String s)
    {
        synchronized (staticLock)
        {
            getTimeSpentData(context, appsessioninfomap).onResume(appeventslogger, l, s);
            onTimeSpentDataUpdate();
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void onSuspend(Context context, onTimeSpentDataUpdate ontimespentdataupdate, AppEventsLogger appeventslogger, long l)
    {
        synchronized (staticLock)
        {
            getTimeSpentData(context, ontimespentdataupdate).onSuspend(appeventslogger, l);
            onTimeSpentDataUpdate();
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void onTimeSpentDataUpdate()
    {
        if (!hasChanges)
        {
            hasChanges = true;
            AppEventsLogger.access$1500().schedule(appSessionInfoFlushRunnable, 30L, TimeUnit.SECONDS);
        }
    }

    private static void restoreAppSessionInformation(Context context)
    {
        Object obj1 = null;
        Object obj2 = staticLock;
        obj2;
        JVM INSTR monitorenter ;
        boolean flag = isLoaded;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Object obj = new ObjectInputStream(context.openFileInput("AppEventsLogger.persistedsessioninfo"));
        obj1 = obj;
        appSessionInfoMap = (HashMap)((ObjectInputStream) (obj)).readObject();
        obj1 = obj;
        Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "App session info loaded");
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (appSessionInfoMap == null)
        {
            appSessionInfoMap = new HashMap();
        }
        isLoaded = true;
        hasChanges = false;
_L1:
        obj2;
        JVM INSTR monitorexit ;
        return;
_L4:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (appSessionInfoMap == null)
        {
            appSessionInfoMap = new HashMap();
        }
        isLoaded = true;
        hasChanges = false;
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
        Log.d(AppEventsLogger.access$1400(), (new StringBuilder()).append("Got unexpected exception: ").append(exception.toString()).toString());
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (appSessionInfoMap == null)
        {
            appSessionInfoMap = new HashMap();
        }
        isLoaded = true;
        hasChanges = false;
          goto _L1
_L2:
        Utility.closeQuietly(((java.io.Closeable) (obj1)));
        context.deleteFile("AppEventsLogger.persistedsessioninfo");
        if (appSessionInfoMap == null)
        {
            appSessionInfoMap = new HashMap();
        }
        isLoaded = true;
        hasChanges = false;
        throw obj;
        obj;
          goto _L2
        exception;
          goto _L3
        obj1;
          goto _L4
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = ((FileNotFoundException) (obj1));
          goto _L4
        filenotfoundexception;
        obj1 = null;
          goto _L2
    }

    static void saveAppSessionInformation(Context context)
    {
        Object obj = staticLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = hasChanges;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("AppEventsLogger.persistedsessioninfo", 0)));
        context = objectoutputstream;
        objectoutputstream.writeObject(appSessionInfoMap);
        context = objectoutputstream;
        hasChanges = false;
        context = objectoutputstream;
        Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "App session info saved");
        Utility.closeQuietly(objectoutputstream);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        objectoutputstream = null;
_L4:
        context = objectoutputstream;
        Log.d(AppEventsLogger.access$1400(), (new StringBuilder()).append("Got unexpected exception: ").append(exception1.toString()).toString());
        Utility.closeQuietly(objectoutputstream);
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        context = null;
_L3:
        Utility.closeQuietly(context);
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
        exception1;
          goto _L4
    }


    _cls1()
    {
    }
}
