// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.android.view.ValidatingEditText;
import com.pandora.radio.util.k;
import p.cw.c;

// Referenced classes of package com.pandora.android.activity:
//            ForgotPasswordActivity, c, WelcomeActivity

class a extends AnimatorListenerAdapter
{

    final ForgotPasswordActivity a;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        animator = new Bundle();
        animator.putBoolean("has_animated", true);
        android.text.Editable editable = ForgotPasswordActivity.a(a).getText();
        if (editable != null && s.j(editable.toString()))
        {
            animator.putString("android.intent.extra.EMAIL", editable.toString());
        }
        b.a.b().o().a(com.pandora.radio.util.ext);
        c.a().a(a, com/pandora/android/activity/WelcomeActivity, animator);
    }

    (ForgotPasswordActivity forgotpasswordactivity)
    {
        a = forgotpasswordactivity;
        super();
    }
}
