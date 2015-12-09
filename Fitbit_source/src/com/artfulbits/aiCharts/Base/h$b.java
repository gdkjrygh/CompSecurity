// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.artfulbits.aiCharts.a.d;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            h

static final class c extends c
{

    private final d c;
    private final Rect d = new Rect();

    protected final void a(Canvas canvas, Rect rect)
    {
        (new Paint()).setAntiAlias(true);
        c.k().setBounds(rect);
        c.k().draw(canvas);
        canvas.drawText(c.j(), rect.centerX(), rect.centerY() + d.height() / 2, c.f());
    }

    protected final void a(Point point)
    {
        String s1 = c.j();
        String s = s1;
        if (s1.length() > 3)
        {
            s = s1.substring(0, 3);
        }
        c.f().getTextBounds(s, 0, s.length(), d);
        int i = Math.max(d.height(), d.width()) + 5;
        point.set(i, i);
    }

    public e(d d1)
    {
        c = d1;
    }
}
