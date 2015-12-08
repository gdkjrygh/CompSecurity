// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayFragment

public class startHeight extends Animation
{

    int index;
    int startHeight;
    int targetHeight;
    final MapOverlayFragment this$0;
    View view;

    protected void applyTransformation(float f, Transformation transformation)
    {
        index = index + 1;
        int i = startHeight;
        int j = (int)((float)startHeight * f);
        int k = MapOverlayFragment.access$1700(MapOverlayFragment.this);
        view.getLayoutParams().t = (i - j) + k;
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

    public (View view1, int i, int j)
    {
        this$0 = MapOverlayFragment.this;
        super();
        index = 0;
        view = view1;
        targetHeight = j;
        startHeight = i;
    }
}
