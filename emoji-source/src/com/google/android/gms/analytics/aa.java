// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            Logger, GoogleAnalytics

public class aa
{

    private static GoogleAnalytics wK;

    public static void A(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.error(s);
        }
    }

    public static void B(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.info(s);
        }
    }

    public static void C(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.verbose(s);
        }
    }

    public static void D(String s)
    {
        Logger logger = getLogger();
        if (logger != null)
        {
            logger.warn(s);
        }
    }

    public static boolean dp()
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
        if (wK == null)
        {
            wK = GoogleAnalytics.di();
        }
        if (wK != null)
        {
            return wK.getLogger();
        } else
        {
            return null;
        }
    }
}
