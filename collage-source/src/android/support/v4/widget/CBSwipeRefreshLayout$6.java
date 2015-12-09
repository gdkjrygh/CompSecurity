// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            CBSwipeRefreshLayout, CircleImageView

class this._cls0 extends Animation
{

    final CBSwipeRefreshLayout this$0;

    public void applyTransformation(float f, Transformation transformation)
    {
        int i;
        int j;
        int k;
        if (!CBSwipeRefreshLayout.access$1100(CBSwipeRefreshLayout.this))
        {
            i = (int)(CBSwipeRefreshLayout.access$1200(CBSwipeRefreshLayout.this) - (float)CBSwipeRefreshLayout.access$400(CBSwipeRefreshLayout.this).getMeasuredHeight());
        } else
        {
            i = (int)CBSwipeRefreshLayout.access$1200(CBSwipeRefreshLayout.this);
        }
        j = mFrom;
        i = (int)((float)(i - mFrom) * f);
        k = CBSwipeRefreshLayout.access$400(CBSwipeRefreshLayout.this).getTop();
        CBSwipeRefreshLayout.access$900(CBSwipeRefreshLayout.this, (i + j) - k, false);
    }

    ()
    {
        this$0 = CBSwipeRefreshLayout.this;
        super();
    }
}
