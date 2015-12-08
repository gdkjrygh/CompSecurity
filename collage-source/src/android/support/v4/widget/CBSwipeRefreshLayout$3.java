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
        CBSwipeRefreshLayout.access$700(CBSwipeRefreshLayout.this, 1.0F - f);
    }

    ()
    {
        this$0 = CBSwipeRefreshLayout.this;
        super();
    }
}
