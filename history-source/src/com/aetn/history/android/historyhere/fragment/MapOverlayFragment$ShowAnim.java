// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayFragment

public class targetHeight extends Animation
{

    int targetHeight;
    float targetY;
    final MapOverlayFragment this$0;
    View view;

    protected void applyTransformation(float f, Transformation transformation)
    {
        int i = (int)((float)targetHeight * f) + MapOverlayFragment.access$1700(MapOverlayFragment.this);
        Utils.logger(MapOverlayFragment.access$000(MapOverlayFragment.this), (new StringBuilder()).append("interpolatedTime | ShowAnim: ").append(f).append("|").append(i).toString());
        view.getLayoutParams().t = i;
        view.requestLayout();
    }

    public void initialize(int i, int j, int k, int l)
    {
        super.initialize(i, j, k, l);
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    public (View view1, int i)
    {
        this$0 = MapOverlayFragment.this;
        super();
        view = view1;
        targetHeight = i;
    }
}
