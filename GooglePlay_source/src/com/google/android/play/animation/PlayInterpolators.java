// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.animation;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public final class PlayInterpolators
{

    private static Interpolator sFastOutLinearIn;
    private static Interpolator sFastOutSlowIn;

    public static Interpolator fastOutLinearIn(Context context)
    {
        if (sFastOutLinearIn == null)
        {
            sFastOutLinearIn = AnimationUtils.loadInterpolator(context.getApplicationContext(), 0x10c000f);
        }
        return sFastOutLinearIn;
    }

    public static Interpolator fastOutSlowIn(Context context)
    {
        if (sFastOutSlowIn == null)
        {
            sFastOutSlowIn = AnimationUtils.loadInterpolator(context.getApplicationContext(), 0x10c000d);
        }
        return sFastOutSlowIn;
    }
}
