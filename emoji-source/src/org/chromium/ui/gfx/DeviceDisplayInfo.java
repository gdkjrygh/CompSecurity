// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.gfx;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class DeviceDisplayInfo
{

    static final boolean $assertionsDisabled;
    private final Context mAppContext;
    private DisplayMetrics mTempMetrics;
    private Point mTempPoint;
    private final WindowManager mWinManager;

    private DeviceDisplayInfo(Context context)
    {
        mTempPoint = new Point();
        mTempMetrics = new DisplayMetrics();
        mAppContext = context.getApplicationContext();
        mWinManager = (WindowManager)mAppContext.getSystemService("window");
    }

    public static DeviceDisplayInfo create(Context context)
    {
        return new DeviceDisplayInfo(context);
    }

    private Display getDisplay()
    {
        return mWinManager.getDefaultDisplay();
    }

    private int getPixelFormat()
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            return getDisplay().getPixelFormat();
        } else
        {
            return 1;
        }
    }

    private int getSmallestDIPWidth()
    {
        return mAppContext.getResources().getConfiguration().smallestScreenWidthDp;
    }

    private native void nativeUpdateSharedDeviceDisplayInfo(int i, int j, int k, int l, int i1, int j1, double d, int k1, int l1);

    public int getBitsPerComponent()
    {
        byte byte0 = 5;
        switch (getPixelFormat())
        {
        case 5: // '\005'
        default:
            byte0 = 8;
            // fall through

        case 4: // '\004'
        case 6: // '\006'
            return byte0;

        case 7: // '\007'
            return 4;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return 8;

        case 11: // '\013'
            return 2;

        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            return 0;
        }
    }

    public int getBitsPerPixel()
    {
        int i = getPixelFormat();
        PixelFormat pixelformat = new PixelFormat();
        PixelFormat.getPixelFormatInfo(i, pixelformat);
        return pixelformat.bitsPerPixel;
    }

    public double getDIPScale()
    {
        getDisplay().getMetrics(mTempMetrics);
        return (double)mTempMetrics.density;
    }

    public int getDisplayHeight()
    {
        getDisplay().getSize(mTempPoint);
        return mTempPoint.y;
    }

    public int getDisplayWidth()
    {
        getDisplay().getSize(mTempPoint);
        return mTempPoint.x;
    }

    public int getPhysicalDisplayHeight()
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            return 0;
        } else
        {
            getDisplay().getRealSize(mTempPoint);
            return mTempPoint.y;
        }
    }

    public int getPhysicalDisplayWidth()
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            return 0;
        } else
        {
            getDisplay().getRealSize(mTempPoint);
            return mTempPoint.x;
        }
    }

    public int getRotationDegrees()
    {
label0:
        {
label1:
            {
                boolean flag = false;
                byte byte0 = flag;
                switch (getDisplay().getRotation())
                {
                default:
                    byte0 = flag;
                    if (!$assertionsDisabled)
                    {
                        throw new AssertionError();
                    }
                    break;

                case 0: // '\0'
                    break;

                case 2: // '\002'
                    break label1;

                case 3: // '\003'
                    break label0;

                case 1: // '\001'
                    byte0 = 90;
                    break;
                }
                return byte0;
            }
            return 180;
        }
        return 270;
    }

    public void updateNativeSharedDisplayInfo()
    {
        nativeUpdateSharedDeviceDisplayInfo(getDisplayHeight(), getDisplayWidth(), getPhysicalDisplayHeight(), getPhysicalDisplayWidth(), getBitsPerPixel(), getBitsPerComponent(), getDIPScale(), getSmallestDIPWidth(), getRotationDegrees());
    }

    static 
    {
        boolean flag;
        if (!org/chromium/ui/gfx/DeviceDisplayInfo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
