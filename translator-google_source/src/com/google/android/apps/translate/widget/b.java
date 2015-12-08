// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.view.animation.Interpolator;

final class b
    implements Interpolator
{

    b()
    {
    }

    public final float getInterpolation(float f)
    {
        return (float)Math.pow(2D, f) - 1.0F;
    }
}
