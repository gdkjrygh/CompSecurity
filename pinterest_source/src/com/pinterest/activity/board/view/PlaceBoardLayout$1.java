// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.pinterest.activity.board.view:
//            PlaceBoardLayout

class val.lp extends Animation
{

    final PlaceBoardLayout this$0;
    final int val$currentTopMargin;
    final android.widget.Params val$lp;
    final int val$targetMargin;

    protected void applyTransformation(float f, Transformation transformation)
    {
        int i = val$targetMargin;
        int j = val$currentTopMargin;
        transformation = val$lp;
        float f1 = val$currentTopMargin;
        transformation.topMargin = (int)((float)(i - j) * f + f1);
        PlaceBoardLayout.access$000(PlaceBoardLayout.this).setLayoutParams(val$lp);
    }

    ()
    {
        this$0 = final_placeboardlayout;
        val$targetMargin = i;
        val$currentTopMargin = j;
        val$lp = android.widget.Params.this;
        super();
    }
}
