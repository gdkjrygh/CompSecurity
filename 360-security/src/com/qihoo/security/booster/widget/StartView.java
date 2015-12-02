// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.booster.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.Random;

public class StartView extends ImageView
{

    Random a;
    private Paint b;
    private Path c;

    public StartView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Random();
        c = new Path();
        a(context);
    }

    public StartView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Random();
        c = new Path();
        a(context);
    }

    private void a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setLayerType(1, null);
        }
    }

    private void a(Context context)
    {
        a();
        b = new Paint();
        b.setColor(getResources().getColor(0x7f08001f));
    }

    private int getDuration()
    {
        return (int)((0.69999999999999996D + (double)a.nextFloat() * 0.80000000000000004D) * 1000D);
    }

    private float getStarY()
    {
        return (float)(-0.29999999999999999D - (double)a.nextFloat() * 1.2D) * 700F;
    }

    private int getStartSize()
    {
        return 6;
    }

    private float getStartX()
    {
        return a.nextFloat() * (float)getWidth();
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.clipRect(0, 0, getWidth(), getHeight());
        c.reset();
        c.addCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, android.graphics.Path.Direction.CW);
        canvas.clipPath(c, android.graphics.Region.Op.REPLACE);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, b);
        super.onDraw(canvas);
        c.addCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, android.graphics.Path.Direction.CW);
        canvas.clipPath(c, android.graphics.Region.Op.XOR);
    }
}
