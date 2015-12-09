// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class NoInternetWarningBar extends LinearLayout
{

    android.view.animation.Animation.AnimationListener a;
    private Context b;
    private Animation c;

    public NoInternetWarningBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new android.view.animation.Animation.AnimationListener() {

            final NoInternetWarningBar a;

            public void onAnimationEnd(Animation animation)
            {
                a.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = NoInternetWarningBar.this;
                super();
            }
        };
        b = context;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f030112, this);
        setClickable(true);
        c = AnimationUtils.loadAnimation(b, 0x7f040039);
        c.setAnimationListener(a);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            startAnimation(c);
        }
        return super.onTouchEvent(motionevent);
    }
}
