// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.pandora.android.activity:
//            WelcomeActivity

class > extends AnimatorListenerAdapter
{

    final WelcomeActivity a;

    public void onAnimationEnd(Animator animator)
    {
        WelcomeActivity.c(a).setVisibility(0);
        WelcomeActivity.d(a).setVisibility(4);
    }

    (WelcomeActivity welcomeactivity)
    {
        a = welcomeactivity;
        super();
    }
}
