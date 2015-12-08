// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class dbp extends Drawable
{

    public orr a;
    public float b;
    public float c;
    private final Paint d = new Paint();

    public dbp(Context context)
    {
        context = context.getResources();
        d.setColor(context.getColor(b.dq));
    }

    public final void draw(Canvas canvas)
    {
        if (a == null)
        {
            return;
        } else
        {
            Rect rect = getBounds();
            canvas.drawRect(rect.left, rect.top, b, rect.bottom, d);
            canvas.drawRect(c, rect.top, rect.right, rect.bottom, d);
            return;
        }
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
}
