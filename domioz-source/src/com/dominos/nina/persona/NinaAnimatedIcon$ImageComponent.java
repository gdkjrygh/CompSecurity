// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;

// Referenced classes of package com.dominos.nina.persona:
//            RenderState

class centerY
{

    final Bitmap bitmap;
    final float centerX;
    final float centerY;
    final float left;
    final Paint paint = new Paint();
    final float top;

    void draw(Canvas canvas, RenderState renderstate)
    {
        canvas.save();
        canvas.translate(renderstate.translateX, renderstate.translateY);
        canvas.rotate(renderstate.rotation, centerX, centerY);
        canvas.scale(renderstate.scaleX, renderstate.scaleY, centerX, centerY);
        paint.setColorFilter(new PorterDuffColorFilter(renderstate.color, android.graphics.mponent.paint));
        canvas.drawBitmap(bitmap, left, top, paint);
        canvas.restore();
    }

    (Bitmap bitmap1, float f, float f1, float f2, float f3)
    {
        bitmap = bitmap1;
        left = f;
        top = f1;
        centerX = f2;
        centerY = f3;
    }
}
