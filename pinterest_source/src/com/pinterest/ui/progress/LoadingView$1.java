// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.progress;

import android.animation.Animator;

// Referenced classes of package com.pinterest.ui.progress:
//            LoadingView

class er extends com.pinterest.kit.utils..AnimationListener
{

    final LoadingView this$0;

    public void onAnimationRepeat(Animator animator)
    {
        if (!LoadingView.access$000(LoadingView.this) || getVisibility() != 0)
        {
            LoadingView.access$100(LoadingView.this);
        }
    }

    nimationListener()
    {
        this$0 = LoadingView.this;
        super();
    }
}
