// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.progressspinner;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class ProgressSpinnerView extends FrameLayout
{

    private final Handler handler;
    private final Runnable showSpinnerRunnable;

    public ProgressSpinnerView(Context context)
    {
        super(context);
        showSpinnerRunnable = new Runnable() {

            final ProgressSpinnerView this$0;

            public final void run()
            {
                setVisibility(0);
            }

            
            {
                this$0 = ProgressSpinnerView.this;
                super();
            }
        };
        handler = new Handler(context.getMainLooper());
        LayoutInflater.from(context).inflate(R.layout.progress_spinner, this);
    }

    public ProgressSpinnerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        showSpinnerRunnable = new _cls1();
        handler = new Handler(context.getMainLooper());
        LayoutInflater.from(context).inflate(R.layout.progress_spinner, this);
    }

    public ProgressSpinnerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        showSpinnerRunnable = new _cls1();
        handler = new Handler(context.getMainLooper());
        LayoutInflater.from(context).inflate(R.layout.progress_spinner, this);
    }

    private void showDelayed(int i)
    {
        handler.postDelayed(showSpinnerRunnable, i);
    }

    public final void hide()
    {
        handler.removeCallbacks(showSpinnerRunnable);
        setVisibility(8);
    }

    protected void onDetachedFromWindow()
    {
        handler.removeCallbacks(showSpinnerRunnable);
        super.onDetachedFromWindow();
    }

    public final void show()
    {
        setVisibility(0);
    }

    public final void showDelayed()
    {
        showDelayed(300);
    }
}
