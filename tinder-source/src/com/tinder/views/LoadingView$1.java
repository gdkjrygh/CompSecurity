// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

// Referenced classes of package com.tinder.views:
//            LoadingView

class nerAdapter extends AnimatorListenerAdapter
{

    final LoadingView this$0;
    final ImageView val$ring;

    public void onAnimationCancel(Animator animator)
    {
        val$ring.setVisibility(8);
    }

    nerAdapter()
    {
        this$0 = final_loadingview;
        val$ring = ImageView.this;
        super();
    }
}
