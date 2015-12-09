// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SimplifiedSetupProfileActivity

final class val.mainView extends AnimatorListenerAdapter
{

    final SimplifiedSetupProfileActivity this$0;
    final boolean val$animateIn;
    final View val$mainView;

    public final void onAnimationEnd(Animator animator)
    {
        if (!val$animateIn)
        {
            val$mainView.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        if (val$animateIn)
        {
            val$mainView.setVisibility(0);
        }
    }

    ()
    {
        this$0 = final_simplifiedsetupprofileactivity;
        val$animateIn = flag;
        val$mainView = View.this;
        super();
    }
}
