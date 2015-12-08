// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.a;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.fitbit.ui.loadable.LoadablePicassoImageView;

public class b extends Animation
{

    private static final int a = 700;
    private static final float b = 1F;
    private static final float c = 0.2F;
    private Camera d;
    private int e;
    private String f;
    private LoadablePicassoImageView g;
    private float h;
    private float i;
    private boolean j;

    public b(LoadablePicassoImageView loadablepicassoimageview, int k)
    {
        this(loadablepicassoimageview, null, k);
    }

    public b(LoadablePicassoImageView loadablepicassoimageview, String s)
    {
        this(loadablepicassoimageview, s, 0);
    }

    private b(LoadablePicassoImageView loadablepicassoimageview, String s, int k)
    {
        e = 0;
        j = true;
        f = s;
        e = k;
        g = loadablepicassoimageview;
        setDuration(700L);
        setFillAfter(false);
        setInterpolator(new AccelerateDecelerateInterpolator());
    }

    protected void applyTransformation(float f1, Transformation transformation)
    {
        float f2 = (float)(((double)f1 * 3.1415926535897931D * 180D) / 3.1415926535897931D);
        if (f1 <= 0.5F)
        {
            transformation.setAlpha(1.0F + -0.8F * f1);
            f1 = f2;
        } else
        {
            f2 -= 180F;
            if (f != null)
            {
                g.a(f);
            } else
            {
                g.setImageResource(e);
            }
            transformation.setAlpha(0.2F + 0.8F * f1);
            f1 = f2;
        }
        f2 = f1;
        if (j)
        {
            f2 = -f1;
        }
        transformation = transformation.getMatrix();
        d.save();
        d.rotateY(f2);
        d.getMatrix(transformation);
        d.restore();
        transformation.preTranslate(-h, -i);
        transformation.postTranslate(h, i);
    }

    public void initialize(int k, int l, int i1, int j1)
    {
        super.initialize(k, l, i1, j1);
        h = k / 2;
        i = l / 2;
        d = new Camera();
    }
}
