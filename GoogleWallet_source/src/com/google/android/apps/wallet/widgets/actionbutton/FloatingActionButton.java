// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.actionbutton;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class FloatingActionButton extends ImageButton
{

    public FloatingActionButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBackgroundResource(com.google.android.apps.walletnfcrel.R.drawable.fab_background);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            setElevation(getResources().getDimension(com.google.android.apps.walletnfcrel.R.dimen.fab_elevation));
            setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, com.google.android.apps.walletnfcrel.R.anim.floating_action_button_raise));
        }
    }

    public final ObjectAnimator fadeIn(long l)
    {
        return ObjectAnimator.ofFloat(this, "alpha", new float[] {
            0.0F, 1.0F
        }).setDuration(l);
    }

    public final ObjectAnimator fadeOut(long l)
    {
        return ObjectAnimator.ofFloat(this, "alpha", new float[] {
            1.0F, 0.0F
        }).setDuration(l);
    }
}
