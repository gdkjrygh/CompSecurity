// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout, MaterialProgressDrawable

class val.endingAlpha extends Animation
{

    final SwipeRefreshLayout this$0;
    final int val$endingAlpha;
    final int val$startingAlpha;

    public void applyTransformation(float f, Transformation transformation)
    {
        SwipeRefreshLayout.access$100(SwipeRefreshLayout.this).setAlpha((int)((float)val$startingAlpha + (float)(val$endingAlpha - val$startingAlpha) * f));
    }

    ble()
    {
        this$0 = final_swiperefreshlayout;
        val$startingAlpha = i;
        val$endingAlpha = I.this;
        super();
    }
}
