// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

final class gvw extends BitmapDrawable
{

    private static final Paint a = new Paint();
    private final boolean b;
    private final float c;
    private final com.squareup.picasso.Picasso.LoadedFrom d;
    private Drawable e;
    private long f;
    private boolean g;
    private int h;

    private gvw(Context context, Bitmap bitmap, Drawable drawable, com.squareup.picasso.Picasso.LoadedFrom loadedfrom, boolean flag, boolean flag1)
    {
        super(context.getResources(), bitmap);
        h = 255;
        b = flag1;
        c = context.getResources().getDisplayMetrics().density;
        d = loadedfrom;
        boolean flag2;
        if (loadedfrom != com.squareup.picasso.Picasso.LoadedFrom.a && !flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            e = drawable;
            g = true;
            f = SystemClock.uptimeMillis();
        }
    }

    private static Path a(Point point, int i)
    {
        Point point1 = new Point(point.x + i, point.y);
        Point point2 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point1.x, point1.y);
        path.lineTo(point2.x, point2.y);
        return path;
    }

    static void a(ImageView imageview, Context context, Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom, boolean flag, boolean flag1)
    {
        Drawable drawable = imageview.getDrawable();
        if (drawable instanceof AnimationDrawable)
        {
            ((AnimationDrawable)drawable).stop();
        }
        imageview.setImageDrawable(new gvw(context, bitmap, drawable, loadedfrom, flag, flag1));
    }

    static void a(ImageView imageview, Drawable drawable)
    {
        imageview.setImageDrawable(drawable);
        if (imageview.getDrawable() instanceof AnimationDrawable)
        {
            ((AnimationDrawable)imageview.getDrawable()).start();
        }
    }

    public final void draw(Canvas canvas)
    {
        if (g) goto _L2; else goto _L1
_L1:
        super.draw(canvas);
_L4:
        if (b)
        {
            a.setColor(-1);
            canvas.drawPath(a(new Point(0, 0), (int)(16F * c)), a);
            a.setColor(d.debugColor);
            canvas.drawPath(a(new Point(0, 0), (int)(15F * c)), a);
        }
        return;
_L2:
        float f1 = (float)(SystemClock.uptimeMillis() - f) / 200F;
        if (f1 >= 1.0F)
        {
            g = false;
            e = null;
            super.draw(canvas);
        } else
        {
            if (e != null)
            {
                e.draw(canvas);
            }
            super.setAlpha((int)(f1 * (float)h));
            super.draw(canvas);
            super.setAlpha(h);
            if (android.os.Build.VERSION.SDK_INT <= 10)
            {
                invalidateSelf();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void onBoundsChange(Rect rect)
    {
        if (e != null)
        {
            e.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i)
    {
        h = i;
        if (e != null)
        {
            e.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        if (e != null)
        {
            e.setColorFilter(colorfilter);
        }
        super.setColorFilter(colorfilter);
    }

}
