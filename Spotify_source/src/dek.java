// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;

public final class dek
{

    public Paint a;
    public Paint b;
    public int c;
    public int d;
    public int e;
    private final int f;
    private LinearGradient g;
    private int h;

    public dek(Context context)
    {
        c = 0;
        e = 255;
        a = new Paint(1);
        b = new Paint();
        int i = dgo.b(context, 0x7f010150);
        b.setColor(i);
        f = i;
    }

    public final void a(int i)
    {
        e = i;
        b.setAlpha(i);
    }

    public final void a(int i, int j)
    {
        h = i;
        if (c != j)
        {
            c = j;
            g = new LinearGradient(0.0F, 0.0F, 0.0F, c, 0, f, android.graphics.Shader.TileMode.CLAMP);
            a.setShader(g);
        }
    }

    public final void a(Canvas canvas)
    {
        if (g != null)
        {
            int i = canvas.save();
            canvas.drawRect(0.0F, 0.0F, h, c, b);
            canvas.drawRect(0.0F, 0.0F, h, c, a);
            canvas.restoreToCount(i);
        }
    }
}
