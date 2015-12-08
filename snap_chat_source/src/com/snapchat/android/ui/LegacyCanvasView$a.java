// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

// Referenced classes of package com.snapchat.android.ui:
//            LegacyCanvasView

public final class a
{

    public Paint a;
    Path b;
    private float c;

    public final void a(float f, float f1)
    {
        b.lineTo(f, f1);
    }

    public final void a(Canvas canvas)
    {
        canvas.drawPath(b, a);
    }

    public (int i, float f)
    {
        c = f;
        b = new Path();
        a = new Paint();
        a.setColor(i);
        a.setAntiAlias(true);
        a.setStyle(android.graphics.View.a.a);
        a.setStrokeWidth(c * 6.5F);
        a.setStrokeJoin(android.graphics.);
        a.setStrokeCap(android.graphics.View.a.a);
    }
}
