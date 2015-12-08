// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

// Referenced classes of package android.support.v4.widget:
//            af

final class ag
    implements af
{

    ag()
    {
    }

    public final Object a(Context context, Interpolator interpolator)
    {
        if (interpolator != null)
        {
            return new Scroller(context, interpolator);
        } else
        {
            return new Scroller(context);
        }
    }

    public final void a(Object obj, int i, int j, int k)
    {
        ((Scroller)obj).startScroll(i, j, 0, k);
    }

    public final void a(Object obj, int i, int j, int k, int l)
    {
        ((Scroller)obj).fling(0, 0, i, j, k, l, 0x80000000, 0x7fffffff);
    }

    public final void a(Object obj, int i, int j, int k, int l, int i1)
    {
        ((Scroller)obj).startScroll(i, j, k, l, i1);
    }

    public final boolean a(Object obj)
    {
        return ((Scroller)obj).isFinished();
    }

    public final int b(Object obj)
    {
        return ((Scroller)obj).getCurrX();
    }

    public final void b(Object obj, int i, int j, int k, int l, int i1)
    {
        ((Scroller)obj).fling(i, j, 0, k, 0, 0, 0, l);
    }

    public final int c(Object obj)
    {
        return ((Scroller)obj).getCurrY();
    }

    public final float d(Object obj)
    {
        return 0.0F;
    }

    public final boolean e(Object obj)
    {
        return ((Scroller)obj).computeScrollOffset();
    }

    public final void f(Object obj)
    {
        ((Scroller)obj).abortAnimation();
    }

    public final int g(Object obj)
    {
        return ((Scroller)obj).getFinalX();
    }

    public final int h(Object obj)
    {
        return ((Scroller)obj).getFinalY();
    }
}
