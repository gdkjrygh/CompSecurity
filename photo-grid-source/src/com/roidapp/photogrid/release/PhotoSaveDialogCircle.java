// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class PhotoSaveDialogCircle extends View
{

    private float a;
    private float b;
    private int c;

    public PhotoSaveDialogCircle(Context context, float f, float f1)
    {
        super(context);
        a = f;
        b = f1;
    }

    public PhotoSaveDialogCircle(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final void a(int i)
    {
        c = i;
    }

    public void draw(Canvas canvas)
    {
        Paint paint = new Paint(1);
        Paint paint1 = new Paint(1);
        int i = Math.round((a / b) * 360F);
        paint1.setColor(Color.rgb(181, 181, 181));
        if (i <= 90)
        {
            paint.setColor(Color.rgb(255, 83, 83));
        } else
        {
            paint.setColor(Color.rgb(217, 217, 217));
        }
        canvas.drawArc(new RectF(0.0F, 0.0F, c, c), 270F, -i, true, paint);
        canvas.drawArc(new RectF(0.0F, 0.0F, c, c), 270F, 360 - i, true, paint1);
        super.draw(canvas);
    }
}
