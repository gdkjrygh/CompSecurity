// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class KikCodeBackgroundImageView extends View
{

    float a;
    private Paint b;

    public KikCodeBackgroundImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Paint(1);
        b.setAntiAlias(true);
        b.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i = getWidth();
        int j = getHeight();
        float f = (float)i / 2.0F;
        float f1 = (float)j / 2.0F;
        float f2;
        if (i >= j)
        {
            i = j;
        }
        a = (float)i / 2.0F;
        b.setARGB(255, 255, 255, 255);
        canvas.drawCircle(f, f1, a, b);
        f2 = (float)((double)a * 0.93000000000000005D);
        b.setARGB(255, 46, 45, 48);
        canvas.drawCircle(f, f1, f2, b);
    }
}
