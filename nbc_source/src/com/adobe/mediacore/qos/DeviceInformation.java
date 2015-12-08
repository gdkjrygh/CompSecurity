// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

public final class DeviceInformation
{

    private final int _densityDPI;
    private final int _heightPixels;
    private final String _id;
    private final String _manufacturer;
    private final String _model;
    private final String _os;
    private final int _sdk;
    private final int _widthPixels;

    public DeviceInformation(Context context)
    {
        _os = android.os.Build.VERSION.RELEASE;
        _sdk = android.os.Build.VERSION.SDK_INT;
        _model = Build.MODEL;
        _manufacturer = Build.MANUFACTURER;
        _id = Build.ID;
        WindowManager windowmanager = (WindowManager)context.getSystemService("window");
        Display display = windowmanager.getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        _densityDPI = displaymetrics.densityDpi;
        context = getScreenSize(windowmanager, context.getResources());
        _heightPixels = ((Point) (context)).y;
        _widthPixels = ((Point) (context)).x;
    }

    private Point getScreenSize(WindowManager windowmanager, Resources resources)
    {
        int k;
        int l;
        int i1;
        Display display = windowmanager.getDefaultDisplay();
        Method method = android/view/Display.getMethod("getRawWidth", new Class[0]);
        Method method1 = android/view/Display.getMethod("getRawHeight", new Class[0]);
        k = ((Integer)method.invoke(display, new Object[0])).intValue();
        l = ((Integer)method1.invoke(display, new Object[0])).intValue();
        i1 = resources.getConfiguration().orientation;
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = l;
        j = k;
        if (k > l)
        {
            j = l;
            i = k;
        }
_L4:
        return new Point(j, i);
_L2:
        i = l;
        j = k;
        if (i1 == 2)
        {
            i = l;
            j = k;
            if (k < l)
            {
                j = l;
                i = k;
            }
        }
        continue; /* Loop/switch isn't completed */
        resources;
        windowmanager = windowmanager.getDefaultDisplay();
        resources = new DisplayMetrics();
        windowmanager.getMetrics(resources);
        j = ((DisplayMetrics) (resources)).widthPixels;
        i = ((DisplayMetrics) (resources)).heightPixels;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getDensityDPI()
    {
        return _densityDPI;
    }

    public int getHeightPixels()
    {
        return _heightPixels;
    }

    public String getId()
    {
        return _id;
    }

    public String getManufacturer()
    {
        return _manufacturer;
    }

    public String getModel()
    {
        return _model;
    }

    public String getOS()
    {
        return _os;
    }

    public int getSDK()
    {
        return _sdk;
    }

    public int getWidthPixels()
    {
        return _widthPixels;
    }
}
