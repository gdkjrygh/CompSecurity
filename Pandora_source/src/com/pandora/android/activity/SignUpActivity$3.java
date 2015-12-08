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
import android.widget.ScrollView;

// Referenced classes of package com.pandora.android.activity:
//            SignUpActivity

class a
    implements android.view.OnGlobalLayoutListener
{

    final SignUpActivity a;

    public void onGlobalLayout()
    {
        Object obj;
        if (android.os._INT < 16)
        {
            SignUpActivity.b(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else
        {
            SignUpActivity.b(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        obj = a.getIntent().getExtras();
        if (obj != null)
        {
            int ai[] = new int[2];
            a.findViewById(0x7f1001eb).getLocationOnScreen(ai);
            SignUpActivity.a(a, ((Bundle) (obj)).getIntArray("logo_location")[1] - ai[1]);
        }
        SignUpActivity.b(a).setTranslationY(SignUpActivity.c(a));
        SignUpActivity.b(a).setAlpha(1.0F);
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).setDuration(500L);
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            ObjectAnimator.ofFloat(SignUpActivity.b(a), "translationY", new float[] {
                0.0F
            })
        });
        ((AnimatorSet) (obj)).start();
    }

    stener(SignUpActivity signupactivity)
    {
        a = signupactivity;
        super();
    }
}
