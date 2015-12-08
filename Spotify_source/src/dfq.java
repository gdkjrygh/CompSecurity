// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class dfq extends Drawable
{

    private static dfv f = new dfv() {

        public final Drawable a(Bitmap bitmap)
        {
            return new dfq(bitmap);
        }

    };
    private final Bitmap a;
    private final Paint b;
    private final BitmapShader c;
    private final ColorFilter d;
    private final Matrix e = new Matrix();

    public dfq(Bitmap bitmap)
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
            d = new PorterDuffColorFilter(0xcc000000, android.graphics.PorterDuff.Mode.SRC_ATOP);
            return;
        }
    }

    public static dfv a()
    {
        return f;
    }

    private int b()
    {
        return Math.min(a.getWidth(), a.getHeight());
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        float f1 = rect.exactCenterX();
        float f2 = rect.exactCenterY();
        int i = Math.min(rect.width(), rect.height());
        float f3 = (float)i / 2.0F;
        e.reset();
        e.postTranslate(-f1, -f2);
        c.setLocalMatrix(e);
        canvas.save();
        b.setShader(null);
        b.setColorFilter(d);
        canvas.clipRect(0, 0, i, i);
        canvas.translate(f1, f2);
        canvas.scale(1.3F, 1.3F);
        canvas.translate((float)(-a.getWidth()) / 2.0F, (float)(-a.getHeight()) / 2.0F);
        canvas.drawBitmap(a, 0.0F, 0.0F, b);
        canvas.restore();
        canvas.save();
        b.setShader(c);
        b.setColorFilter(null);
        canvas.translate(f1, f2);
        canvas.scale(0.9F, 0.9F);
        canvas.drawCircle(0.0F, 0.0F, f3, b);
        canvas.restore();
    }

    public final int getIntrinsicHeight()
    {
        return b();
    }

    public final int getIntrinsicWidth()
    {
        return b();
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
