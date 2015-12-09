// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android.views;

import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.google.wallet.wobl.renderer.common.ActionProgressBar;

public class SpinnerView extends ImageView
    implements ActionProgressBar
{

    public SpinnerView(Context context)
    {
        super(context);
    }

    private void showBusyState(boolean flag)
    {
        if (flag)
        {
            RotateAnimation rotateanimation = new RotateAnimation(0.0F, 360F, 1, 0.5F, 1, 0.5F);
            rotateanimation.setInterpolator(new LinearInterpolator());
            rotateanimation.setRepeatCount(-1);
            rotateanimation.setDuration(1000L);
            startAnimation(rotateanimation);
            return;
        } else
        {
            setAnimation(null);
            return;
        }
    }

    public void setActionCompleted()
    {
        setEnabled(true);
        showBusyState(false);
    }

    public void setActionStarted()
    {
        setEnabled(false);
        showBusyState(true);
    }
}
