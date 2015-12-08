// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class afq extends Drawable
{

    float a;
    float b;
    boolean c;
    boolean d;
    private final Paint e = new Paint(5);
    private final RectF f = new RectF();
    private final Rect g = new Rect();

    public afq(int i, float f1)
    {
        c = false;
        d = true;
        a = f1;
        e.setColor(i);
    }

    void a(Rect rect)
    {
        Rect rect1 = rect;
        if (rect == null)
        {
            rect1 = getBounds();
        }
        f.set(rect1.left, rect1.top, rect1.right, rect1.bottom);
        g.set(rect1);
        if (c)
        {
            float f1 = afr.a(b, a, d);
            float f2 = afr.b(b, a, d);
            g.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
            f.set(g);
        }
    }

    public final void draw(Canvas canvas)
    {
        canvas.drawRoundRect(f, a, a, e);
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void getOutline(Outline outline)
    {
        outline.setRoundRect(g, a);
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a(rect);
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
