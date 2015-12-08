// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

class this._cls0 extends Animation
{

    final SwipeRefreshLayout this$0;

    public void applyTransformation(float f, Transformation transformation)
    {
        int i = 0;
        if (SwipeRefreshLayout.access$000(SwipeRefreshLayout.this) != SwipeRefreshLayout.access$100(SwipeRefreshLayout.this))
        {
            i = SwipeRefreshLayout.access$000(SwipeRefreshLayout.this) + (int)((float)(SwipeRefreshLayout.access$100(SwipeRefreshLayout.this) - SwipeRefreshLayout.access$000(SwipeRefreshLayout.this)) * f);
        }
        int j = i - SwipeRefreshLayout.access$200(SwipeRefreshLayout.this).getTop();
        int k = SwipeRefreshLayout.access$200(SwipeRefreshLayout.this).getTop();
        i = j;
        if (j + k < 0)
        {
            i = 0 - k;
        }
        SwipeRefreshLayout.access$300(SwipeRefreshLayout.this, i);
    }

    ()
    {
        this$0 = SwipeRefreshLayout.this;
        super();
    }
}
