// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class dfo extends Drawable
{

    private static dfv e = new dfv() {

        public final Drawable a(Bitmap bitmap)
        {
            return new dfo(bitmap);
        }

    };
    private final Bitmap a;
    private final Paint b;
    private final BitmapShader c;
    private final Matrix d = new Matrix();

    public dfo(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            throw new NullPointerException("Bitmap cannot be null.");
        } else
        {
            a = bitmap;
            b = new Paint(1);
            b.setStyle(android.graphics.Paint.Style.FILL);
            c = new BitmapShader(a, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            b.setShader(c);
            return;
        }
    }

    public static dfv a()
    {
        return e;
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        float f = rect.exactCenterX();
        float f1 = rect.exactCenterY();
        float f2 = (float)Math.min(rect.width(), rect.height()) / 2.0F;
        d.reset();
        d.postTranslate(-f, -f1);
        c.setLocalMatrix(d);
        canvas.save();
        canvas.translate(f, f1);
        canvas.drawCircle(0.0F, 0.0F, f2, b);
        canvas.restore();
    }

    public final int getIntrinsicHeight()
    {
        return a.getHeight();
    }

    public final int getIntrinsicWidth()
    {
        return a.getWidth();
    }

    public final int getOpacity()
    {
        Paint paint = b;
        if (paint.getXfermode() == null)
        {
            int i = paint.getAlpha();
            if (i == 0)
            {
                return -2;
            }
            if (i == 255 && !a.hasAlpha())
            {
                return -1;
            }
        }
        return -3;
    }

    public final void setAlpha(int i)
    {
        b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        throw new UnsupportedOperationException("Custom ColorFilters not supported");
    }

}
