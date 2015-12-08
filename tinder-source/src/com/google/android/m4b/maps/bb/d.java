// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;

public final class d
    implements Interpolator
{

    private final float a = 0.99F;

    public d()
    {
    }

    public final float getInterpolation(float f)
    {
        if (f < 0.0F)
        {
            return 0.0F;
        } else
        {
            return (float)(1.0D - Math.pow(1.0F - a, f));
        }
    }
}
