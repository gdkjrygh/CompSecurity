// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.a.c;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            h

static final class c extends c
{

    private final c c;

    protected final void a(Canvas canvas, Rect rect)
    {
        c.f().setBounds(rect);
        c.f().draw(canvas);
    }

    protected final void a(Point point)
    {
        point.set(20, 20);
    }

    public e(c c1)
    {
        c = c1;
    }
}
