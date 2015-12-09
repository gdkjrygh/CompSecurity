// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.roundedimage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RoundedImage extends ImageView
{

    int defaultImageResourceId;

    public RoundedImage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        defaultImageResourceId = -1;
        context = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.RoundedImage);
        defaultImageResourceId = context.getResourceId(com.google.android.apps.walletnfcrel.R.styleable.RoundedImage_defaultImage, -1);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        int k = getMeasuredWidth();
        j = resolveSize(k, j);
        setMeasuredDimension(resolveSize(k, i), j);
    }

    public void setImage(Bitmap bitmap)
    {
        Bitmap bitmap1 = bitmap;
        if (bitmap == null)
        {
            bitmap1 = BitmapFactory.decodeResource(getResources(), defaultImageResourceId);
        }
        bitmap = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        bitmap.setCornerRadius(bitmap1.getWidth() / 2);
        bitmap.setAntiAlias(true);
        setImageDrawable(bitmap);
    }
}
