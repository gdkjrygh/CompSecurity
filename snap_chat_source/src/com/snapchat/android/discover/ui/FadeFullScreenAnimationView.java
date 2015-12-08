// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Jy;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.snapchat.android.util.SnapMediaUtils;

public class FadeFullScreenAnimationView extends ImageView
{
    public static interface a
    {
    }


    private Bitmap a;
    private Jy b;
    private Context c;

    public FadeFullScreenAnimationView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, Jy.a());
    }

    public FadeFullScreenAnimationView(Context context, AttributeSet attributeset, Jy jy)
    {
        super(context, attributeset);
        a = null;
        c = context;
        b = jy;
    }

    private void b()
    {
        if (a == null && getWidth() > 0 && getHeight() > 0)
        {
            android.graphics.BitmapFactory.Options options = SnapMediaUtils.a(c.getResources().getDisplayMetrics(), getWidth(), getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            a = b.a(options, true);
            if (a == null)
            {
                a = SnapMediaUtils.a(getWidth(), getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            }
            if (a != null)
            {
                Canvas canvas = new Canvas(a);
                Paint paint = new Paint();
                paint.setColor(0xff000000);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                canvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), paint);
            }
            setImageBitmap(a);
        }
    }

    public final void a()
    {
        b();
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(ObjectAnimator.ofFloat(this, View.ALPHA, new float[] {
            getAlpha(), 0.0F
        }));
        animatorset.setDuration((long)(getAlpha() * 325F));
        animatorset.setInterpolator(new DecelerateInterpolator());
        animatorset.start();
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(j));
    }

    public void setAlpha(float f)
    {
        b();
        if (a == null)
        {
            return;
        } else
        {
            super.setAlpha(f);
            return;
        }
    }

    public void setFadeFullScreenListener(a a1)
    {
    }
}
