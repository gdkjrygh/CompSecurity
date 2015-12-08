// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

public class DeviceFormFactor
{

    private static final int MINIMUM_TABLET_WIDTH_DP = 600;
    private static Boolean sIsTablet = null;

    public DeviceFormFactor()
    {
    }

    public static boolean isTablet(Context context)
    {
        if (sIsTablet == null)
        {
            boolean flag;
            if (context.getResources().getConfiguration().smallestScreenWidthDp >= 600)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            sIsTablet = Boolean.valueOf(flag);
        }
        return sIsTablet.booleanValue();
    }

}
