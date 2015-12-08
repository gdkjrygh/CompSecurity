// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digitalanalytics.api;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.da.DigitalAnalyticsModule;
import com.da.LoggingUtil;
import com.da.model.DAModel;
import com.ibm.eo.EOCore;

public final class DigitalAnalytics
{

    private DigitalAnalytics()
    {
    }

    public static Boolean fireConversionEvent(String s, String s1, String s2, String s3, String as[])
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().fireConversionEvent(s, s1, s2, s3, as).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Boolean fireElement(String s, String s1, String as[])
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().fireElement(s, s1, as).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Boolean fireImpression(String s, String as[], String as1[])
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().fireImpression(s, as, as1).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Boolean fireLinkClick(String s, String s1, String s2)
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().fireLinkClick(s, s1, s2).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Boolean fireOrder(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String as[])
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().fireOrder(s, s1, s2, s3, s4, s5, s6, s7, as).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Boolean firePageview(String s, String s1, String s2, String s3, String as[], String as1[])
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().firePageview(s, s1, s2, s3, as, as1).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Boolean fireProductview(String s, String s1, String s2, String s3, String as[])
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().fireProductview(s, s1, s2, s3, as).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Boolean fireRegistration(String s, String s1, String s2, String s3, String s4, String as[])
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().fireRegistration(s, s1, s2, s3, s4, as).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Boolean fireShopAction5(String s, String s1, String s2, String s3, String s4, String s5, String as[])
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().fireShopAction5(s, s1, s2, s3, s4, s5, as).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Boolean fireShopAction9(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8, String as[])
    {
        boolean flag;
        try
        {
            flag = DigitalAnalyticsModule.getInstance().fireShopAction9(s, s1, s2, s3, s4, s5, s6, s7, s8, as).isDataConstraintSuccess();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LoggingUtil.forceLog(s.getMessage(), s, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static String libraryVersion()
    {
        String s;
        try
        {
            s = DigitalAnalyticsModule.getInstance().libraryVersion();
        }
        catch (Exception exception)
        {
            LoggingUtil.forceLog(exception.getMessage(), exception, 1);
            return null;
        }
        return s;
    }

    public static String sessionId()
    {
        String s;
        try
        {
            s = DigitalAnalyticsModule.getInstance().sessionId();
        }
        catch (Exception exception)
        {
            LoggingUtil.forceLog(exception.getMessage(), exception, 1);
            return null;
        }
        return s;
    }

    public static Boolean shutdown()
    {
        try
        {
            DigitalAnalyticsModule.shutdown();
        }
        catch (Exception exception)
        {
            LoggingUtil.forceLog(exception.getMessage(), exception, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    public static Boolean startNewSession(Context context)
    {
        try
        {
            context = DigitalAnalyticsModule.getInstance().startNewSession(context);
            LoggingUtil.log((new StringBuilder()).append("New Session Created: ").append(context).toString(), 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            LoggingUtil.forceLog(context.getMessage(), context, 1);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    public static Boolean startup(Application application)
    {
        boolean flag;
        try
        {
            EOCore.enable(application);
            DigitalAnalyticsModule.startup(application);
            flag = DigitalAnalyticsModule.getInstance().isEnabled();
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            Log.e("DigitalAnalytics", application.getMessage(), application);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static String visitorId()
    {
        String s;
        try
        {
            s = DigitalAnalyticsModule.getInstance().visitorId();
        }
        catch (Exception exception)
        {
            LoggingUtil.forceLog(exception.getMessage(), exception, 1);
            return null;
        }
        return s;
    }
}
