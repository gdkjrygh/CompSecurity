// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import com.pandora.android.util.s;
import com.pandora.android.view.ValidatingEditText;

// Referenced classes of package com.pandora.android.activity:
//            SignUpActivity, c, WelcomeActivity

class t> extends AnimatorListenerAdapter
{

    final SignUpActivity a;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        animator = new Bundle();
        animator.putBoolean("has_animated", true);
        animator.putString("android.intent.extra.EMAIL", s.a(SignUpActivity.i(a).getText()));
        c.a().a(a, com/pandora/android/activity/WelcomeActivity, animator);
    }

    (SignUpActivity signupactivity)
    {
        a = signupactivity;
        super();
    }
}
