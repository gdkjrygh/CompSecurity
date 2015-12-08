// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.animation.Interpolator;
import com.google.android.libraries.handwriting.base.StrokeList;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            UIHandler, HandwritingOverlayView

final class ae
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final ValueAnimator a;
    final Interpolator b;
    final Paint c;
    final ArgbEvaluator d;
    final StrokeList e;
    final float f;
    final float g;
    final UIHandler h;

    ae(UIHandler uihandler, ValueAnimator valueanimator, Interpolator interpolator, Paint paint, ArgbEvaluator argbevaluator, StrokeList strokelist, float f1, 
            float f2)
    {
        h = uihandler;
        a = valueanimator;
        b = interpolator;
        c = paint;
        d = argbevaluator;
        e = strokelist;
        f = f1;
        g = f2;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (UIHandler.b(h) == null || UIHandler.b(h).getAnimationLayer() == null)
        {
            return;
        }
        if (UIHandler.c(h))
        {
            a.cancel();
            UIHandler.d(h);
            UIHandler.b(h).getAnimationLayer().a();
            return;
        } else
        {
            valueanimator = Float.valueOf(b.getInterpolation(((Float)valueanimator.getAnimatedValue()).floatValue()));
            UIHandler.b(h).getAnimationLayer().a();
            (new Paint(c)).setColor(((Integer)d.evaluate(valueanimator.floatValue(), Integer.valueOf(UIHandler.b(h).getStrokePaint().getColor()), Integer.valueOf(c.getColor()))).intValue());
            UIHandler.b(h).getAnimationLayer().a(e, valueanimator.floatValue() * f, valueanimator.floatValue() * g, c);
            return;
        }
    }
}
