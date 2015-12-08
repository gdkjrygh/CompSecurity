// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class HeightConstantClampImageView extends ImageView
{

    private boolean a;
    private float b;
    private double c;
    private android.widget.ImageView.ScaleType d;

    public HeightConstantClampImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HeightConstantClampImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = true;
        b = -1F;
        c = 1.7777777777777777D;
        context = context.obtainStyledAttributes(attributeset, kik.android.ag.b.d);
        b = context.getDimension(0, -1F);
        context.recycle();
    }

    protected void onMeasure(int i, int j)
    {
        Drawable drawable;
        if (b < 0.0F)
        {
            super.onMeasure(i, j);
            return;
        }
        i = android.view.View.MeasureSpec.getSize(i);
        drawable = getDrawable();
        if (drawable == null) goto _L2; else goto _L1
_L1:
        double d1;
        double d2;
        int k;
        j = drawable.getIntrinsicHeight();
        k = drawable.getIntrinsicWidth();
        d1 = (double)k / (double)j;
        d2 = (double)b / (double)j;
        if (d1 >= c || !a) goto _L4; else goto _L3
_L3:
        float f1 = b * (float)c;
        float f = f1;
        if (b != -1F)
        {
            f = f1;
            if (f1 > (float)i)
            {
                f = i;
            }
        }
        if (d == null)
        {
            float f2 = (float)((double)f / (double)k);
            Matrix matrix = new Matrix();
            matrix.postScale(f2, f2);
            matrix.postTranslate(0.0F, -(int)Math.floor(((double)(f2 * (float)j) - (double)b) / 2D));
            setScaleType(android.widget.ImageView.ScaleType.MATRIX);
            setImageMatrix(matrix);
        }
        i = (int)Math.ceil(f);
_L5:
        setMeasuredDimension(i, (int)b);
        return;
_L4:
        j = (int)(float)(int)((double)k * d2);
        i = j;
        if (d == null)
        {
            setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            i = j;
        }
        if (true) goto _L5; else goto _L2
_L2:
        setMeasuredDimension(i, (int)b);
        return;
    }
}
