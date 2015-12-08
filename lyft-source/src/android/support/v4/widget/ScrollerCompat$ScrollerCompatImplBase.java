// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

class 
    implements 
{

    public Object a(Context context, Interpolator interpolator)
    {
        if (interpolator != null)
        {
            return new Scroller(context, interpolator);
        } else
        {
            return new Scroller(context);
        }
    }

    public void a(Object obj, int i, int j, int k, int l)
    {
        ((Scroller)obj).startScroll(i, j, k, l);
    }

    public void a(Object obj, int i, int j, int k, int l, int i1)
    {
        ((Scroller)obj).startScroll(i, j, k, l, i1);
    }

    public void a(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        ((Scroller)obj).fling(i, j, k, l, i1, j1, k1, l1);
    }

    public void a(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2)
    {
        ((Scroller)obj).fling(i, j, k, l, i1, j1, k1, l1);
    }

    public boolean a(Object obj)
    {
        return ((Scroller)obj).isFinished();
    }

    public int b(Object obj)
    {
        return ((Scroller)obj).getCurrX();
    }

    public int c(Object obj)
    {
        return ((Scroller)obj).getCurrY();
    }

    public float d(Object obj)
    {
        return 0.0F;
    }

    public boolean e(Object obj)
    {
        return ((Scroller)obj).computeScrollOffset();
    }

    public void f(Object obj)
    {
        ((Scroller)obj).abortAnimation();
    }

    public int g(Object obj)
    {
        return ((Scroller)obj).getFinalX();
    }

    public int h(Object obj)
    {
        return ((Scroller)obj).getFinalY();
    }

    ()
    {
    }
}
