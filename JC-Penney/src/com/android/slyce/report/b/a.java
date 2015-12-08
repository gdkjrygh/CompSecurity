// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.view.View;

public class a
{

    public static int a(int i)
    {
        float af[] = new float[3];
        Color.colorToHSV(i, af);
        af[2] = 0.3F;
        return Color.HSVToColor(242, af);
    }

    public static int a(Activity activity)
    {
        int i = 0xff000000;
        activity = a(activity, 1, 1, false);
        if (activity != null)
        {
            i = activity.getPixel(0, 0);
        }
        return a(i);
    }

    public static int a(Bitmap bitmap)
    {
        int i = 0xff000000;
        if (bitmap != null)
        {
            i = Bitmap.createScaledBitmap(bitmap, 1, 1, false).getPixel(0, 0);
        }
        return a(i);
    }

    public static Bitmap a(Activity activity, int i, int j, boolean flag)
    {
        View view = activity.findViewById(0x1020002).getRootView();
        boolean flag1 = view.isDrawingCacheEnabled();
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache(true);
        Bitmap bitmap = view.getDrawingCache();
        Object obj = null;
        activity = obj;
        if (bitmap != null)
        {
            activity = obj;
            if (bitmap.getWidth() > 0)
            {
                activity = obj;
                if (bitmap.getHeight() > 0)
                {
                    int l = i;
                    int k = j;
                    if (flag)
                    {
                        l = bitmap.getWidth() / i;
                        k = bitmap.getHeight() / j;
                    }
                    activity = obj;
                    if (l > 0)
                    {
                        activity = obj;
                        if (k > 0)
                        {
                            try
                            {
                                activity = Bitmap.createScaledBitmap(bitmap, l, k, false);
                            }
                            // Misplaced declaration of an exception variable
                            catch (Activity activity)
                            {
                                Log.i("MixpanelAPI.ActivityImageUtils", "Not enough memory to produce scaled image, returning a null screenshot");
                                activity = obj;
                            }
                        }
                    }
                }
            }
        }
        if (!flag1)
        {
            view.setDrawingCacheEnabled(false);
        }
        return activity;
    }
}
