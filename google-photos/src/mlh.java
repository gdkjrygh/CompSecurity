// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public final class mlh extends View
{

    private Path a;
    private Paint b;

    public mlh(Context context)
    {
        super(context);
        a = new Path();
        b = new Paint(1);
    }

    public final boolean hasOverlappingRendering()
    {
        return false;
    }

    public final void onDraw(Canvas canvas)
    {
        canvas.drawPath(a, b);
    }

    public final void onSizeChanged(int i, int j, int k, int l)
    {
        a.reset();
        a.addOval(new RectF(0.0F, 0.0F, i, j), android.graphics.Path.Direction.CW);
    }

    public final void setBackgroundColor(int i)
    {
        b.setColor(i);
    }
}
