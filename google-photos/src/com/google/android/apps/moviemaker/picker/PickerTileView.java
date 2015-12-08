// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.picker;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;
import ctn;
import cto;

public class PickerTileView extends ImageView
    implements Checkable
{

    public final Object a;
    public Bitmap b;
    public Bitmap c;
    public boolean d;
    public long e;
    public boolean f;
    public final ObjectAnimator g;
    public final Runnable h;
    private final Point i;
    private final Rect j;
    private final Paint k;
    private final Paint l;
    private final int m;
    private final ColorFilter n;
    private final Runnable o;

    public PickerTileView(Context context)
    {
        this(context, null);
    }

    public PickerTileView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PickerTileView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        i = new Point();
        j = new Rect();
        k = new Paint();
        l = new Paint();
        a = new Object();
        m = Color.rgb(51, 182, 121);
        h = new ctn(this);
        o = new cto(this);
        context = new ColorMatrix();
        context.setSaturation(0.2F);
        n = new ColorMatrixColorFilter(context);
        setBackgroundColor(-1);
        l.setColor(m);
        l.setStyle(android.graphics.Paint.Style.STROKE);
        g = ObjectAnimator.ofInt(this, "imageAlpha", new int[] {
            0, 255
        });
        g.setDuration(750L);
    }

    public static Bitmap a(PickerTileView pickertileview, Bitmap bitmap)
    {
        pickertileview.c = bitmap;
        return bitmap;
    }

    public static Object a(PickerTileView pickertileview)
    {
        return pickertileview.a;
    }

    public static void a(PickerTileView pickertileview, boolean flag)
    {
        pickertileview.f = true;
    }

    public static boolean b(PickerTileView pickertileview)
    {
        return pickertileview.d;
    }

    public static long c(PickerTileView pickertileview)
    {
        return pickertileview.e;
    }

    public static Runnable d(PickerTileView pickertileview)
    {
        return pickertileview.o;
    }

    public static Bitmap e(PickerTileView pickertileview)
    {
        return pickertileview.c;
    }

    public static ObjectAnimator f(PickerTileView pickertileview)
    {
        return pickertileview.g;
    }

    public boolean isChecked()
    {
        return isSelected();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (f && getDrawable() != null)
        {
            k.setAlpha(getImageAlpha());
            canvas.drawBitmap(b, i.x, i.y, k);
        }
        if (isSelected() && getDrawable() != null)
        {
            l.setAlpha(Math.min(204, getImageAlpha()));
            canvas.drawRect(j, l);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, i1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (b != null)
        {
            k1 = (i1 - b.getWidth()) / 2;
            l1 = (j1 - b.getHeight()) / 2;
            i.set(k1, l1);
        }
        j.set(0, 0, i1, j1);
        j.inset(i1 / 20, j1 / 20);
        l.setStrokeWidth(i1 / 10);
    }

    public void setChecked(boolean flag)
    {
        setSelected(flag);
        if (flag)
        {
            setColorFilter(n);
            return;
        } else
        {
            clearColorFilter();
            return;
        }
    }

    public void toggle()
    {
        if (isSelected())
        {
            setSelected(false);
            return;
        } else
        {
            setSelected(true);
            return;
        }
    }
}
