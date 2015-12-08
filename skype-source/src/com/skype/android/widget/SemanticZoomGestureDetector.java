// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.view.ScaleGestureDetector;
import android.view.View;

public class SemanticZoomGestureDetector extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
{

    private float a;
    private float b;
    private boolean c;
    private View d;
    private View e;
    private View f;
    private boolean g;

    public SemanticZoomGestureDetector(View view, View view1)
    {
        d = view;
        e = view1;
        if (view1.getVisibility() != 0)
        {
            view1 = view;
        }
        f = view1;
    }

    private static float a(float f1, float f2, float f3, float f4)
    {
        return (1.0F - f4) * ((f1 - f2) / (f3 - f2)) + f4;
    }

    private static void a(View view)
    {
        view.setAlpha(1.0F);
        view.setScaleX(1.0F);
        view.setScaleY(1.0F);
        view.setVisibility(0);
    }

    private static void a(View view, float f1)
    {
        view.setScaleX(f1);
        view.setScaleY(f1);
    }

    public final boolean a()
    {
        return g;
    }

    public final void b()
    {
        if (d != null)
        {
            d.setVisibility(8);
            a(e);
            g = false;
            f = e;
        }
    }

    public final void c()
    {
        e.setAlpha(0.0F);
        a(d);
        g = true;
        f = d;
    }

    public final boolean d()
    {
        return c;
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f1;
        View view;
        boolean flag;
        if (b == 0.0F)
        {
            f1 = scalegesturedetector.getPreviousSpan();
        } else
        {
            f1 = b;
        }
        b = f1;
        if (scalegesturedetector.getCurrentSpan() > b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = Math.max(0.1F, Math.min(5F, scalegesturedetector.getScaleFactor()));
        if ((double)a > 1.5D)
        {
            e.setVisibility(0);
            f1 = a(a, 1.5F, 5F, 0.2F);
            a(e, f1);
            e.setAlpha(f1);
        } else
        if (a < 0.5F)
        {
            d.setVisibility(0);
            a(d, a(a, 0.5F, 0.1F, 3F));
            d.setAlpha(a(a, 0.5F, 0.1F, 0.1F));
        }
        a(f, a);
        view = f;
        if (flag)
        {
            f1 = 1.0F / a;
        } else
        {
            f1 = a;
        }
        view.setAlpha(f1);
        f.invalidate();
        b = scalegesturedetector.getCurrentSpan();
        return super.onScale(scalegesturedetector);
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        c = true;
        b = 0.0F;
        return super.onScaleBegin(scalegesturedetector);
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        boolean flag = false;
        c = false;
        if (a < 1.0F)
        {
            flag = true;
        }
        if (flag)
        {
            c();
            return;
        } else
        {
            b();
            return;
        }
    }
}
