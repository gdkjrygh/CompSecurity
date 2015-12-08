// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment

private static final class paint extends View
{

    private Paint paint;
    private PointF touchPoint;

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (touchPoint != null)
        {
            canvas.drawCircle(touchPoint.x, touchPoint.y, 48F, paint);
        }
    }

    public final void setColor(int i)
    {
        paint.setColor(i);
    }

    public final void setTouchPoint(PointF pointf)
    {
        touchPoint = pointf;
    }

    public (Context context)
    {
        super(context);
        paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(android.graphics.agment.a.paint);
        paint.setStrokeWidth(4F);
        paint.setAlpha(128);
        paint.setAntiAlias(true);
    }
}
