// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.content.Context;
import android.content.pm.PackageManager;

public class TouchDevice
{

    private TouchDevice()
    {
    }

    private static int maxTouchPoints(Context context)
    {
        byte byte1 = 2;
        byte byte0;
        if (context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.jazzhand"))
        {
            byte0 = 5;
        } else
        {
            byte0 = byte1;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct"))
            {
                byte0 = byte1;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch"))
                {
                    return !context.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? 0 : 1;
                }
            }
        }
        return byte0;
    }
}
