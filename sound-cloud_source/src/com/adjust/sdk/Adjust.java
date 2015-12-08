// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.net.Uri;

// Referenced classes of package com.adjust.sdk:
//            AdjustInstance, AdjustConfig, AdjustEvent

public class Adjust
{

    private static AdjustInstance defaultInstance;

    private Adjust()
    {
    }

    public static void appWillOpenUrl(Uri uri)
    {
        getDefaultInstance().appWillOpenUrl(uri);
    }

    public static AdjustInstance getDefaultInstance()
    {
        com/adjust/sdk/Adjust;
        JVM INSTR monitorenter ;
        AdjustInstance adjustinstance;
        if (defaultInstance == null)
        {
            defaultInstance = new AdjustInstance();
        }
        adjustinstance = defaultInstance;
        com/adjust/sdk/Adjust;
        JVM INSTR monitorexit ;
        return adjustinstance;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean isEnabled()
    {
        return getDefaultInstance().isEnabled();
    }

    public static void onCreate(AdjustConfig adjustconfig)
    {
        getDefaultInstance().onCreate(adjustconfig);
    }

    public static void onPause()
    {
        getDefaultInstance().onPause();
    }

    public static void onResume()
    {
        getDefaultInstance().onResume();
    }

    public static void setEnabled(boolean flag)
    {
        getDefaultInstance().setEnabled(flag);
    }

    public static void setOfflineMode(boolean flag)
    {
        getDefaultInstance().setOfflineMode(flag);
    }

    public static void setReferrer(String s)
    {
        getDefaultInstance().sendReferrer(s);
    }

    public static void trackEvent(AdjustEvent adjustevent)
    {
        getDefaultInstance().trackEvent(adjustevent);
    }
}
