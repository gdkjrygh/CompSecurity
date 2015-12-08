// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            CBSwipeRefreshLayout

class this._cls0 extends Animation
{

    final CBSwipeRefreshLayout this$0;

    public void applyTransformation(float f, Transformation transformation)
    {
        float f1 = CBSwipeRefreshLayout.access$1400(CBSwipeRefreshLayout.this);
        float f2 = -CBSwipeRefreshLayout.access$1400(CBSwipeRefreshLayout.this);
        CBSwipeRefreshLayout.access$700(CBSwipeRefreshLayout.this, f1 + f2 * f);
        CBSwipeRefreshLayout.access$1300(CBSwipeRefreshLayout.this, f);
    }

    ()
    {
        this$0 = CBSwipeRefreshLayout.this;
        super();
    }
}
