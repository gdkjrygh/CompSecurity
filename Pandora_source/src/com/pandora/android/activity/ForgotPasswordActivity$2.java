// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.pandora.android.activity:
//            ForgotPasswordActivity

class a
    implements android.view.LayoutListener
{

    final ForgotPasswordActivity a;

    public void onGlobalLayout()
    {
        ForgotPasswordActivity.c(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        Object obj = a.getIntent().getExtras();
        if (obj != null)
        {
            int ai[] = new int[2];
            a.findViewById(0x7f100163).getLocationOnScreen(ai);
            ForgotPasswordActivity.a(a, ((Bundle) (obj)).getIntArray("logo_location")[1] - ai[1]);
        }
        ForgotPasswordActivity.c(a).setTranslationY(ForgotPasswordActivity.d(a));
        ForgotPasswordActivity.c(a).setAlpha(1.0F);
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).setDuration(500L);
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            ObjectAnimator.ofFloat(ForgotPasswordActivity.c(a), "translationY", new float[] {
                0.0F
            })
        });
        ((AnimatorSet) (obj)).start();
    }

    (ForgotPasswordActivity forgotpasswordactivity)
    {
        a = forgotpasswordactivity;
        super();
    }
}
