// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.transition.ChangeBounds;
import android.view.Window;
import android.view.animation.Interpolator;

public class TransitionUtils
{

    public TransitionUtils()
    {
    }

    private static ChangeBounds createChangeBoundsTransition(int i, Interpolator interpolator)
    {
        ChangeBounds changebounds = new ChangeBounds();
        changebounds.setInterpolator(interpolator);
        changebounds.setDuration(i);
        return changebounds;
    }

    public static void setChangeBoundsEnterTransition(Window window, int i, Interpolator interpolator)
    {
        if (transitionsSupported())
        {
            window.setSharedElementEnterTransition(createChangeBoundsTransition(i, interpolator));
        }
    }

    public static void setChangeBoundsExitTransition(Window window, int i, Interpolator interpolator)
    {
        if (transitionsSupported())
        {
            window.setSharedElementEnterTransition(createChangeBoundsTransition(i, interpolator));
        }
    }

    public static boolean transitionsSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }
}
