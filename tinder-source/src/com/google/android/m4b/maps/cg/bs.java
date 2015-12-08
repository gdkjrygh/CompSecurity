// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.m4b.maps.df.aa;
import com.google.android.m4b.maps.model.CameraPosition;

public final class bs extends ImageView
    implements android.view.animation.Animation.AnimationListener, aa
{

    boolean a;
    private Matrix b;
    private Matrix c;
    private float d;
    private float e;
    private boolean f;
    private Animation g;
    private Animation h;

    public bs(Context context, Resources resources)
    {
        super(context);
        f = false;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        setImageDrawable(resources.getDrawable(com.google.android.m4b.maps.h.e.maps_ic_compass_needle));
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            setBackground(resources.getDrawable(com.google.android.m4b.maps.h.e.maps_button_compass_selector));
        } else
        {
            setBackgroundDrawable(resources.getDrawable(com.google.android.m4b.maps.h.e.maps_button_compass_selector));
        }
        g = new AlphaAnimation(0.0F, 1.0F);
        g.setDuration(100L);
        g.setAnimationListener(this);
        h = new AlphaAnimation(1.0F, 0.0F);
        h.setDuration(500L);
        h.setStartOffset(1600L);
        h.setAnimationListener(this);
    }

    private void a()
    {
        float f2;
        float f3;
        if (b != null && c != null)
        {
            c.set(b);
            c.postRotate(-d, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
            float f1 = (e / 90F) * 0.7F;
            c.postScale(1.0F, 1.0F - f1);
            c.postTranslate(0.0F, (f1 / 2.0F) * (float)getHeight());
            setImageMatrix(c);
        }
        f2 = e;
        f3 = d;
        if (f2 > 0.5F) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (f3 < 0.5F || f3 > 359.5F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L9:
        if (flag) goto _L5; else goto _L4
_L4:
        if (getVisibility() == 0 && getAnimation() != h)
        {
            f = false;
            startAnimation(h);
        }
_L7:
        return;
_L3:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        if (getVisibility() == 0 && getAnimation() == h)
        {
            f = true;
            clearAnimation();
            return;
        }
        if (getVisibility() != 4 || getAnimation() == g) goto _L7; else goto _L6
_L6:
        startAnimation(g);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(CameraPosition cameraposition)
    {
        if (!a)
        {
            return;
        } else
        {
            d = cameraposition.e;
            e = cameraposition.d;
            a();
            return;
        }
    }

    public final IBinder asBinder()
    {
        return null;
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (animation == h && a && !f)
        {
            setVisibility(4);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        if (animation == g && a)
        {
            setVisibility(0);
        }
    }

    protected final void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        b = new Matrix();
        c = new Matrix();
        RectF rectf = new RectF(0.0F, 0.0F, i, j);
        RectF rectf1 = new RectF(0.0F, 0.0F, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        b.setRectToRect(rectf1, rectf, android.graphics.Matrix.ScaleToFit.CENTER);
        a();
    }
}
