// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import czx;
import dav;
import dbq;
import ddl;

public class StoryboardVideoPosterView extends dbq
{

    private static final Property p = new dav(java/lang/Float, "transition");
    private final Matrix l;
    private final Matrix m;
    private RectF n;
    private float o;

    public StoryboardVideoPosterView(Context context)
    {
        super(context);
        l = new Matrix();
        m = new Matrix();
        o = 1.0F;
    }

    public StoryboardVideoPosterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = new Matrix();
        m = new Matrix();
        o = 1.0F;
    }

    public StoryboardVideoPosterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        l = new Matrix();
        m = new Matrix();
        o = 1.0F;
    }

    public static float a(StoryboardVideoPosterView storyboardvideoposterview)
    {
        return storyboardvideoposterview.o;
    }

    public static float a(StoryboardVideoPosterView storyboardvideoposterview, float f)
    {
        storyboardvideoposterview.o = f;
        return f;
    }

    protected final void a(Bitmap bitmap, Matrix matrix)
    {
        if (n == null || o >= 1.0F)
        {
            super.a(bitmap, matrix);
            return;
        } else
        {
            super.a(bitmap, m);
            Matrix matrix1 = l;
            bitmap = new RectF(n.left * (float)bitmap.getWidth(), n.top * (float)bitmap.getHeight(), n.right * (float)bitmap.getWidth(), n.bottom * (float)bitmap.getHeight());
            int i = -getPaddingLeft();
            int j = -getPaddingTop();
            matrix1.setRectToRect(bitmap, new RectF(i, j, i + getWidth(), j + getHeight()), android.graphics.Matrix.ScaleToFit.FILL);
            ddl.a(l, m, o, matrix);
            return;
        }
    }

    public final void a(RectF rectf, int i, int j)
    {
        n = rectf;
        c();
        rectf = czx.a();
        rectf.setTarget(this);
        rectf.setProperty(p);
        rectf.setFloatValues(new float[] {
            0.0F, 1.0F
        });
        rectf.setStartDelay(500L);
        rectf.setDuration(750L).start();
        this.i = 0;
        o = 0.0F;
    }

}
