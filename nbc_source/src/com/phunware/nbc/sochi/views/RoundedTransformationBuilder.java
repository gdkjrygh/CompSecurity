// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.views;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.squareup.picasso.Transformation;

// Referenced classes of package com.phunware.nbc.sochi.views:
//            RoundedDrawable

public final class RoundedTransformationBuilder
{

    private ColorStateList mBorderColor;
    private float mBorderWidth;
    private float mCornerRadius;
    private final DisplayMetrics mDisplayMetrics = Resources.getSystem().getDisplayMetrics();
    private boolean mOval;
    private android.widget.ImageView.ScaleType mScaleType;

    public RoundedTransformationBuilder()
    {
        mCornerRadius = 0.0F;
        mOval = false;
        mBorderWidth = 0.0F;
        mBorderColor = ColorStateList.valueOf(0xff000000);
        mScaleType = android.widget.ImageView.ScaleType.FIT_CENTER;
    }

    public RoundedTransformationBuilder borderColor(int i)
    {
        mBorderColor = ColorStateList.valueOf(i);
        return this;
    }

    public RoundedTransformationBuilder borderColor(ColorStateList colorstatelist)
    {
        mBorderColor = colorstatelist;
        return this;
    }

    public RoundedTransformationBuilder borderWidth(float f)
    {
        mBorderWidth = f;
        return this;
    }

    public RoundedTransformationBuilder borderWidthDp(float f)
    {
        mBorderWidth = TypedValue.applyDimension(1, f, mDisplayMetrics);
        return this;
    }

    public Transformation build()
    {
        return new Transformation() {

            final RoundedTransformationBuilder this$0;

            public String key()
            {
                return (new StringBuilder()).append("r:").append(mCornerRadius).append("b:").append(mBorderWidth).append("c:").append(mBorderColor).append("o:").append(mOval).toString();
            }

            public Bitmap transform(Bitmap bitmap)
            {
                Bitmap bitmap1 = RoundedDrawable.fromBitmap(bitmap).setScaleType(mScaleType).setCornerRadius(mCornerRadius).setBorderWidth(mBorderWidth).setBorderColor(mBorderColor).setOval(mOval).toBitmap();
                if (!bitmap.equals(bitmap1))
                {
                    bitmap.recycle();
                }
                return bitmap1;
            }

            
            {
                this$0 = RoundedTransformationBuilder.this;
                super();
            }
        };
    }

    public RoundedTransformationBuilder cornerRadius(float f)
    {
        mCornerRadius = f;
        return this;
    }

    public RoundedTransformationBuilder cornerRadiusDp(float f)
    {
        mCornerRadius = TypedValue.applyDimension(1, f, mDisplayMetrics);
        return this;
    }

    public RoundedTransformationBuilder oval(boolean flag)
    {
        mOval = flag;
        return this;
    }

    public RoundedTransformationBuilder scaleType(android.widget.ImageView.ScaleType scaletype)
    {
        mScaleType = scaletype;
        return this;
    }





}
