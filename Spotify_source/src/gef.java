// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class gef extends Animation
    implements android.view.animation.Animation.AnimationListener
{

    public int a;
    public int b;
    private View c;
    private android.view.ViewGroup.MarginLayoutParams d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public gef(View view)
    {
        setDuration(200L);
        c = view;
        d = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int k = d.leftMargin;
        h = k;
        e = k;
        k = d.topMargin;
        i = k;
        f = k;
        k = d.rightMargin;
        j = k;
        g = k;
        k = d.bottomMargin;
        b = k;
        a = k;
        setAnimationListener(this);
    }

    protected final void applyTransformation(float f1, Transformation transformation)
    {
        super.applyTransformation(f1, transformation);
        int k = e;
        int l = (int)((float)(h - e) * f1);
        int i1 = f;
        int j1 = (int)((float)(i - f) * f1);
        int k1 = g;
        int l1 = (int)((float)(j - g) * f1);
        int i2 = a;
        int j2 = (int)((float)(b - a) * f1);
        d.leftMargin = k + l;
        d.topMargin = i1 + j1;
        d.rightMargin = k1 + l1;
        d.bottomMargin = i2 + j2;
        c.requestLayout();
    }

    public final void onAnimationEnd(Animation animation)
    {
        d.leftMargin = h;
        d.topMargin = i;
        d.rightMargin = j;
        d.bottomMargin = b;
        c.requestLayout();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    public final boolean willChangeBounds()
    {
        return true;
    }
}
