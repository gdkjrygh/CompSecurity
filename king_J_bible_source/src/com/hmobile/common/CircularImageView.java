// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircularImageView extends ImageView
{

    public CircularImageView(Context context)
    {
        super(context);
    }

    public CircularImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CircularImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static Bitmap getCroppedBitmap(Bitmap bitmap, int i)
    {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i)
        {
            bitmap = Bitmap.createScaledBitmap(bitmap, i, i, false);
        }
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setColor(Color.parseColor("#BAB399"));
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2 - 3, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmap1;
    }

    protected void onDraw(Canvas canvas)
    {
        Object obj;
        for (obj = getDrawable(); obj == null || getWidth() == 0 || getHeight() == 0;)
        {
            return;
        }

        obj = ((BitmapDrawable)obj).getBitmap().copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        ((Bitmap) (obj)).getWidth();
        obj = getCroppedBitmap(((Bitmap) (obj)), getWidth());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setColor(Color.parseColor("#ffffff"));
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, getWidth() / 2, paint);
        canvas.drawBitmap(((Bitmap) (obj)), 0.0F, 0.0F, null);
    }
}
