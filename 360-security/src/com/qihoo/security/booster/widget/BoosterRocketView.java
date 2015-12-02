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

public class BoosterRocketView extends ImageView
{

    private Paint a;
    private final Path b;

    public BoosterRocketView(Context context)
    {
        super(context);
        b = new Path();
        a(context);
    }

    public BoosterRocketView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Path();
        a(context);
    }

    public BoosterRocketView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new Path();
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
        a = new Paint();
        a.setColor(getResources().getColor(0x7f080056));
        a.setAntiAlias(true);
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.clipRect(0, 0, getWidth(), getHeight());
        b.reset();
        b.addCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2 + 1, android.graphics.Path.Direction.CW);
        canvas.clipPath(b, android.graphics.Region.Op.REPLACE);
        super.onDraw(canvas);
    }
}
