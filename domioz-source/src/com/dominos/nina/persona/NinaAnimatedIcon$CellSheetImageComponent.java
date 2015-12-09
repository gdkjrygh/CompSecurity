// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

// Referenced classes of package com.dominos.nina.persona:
//            RenderState

class dest extends dest
{

    final p bitmapAgent;
    final RectF dest;
    final int index;
    final Paint paint = new Paint();
    final Rect src = new Rect(0, 0, 0, 0);

    void draw(Canvas canvas, RenderState renderstate)
    {
        renderstate = bitmapAgent.bitmapAgent(index);
        canvas.save();
        src.right = renderstate.getWidth();
        src.bottom = renderstate.getHeight();
        canvas.drawBitmap(renderstate, src, dest, paint);
        canvas.restore();
        bitmapAgent.p(renderstate);
    }

    ( , int i, int j, float f, float f1, int k)
    {
        super(null, f, f1, 0.0F, 0.0F);
        bitmapAgent = ;
        index = k;
        dest = new RectF(f, f1, i, j);
    }
}
