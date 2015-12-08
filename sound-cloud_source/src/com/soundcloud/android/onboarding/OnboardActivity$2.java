// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.view.View;
import android.view.animation.Animation;
import com.soundcloud.android.util.AnimUtils;

// Referenced classes of package com.soundcloud.android.onboarding:
//            OnboardActivity

class nListener extends com.soundcloud.android.util.imationListener
{

    final OnboardActivity this$0;

    public void onAnimationEnd(Animation animation)
    {
        OnboardActivity.access$000(OnboardActivity.this).setVisibility(8);
        if (OnboardActivity.access$100(OnboardActivity.this) != null)
        {
            AnimUtils.hideView(OnboardActivity.access$100(OnboardActivity.this), false);
        }
        if (OnboardActivity.access$200(OnboardActivity.this) != null)
        {
            AnimUtils.hideView(OnboardActivity.access$200(OnboardActivity.this), false);
        }
        if (OnboardActivity.access$300(OnboardActivity.this) != null)
        {
            AnimUtils.hideView(OnboardActivity.access$300(OnboardActivity.this), false);
        }
        if (OnboardActivity.access$400(OnboardActivity.this) != null)
        {
            AnimUtils.hideView(OnboardActivity.access$400(OnboardActivity.this), false);
        }
        if (OnboardActivity.access$500(OnboardActivity.this) != null)
        {
            AnimUtils.hideView(OnboardActivity.access$500(OnboardActivity.this), false);
        }
    }

    nListener()
    {
        this$0 = OnboardActivity.this;
        super();
    }
}
