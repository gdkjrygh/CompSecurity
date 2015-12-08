// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.urbanairship.actions:
//            LandingPageActivity

class > extends AnimatorListenerAdapter
{

    final LandingPageActivity this$0;
    final View val$out;

    public void onAnimationEnd(Animator animator)
    {
        val$out.setVisibility(8);
    }

    ()
    {
        this$0 = final_landingpageactivity;
        val$out = View.this;
        super();
    }
}
