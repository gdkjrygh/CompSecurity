// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;

public final class SPenSupport
{

    private static final int SPEN_ACTION_CANCEL = 214;
    private static final int SPEN_ACTION_DOWN = 211;
    private static final int SPEN_ACTION_MOVE = 213;
    private static final int SPEN_ACTION_UP = 212;
    private static Boolean sIsSPenSupported;

    public SPenSupport()
    {
    }

    public static int convertSPenEventAction(int i)
    {
        switch (i)
        {
        default:
            return i;

        case 211: 
            return 0;

        case 212: 
            return 1;

        case 213: 
            return 2;

        case 214: 
            return 3;
        }
    }

    private static boolean detectSPenSupport(Context context)
    {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER))
        {
            context = context.getPackageManager().getSystemAvailableFeatures();
            int j = context.length;
            int i = 0;
            while (i < j) 
            {
                if ("com.sec.feature.spen_usp".equalsIgnoreCase(((FeatureInfo) (context[i])).name))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean isSPenSupported(Context context)
    {
        if (sIsSPenSupported == null)
        {
            sIsSPenSupported = Boolean.valueOf(detectSPenSupport(context));
        }
        return sIsSPenSupported.booleanValue();
    }
}
