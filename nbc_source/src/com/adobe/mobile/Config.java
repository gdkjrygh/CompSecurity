// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.app.Activity;
import android.content.Context;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, MobilePrivacyStatus, MobileConfig, MessageAlert, 
//            Messages, AnalyticsTrackLifetimeValueIncrease, Lifecycle

public final class Config
{

    public Config()
    {
    }

    public static void collectLifecycleData()
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

            public void run()
            {
                Lifecycle.start(null);
            }

        });
    }

    public static void collectLifecycleData(Activity activity)
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(activity) {

            final Activity val$activity;

            public void run()
            {
                Lifecycle.start(activity);
            }

            
            {
                activity = activity1;
                super();
            }
        });
    }

    public static Boolean getDebugLogging()
    {
        return Boolean.valueOf(StaticMethods.getDebugLogging());
    }

    public static BigDecimal getLifetimeValue()
    {
        Object obj = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public BigDecimal call()
                throws Exception
            {
                return AnalyticsTrackLifetimeValueIncrease.getLifetimeValue();
            }

        });
        StaticMethods.getAnalyticsExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (BigDecimal)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to get lifetime value (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((BigDecimal) (obj));
    }

    public static MobilePrivacyStatus getPrivacyStatus()
    {
        Object obj = new FutureTask(new Callable() {

            public MobilePrivacyStatus call()
                throws Exception
            {
                return MobileConfig.getInstance().getPrivacyStatus();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

        });
        StaticMethods.getSharedExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (MobilePrivacyStatus)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to get PrivacyStatus (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((MobilePrivacyStatus) (obj));
    }

    public static String getUserIdentifier()
    {
        Object obj = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public String call()
                throws Exception
            {
                return StaticMethods.getVisitorID();
            }

        });
        StaticMethods.getAnalyticsExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (String)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to get UserIdentifier (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((String) (obj));
    }

    public static String getVersion()
    {
        return "4.3.0-AN";
    }

    public static void overrideConfigStream(InputStream inputstream)
    {
        MobileConfig.setUserDefinedConfigPath(inputstream);
    }

    public static void pauseCollectingLifecycleData()
    {
        MessageAlert.clearCurrentDialog();
        StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

            public void run()
            {
                Lifecycle.stop();
            }

        });
    }

    public static void setContext(Context context)
    {
        StaticMethods.setSharedContext(context);
    }

    public static void setDebugLogging(Boolean boolean1)
    {
        StaticMethods.setDebugLogging(boolean1.booleanValue());
    }

    public static void setLargeIconResourceId(int i)
    {
        StaticMethods.getMessagesExecutor().execute(new Runnable(i) {

            final int val$resourceId;

            public void run()
            {
                Messages.setLargeIconResourceId(resourceId);
            }

            
            {
                resourceId = i;
                super();
            }
        });
    }

    public static void setPrivacyStatus(MobilePrivacyStatus mobileprivacystatus)
    {
        StaticMethods.getSharedExecutor().execute(new Runnable(mobileprivacystatus) {

            final MobilePrivacyStatus val$status;

            public void run()
            {
                MobileConfig.getInstance().setPrivacyStatus(status);
            }

            
            {
                status = mobileprivacystatus;
                super();
            }
        });
    }

    public static void setSmallIconResourceId(int i)
    {
        StaticMethods.getMessagesExecutor().execute(new Runnable(i) {

            final int val$resourceId;

            public void run()
            {
                Messages.setSmallIconResourceId(resourceId);
            }

            
            {
                resourceId = i;
                super();
            }
        });
    }

    public static void setUserIdentifier(String s)
    {
        StaticMethods.getAnalyticsExecutor().execute(new Runnable(s) {

            final String val$identifier;

            public void run()
            {
                StaticMethods.setVisitorID(identifier);
            }

            
            {
                identifier = s;
                super();
            }
        });
    }
}
