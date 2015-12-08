// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.rebound.h;
import com.facebook.rebound.j;
import com.facebook.rebound.n;
import com.soundcloud.android.view.FixedWidthView;
import com.soundcloud.android.view.ListenableHorizontalScrollView;
import com.soundcloud.android.waveform.WaveformData;

// Referenced classes of package com.soundcloud.android.playback.ui.view:
//            WaveformCanvas, ProgressLineDrawable

public class WaveformView extends FrameLayout
{
    public static interface OnWidthChangedListener
    {

        public abstract void onWaveformViewWidthChanged(int i);
    }


    private static final int DEFAULT_BAR_SPACE_DP = 1;
    private static final int DEFAULT_BAR_WIDTH_DP = 2;
    private static final int DEFAULT_BASELINE_DP = 68;
    private static final float DEFAULT_WAVEFORM_WIDTH_RATIO = 1.5F;
    private static final int SCALE_DOWN_DURATION = 50;
    private static final double SPRING_FRICTION = 10D;
    private static final double SPRING_TENSION = 180D;
    private final int barWidth;
    private final int baseline;
    private final FixedWidthView dragView = (FixedWidthView)findViewById(0x7f0f01e2);
    private final ListenableHorizontalScrollView dragViewHolder = (ListenableHorizontalScrollView)findViewById(0x7f0f01e1);
    private final Runnable layoutWaveformsRunnable = new _cls1();
    private final ImageView leftLine = (ImageView)findViewById(0x7f0f01de);
    private final WaveformCanvas leftWaveform = (WaveformCanvas)findViewById(0x7f0f01dd);
    private ObjectAnimator leftWaveformScaler;
    private OnWidthChangedListener onWidthChangedListener;
    private final Paint progressAbovePaint = new Paint();
    private final Paint progressBelowPaint = new Paint();
    private final int progressColor;
    private final ImageView rightLine = (ImageView)findViewById(0x7f0f01e0);
    private final WaveformCanvas rightWaveform = (WaveformCanvas)findViewById(0x7f0f01df);
    private ObjectAnimator rightWaveformScaler;
    private final int spaceWidth;
    private final n springSystem = n.c();
    private h springY;
    private final Paint unplayedAbovePaint = new Paint();
    private final Paint unplayedBelowPaint = new Paint();
    private final int unplayedColor;
    private final float waveformWidthRatio;

    public WaveformView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        float f = getResources().getDisplayMetrics().density;
        attributeset = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.WaveformView);
        int i = attributeset.getColor(0, -1);
        int k = attributeset.getColor(1, -1);
        int l = attributeset.getColor(2, -1);
        int i1 = attributeset.getColor(3, -1);
        int j1 = attributeset.getColor(4, -1);
        waveformWidthRatio = attributeset.getFloat(5, 1.5F);
        barWidth = attributeset.getDimensionPixelSize(6, (int)(2.0F * f));
        spaceWidth = attributeset.getDimensionPixelSize(7, (int)(1.0F * f));
        baseline = attributeset.getDimensionPixelSize(8, (int)(f * 68F));
        attributeset.recycle();
        progressColor = k;
        unplayedColor = i1;
        progressAbovePaint.setShader(new LinearGradient(0.0F, 0.0F, 0.0F, baseline, i, k, android.graphics.Shader.TileMode.MIRROR));
        progressBelowPaint.setColor(l);
        unplayedAbovePaint.setColor(i1);
        unplayedBelowPaint.setColor(j1);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f030097, this);
        dragViewHolder.setOverScrollMode(2);
        leftWaveform.setScaleY(0.0F);
        rightWaveform.setScaleY(0.0F);
        leftWaveform.setPivotY(baseline);
        rightWaveform.setPivotY(baseline);
        leftLine.setImageDrawable(createLoadingDrawable(progressColor));
        rightLine.setImageDrawable(createLoadingDrawable(unplayedColor));
    }

    private void clearScaleAnimations()
    {
        if (springY != null)
        {
            springY.c();
            springY.a();
        }
        if (leftWaveformScaler != null)
        {
            leftWaveformScaler.cancel();
        }
        if (rightWaveformScaler != null)
        {
            rightWaveformScaler.cancel();
        }
    }

    private Drawable createLoadingDrawable(int i)
    {
        return new ProgressLineDrawable(i, baseline, spaceWidth);
    }

    private ObjectAnimator createScaleDownAnimator(View view)
    {
        view = ObjectAnimator.ofFloat(view, "scaleY", new float[] {
            view.getScaleY(), 0.0F
        });
        view.setDuration(50L);
        view.setInterpolator(new DecelerateInterpolator());
        return view;
    }

    private void hideIdleLines()
    {
        leftLine.clearAnimation();
        rightLine.clearAnimation();
        leftLine.setVisibility(8);
        rightLine.setVisibility(8);
    }

    public ListenableHorizontalScrollView getDragViewHolder()
    {
        return dragViewHolder;
    }

    ImageView getLeftLine()
    {
        return leftLine;
    }

    WaveformCanvas getLeftWaveform()
    {
        return leftWaveform;
    }

    ImageView getRightLine()
    {
        return rightLine;
    }

    WaveformCanvas getRightWaveform()
    {
        return rightWaveform;
    }

    public float getWidthRatio()
    {
        return waveformWidthRatio;
    }

    protected void onSizeChanged(int i, int k, int l, int i1)
    {
        super.onSizeChanged(i, k, l, i1);
        if (onWidthChangedListener != null)
        {
            onWidthChangedListener.onWaveformViewWidthChanged(i);
        }
    }

    public void setOnWidthChangedListener(OnWidthChangedListener onwidthchangedlistener)
    {
        onWidthChangedListener = onwidthchangedlistener;
    }

    public void setWaveformData(WaveformData waveformdata, int i)
    {
        waveformdata = waveformdata.scale(i / (barWidth + spaceWidth));
        leftWaveform.initialize(waveformdata, progressAbovePaint, progressBelowPaint, barWidth, spaceWidth, baseline);
        rightWaveform.initialize(waveformdata, unplayedAbovePaint, unplayedBelowPaint, barWidth, spaceWidth, baseline);
        dragViewHolder.setAreaWidth(i);
    }

    void setWaveformTranslations(int i, int k)
    {
        leftWaveform.setTranslationX(i);
        rightWaveform.setTranslationX(k);
        leftLine.setTranslationX(i);
        rightLine.setTranslationX(k);
    }

    void setWaveformWidths(int i)
    {
        leftWaveform.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, -1));
        leftLine.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, -1));
        rightWaveform.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, -1));
        rightLine.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, -1));
        dragView.setWidth(getWidth() + i);
        post(layoutWaveformsRunnable);
    }

    void showCollapsedWaveform()
    {
        clearScaleAnimations();
        leftWaveformScaler = createScaleDownAnimator(leftWaveform);
        leftWaveformScaler.start();
        rightWaveformScaler = createScaleDownAnimator(rightWaveform);
        rightWaveformScaler.start();
    }

    void showExpandedWaveform()
    {
        clearScaleAnimations();
        springY = springSystem.a();
        springY.a(new _cls2());
        springY.a(j.a(180D, 10D));
        springY.a(leftWaveform.getScaleY());
        springY.b(1.0D);
        hideIdleLines();
    }

    void showIdleLinesAtWaveformPositions()
    {
        leftLine.setTranslationX(leftWaveform.getTranslationX());
        rightLine.setTranslationX(rightWaveform.getTranslationX());
        leftLine.setVisibility(0);
        rightLine.setVisibility(0);
    }






    private class _cls1
        implements Runnable
    {

        final WaveformView this$0;

        public void run()
        {
            leftWaveform.requestLayout();
            rightWaveform.requestLayout();
            leftLine.requestLayout();
            rightLine.requestLayout();
            dragView.requestLayout();
        }

        _cls1()
        {
            this$0 = WaveformView.this;
            super();
        }
    }


    private class _cls2 extends g
    {

        final WaveformView this$0;

        public void onSpringUpdate(h h1)
        {
            float f = (float)h1.d.a;
            rightWaveform.setScaleY(f);
            leftWaveform.setScaleY(f);
        }

        _cls2()
        {
            this$0 = WaveformView.this;
            super();
        }
    }

}
