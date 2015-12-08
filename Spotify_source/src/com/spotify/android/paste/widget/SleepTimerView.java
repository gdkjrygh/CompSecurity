// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import dgq;

public class SleepTimerView extends LinearLayout
{

    private static final TimeInterpolator a = new LinearInterpolator();
    private TextView b;
    private ObjectAnimator c;
    private int d;
    private dgq e;

    public SleepTimerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(0x7f030108, this);
        b = (TextView)findViewById(0x7f110479);
        findViewById(0x7f110478);
    }

    static dgq a(SleepTimerView sleeptimerview)
    {
        return sleeptimerview.e;
    }

    public final void a()
    {
        if (c != null && c.isRunning())
        {
            c.cancel();
        }
    }

    public final void a(int i)
    {
        if (c != null)
        {
            c.cancel();
        }
        setTimeLeftSeconds(i);
        c = ObjectAnimator.ofInt(this, "timeLeftSeconds", new int[] {
            i, 0
        });
        c.setDuration((long)i * 1000L);
        c.setInterpolator(a);
        c.start();
        c.addListener(new android.animation.Animator.AnimatorListener() {

            private SleepTimerView a;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
                SleepTimerView.a(a).a();
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                a = SleepTimerView.this;
                super();
            }
        });
    }

    public final void a(dgq dgq)
    {
        e = dgq;
    }

    public void setTimeLeftSeconds(int i)
    {
        if (d == i)
        {
            return;
        } else
        {
            d = i;
            b.setText(DateUtils.formatElapsedTime(i));
            return;
        }
    }

}
