// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.animation.Animator;
import android.widget.ImageView;
import com.pinterest.ui.tab.Tab;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXSocialTabBar

class stener extends com.pinterest.kit.utils.mationListener
{

    final NUXSocialTabBar this$0;
    final Tab val$button;

    public void onAnimationEnd(Animator animator)
    {
        val$button.setAlpha(1.0F);
        val$button.getImageView().setAlpha(1.0F);
        super.onAnimationEnd(animator);
    }

    stener()
    {
        this$0 = final_nuxsocialtabbar;
        val$button = Tab.this;
        super();
    }
}
