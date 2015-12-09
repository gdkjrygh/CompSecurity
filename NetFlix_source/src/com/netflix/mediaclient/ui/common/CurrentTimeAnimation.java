// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

public class CurrentTimeAnimation extends TranslateAnimation
{

    public CurrentTimeAnimation(float f, float f1, float f2, float f3)
    {
        super(f, f1, f2, f3);
    }

    public CurrentTimeAnimation(int i, float f, int j, float f1, int k, float f2, int l, 
            float f3)
    {
        super(i, f, j, f1, k, f2, l, f3);
    }

    public CurrentTimeAnimation(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        super.applyTransformation(f, transformation);
    }
}
