// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            Logger, p, GoogleAnalytics

public class ae
{

    private static GoogleAnalytics BL;
    private static volatile boolean BM = false;
    private static Logger BN;

    private ae()
    {
    }

    public static void T(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.error(s);
        }
    }

    public static void U(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.info(s);
        }
    }

    public static void V(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.verbose(s);
        }
    }

    public static void W(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.warn(s);
        }
    }

    public static boolean ff()
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

    static Logger getLogger()
    {
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorenter ;
        Logger logger;
        if (!BM)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (BN == null)
        {
            BN = new p();
        }
        logger = BN;
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorexit ;
        return logger;
        if (BL == null)
        {
            BL = GoogleAnalytics.eY();
        }
        if (BL == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        logger = BL.getLogger();
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorexit ;
        return logger;
        Exception exception;
        exception;
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorexit ;
        throw exception;
        com/google/android/gms/analytics/ae;
        JVM INSTR monitorexit ;
        return null;
    }

}
