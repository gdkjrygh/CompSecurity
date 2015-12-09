// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            LoggingBehavior, Response, FacebookRequestError, Request, 
//            RequestBatch, FacebookException

public final class Settings
{

    private static final String ANALYTICS_EVENT = "event";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static final String ATTRIBUTION_KEY = "attribution";
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
    private static final int DEFAULT_CORE_POOL_SIZE = 5;
    private static final int DEFAULT_KEEP_ALIVE = 1;
    private static final int DEFAULT_MAXIMUM_POOL_SIZE = 128;
    private static final ThreadFactory DEFAULT_THREAD_FACTORY = new ThreadFactory() {

        private final AtomicInteger counter = new AtomicInteger(0);

        public Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder()).append("FacebookSdk #").append(counter.incrementAndGet()).toString());
        }

    };
    private static final BlockingQueue DEFAULT_WORK_QUEUE = new LinkedBlockingQueue(10);
    private static final Object LOCK = new Object();
    private static final String MOBILE_INSTALL_EVENT = "MOBILE_APP_INSTALL";
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
    private static volatile Executor executor;
    private static final HashSet loggingBehaviors;
    private static volatile boolean shouldAutoPublishInstall;

    public Settings()
    {
    }

    public static final void addLoggingBehavior(LoggingBehavior loggingbehavior)
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.add(loggingbehavior);
        }
        return;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    public static final void clearLoggingBehaviors()
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.clear();
        }
        return;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static Executor getAsyncTaskExecutor()
    {
        Object obj;
        try
        {
            obj = android/os/AsyncTask.getField("THREAD_POOL_EXECUTOR");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        try
        {
            obj = ((Field) (obj)).get(null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        if (!(obj instanceof Executor))
        {
            return null;
        } else
        {
            return (Executor)obj;
        }
    }

    public static String getAttributionId(ContentResolver contentresolver)
    {
        contentresolver = contentresolver.query(ATTRIBUTION_ID_CONTENT_URI, new String[] {
            "aid"
        }, null, null, null);
        if (contentresolver == null || !contentresolver.moveToFirst())
        {
            return null;
        } else
        {
            String s = contentresolver.getString(contentresolver.getColumnIndex("aid"));
            contentresolver.close();
            return s;
        }
    }

    public static Executor getExecutor()
    {
        Object obj1 = LOCK;
        obj1;
        JVM INSTR monitorenter ;
        Executor executor1;
        if (executor != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        executor1 = getAsyncTaskExecutor();
        Object obj;
        obj = executor1;
        if (executor1 != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        obj = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, DEFAULT_WORK_QUEUE, DEFAULT_THREAD_FACTORY);
        executor = ((Executor) (obj));
        obj1;
        JVM INSTR monitorexit ;
        return executor;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static final Set getLoggingBehaviors()
    {
        Set set;
        synchronized (loggingBehaviors)
        {
            set = Collections.unmodifiableSet(new HashSet(loggingBehaviors));
        }
        return set;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String getMigrationBundle()
    {
        return "fbsdk:20121026";
    }

    public static String getSdkVersion()
    {
        return "3.0.0";
    }

    public static boolean getShouldAutoPublishInstall()
    {
        return shouldAutoPublishInstall;
    }

    public static final boolean isLoggingBehaviorEnabled(LoggingBehavior loggingbehavior)
    {
        synchronized (loggingBehaviors) { }
        return false;
        exception;
        loggingbehavior;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean publishInstallAndWait(Context context, String s)
    {
        context = publishInstallAndWaitForResponse(context, s);
        return context != null && context.getError() == null;
    }

    public static Response publishInstallAndWaitForResponse(Context context, String s)
    {
        if (context == null || s == null)
        {
            try
            {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Utility.logd("Facebook-publish", context);
            }
            return new Response(null, null, new FacebookRequestError(null, context));
        }
        Object obj;
        String s1;
        String s2;
        String s3;
        SharedPreferences sharedpreferences;
        long l;
        s3 = getAttributionId(context.getContentResolver());
        sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
        context = (new StringBuilder()).append(s).append("ping").toString();
        s1 = (new StringBuilder()).append(s).append("json").toString();
        l = sharedpreferences.getLong(context, 0L);
        s2 = sharedpreferences.getString(s1, null);
        obj = com.facebook.model.GraphObject.Factory.create();
        ((GraphObject) (obj)).setProperty("event", "MOBILE_APP_INSTALL");
        ((GraphObject) (obj)).setProperty("attribution", s3);
        obj = Request.newPostRequest(null, String.format("%s/activities", new Object[] {
            s
        }), ((GraphObject) (obj)), null);
        if (l == 0L) goto _L2; else goto _L1
_L1:
        s = null;
        context = s;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        context = com.facebook.model.GraphObject.Factory.create(new JSONObject(s2));
_L4:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        return (Response)Response.createResponsesFromString("true", null, new RequestBatch(new Request[] {
            obj
        }), true).get(0);
        return new Response(null, null, context, true);
_L2:
        if (s3 != null)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        throw new FacebookException("No attribution id returned from the Facebook application");
        if (!Utility.queryAppAttributionSupportAndWait(s))
        {
            throw new FacebookException("Install attribution has been disabled on the server.");
        }
        s = ((Request) (obj)).executeAndWait();
        obj = sharedpreferences.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putLong(context, System.currentTimeMillis());
        if (s.getGraphObject() != null && s.getGraphObject().getInnerJSONObject() != null)
        {
            ((android.content.SharedPreferences.Editor) (obj)).putString(s1, s.getGraphObject().getInnerJSONObject().toString());
        }
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        return s;
        context;
        context = s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void publishInstallAsync(Context context, String s)
    {
        publishInstallAsync(context, s, null);
    }

    public static void publishInstallAsync(Context context, String s, Request.Callback callback)
    {
        context = context.getApplicationContext();
        getExecutor().execute(new Runnable(context, s, callback) {

            final Context val$applicationContext;
            final String val$applicationId;
            final Request.Callback val$callback;

            public void run()
            {
                Response response = Settings.publishInstallAndWaitForResponse(applicationContext, applicationId);
                if (callback != null)
                {
                    (new Handler(Looper.getMainLooper())).post(response. new Runnable() {

                        final _cls2 this$0;
                        final Response val$response;

                        public void run()
                        {
                            callback.onCompleted(response);
                        }

            
            {
                this$0 = final__pcls2;
                response = Response.this;
                super();
            }
                    });
                }
            }

            
            {
                applicationContext = context;
                applicationId = s;
                callback = callback1;
                super();
            }
        });
    }

    public static final void removeLoggingBehavior(LoggingBehavior loggingbehavior)
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.remove(loggingbehavior);
        }
        return;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    public static void setExecutor(Executor executor1)
    {
        Validate.notNull(executor1, "executor");
        synchronized (LOCK)
        {
            executor = executor1;
        }
        return;
        executor1;
        obj;
        JVM INSTR monitorexit ;
        throw executor1;
    }

    public static void setShouldAutoPublishInstall(boolean flag)
    {
        shouldAutoPublishInstall = flag;
    }

    static 
    {
        loggingBehaviors = new HashSet(Arrays.asList(new LoggingBehavior[] {
            LoggingBehavior.DEVELOPER_ERRORS
        }));
    }
}
