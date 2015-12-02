// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.app.Activity;
import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.adjust.sdk:
//            ActivityHandler, Logger, AdjustFactory, OnFinishedListener

public class Adjust
{

    private static ActivityHandler activityHandler;
    private static Logger logger;

    public Adjust()
    {
    }

    public static void appDidLaunch(Activity activity, String s, String s1, String s2, boolean flag)
    {
        activityHandler = new ActivityHandler(activity, s, s1, s2, flag);
    }

    public static void appWillOpenUrl(Uri uri)
    {
        activityHandler.readOpenUrl(uri);
_L1:
        return;
        uri;
        if (logger != null)
        {
            logger.error("No activity handler found");
            return;
        }
          goto _L1
    }

    public static Boolean isEnabled()
    {
        Boolean boolean1;
        try
        {
            boolean1 = activityHandler.isEnabled();
        }
        catch (NullPointerException nullpointerexception)
        {
            if (logger != null)
            {
                logger.error("No activity handler found");
            }
            return Boolean.valueOf(false);
        }
        return boolean1;
    }

    public static void onPause()
    {
        logger.debug("onPause");
        activityHandler.trackSubsessionEnd();
_L1:
        return;
        NullPointerException nullpointerexception;
        nullpointerexception;
        if (logger != null)
        {
            logger.error("No activity handler found");
            return;
        }
          goto _L1
    }

    public static void onResume(Activity activity)
    {
        if (activityHandler == null)
        {
            activityHandler = new ActivityHandler(activity);
        }
        logger = AdjustFactory.getLogger();
        activityHandler.trackSubsessionStart();
    }

    public static void setEnabled(Boolean boolean1)
    {
        activityHandler.setEnabled(boolean1);
_L1:
        return;
        boolean1;
        if (logger != null)
        {
            logger.error("No activity handler found");
            return;
        }
          goto _L1
    }

    public static void setOnFinishedListener(OnFinishedListener onfinishedlistener)
    {
        activityHandler.setOnFinishedListener(onfinishedlistener);
_L1:
        return;
        onfinishedlistener;
        if (logger != null)
        {
            logger.error("No activity handler found");
            return;
        }
          goto _L1
    }

    public static void setSdkPrefix(String s)
    {
        activityHandler.setSdkPrefix(s);
    }

    public static void trackEvent(String s)
    {
        trackEvent(s, null);
    }

    public static void trackEvent(String s, Map map)
    {
        activityHandler.trackEvent(s, map);
_L1:
        return;
        s;
        if (logger != null)
        {
            logger.error("No activity handler found");
            return;
        }
          goto _L1
    }

    public static void trackRevenue(double d)
    {
        trackRevenue(d, null);
    }

    public static void trackRevenue(double d, String s)
    {
        trackRevenue(d, s, null);
    }

    public static void trackRevenue(double d, String s, Map map)
    {
        activityHandler.trackRevenue(d, s, map);
_L1:
        return;
        s;
        if (logger != null)
        {
            logger.error("No activity handler found");
            return;
        }
          goto _L1
    }
}
