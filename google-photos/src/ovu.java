// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class ovu extends Drawable
{

    private final ovw a = new ovw(this);
    private final Drawable b;
    private final float c;
    private final ovv d = new ovv(this);
    private final ovv e = new ovv(this);

    public ovu(Context context, int i, float f)
    {
        b = ed.a(context, i);
        c = f / 2.0F;
    }

    static ovw a(ovu ovu1)
    {
        return ovu1.a;
    }

    public final void a(float f, boolean flag)
    {
        if (flag)
        {
            d.a(f);
            return;
        } else
        {
            e.a(f);
            return;
        }
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        float f = (float)rect.centerX() - c;
        canvas.save();
        canvas.clipRect(rect.left, rect.top, f, rect.bottom);
        canvas.scale(d.a(), 1.0F, f, 0.0F);
        b.draw(canvas);
        canvas.restore();
        float f1 = (float)rect.centerX() + c;
        canvas.save();
        canvas.clipRect(f1, rect.top, rect.right, rect.bottom);
        canvas.scale(e.a(), 1.0F, f1, 0.0F);
        b.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(f, rect.top, f1, rect.bottom);
        b.draw(canvas);
        canvas.restore();
    }

    public final int getIntrinsicHeight()
    {
        return b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth()
    {
        return b.getIntrinsicWidth();
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void setAlpha(int i)
    {
        b.setAlpha(i);
    }

    public final void setBounds(int i, int j, int k, int l)
    {
        super.setBounds(i, j, k, l);
        b.setBounds(i, j, k, l);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
