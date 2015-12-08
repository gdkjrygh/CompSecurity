// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.view.bp;
import android.util.DisplayMetrics;
import android.widget.ImageView;

// Referenced classes of package android.support.v4.widget:
//            e

final class d extends ImageView
{

    private android.view.animation.Animation.AnimationListener a;
    private int b;

    public d(Context context)
    {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int)(20F * f * 2.0F);
        int j = (int)(1.75F * f);
        int k = (int)(0.0F * f);
        b = (int)(3.5F * f);
        if (a())
        {
            context = new ShapeDrawable(new OvalShape());
            bp.f(this, f * 4F);
        } else
        {
            context = new ShapeDrawable(new e(this, b, i));
            bp.a(this, 1, context.getPaint());
            context.getPaint().setShadowLayer(b, k, j, 0x1e000000);
            i = b;
            setPadding(i, i, i, i);
        }
        context.getPaint().setColor(0xfffafafa);
        setBackgroundDrawable(context);
    }

    static int a(d d1)
    {
        return d1.b;
    }

    static int a(d d1, int i)
    {
        d1.b = i;
        return i;
    }

    private static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public final void a(android.view.animation.Animation.AnimationListener animationlistener)
    {
        a = animationlistener;
    }

    public final void onAnimationEnd()
    {
        super.onAnimationEnd();
        if (a != null)
        {
            a.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart()
    {
        super.onAnimationStart();
        if (a != null)
        {
            a.onAnimationStart(getAnimation());
        }
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (!a())
        {
            setMeasuredDimension(getMeasuredWidth() + b * 2, getMeasuredHeight() + b * 2);
        }
    }

    public final void setBackgroundColor(int i)
    {
        if (getBackground() instanceof ShapeDrawable)
        {
            ((ShapeDrawable)getBackground()).getPaint().setColor(i);
        }
    }
}
