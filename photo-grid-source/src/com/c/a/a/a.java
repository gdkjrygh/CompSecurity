// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class a extends Animation
{

    public static final boolean a;
    private static final WeakHashMap b = new WeakHashMap();
    private final WeakReference c;
    private final Camera d = new Camera();
    private boolean e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private final RectF p = new RectF();
    private final RectF q = new RectF();
    private final Matrix r = new Matrix();

    private a(View view)
    {
        f = 1.0F;
        l = 1.0F;
        m = 1.0F;
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        c = new WeakReference(view);
    }

    public static a a(View view)
    {
        a a1;
label0:
        {
            a a2 = (a)b.get(view);
            if (a2 != null)
            {
                a1 = a2;
                if (a2 == view.getAnimation())
                {
                    break label0;
                }
            }
            a1 = new a(view);
            b.put(view, a1);
        }
        return a1;
    }

    public final float a()
    {
        View view = (View)c.get();
        if (view == null)
        {
            return 0.0F;
        } else
        {
            return (float)view.getLeft() + n;
        }
    }

    protected final void applyTransformation(float f1, Transformation transformation)
    {
        View view = (View)c.get();
        if (view != null)
        {
            transformation.setAlpha(f);
            transformation = transformation.getMatrix();
            float f3 = view.getWidth();
            float f4 = view.getHeight();
            boolean flag = e;
            float f2;
            float f5;
            float f6;
            float f7;
            if (flag)
            {
                f1 = g;
            } else
            {
                f1 = f3 / 2.0F;
            }
            if (flag)
            {
                f2 = h;
            } else
            {
                f2 = f4 / 2.0F;
            }
            f5 = i;
            f6 = j;
            f7 = k;
            if (f5 != 0.0F || f6 != 0.0F || f7 != 0.0F)
            {
                Camera camera = d;
                camera.save();
                camera.rotateX(f5);
                camera.rotateY(f6);
                camera.rotateZ(-f7);
                camera.getMatrix(transformation);
                camera.restore();
                transformation.preTranslate(-f1, -f2);
                transformation.postTranslate(f1, f2);
            }
            f5 = l;
            f6 = m;
            if (f5 != 1.0F || f6 != 1.0F)
            {
                transformation.postScale(f5, f6);
                transformation.postTranslate(-(f1 / f3) * (f5 * f3 - f3), -(f2 / f4) * (f6 * f4 - f4));
            }
            transformation.postTranslate(n, o);
        }
    }

    public final float b()
    {
        View view = (View)c.get();
        if (view == null)
        {
            return 0.0F;
        } else
        {
            return (float)view.getTop() + o;
        }
    }

    static 
    {
        boolean flag;
        if (Integer.valueOf(android.os.Build.VERSION.SDK).intValue() < 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
