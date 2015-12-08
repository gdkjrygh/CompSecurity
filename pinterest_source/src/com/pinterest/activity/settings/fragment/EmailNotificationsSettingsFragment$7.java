// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            EmailNotificationsSettingsFragment

class this._cls0
    implements android.animation.ionsSettingsFragment._cls7
{

    final EmailNotificationsSettingsFragment this$0;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        containerLayout.setVisibility(8);
        ObjectAnimator.ofFloat(footer, "alpha", new float[] {
            1.0F
        }).setDuration(300L).start();
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        ObjectAnimator.ofFloat(footer, "alpha", new float[] {
            0.0F
        }).setDuration(300L).start();
    }

    ()
    {
        this$0 = EmailNotificationsSettingsFragment.this;
        super();
    }
}
