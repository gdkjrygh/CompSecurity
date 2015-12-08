// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout, SwipeProgressBar

class this._cls0 extends Animation
{

    final SwipeRefreshLayout this$0;

    public void applyTransformation(float f, Transformation transformation)
    {
        float f1 = SwipeRefreshLayout.access$400(SwipeRefreshLayout.this);
        float f2 = SwipeRefreshLayout.access$400(SwipeRefreshLayout.this);
        SwipeRefreshLayout.access$500(SwipeRefreshLayout.this).setTriggerPercentage(f1 + (0.0F - f2) * f);
    }

    ()
    {
        this$0 = SwipeRefreshLayout.this;
        super();
    }
}
