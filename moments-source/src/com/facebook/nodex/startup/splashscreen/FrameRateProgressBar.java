// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class FrameRateProgressBar extends ProgressBar
{

    private final Runnable a;

    public FrameRateProgressBar(Context context)
    {
        super(context);
        a = new _cls1();
    }

    public FrameRateProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new _cls1();
    }

    public FrameRateProgressBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new _cls1();
    }

    private void a()
    {
        super.postInvalidateOnAnimation();
    }

    static void a(FrameRateProgressBar framerateprogressbar)
    {
        framerateprogressbar.a();
    }

    public void postInvalidateOnAnimation()
    {
        removeCallbacks(a);
        postDelayed(a, 150L);
    }

    private class _cls1
        implements Runnable
    {

        final FrameRateProgressBar a;

        public void run()
        {
            FrameRateProgressBar.a(a);
        }

        _cls1()
        {
            a = FrameRateProgressBar.this;
            super();
        }
    }

}
