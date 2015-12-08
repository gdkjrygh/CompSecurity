// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class dfx extends Drawable
{

    private static PorterDuffXfermode a;
    private final Bitmap b;
    private final Paint c = new Paint(1);
    private Rect d;

    public dfx(int i, int j)
    {
        d = new Rect();
        d = new Rect(0, 0, i, i);
        b = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        c.setColor(j);
        Canvas canvas = new Canvas(b);
        canvas.drawColor(j);
        c.setColor(0);
        c.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        i = b.getWidth();
        j = b.getHeight();
        canvas.drawCircle(i, j, i, c);
    }

    public final void draw(Canvas canvas)
    {
        c.setColor(-1);
        c.setXfermode(a);
        canvas.drawBitmap(b, null, d, c);
        canvas.save();
        canvas.translate(canvas.getWidth(), 0.0F);
        canvas.scale(-1F, 1.0F);
        canvas.drawBitmap(b, null, d, c);
        canvas.restore();
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }

    static 
    {
        a = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_OVER);
    }
}
