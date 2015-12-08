// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.View;

public class AmbilWarnaPrefWidgetView extends View
{

    Paint paint;
    float rectSize;
    float strokeWidth;

    public AmbilWarnaPrefWidgetView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        float f = context.getResources().getDisplayMetrics().density;
        rectSize = FloatMath.floor(24F * f + 0.5F);
        strokeWidth = FloatMath.floor(1.0F * f + 0.5F);
        paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(strokeWidth);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawRect(strokeWidth, strokeWidth, rectSize - strokeWidth, rectSize - strokeWidth, paint);
    }
}
