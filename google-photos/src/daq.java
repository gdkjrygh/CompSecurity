// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;

public final class daq extends android.view.View.DragShadowBuilder
{

    private final Bitmap a;
    private final int b;
    private final Paint c = new Paint();

    public daq(View view)
    {
        super(view);
        Object obj = (dbq)view.findViewById(b.hn);
        Bitmap bitmap;
        if (((dbq) (obj)).g != null)
        {
            ((dbq) (obj)).g.a();
            obj = ((dbq) (obj)).g;
        } else
        if (((dbq) (obj)).h != null)
        {
            ((dbq) (obj)).h.a();
            obj = ((dbq) (obj)).h;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            bitmap = ((csb) (obj)).d();
            int i = Math.round((float)view.getWidth() * 0.8F);
            int j = Math.round((((float)bitmap.getHeight() * (float)view.getWidth()) / (float)bitmap.getWidth()) * 0.8F);
            if (i > 0 && j > 0)
            {
                bitmap = b.a(bitmap, i, j);
            } else
            {
                bitmap = null;
            }
            ((csb) (obj)).b();
        } else
        {
            bitmap = null;
        }
        a = bitmap;
        b = view.getResources().getDimensionPixelSize(b.dH);
    }

    public final void onDrawShadow(Canvas canvas)
    {
        if (a != null)
        {
            canvas.drawBitmap(a, b, b, c);
        }
    }

    public final void onProvideShadowMetrics(Point point, Point point1)
    {
        if (a != null)
        {
            int i = b << 1;
            point.set(a.getWidth() + i, i + a.getHeight());
            point1.set(a.getWidth() / 2, a.getHeight() / 2);
        }
    }
}
