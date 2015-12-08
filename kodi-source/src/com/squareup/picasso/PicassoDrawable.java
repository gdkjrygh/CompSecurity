// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.widget.ImageView;

final class PicassoDrawable extends BitmapDrawable
{

    private static final Paint DEBUG_PAINT = new Paint();
    int alpha;
    boolean animating;
    private final boolean debugging;
    private final float density;
    private final Picasso.LoadedFrom loadedFrom;
    Drawable placeholder;
    long startTimeMillis;

    PicassoDrawable(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedfrom, boolean flag, boolean flag1)
    {
        super(context.getResources(), bitmap);
        alpha = 255;
        debugging = flag1;
        density = context.getResources().getDisplayMetrics().density;
        loadedFrom = loadedfrom;
        boolean flag2;
        if (loadedfrom != Picasso.LoadedFrom.MEMORY && !flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            placeholder = drawable;
            animating = true;
            startTimeMillis = SystemClock.uptimeMillis();
        }
    }

    private void drawDebugIndicator(Canvas canvas)
    {
        DEBUG_PAINT.setColor(-1);
        canvas.drawPath(getTrianglePath(new Point(0, 0), (int)(16F * density)), DEBUG_PAINT);
        DEBUG_PAINT.setColor(loadedFrom.debugColor);
        canvas.drawPath(getTrianglePath(new Point(0, 0), (int)(15F * density)), DEBUG_PAINT);
    }

    private static Path getTrianglePath(Point point, int i)
    {
        Point point1 = new Point(point.x + i, point.y);
        Point point2 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point1.x, point1.y);
        path.lineTo(point2.x, point2.y);
        return path;
    }

    static void setBitmap(ImageView imageview, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedfrom, boolean flag, boolean flag1)
    {
        Drawable drawable = imageview.getDrawable();
        if (drawable instanceof AnimationDrawable)
        {
            ((AnimationDrawable)drawable).stop();
        }
        imageview.setImageDrawable(new PicassoDrawable(context, bitmap, drawable, loadedfrom, flag, flag1));
    }

    static void setPlaceholder(ImageView imageview, Drawable drawable)
    {
        imageview.setImageDrawable(drawable);
        if (imageview.getDrawable() instanceof AnimationDrawable)
        {
            ((AnimationDrawable)imageview.getDrawable()).start();
        }
    }

    public void draw(Canvas canvas)
    {
        if (animating) goto _L2; else goto _L1
_L1:
        super.draw(canvas);
_L4:
        if (debugging)
        {
            drawDebugIndicator(canvas);
        }
        return;
_L2:
        float f = (float)(SystemClock.uptimeMillis() - startTimeMillis) / 200F;
        if (f >= 1.0F)
        {
            animating = false;
            placeholder = null;
            super.draw(canvas);
        } else
        {
            if (placeholder != null)
            {
                placeholder.draw(canvas);
            }
            super.setAlpha((int)((float)alpha * f));
            super.draw(canvas);
            super.setAlpha(alpha);
            if (android.os.Build.VERSION.SDK_INT <= 10)
            {
                invalidateSelf();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onBoundsChange(Rect rect)
    {
        if (placeholder != null)
        {
            placeholder.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i)
    {
        alpha = i;
        if (placeholder != null)
        {
            placeholder.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        if (placeholder != null)
        {
            placeholder.setColorFilter(colorfilter);
        }
        super.setColorFilter(colorfilter);
    }

}
