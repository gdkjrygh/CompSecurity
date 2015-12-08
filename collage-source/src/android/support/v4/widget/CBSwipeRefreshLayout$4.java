// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            CBSwipeRefreshLayout, MaterialProgressDrawable

class val.endingAlpha extends Animation
{

    final CBSwipeRefreshLayout this$0;
    final int val$endingAlpha;
    final int val$startingAlpha;

    public void applyTransformation(float f, Transformation transformation)
    {
        CBSwipeRefreshLayout.access$100(CBSwipeRefreshLayout.this).setAlpha((int)((float)val$startingAlpha + (float)(val$endingAlpha - val$startingAlpha) * f));
    }

    e()
    {
        this$0 = final_cbswiperefreshlayout;
        val$startingAlpha = i;
        val$endingAlpha = I.this;
        super();
    }
}
