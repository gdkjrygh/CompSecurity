// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import com.squareup.picasso.z;

public class DarkenTransformation
    implements z
{

    private final Paint mPaint = new Paint();

    public DarkenTransformation(Context context)
    {
        context = new PorterDuffColorFilter(context.getResources().getColor(0x7f0d0109), android.graphics.PorterDuff.Mode.SRC_OVER);
        mPaint.setColorFilter(context);
    }

    public String key()
    {
        return "darken-transformation";
    }

    public Bitmap transform(Bitmap bitmap)
    {
        (new Canvas(bitmap)).drawBitmap(bitmap, 0.0F, 0.0F, mPaint);
        return bitmap;
    }
}
