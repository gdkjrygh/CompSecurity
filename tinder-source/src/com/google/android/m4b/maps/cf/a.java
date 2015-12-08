// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public class a extends Animation
{

    private float a;

    public a()
    {
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        a = f;
    }

    public final float c(long l)
    {
        getTransformation(l, null);
        return a;
    }
}
