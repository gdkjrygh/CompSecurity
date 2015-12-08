// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.anim;

import android.view.animation.Interpolator;

public class PinSpinInterpolator
    implements Interpolator
{

    public PinSpinInterpolator()
    {
    }

    public float getInterpolation(float f)
    {
        return (float)(Math.cos((double)(1.0F + f) * 3.1415926535897931D) / 2D) + 0.5F;
    }
}
