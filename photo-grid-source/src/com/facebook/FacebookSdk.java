// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            LoggingBehavior, AsyncTask, GraphResponse, FacebookRequestError, 
//            GraphRequest, GraphRequestBatch, FacebookException

public final class FacebookSdk
{

    private static final String ANALYTICS_EVENT = "event";
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
    static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized.";
    static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
    private static final int DEFAULT_CORE_POOL_SIZE = 5;
    private static final int DEFAULT_KEEP_ALIVE = 1;
    private static final int DEFAULT_MAXIMUM_POOL_SIZE = 128;
    private static final ThreadFactory DEFAULT_THREAD_FACTORY = new _cls1();
    private static final BlockingQueue DEFAULT_WORK_QUEUE = new LinkedBlockingQueue(10);
    private static final String FACEBOOK_COM = "facebook.com";
    private static final Object LOCK = new Object();
    private static final int MAX_REQUEST_CODE_RANGE = 100;
    private static final String MOBILE_INSTALL_EVENT = "MOBILE_APP_INSTALL";
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
    private static final String TAG = com/facebook/FacebookSdk.getCanonicalName();
    private static volatile String appClientToken;
    private static Context applicationContext;
    private static volatile String applicationId;
    private static volatile String applicationName;
    private static File cacheDir;
    private static int callbackRequestCodeOffset = 64206;
    private static volatile Executor executor;
    private static volatile String facebookDomain = "facebook.com";
    private static volatile boolean isDebugEnabled = false;
    private static boolean isLegacyTokenUpgradeSupported = false;
    private static final HashSet loggingBehaviors;
    private static AtomicLong onProgressThreshold = new AtomicLong(0x10000L);
    private static Boolean sdkInitialized = Boolean.valueOf(false);

    public FacebookSdk()
    {
    }

    public static void addLoggingBehavior(LoggingBehavior loggingbehavior)
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.add(loggingbehavior);
            updateGraphDebugBehavior();
        }
        return;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    public static void clearLoggingBehaviors()
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

    public static Context getApplicationContext()
    {
        Validate.sdkInitialized();
        return applicationContext;
    }

    public static String getApplicationId()
    {
        Validate.sdkInitialized();
        return applicationId;
    }

    public static String getApplicationName()
    {
        Validate.sdkInitialized();
        return applicationName;
    }

    public static String getApplicationSignature(Context context)
    {
        Validate.sdkInitialized();
        PackageManager packagemanager;
        if (context != null)
        {
            if ((packagemanager = context.getPackageManager()) != null)
            {
                context = context.getPackageName();
                Signature asignature[];
                try
                {
                    context = packagemanager.getPackageInfo(context, 64);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return null;
                }
                asignature = ((PackageInfo) (context)).signatures;
                if (asignature != null && asignature.length != 0)
                {
                    MessageDigest messagedigest;
                    try
                    {
                        messagedigest = MessageDigest.getInstance("SHA-1");
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        return null;
                    }
                    messagedigest.update(((PackageInfo) (context)).signatures[0].toByteArray());
                    return Base64.encodeToString(messagedigest.digest(), 9);
                }
            }
        }
        return null;
    }

    private static Executor getAsyncTaskExecutor()
    {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public static String getAttributionId(ContentResolver contentresolver)
    {
        Validate.sdkInitialized();
        contentresolver = contentresolver.query(ATTRIBUTION_ID_CONTENT_URI, new String[] {
            "aid"
        }, null, null, null);
        if (contentresolver == null) goto _L2; else goto _L1
_L1:
        Object obj = contentresolver;
        boolean flag = contentresolver.moveToFirst();
        if (flag) goto _L3; else goto _L2
_L2:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        obj = null;
_L5:
        return ((String) (obj));
_L3:
        obj = contentresolver;
        String s = contentresolver.getString(contentresolver.getColumnIndex("aid"));
        obj = s;
        if (contentresolver == null) goto _L5; else goto _L4
_L4:
        contentresolver.close();
        return s;
        Exception exception;
        exception;
        contentresolver = null;
_L9:
        obj = contentresolver;
        (new StringBuilder("Caught unexpected exception in getAttributionId(): ")).append(exception.toString());
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        return null;
        contentresolver;
        obj = null;
_L7:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw contentresolver;
        contentresolver;
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static File getCacheDir()
    {
        Validate.sdkInitialized();
        return cacheDir;
    }

    public static int getCallbackRequestCodeOffset()
    {
        Validate.sdkInitialized();
        return callbackRequestCodeOffset;
    }

    public static String getClientToken()
    {
        Validate.sdkInitialized();
        return appClientToken;
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

    public static String getFacebookDomain()
    {
        return facebookDomain;
    }

    public static boolean getLimitEventAndDataUsage(Context context)
    {
        Validate.sdkInitialized();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static Set getLoggingBehaviors()
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

    public static long getOnProgressThreshold()
    {
        Validate.sdkInitialized();
        return onProgressThreshold.get();
    }

    public static String getSdkVersion()
    {
        Validate.sdkInitialized();
        return "4.0.1";
    }

    public static boolean isDebugEnabled()
    {
        return isDebugEnabled;
    }

    public static boolean isFacebookRequestCode(int i)
    {
        return i >= callbackRequestCodeOffset && i < callbackRequestCodeOffset + 100;
    }

    public static boolean isInitialized()
    {
        com/facebook/FacebookSdk;
        JVM INSTR monitorenter ;
        boolean flag = sdkInitialized.booleanValue();
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean isLegacyTokenUpgradeSupported()
    {
        return isLegacyTokenUpgradeSupported;
    }

    public static boolean isLoggingBehaviorEnabled(LoggingBehavior loggingbehavior)
    {
        HashSet hashset = loggingBehaviors;
        hashset;
        JVM INSTR monitorenter ;
        boolean flag;
        if (isDebugEnabled() && loggingBehaviors.contains(loggingbehavior))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashset;
        JVM INSTR monitorexit ;
        return flag;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    static void loadDefaultsFromMetadata(Context context)
    {
        if (context != null)
        {
            try
            {
                context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            if (context != null && ((ApplicationInfo) (context)).metaData != null)
            {
                if (applicationId == null)
                {
                    applicationId = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationId");
                }
                if (applicationName == null)
                {
                    applicationName = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationName");
                }
                if (appClientToken == null)
                {
                    appClientToken = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ClientToken");
                    return;
                }
            }
        }
    }

    static GraphResponse publishInstallAndWaitForResponse(Context context, String s)
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
            return new GraphResponse(null, null, new FacebookRequestError(null, context));
        }
        String s1;
        String s2;
        SharedPreferences sharedpreferences;
        String s3;
        AttributionIdentifiers attributionidentifiers;
        JSONObject jsonobject;
        long l;
        attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
        sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
        s1 = (new StringBuilder()).append(s).append("ping").toString();
        s2 = (new StringBuilder()).append(s).append("json").toString();
        l = sharedpreferences.getLong(s1, 0L);
        s3 = sharedpreferences.getString(s2, null);
        jsonobject = new JSONObject();
        jsonobject.put("event", "MOBILE_APP_INSTALL");
        Utility.setAppEventAttributionParameters(jsonobject, attributionidentifiers, AppEventsLogger.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context));
        jsonobject.put("application_package_name", context.getPackageName());
        s = GraphRequest.newPostRequest(null, String.format("%s/activities", new Object[] {
            s
        }), jsonobject, null);
        if (l == 0L) goto _L2; else goto _L1
_L1:
        if (s3 == null) goto _L4; else goto _L3
_L3:
        context = new JSONObject(s3);
_L6:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        return (GraphResponse)GraphResponse.createResponsesFromString("true", null, new GraphRequestBatch(new GraphRequest[] {
            s
        })).get(0);
        context;
        throw new FacebookException("An error occurred while publishing install.", context);
        return new GraphResponse(null, null, null, context);
_L2:
        context = s.executeAndWait();
        s = sharedpreferences.edit();
        s.putLong(s1, System.currentTimeMillis());
        if (context.getJSONObject() != null)
        {
            s.putString(s2, context.getJSONObject().toString());
        }
        s.apply();
        return context;
_L4:
        context = null;
        continue; /* Loop/switch isn't completed */
        context;
        context = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void publishInstallAsync(final Context applicationContext, final String applicationId)
    {
        applicationContext = applicationContext.getApplicationContext();
        getExecutor().execute(new _cls3());
    }

    public static void removeLoggingBehavior(LoggingBehavior loggingbehavior)
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

    public static void sdkInitialize(Context context)
    {
        com/facebook/FacebookSdk;
        JVM INSTR monitorenter ;
        boolean flag = sdkInitialized.booleanValue();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
        return;
_L2:
        Validate.notNull(context, "applicationContext");
        context = context.getApplicationContext();
        applicationContext = context;
        loadDefaultsFromMetadata(context);
        Utility.loadAppSettingsAsync(applicationContext, applicationId);
        BoltsMeasurementEventListener.getInstance(applicationContext);
        cacheDir = applicationContext.getCacheDir();
        context = new FutureTask(new _cls2());
        getExecutor().execute(context);
        sdkInitialized = Boolean.valueOf(true);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void sdkInitialize(Context context, int i)
    {
        com/facebook/FacebookSdk;
        JVM INSTR monitorenter ;
        if (sdkInitialized.booleanValue() && i != callbackRequestCodeOffset)
        {
            throw new FacebookException("The callback request code offset can't be updated once the SDK is initialized.");
        }
        break MISSING_BLOCK_LABEL_35;
        context;
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
        throw context;
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        throw new FacebookException("The callback request code offset can't be negative.");
        callbackRequestCodeOffset = i;
        sdkInitialize(context);
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
    }

    public static void setApplicationId(String s)
    {
        applicationId = s;
    }

    public static void setApplicationName(String s)
    {
        applicationName = s;
    }

    public static void setCacheDir(File file)
    {
        cacheDir = file;
    }

    public static void setClientToken(String s)
    {
        appClientToken = s;
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

    public static void setFacebookDomain(String s)
    {
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = s;
    }

    public static void setIsDebugEnabled(boolean flag)
    {
        isDebugEnabled = flag;
    }

    public static void setLegacyTokenUpgradeSupported(boolean flag)
    {
        isLegacyTokenUpgradeSupported = flag;
    }

    public static void setLimitEventAndDataUsage(Context context, boolean flag)
    {
        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("limitEventUsage", flag).apply();
    }

    public static void setOnProgressThreshold(long l)
    {
        onProgressThreshold.set(l);
    }

    private static void updateGraphDebugBehavior()
    {
        if (loggingBehaviors.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO) && !loggingBehaviors.contains(LoggingBehavior.GRAPH_API_DEBUG_WARNING))
        {
            loggingBehaviors.add(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
        }
    }

    static 
    {
        loggingBehaviors = new HashSet(Arrays.asList(new LoggingBehavior[] {
            LoggingBehavior.DEVELOPER_ERRORS
        }));
    }

    private class _cls3
        implements Runnable
    {

        final Context val$applicationContext;
        final String val$applicationId;

        public final void run()
        {
            FacebookSdk.publishInstallAndWaitForResponse(applicationContext, applicationId);
        }

        _cls3()
        {
            applicationContext = context;
            applicationId = s;
            super();
        }
    }


    private class _cls2
        implements Callable
    {

        public final volatile Object call()
        {
            return call();
        }

        public final Void call()
        {
            AccessTokenManager.getInstance().loadCurrentAccessToken();
            ProfileManager.getInstance().loadCurrentProfile();
            if (AccessToken.getCurrentAccessToken() != null && Profile.getCurrentProfile() == null)
            {
                Profile.fetchProfileForCurrentAccessToken();
            }
            return null;
        }

        _cls2()
        {
        }
    }


    private class _cls1
        implements ThreadFactory
    {

        private final AtomicInteger counter = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder("FacebookSdk #")).append(counter.incrementAndGet()).toString());
        }

        _cls1()
        {
        }
    }

}
