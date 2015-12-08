// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.widget.ImageView;

final class gdx extends Drawable
{

    private static final Paint a = new Paint();
    private Drawable b;
    private final Drawable c;
    private long d;
    private boolean e;
    private int f;
    private final boolean g;
    private final float h;
    private final com.squareup.picasso.Picasso.LoadedFrom i;

    private gdx(Context context, Drawable drawable, Drawable drawable1, com.squareup.picasso.Picasso.LoadedFrom loadedfrom, boolean flag)
    {
        f = 255;
        c = drawable;
        g = flag;
        h = context.getResources().getDisplayMetrics().density;
        i = loadedfrom;
        boolean flag1;
        if (loadedfrom != com.squareup.picasso.Picasso.LoadedFrom.a)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            b = drawable1;
            e = true;
            d = SystemClock.uptimeMillis();
        }
    }

    private static Path a(Point point, int j)
    {
        Point point1 = new Point(point.x + j, point.y);
        Point point2 = new Point(point.x, point.y + j);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point1.x, point1.y);
        path.lineTo(point2.x, point2.y);
        return path;
    }

    static void a(ImageView imageview, Drawable drawable)
    {
        imageview.setImageDrawable(drawable);
        if (imageview.getDrawable() instanceof AnimationDrawable)
        {
            ((AnimationDrawable)imageview.getDrawable()).start();
        }
    }

    static void a(ImageView imageview, Drawable drawable, com.squareup.picasso.Picasso.LoadedFrom loadedfrom, boolean flag)
    {
        Drawable drawable1 = imageview.getDrawable();
        if (drawable1 instanceof AnimationDrawable)
        {
            ((AnimationDrawable)drawable1).stop();
        }
        imageview.setImageDrawable(new gdx(imageview.getContext(), drawable, drawable1, loadedfrom, flag));
    }

    public final void draw(Canvas canvas)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.squareup.picasso.Picasso.LoadedFrom.values().length];
                try
                {
                    a[com.squareup.picasso.Picasso.LoadedFrom.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.squareup.picasso.Picasso.LoadedFrom.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.squareup.picasso.Picasso.LoadedFrom.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Paint paint;
        if (!e)
        {
            c.draw(canvas);
        } else
        {
            float f1 = (float)(SystemClock.uptimeMillis() - d) / 200F;
            if (f1 >= 1.0F)
            {
                e = false;
                b = null;
                c.draw(canvas);
            } else
            {
                if (b != null)
                {
                    if (getBounds() != b.getBounds())
                    {
                        b.setBounds(getBounds());
                    }
                    b.draw(canvas);
                }
                int j = (int)(f1 * (float)f);
                c.setAlpha(j);
                c.draw(canvas);
                c.setAlpha(f);
                invalidateSelf();
            }
        }
        if (!g) goto _L2; else goto _L1
_L1:
        a.setColor(-1);
        canvas.drawPath(a(new Point(0, 0), (int)(16F * h)), a);
        paint = a;
        _cls1.a[i.ordinal()];
        JVM INSTR tableswitch 1 3: default 96
    //                   1 231
    //                   2 270
    //                   3 277;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new IllegalStateException("Unknown LoadedFrom type.");
_L4:
        int k = -256;
_L8:
        paint.setColor(k);
        canvas.drawPath(a(new Point(0, 0), (int)(15F * h)), a);
_L2:
        return;
_L5:
        k = 0xffff0000;
        continue; /* Loop/switch isn't completed */
_L6:
        k = 0xff00ff00;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final int getIntrinsicHeight()
    {
        return c.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth()
    {
        return c.getIntrinsicWidth();
    }

    public final int getOpacity()
    {
        return c.getOpacity();
    }

    public final int[] getState()
    {
        return c.getState();
    }

    public final boolean isStateful()
    {
        return c.isStateful();
    }

    protected final void onBoundsChange(Rect rect)
    {
        if (b != null)
        {
            b.setBounds(rect);
        }
        c.setBounds(rect);
        super.onBoundsChange(rect);
    }

    protected final boolean onStateChange(int ai[])
    {
        return c.setState(ai);
    }

    public final void setAlpha(int j)
    {
        f = j;
        if (b != null)
        {
            b.setAlpha(j);
        }
        c.setAlpha(j);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        if (b != null)
        {
            b.setColorFilter(colorfilter);
        }
        c.setColorFilter(colorfilter);
    }

    public final boolean setState(int ai[])
    {
        return c.setState(ai);
    }

}
