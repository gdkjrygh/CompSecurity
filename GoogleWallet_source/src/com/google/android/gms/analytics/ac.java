// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            Logger, GoogleAnalytics

public class ac
{

    private static GoogleAnalytics BI;
    private static volatile boolean BJ = false;
    private static Logger BK;

    private ac()
    {
    }

    public static void e(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.error(s);
        }
    }

    public static boolean fa()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getLogger() != null)
        {
            flag = flag1;
            if (getLogger().getLogLevel() == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    private static Logger getLogger()
    {
        com/google/android/gms/analytics/ac;
        JVM INSTR monitorenter ;
        Logger logger;
        if (!BJ)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (BK == null)
        {
            BK = new Logger();
        }
        logger = BK;
        com/google/android/gms/analytics/ac;
        JVM INSTR monitorexit ;
        return logger;
        if (BI == null)
        {
            BI = GoogleAnalytics.eT();
        }
        if (BI == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        logger = BI.getLogger();
        com/google/android/gms/analytics/ac;
        JVM INSTR monitorexit ;
        return logger;
        Exception exception;
        exception;
        com/google/android/gms/analytics/ac;
        JVM INSTR monitorexit ;
        throw exception;
        com/google/android/gms/analytics/ac;
        JVM INSTR monitorexit ;
        return null;
    }

    public static void i(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.info(s);
        }
    }

    public static void v(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.verbose(s);
        }
    }

    public static void w(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.warn(s);
        }
    }

}
