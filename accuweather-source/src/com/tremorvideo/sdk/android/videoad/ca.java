// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bz

class ca extends BitmapDrawable
{

    Bitmap a;
    final bz b;

    public ca(bz bz1, Bitmap bitmap)
    {
        b = bz1;
        super(bitmap);
        a = bitmap;
    }

    public void draw(Canvas canvas)
    {
        if (!b.f)
        {
            super.draw(canvas);
            return;
        } else
        {
            Matrix matrix = new Matrix();
            matrix.postScale(1.0F, -1F);
            matrix.postTranslate(0.0F, a.getHeight());
            canvas.drawBitmap(a, matrix, null);
            return;
        }
    }

    public int getIntrinsicHeight()
    {
        return a.getHeight();
    }

    public int getIntrinsicWidth()
    {
        return a.getWidth();
    }
}
