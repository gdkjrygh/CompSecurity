// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.cleanmaster.sdk.cmloginsdkjar.internal.HMACSHA1;
import com.cleanmaster.sdk.cmloginsdkjar.internal.Validate;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            ag

public final class Settings
{

    public static final String APPLICATION_ID_PROPERTY = "com.cleanmaster.sdk.cmloginsdk.ApplicationId";
    public static final String APPLICATION_SALT_PROPERTY = "com.cleanmaster.sdk.cmloginsdk.ApplicationSalt";
    private static final String CLEANMASTER_COM = "ksmobile.com";
    private static final int DEFAULT_CORE_POOL_SIZE = 5;
    private static final int DEFAULT_KEEP_ALIVE = 1;
    private static final int DEFAULT_MAXIMUM_POOL_SIZE = 128;
    private static final ThreadFactory DEFAULT_THREAD_FACTORY = new ag();
    private static final BlockingQueue DEFAULT_WORK_QUEUE = new LinkedBlockingQueue(10);
    private static final Object LOCK = new Object();
    private static final String TAG = com/cleanmaster/sdk/cmloginsdkjar/Settings.getCanonicalName();
    private static volatile String accessToken;
    private static volatile String appVersion;
    private static volatile String applicationId = null;
    private static volatile String applicationSalt = null;
    private static volatile String cleanmasterDomain = "ksmobile.com";
    private static volatile boolean defaultsLoaded = false;
    private static volatile Executor executor;
    private static volatile String fbId = "";
    private static volatile String fbToken = "";
    private static volatile boolean fbTriggerbyCm;
    private static volatile boolean isDebugEnabled = false;
    private static volatile String loginSid;
    private static volatile String loginSidSig;
    private static AtomicLong onProgressThreshold = new AtomicLong(0x10000L);
    private static Activity parentActivity;
    private static volatile String registSid;
    private static volatile String registSidSig;
    private static Boolean sdkInitialized = Boolean.valueOf(false);
    private static volatile String sid;
    private static volatile long sidExpires;
    private static volatile String ssoTicket;
    private static volatile String thirdSid;
    private static volatile String thirdSidSig;

    public Settings()
    {
    }

    public static String calcClientLoginSid(Context context)
    {
        char ac[];
        char ac1[];
        String s1;
        int i;
        int k;
        k = 0;
        ac1 = new char[16];
        ac1;
        ac1[0] = '0';
        ac1[1] = '1';
        ac1[2] = '2';
        ac1[3] = '3';
        ac1[4] = '4';
        ac1[5] = '5';
        ac1[6] = '6';
        ac1[7] = '7';
        ac1[8] = '8';
        ac1[9] = '9';
        ac1[10] = 'A';
        ac1[11] = 'B';
        ac1[12] = 'C';
        ac1[13] = 'D';
        ac1[14] = 'E';
        ac1[15] = 'F';
        ac = "NoAndroidId";
        s1 = UUID.randomUUID().toString();
        i = (new Random()).nextInt(0x15f90);
        String s = android.provider.Secure.getString(context.getContentResolver(), "android_id");
        context = s;
        if (s == null)
        {
            context = "NoAndroidId";
        }
_L2:
        context = (new StringBuilder()).append(i + 10000).append(s1).append(context).append(applicationSalt).toString();
        int l;
        try
        {
            ac = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        try
        {
            ac.update(context.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        context = ac.digest();
        l = context.length;
        ac = new char[l * 2];
        for (int j = 0; j < l; j++)
        {
            byte byte0 = context[j];
            int i1 = k + 1;
            ac[k] = ac1[byte0 >>> 4 & 0xf];
            k = i1 + 1;
            ac[i1] = ac1[byte0 & 0xf];
        }

        return new String(ac);
        context;
        context = ac;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String calcSidSig(String s)
    {
        String s1 = null;
        if ("".equals(s))
        {
            s1 = "";
        } else
        {
            try
            {
                s = HMACSHA1.getSignature(s.getBytes("UTF-8"), applicationSalt.getBytes("UTF-8"));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                s = null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                s = null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                s = null;
            }
            if (s != null)
            {
                return Base64.encodeToString(s, 2).replace('+', '-').replace('/', '_').replace("=", "");
            }
        }
        return s1;
    }

    public static String getAccessToken()
    {
        return accessToken;
    }

    public static String getAppVersion()
    {
        return appVersion;
    }

    public static String getApplicationId()
    {
        return applicationId;
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

    public static String getCleanmasterDomain()
    {
        return cleanmasterDomain;
    }

    public static String getClientLoginSid()
    {
        return getLoginSid();
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

    public static String getFbId()
    {
        return fbId;
    }

    public static String getFbToken()
    {
        return fbToken;
    }

    public static String getLoginSid()
    {
        return loginSid;
    }

    public static String getLoginSidSig()
    {
        return loginSidSig;
    }

    public static long getOnProgressThreshold()
    {
        return onProgressThreshold.get();
    }

    public static Activity getParentActivity()
    {
        return parentActivity;
    }

    public static String getRegistSid()
    {
        return registSid;
    }

    public static String getRegistSidSig()
    {
        return registSidSig;
    }

    public static String getSdkVersion()
    {
        return "0.0.1";
    }

    public static String getSid()
    {
        return sid;
    }

    public static long getSidExpires()
    {
        return sidExpires;
    }

    public static String getSsoTicket()
    {
        return ssoTicket;
    }

    public static String getThirdSid()
    {
        return thirdSid;
    }

    public static String getThirdSidSig()
    {
        return thirdSidSig;
    }

    public static final boolean isDebugEnabled()
    {
        return isDebugEnabled;
    }

    public static boolean isFbTriggerbyCm()
    {
        return fbTriggerbyCm;
    }

    public static final boolean isLoggingEnabled()
    {
        return isDebugEnabled();
    }

    public static void loadDefaultsFromMetadata(Context context)
    {
        defaultsLoaded = true;
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
                    applicationId = ((ApplicationInfo) (context)).metaData.getString("com.cleanmaster.sdk.cmloginsdk.ApplicationId");
                }
                if (applicationSalt == null)
                {
                    applicationSalt = ((ApplicationInfo) (context)).metaData.getString("com.cleanmaster.sdk.cmloginsdk.ApplicationSalt");
                    return;
                }
            }
        }
    }

    static void loadDefaultsFromMetadataIfNeeded(Context context)
    {
        if (!defaultsLoaded)
        {
            loadDefaultsFromMetadata(context);
        }
    }

    public static void sdkInitialize(Context context)
    {
        com/cleanmaster/sdk/cmloginsdkjar/Settings;
        JVM INSTR monitorenter ;
        boolean flag = sdkInitialized.booleanValue();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/cleanmaster/sdk/cmloginsdkjar/Settings;
        JVM INSTR monitorexit ;
        return;
_L2:
        loadDefaultsFromMetadataIfNeeded(context);
        setLoginSid(calcClientLoginSid(context));
        setLoginSidSig(calcSidSig(getLoginSid()));
        setRegistSid(calcClientLoginSid(context));
        setRegistSidSig(calcSidSig(getRegistSid()));
        setThirdSid(calcClientLoginSid(context));
        setThirdSidSig(calcSidSig(getThirdSid()));
        sdkInitialized = Boolean.valueOf(true);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void setAccessToken(String s)
    {
        accessToken = s;
    }

    public static void setAppVersion(String s)
    {
        appVersion = s;
    }

    public static void setCleanmasterDomain(String s)
    {
        Log.w(TAG, "WARNING: Calling setCleanmasterDomain from non-DEBUG code.");
        cleanmasterDomain = s;
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

    public static void setFbId(String s)
    {
        fbId = s;
    }

    public static void setFbToken(String s)
    {
        fbToken = s;
    }

    public static void setFbTriggerbyCm(boolean flag)
    {
        fbTriggerbyCm = flag;
    }

    public static final void setIsDebugEnabled(boolean flag)
    {
        isDebugEnabled = flag;
    }

    public static final void setIsLoggingEnabled(boolean flag)
    {
        setIsDebugEnabled(flag);
    }

    public static void setLoginSid(String s)
    {
        loginSid = s;
    }

    public static void setLoginSidSig(String s)
    {
        loginSidSig = s;
    }

    public static void setOnProgressThreshold(long l)
    {
        onProgressThreshold.set(l);
    }

    public static void setParentActivity(Activity activity)
    {
        parentActivity = activity;
    }

    public static void setRegistSid(String s)
    {
        registSid = s;
    }

    public static void setRegistSidSig(String s)
    {
        registSidSig = s;
    }

    public static void setSid(String s)
    {
        sid = s;
    }

    public static void setSidExpires(long l)
    {
        sidExpires = l;
    }

    public static void setSsoTicket(String s)
    {
        ssoTicket = s;
    }

    public static void setThirdSid(String s)
    {
        thirdSid = s;
    }

    public static void setThirdSidSig(String s)
    {
        thirdSidSig = s;
    }

}
