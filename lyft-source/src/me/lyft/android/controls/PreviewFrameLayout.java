// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class PreviewFrameLayout extends ViewGroup
{

    private double aspectRatio;
    private FrameLayout frame;
    private OnSizeChangedListener sizeChangedListener;

    public PreviewFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        aspectRatio = 1.3333333333333333D;
    }

    protected void onFinishInflate()
    {
        frame = (FrameLayout)findViewById(0x7f0d00b7);
        if (frame == null)
        {
            throw new IllegalStateException("must provide child with id as \"frame\"");
        } else
        {
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int l1 = getWidth();
        getHeight();
        FrameLayout framelayout = frame;
        int k1 = framelayout.getPaddingLeft() + framelayout.getPaddingRight();
        int i1 = framelayout.getPaddingBottom();
        int j1 = framelayout.getPaddingTop();
        int i2 = l1 - k1;
        l1 = (int)((double)i2 / aspectRatio + 0.5D);
        k1 = i2 + k1;
        i1 = j1 + i1 + l1;
        j1 = (k - i - k1) / 2;
        l1 = (l - j - i1) / 2;
        frame.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000));
        frame.layout(i + j1, j + l1, k - j1, l - l1);
        if (sizeChangedListener != null)
        {
            sizeChangedListener.onSizeChanged();
        }
    }

    public void setAspectRatio(double d)
    {
        if (d <= 0.0D)
        {
            throw new IllegalArgumentException();
        }
        if (aspectRatio != d)
        {
            aspectRatio = d;
            requestLayout();
        }
    }

    public void setOnSizeChangedListener(OnSizeChangedListener onsizechangedlistener)
    {
        sizeChangedListener = onsizechangedlistener;
    }

    private class OnSizeChangedListener
    {

        public abstract void onSizeChanged();
    }

}
