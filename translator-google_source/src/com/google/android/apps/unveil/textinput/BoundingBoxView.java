// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.b;
import com.google.android.apps.unveil.env.p;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            ah, aa

public class BoundingBoxView extends View
{

    private static final int a = Color.argb(75, 0, 160, 210);
    private static final int b = Color.argb(40, 255, 255, 255);
    private Size c;
    private final Paint d = new Paint();
    private aa e;
    private final float f;
    private RectF g;

    public BoundingBoxView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = new RectF();
        d.setStyle(android.graphics.Paint.Style.FILL);
        f = p.a(5F, context);
    }

    private void a(Canvas canvas, List list, boolean flag)
    {
        Paint paint = d;
        int i;
        if (flag)
        {
            i = a;
        } else
        {
            i = b;
        }
        paint.setColor(i);
        for (list = list.iterator(); list.hasNext(); canvas.drawRoundRect(g, f, f, d))
        {
            com.google.bionics.goggles.api2.GogglesCommonProtos.BoundingBox boundingbox = ((ah)list.next()).a;
            RectF rectf = g;
            float f1 = boundingbox.getX();
            float f2 = boundingbox.getY();
            float f3 = boundingbox.getX() + boundingbox.getWidth();
            i = boundingbox.getY();
            rectf.set(f1, f2, f3, boundingbox.getHeight() + i);
        }

    }

    public void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        aa aa1 = e;
        if (aa1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        canvas.scale((float)getWidth() / (float)c.width, (float)getHeight() / (float)c.height);
        a(canvas, e.b, true);
        a(canvas, e.c, false);
        if (true) goto _L1; else goto _L3
_L3:
        canvas;
        throw canvas;
    }

    public void setQueryPictureSize(Size size)
    {
        com.google.android.apps.unveil.env.b.a(size);
        c = size;
        postInvalidate();
    }

    public void setTextMasker(aa aa1)
    {
        com.google.android.apps.unveil.env.b.a(aa1);
        e = aa1;
        invalidate();
    }

}
