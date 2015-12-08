// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.graphics.Canvas;
import android.graphics.Paint;

public final class a
{

    public final Paint a;
    public final float b;
    private float c[];
    private float d[];
    private final Paint e;

    public a(float f)
    {
        this(f, (byte)0);
    }

    private a(float f, byte byte0)
    {
        a = new Paint();
        a.setTextSize(f);
        a.setColor(-1);
        a.setStyle(android.graphics.Paint.Style.FILL);
        a.setAntiAlias(false);
        a.setAlpha(255);
        e = new Paint();
        e.setTextSize(f);
        e.setColor(0xff000000);
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setAntiAlias(false);
        e.setAlpha(255);
        e.setFakeBoldText(true);
        b = f;
    }

    public final void a(Canvas canvas, float f, float f1, String s)
    {
        if (c == null || c.length < s.length())
        {
            c = new float[s.length()];
            d = new float[s.length() << 1];
        }
        e.getTextWidths(s, c);
        for (int i = 0; i < c.length; i++)
        {
            d[i << 1] = f;
            d[(i << 1) + 1] = f1;
            f += c[i];
        }

        canvas.drawPosText(s, d, e);
        canvas.drawPosText(s, d, a);
    }
}
