// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.nux:
//            NUXActivity

class r extends com.pinterest.kit.utils..AnimationListener
{

    final NUXActivity this$0;

    public void onAnimationEnd(Animator animator)
    {
        _wrapper.setPadding(0, 0, 0, (int)Resources.dimension(0x7f0a0173));
        super.onAnimationEnd(animator);
    }

    imationListener()
    {
        this$0 = NUXActivity.this;
        super();
    }
}
