// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.ibm.eo.EOCore;
import java.math.BigDecimal;

// Referenced classes of package com.ibm.eo.util:
//            LogInternal

public class ScreenReceiver extends BroadcastReceiver
{

    private static final int ROTATION_18O = 180;
    private static final int ROTATION_9O = 90;
    private static final int ROTATION_NEGATIVE_9O = -90;
    private static final int ROTATION_O = 0;
    private float deviceHeight;
    private float deviceWidth;
    private int height;
    private float pixelDensity;
    private int rotation;
    private int width;

    public ScreenReceiver()
    {
        rotation = 0;
        screenUpdate();
    }

    public static int getRotation(int i)
    {
        switch (i)
        {
        case 0: // '\0'
        default:
            return 0;

        case 1: // '\001'
            return 90;

        case 2: // '\002'
            return 180;

        case 3: // '\003'
            return -90;
        }
    }

    public static float round(float f)
    {
        return (new BigDecimal(Float.toString(f))).setScale(2, 4).floatValue();
    }

    private Display screenUpdate()
    {
        Display display = ((WindowManager)EOCore.getApplication().getApplicationContext().getSystemService("window")).getDefaultDisplay();
        float f;
        if (android.os.Build.VERSION.SDK_INT > 12)
        {
            Point point = new Point();
            display.getSize(point);
            width = point.x;
            height = point.y;
        } else
        {
            width = display.getWidth();
            height = display.getHeight();
        }
        pixelDensity = EOCore.getApplication().getResources().getDisplayMetrics().density;
        if (pixelDensity == 0.0F)
        {
            f = height;
        } else
        {
            f = (float)height / pixelDensity;
        }
        deviceHeight = round(f);
        if (pixelDensity == 0.0F)
        {
            f = width;
        } else
        {
            f = (float)width / pixelDensity;
        }
        deviceWidth = round(f);
        LogInternal.log((new StringBuilder()).append("Screen height:").append(height).append("  width:").append(width).append(" Pixel density:").append(pixelDensity).append(" Device height:").append(deviceHeight).append(" width:").append(deviceWidth).toString());
        return display;
    }

    public final float getDeviceHeight()
    {
        return deviceHeight;
    }

    public final float getDeviceWidth()
    {
        return deviceWidth;
    }

    public final int getHeight()
    {
        return height;
    }

    public final float getPixelDensity()
    {
        return pixelDensity;
    }

    public final int getRotation()
    {
        return rotation;
    }

    public final int getWidth()
    {
        return width;
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.CONFIGURATION_CHANGED".equalsIgnoreCase(intent.getAction()))
        {
            context = screenUpdate();
            if (android.os.Build.VERSION.SDK_INT > 7)
            {
                rotation = getRotation(context.getRotation());
            } else
            {
                rotation = getRotation(context.getOrientation());
            }
            LogInternal.log((new StringBuilder()).append("Screen change:").append(rotation).toString());
        }
    }
}
