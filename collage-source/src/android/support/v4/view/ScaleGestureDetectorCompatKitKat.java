// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ScaleGestureDetector;

class ScaleGestureDetectorCompatKitKat
{

    private ScaleGestureDetectorCompatKitKat()
    {
    }

    public static boolean isQuickScaleEnabled(Object obj)
    {
        return ((ScaleGestureDetector)obj).isQuickScaleEnabled();
    }

    public static void setQuickScaleEnabled(Object obj, boolean flag)
    {
        ((ScaleGestureDetector)obj).setQuickScaleEnabled(flag);
    }
}
