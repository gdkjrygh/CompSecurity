// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.squareup.picasso.x;
import com.tinder.utils.k;
import com.tinder.utils.o;
import com.tinder.utils.v;

public class RecImageView extends ImageView
    implements x
{

    private boolean mHasRadiusBeenSet;
    private int mRadius;
    private Path mRoundingPath;

    public RecImageView(Context context)
    {
        super(context);
    }

    public RecImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(attributeset);
    }

    private void clipPath(Canvas canvas)
    {
        if (!o.f())
        {
            return;
        }
        try
        {
            configureRounding();
            canvas.clipPath(mRoundingPath);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            v.b("Device does not support clipPath()");
        }
        o.g();
    }

    private void configureRounding()
    {
        int i = getWidth();
        int j = getHeight();
        if (i > 0 && j > 0 && !mHasRadiusBeenSet)
        {
            mHasRadiusBeenSet = true;
            mRoundingPath = new Path();
            RectF rectf = new RectF(0.0F, 0.0F, i, j);
            mRadius = 18;
            float f = mRadius;
            float f1 = mRadius;
            float f2 = mRadius;
            float f3 = mRadius;
            Path path = mRoundingPath;
            android.graphics.Path.Direction direction = android.graphics.Path.Direction.CCW;
            path.addRoundRect(rectf, new float[] {
                f, f1, f2, f3, 0.0F, 0.0F, 0.0F, 0.0F
            }, direction);
        }
    }

    private void init(AttributeSet attributeset)
    {
        if (k.a() < 18 && k.a() > 10)
        {
            setLayerType(1, new Paint(1));
        }
        attributeset = getContext().obtainStyledAttributes(attributeset, com.tinder.a.a.RecImageView, 0, 0);
        mRadius = attributeset.getDimensionPixelSize(0, 0);
        attributeset.recycle();
        setWillNotDraw(false);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        clipPath(canvas);
        super.dispatchDraw(canvas);
    }

    public void draw(Canvas canvas)
    {
        clipPath(canvas);
        super.draw(canvas);
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        setImageBitmap(bitmap);
    }

    public void onPrepareLoad(Drawable drawable)
    {
        setImageDrawable(drawable);
    }
}
