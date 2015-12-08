// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

// Referenced classes of package com.soundcloud.android.view:
//            AspectRatioImageView

public class ParallaxImageView extends AspectRatioImageView
{

    private final float focalPoint;
    private final int movement;
    private int parallaxOffset;

    public ParallaxImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.ParallaxImageView);
        focalPoint = attributeset.getFloat(1, 0.5F);
        movement = (int)attributeset.getDimension(0, -(int)(30F * context.getResources().getDisplayMetrics().density));
        attributeset.recycle();
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    protected boolean setFrame(int i, int j, int k, int l)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            Matrix matrix = getImageMatrix();
            float f = (float)(k - i) / (float)drawable.getIntrinsicWidth();
            int i1 = (int)((float)(-drawable.getIntrinsicHeight()) * focalPoint);
            matrix.setTranslate(0.0F, i1);
            matrix.postScale(f, f, 0.0F, 0.0F);
            matrix.postTranslate(0.0F, Math.min((l - j) / 2 + parallaxOffset, (float)(-i1) * f));
            setImageMatrix(matrix);
        }
        return super.setFrame(i, j, k, l);
    }

    public void setParallaxOffset(double d)
    {
        parallaxOffset = (int)((double)movement * d);
        setFrame(getLeft(), getTop(), getRight(), getBottom());
        invalidate();
    }
}
