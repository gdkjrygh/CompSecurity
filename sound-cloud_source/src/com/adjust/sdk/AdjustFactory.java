// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.Context;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.adjust.sdk:
//            ActivityHandler, IActivityHandler, AttributionHandler, IAttributionHandler, 
//            Logger, PackageHandler, IPackageHandler, RequestHandler, 
//            IRequestHandler, ILogger, AdjustConfig, ActivityPackage

public class AdjustFactory
{

    private static IActivityHandler activityHandler = null;
    private static IAttributionHandler attributionHandler = null;
    private static ILogger logger = null;
    private static HttpsURLConnection mockHttpsURLConnection = null;
    private static IPackageHandler packageHandler = null;
    private static IRequestHandler requestHandler = null;
    private static long sessionInterval = -1L;
    private static long subsessionInterval = -1L;
    private static long timerInterval = -1L;
    private static long timerStart = -1L;

    public AdjustFactory()
    {
    }

    public static IActivityHandler getActivityHandler(AdjustConfig adjustconfig)
    {
        if (activityHandler == null)
        {
            return ActivityHandler.getInstance(adjustconfig);
        } else
        {
            activityHandler.init(adjustconfig);
            return activityHandler;
        }
    }

    public static IAttributionHandler getAttributionHandler(IActivityHandler iactivityhandler, ActivityPackage activitypackage, boolean flag, boolean flag1)
    {
        if (attributionHandler == null)
        {
            return new AttributionHandler(iactivityhandler, activitypackage, flag, flag1);
        } else
        {
            attributionHandler.init(iactivityhandler, activitypackage, flag, flag1);
            return attributionHandler;
        }
    }

    public static HttpsURLConnection getHttpsURLConnection(URL url)
        throws IOException
    {
        if (mockHttpsURLConnection == null)
        {
            return (HttpsURLConnection)url.openConnection();
        } else
        {
            return mockHttpsURLConnection;
        }
    }

    public static ILogger getLogger()
    {
        if (logger == null)
        {
            logger = new Logger();
        }
        return logger;
    }

    public static IPackageHandler getPackageHandler(ActivityHandler activityhandler, Context context, boolean flag)
    {
        if (packageHandler == null)
        {
            return new PackageHandler(activityhandler, context, flag);
        } else
        {
            packageHandler.init(activityhandler, context, flag);
            return packageHandler;
        }
    }

    public static IRequestHandler getRequestHandler(IPackageHandler ipackagehandler)
    {
        if (requestHandler == null)
        {
            return new RequestHandler(ipackagehandler);
        } else
        {
            requestHandler.init(ipackagehandler);
            return requestHandler;
        }
    }

    public static long getSessionInterval()
    {
        if (sessionInterval == -1L)
        {
            return 0x1b7740L;
        } else
        {
            return sessionInterval;
        }
    }

    public static long getSubsessionInterval()
    {
        if (subsessionInterval == -1L)
        {
            return 1000L;
        } else
        {
            return subsessionInterval;
        }
    }

    public static long getTimerInterval()
    {
        if (timerInterval == -1L)
        {
            return 60000L;
        } else
        {
            return timerInterval;
        }
    }

    public static long getTimerStart()
    {
        if (timerStart == -1L)
        {
            return 0L;
        } else
        {
            return timerStart;
        }
    }

    public static void setActivityHandler(IActivityHandler iactivityhandler)
    {
        activityHandler = iactivityhandler;
    }

    public static void setAttributionHandler(IAttributionHandler iattributionhandler)
    {
        attributionHandler = iattributionhandler;
    }

    public static void setLogger(ILogger ilogger)
    {
        logger = ilogger;
    }

    public static void setMockHttpsURLConnection(HttpsURLConnection httpsurlconnection)
    {
        mockHttpsURLConnection = httpsurlconnection;
    }

    public static void setPackageHandler(IPackageHandler ipackagehandler)
    {
        packageHandler = ipackagehandler;
    }

    public static void setRequestHandler(IRequestHandler irequesthandler)
    {
        requestHandler = irequesthandler;
    }

    public static void setSessionInterval(long l)
    {
        sessionInterval = l;
    }

    public static void setSubsessionInterval(long l)
    {
        subsessionInterval = l;
    }

    public static void setTimerInterval(long l)
    {
        timerInterval = l;
    }

    public static void setTimerStart(long l)
    {
        timerStart = l;
    }

}
