// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.accountsalpha;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import com.facebook.accountsalpha.internal.InternalAccountsAlphaError;
import com.facebook.accountsalpha.internal.Validate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.facebook.accountsalpha:
//            LoggingBehavior, LoginManager, AccessTokenManager, AccountsAlphaException, 
//            AccountsAlphaError, AccountsAlphaCallback, AccessToken, EmailLoginRequest, 
//            PhoneLoginRequest

public final class AccountsAlpha
{

    public static final String APPLICATION_ID_PROPERTY = "com.facebook.accountsalpha.ApplicationId";
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.accountsalpha.ApplicationName";
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.accountsalpha.ClientToken";
    private static final Object LOCK = new Object();
    private static volatile String appClientToken;
    private static Context applicationContext;
    private static volatile String applicationId;
    private static volatile String applicationName;
    private static volatile Executor executor;
    private static final HashSet loggingBehaviors;
    private static volatile Boolean sdkInitialized = Boolean.valueOf(false);
    private static volatile String userAgent;

    public AccountsAlpha()
    {
    }

    public static void addLoggingBehavior(LoggingBehavior loggingbehavior)
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

    public static void cancelLogin()
    {
        cancelLogin(null);
    }

    public static void cancelLogin(AccountsAlphaCallback accountsalphacallback)
    {
        LoginManager.getInstance().cancelLogin(accountsalphacallback);
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

    public static String getClientToken()
    {
        Validate.sdkInitialized();
        return appClientToken;
    }

    public static AccessToken getCurrentAccessToken()
    {
        return AccessTokenManager.getInstance().getCurrentAccessToken();
    }

    public static void getCurrentAccount(AccountsAlphaCallback accountsalphacallback)
    {
        LoginManager.getInstance().getCurrentAccount(accountsalphacallback);
    }

    public static Executor getExecutor()
    {
        synchronized (LOCK)
        {
            if (executor == null)
            {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return executor;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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

    public static LoginManager getLoginManager()
    {
        return LoginManager.getInstance();
    }

    public static LoginManager getLoginManager(Bundle bundle)
    {
        LoginManager loginmanager = LoginManager.getInstance();
        loginmanager.onCreate(bundle);
        return loginmanager;
    }

    public static String getUserAgent()
    {
        if (userAgent == null)
        {
            String s = System.getProperty("http.agent");
            userAgent = s;
            if (s == null)
            {
                userAgent = "";
            }
        }
        return userAgent;
    }

    public static void initialize(Context context)
    {
        com/facebook/accountsalpha/AccountsAlpha;
        JVM INSTR monitorenter ;
        initialize(context, null);
        com/facebook/accountsalpha/AccountsAlpha;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void initialize(Context context, InitializeCallback initializecallback)
    {
        com/facebook/accountsalpha/AccountsAlpha;
        JVM INSTR monitorenter ;
        if (!sdkInitialized.booleanValue()) goto _L2; else goto _L1
_L1:
        if (initializecallback == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        initializecallback.onInitialized();
_L4:
        com/facebook/accountsalpha/AccountsAlpha;
        JVM INSTR monitorexit ;
        return;
_L2:
        Validate.notNull(context, "applicationContext");
        Validate.hasInternetPermissions(context, true);
        context = context.getApplicationContext();
        applicationContext = context;
        loadDefaultsFromMetadata(context);
        context = new FutureTask(new _cls1(initializecallback));
        getExecutor().execute(context);
        sdkInitialized = Boolean.valueOf(true);
        Logger.access._mth000("aa_sdk_init");
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static boolean isInitialized()
    {
        return sdkInitialized.booleanValue();
    }

    public static boolean isLoggingBehaviorEnabled(LoggingBehavior loggingbehavior)
    {
        boolean flag;
        synchronized (loggingBehaviors)
        {
            flag = loggingBehaviors.contains(loggingbehavior);
        }
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
                    Object obj = ((ApplicationInfo) (context)).metaData.get("com.facebook.accountsalpha.ApplicationId");
                    if (obj instanceof String)
                    {
                        applicationId = (String)obj;
                    } else
                    if (obj instanceof Integer)
                    {
                        throw new AccountsAlphaException(AccountsAlphaError.INITIALIZATION_ERROR, InternalAccountsAlphaError.INVALID_APP_ID_FORMAT);
                    }
                }
                if (applicationName == null)
                {
                    applicationName = ((ApplicationInfo) (context)).metaData.getString("com.facebook.accountsalpha.ApplicationName");
                }
                if (appClientToken == null)
                {
                    appClientToken = ((ApplicationInfo) (context)).metaData.getString("com.facebook.accountsalpha.ClientToken");
                    return;
                }
            }
        }
    }

    public static EmailLoginRequest logInWithEmail(String s, String s1)
    {
        return LoginManager.getInstance().logInWithEmail(s, s1);
    }

    public static PhoneLoginRequest logInWithPhoneNumber(String s, String s1)
    {
        return LoginManager.getInstance().logInWithPhoneNumber(s, s1);
    }

    public static void logOut()
    {
        AccessTokenManager.getInstance().setCurrentAccessToken(null);
        Logger.access._mth000("aa_log_out");
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

    static 
    {
        executor = AsyncTask.THREAD_POOL_EXECUTOR;
        loggingBehaviors = new HashSet(Collections.singleton(LoggingBehavior.DEVELOPER_ERRORS));
    }

    /* member class not found */
    class InitializeCallback {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class Logger {}

}
