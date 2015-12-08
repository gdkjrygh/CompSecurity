// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            bs

class bt extends bs
{

    bt()
    {
    }

    public final int a(int i, int i1, int j1)
    {
        return View.resolveSizeAndState(i, i1, j1);
    }

    final long a()
    {
        return ValueAnimator.getFrameDelay();
    }

    public final void a(View view, float f1)
    {
        view.setTranslationX(f1);
    }

    public final void a(View view, int i, Paint paint)
    {
        view.setLayerType(i, paint);
    }

    public void a(View view, Paint paint)
    {
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public final void a(View view, boolean flag)
    {
        view.setActivated(flag);
    }

    public final void b(View view, float f1)
    {
        view.setTranslationY(f1);
    }

    public final void c(View view, float f1)
    {
        view.setAlpha(f1);
    }

    public final void d(View view, float f1)
    {
        view.setScaleX(f1);
    }

    public final void e(View view, float f1)
    {
        view.setScaleY(f1);
    }

    public final float f(View view)
    {
        return view.getAlpha();
    }

    public final int g(View view)
    {
        return view.getLayerType();
    }

    public final int j(View view)
    {
        return view.getMeasuredState();
    }

    public final float k(View view)
    {
        return view.getTranslationX();
    }

    public final float l(View view)
    {
        return view.getTranslationY();
    }

    public final float m(View view)
    {
        return view.getScaleX();
    }

    public final void t(View view)
    {
        view.jumpDrawablesToCurrentState();
    }

    public final void u(View view)
    {
        view.setSaveFromParentEnabled(false);
    }
}
