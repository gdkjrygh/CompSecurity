// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            zzp, Logger

public class zzae
{

    private static volatile Logger zzEN;

    static Logger getLogger()
    {
        return zzEN;
    }

    static void setLogger(Logger logger)
    {
        zzEN = logger;
    }

    public static void zzZ(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.error(s);
        }
    }

    public static void zzaa(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.info(s);
        }
    }

    public static void zzab(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.verbose(s);
        }
    }

    public static void zzac(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.warn(s);
        }
    }

    public static boolean zzgw()
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

    static 
    {
        setLogger(new zzp());
    }
}
