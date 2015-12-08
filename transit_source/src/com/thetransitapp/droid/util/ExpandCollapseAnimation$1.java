// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.thetransitapp.droid.util:
//            ExpandCollapseAnimation

class val.targtetHeight extends Animation
{

    private final int val$targtetHeight;
    private final View val$v;

    protected void applyTransformation(float f, Transformation transformation)
    {
        transformation = val$v.getLayoutParams();
        int i;
        if (f == 1.0F)
        {
            i = -2;
        } else
        {
            i = (int)((float)val$targtetHeight * f);
        }
        transformation.ght = i;
        val$v.requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    ()
    {
        val$v = view;
        val$targtetHeight = i;
        super();
    }
}
