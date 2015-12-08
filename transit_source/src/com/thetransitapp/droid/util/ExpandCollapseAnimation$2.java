// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.thetransitapp.droid.util:
//            ExpandCollapseAnimation

class val.initialHeight extends Animation
{

    private final int val$initialHeight;
    private final View val$v;

    protected void applyTransformation(float f, Transformation transformation)
    {
        if (f == 1.0F)
        {
            val$v.setVisibility(8);
            return;
        } else
        {
            val$v.getLayoutParams().ght = val$initialHeight - (int)((float)val$initialHeight * f);
            val$v.requestLayout();
            return;
        }
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    ()
    {
        val$v = view;
        val$initialHeight = i;
        super();
    }
}
