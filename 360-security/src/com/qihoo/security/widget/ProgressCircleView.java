// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class ProgressCircleView extends ImageView
{

    public ProgressCircleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!isInEditMode())
        {
            setBackgroundResource(0x7f0200e8);
            if (getVisibility() == 0)
            {
                a();
                return;
            }
        }
    }

    private void a()
    {
        RotateAnimation rotateanimation = new RotateAnimation(0.0F, 360F, 1, 0.5F, 1, 0.5F);
        rotateanimation.setRepeatCount(-1);
        rotateanimation.setDuration(1000L);
        rotateanimation.setRepeatMode(1);
        rotateanimation.setInterpolator(new LinearInterpolator());
        startAnimation(rotateanimation);
    }

    private void b()
    {
        clearAnimation();
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        if (view != this)
        {
            return;
        }
        if (getVisibility() == 8 || getVisibility() == 4)
        {
            b();
            return;
        } else
        {
            a();
            return;
        }
    }

    protected void onWindowVisibilityChanged(int i)
    {
        if (i == 8 || i == 4 || getVisibility() == 8 || getVisibility() == 4)
        {
            b();
        } else
        {
            a();
        }
        super.onWindowVisibilityChanged(i);
    }

    public void setProgressBackground(int i)
    {
        setBackgroundResource(i);
    }

    public void setVisibility(int i)
    {
label0:
        {
            if (getVisibility() != i)
            {
                super.setVisibility(i);
                if (i != 8 && i != 4)
                {
                    break label0;
                }
                b();
            }
            return;
        }
        a();
    }
}
