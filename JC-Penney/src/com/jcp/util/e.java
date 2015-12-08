// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.squareup.a.bi;

// Referenced classes of package com.jcp.util:
//            ac

public class e
    implements bi
{

    public e()
    {
    }

    public Bitmap a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            Bitmap bitmap1 = ac.a(bitmap.copy(bitmap.getConfig(), true));
            Canvas canvas = new Canvas(bitmap1);
            Paint paint = new Paint();
            paint.setColor(0xff000000);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            paint.setPathEffect(new DashPathEffect(new float[] {
                0.0F, 0.0F
            }, 2.0F));
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeWidth(5F);
            canvas.drawCircle((float)(bitmap1.getWidth() / 2) + 0.2F, (float)(bitmap1.getHeight() / 2) + 0.2F, 45F, paint);
            bitmap.recycle();
            return bitmap1;
        }
    }

    public String a()
    {
        return "CircleLineTransformation()";
    }
}
