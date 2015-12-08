// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

// Referenced classes of package com.millennialmedia.android:
//            AdViewOverlayView

private static class paint extends paint
{

    final float dist;
    final float scale;

    public void draw(Canvas canvas)
    {
        Rect rect = copyBounds();
        float f = (float)(rect.right - rect.left) / 10F;
        float f1 = (float)rect.right - scale * 20F;
        float f2 = (float)rect.top + scale * 20F;
        paint.setStrokeWidth(f);
        paint.setColor(0xff000000);
        paint.setStyle(android.graphics.opDrawable.paint);
        canvas.drawCircle(f1, f2, 12F * scale, paint);
        paint.setColor(-1);
        paint.setStyle(android.graphics.opDrawable.paint);
        canvas.drawCircle(f1, f2, scale * 10F, paint);
        paint.setColor(0xff000000);
        canvas.drawCircle(f1, f2, 7F * scale, paint);
        paint.setColor(-1);
        paint.setStrokeWidth(f / 2.0F);
        paint.setStyle(android.graphics.opDrawable.paint);
        canvas.drawLine(f1 - dist, f2 - dist, f1 + dist, f2 + dist, paint);
        canvas.drawLine(f1 + dist, f2 - dist, f1 - dist, f2 + dist, paint);
    }

    (boolean flag, float f)
    {
        super(flag);
        scale = f;
        dist = 4F * f;
        paint.setColor(0xff000000);
    }
}
