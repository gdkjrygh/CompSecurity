// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ScreenInfo
{

    private Activity activity;
    private float density;
    private int densityDpi;
    private int height;
    private int width;

    public ScreenInfo(Activity activity1)
    {
        activity = activity1;
        ini();
    }

    private void ini()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        width = displaymetrics.widthPixels;
        height = displaymetrics.heightPixels;
        density = displaymetrics.density;
        densityDpi = displaymetrics.densityDpi;
    }

    public Activity getActivity()
    {
        return activity;
    }

    public float getDensity()
    {
        return density;
    }

    public int getDensityDpi()
    {
        return densityDpi;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setActivity(Activity activity1)
    {
        activity = activity1;
    }

    public void setDensity(float f)
    {
        density = f;
    }

    public void setDensityDpi(int i)
    {
        densityDpi = i;
    }

    public void setHeight(int i)
    {
        height = i;
    }

    public void setWidth(int i)
    {
        width = i;
    }
}
