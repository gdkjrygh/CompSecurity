// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import gcg;

public class PremiumUpsellInterstitialLinearLayoutWithBackground extends LinearLayout
{

    private final Drawable a;
    private final Paint b = new Paint();
    private final float c;
    private final Interpolator d = new AccelerateDecelerateInterpolator();
    private int e;
    private int f;
    private int g;
    private final android.graphics.drawable.Drawable.Callback h = new android.graphics.drawable.Drawable.Callback() {

        private PremiumUpsellInterstitialLinearLayoutWithBackground a;

        public final void invalidateDrawable(Drawable drawable)
        {
            a.invalidate();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
        {
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
        {
        }

            
            {
                a = PremiumUpsellInterstitialLinearLayoutWithBackground.this;
                super();
            }
    };

    public PremiumUpsellInterstitialLinearLayoutWithBackground(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setWillNotDraw(false);
        Resources resources = context.getResources();
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x1010119
        });
        a = context.getDrawable(0);
        context.recycle();
        a.setCallback(h);
        c = (float)a.getIntrinsicHeight() / (float)a.getIntrinsicWidth();
        b.setColor(gcg.b(getContext(), 0x7f0f0036));
        e = resources.getDimensionPixelOffset(0x7f0c012d);
        g = resources.getDimensionPixelOffset(0x7f0c012c);
        f = (int)((float)g / c);
        getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() {

            private PremiumUpsellInterstitialLinearLayoutWithBackground a;

            public final void onScrollChanged()
            {
                PremiumUpsellInterstitialLinearLayoutWithBackground.a(a);
            }

            
            {
                a = PremiumUpsellInterstitialLinearLayoutWithBackground.this;
                super();
            }
        });
    }

    private void a()
    {
        View view = (View)getParent();
        if (view == null) goto _L2; else goto _L1
_L1:
        float f2 = (float)view.getScrollY() / (float)e;
        if (f2 >= 0.0F) goto _L4; else goto _L3
_L3:
        float f1 = 0.0F;
_L6:
        f1 = d.getInterpolation(f1);
        int i = (int)((float)f * (1.0F - f1) * 0.5F);
        int j = (int)((1.0F - f1) * (float)g * 0.5F);
        int k = getWidth();
        int l = (int)((float)k * c);
        a.setBounds(-i, -j, i + k, j + l);
        return;
_L4:
        f1 = f2;
        if (f2 > 1.0F)
        {
            f1 = 1.0F;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        f1 = 0.0F;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(PremiumUpsellInterstitialLinearLayoutWithBackground premiumupsellinterstitiallinearlayoutwithbackground)
    {
        premiumupsellinterstitiallinearlayoutwithbackground.a();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        a.draw(canvas);
        canvas.drawRect(0.0F, a.getBounds().bottom, getWidth(), getHeight(), b);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        a();
    }
}
