// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.android.volley.toolbox.NetworkImageView;

public class CircularNetworkImageView extends NetworkImageView
{

    Context mContext;

    public CircularNetworkImageView(Context context)
    {
        super(context);
        mContext = context;
    }

    public CircularNetworkImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        mContext = context;
    }

    public CircularNetworkImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mContext = context;
    }

    public Bitmap getCircularBitmap(Bitmap bitmap)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        int i = bitmap.getWidth();
        if (bitmap.getWidth() > bitmap.getHeight())
        {
            i = bitmap.getHeight();
        }
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, i, i);
        RectF rectf = new RectF(rect);
        float f = i / 2;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(0xff424242);
        canvas.drawRoundRect(rectf, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmap1;
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        } else
        {
            setImageDrawable(new BitmapDrawable(mContext.getResources(), getCircularBitmap(bitmap)));
            return;
        }
    }
}
