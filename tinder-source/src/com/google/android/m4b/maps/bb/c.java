// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;
import com.google.android.m4b.maps.y.j;

public final class c
    implements Interpolator
{

    private final float a;

    public c(float f)
    {
        boolean flag;
        if (0.0F <= f && f < 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        a = f;
    }

    public final float getInterpolation(float f)
    {
        f = Math.min(Math.max(f, 0.0F), 1.0F);
        if (f < a)
        {
            return 0.0F;
        } else
        {
            return (float)((double)(f - a) / (1.0D - (double)a));
        }
    }
}
