// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.squareup.a.bi;

// Referenced classes of package com.jcp.util:
//            ac

public class c
    implements bi
{

    public c()
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
            paint.setColor(0xff888888);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeWidth(5F);
            canvas.drawLine(10F, 90F, 90F, 2.5F, paint);
            bitmap.recycle();
            return bitmap1;
        }
    }

    public String a()
    {
        return "CircleDashAndLineTransformation()";
    }
}
