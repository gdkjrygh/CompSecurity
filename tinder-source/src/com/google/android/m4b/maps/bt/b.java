// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            k

final class b
{

    Bitmap a;
    k b;
    private final View c;

    b(View view)
    {
        c = view;
    }

    final void a(Bitmap bitmap, k k)
    {
        a = bitmap;
        b = k;
        c.invalidate();
    }

    final void a(Canvas canvas)
    {
        Paint paint = new Paint();
        int k = c.getResources().getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_lite_mode_grid_spacing);
        int l = canvas.getWidth();
        int i1 = canvas.getHeight();
        paint.setARGB(50, 128, 128, 128);
        int j = k / 2;
        int i = 0;
        while (j < l) 
        {
            float f;
            if ((i + 7) % 8 == 0)
            {
                f = 2.0F;
            } else
            {
                f = 1.0F;
            }
            paint.setStrokeWidth(f);
            canvas.drawLine(j, 0.0F, j, i1, paint);
            j += k;
            i++;
        }
        j = k / 2;
        i = 0;
        while (j < i1) 
        {
            float f1;
            if ((i + 7) % 8 == 0)
            {
                f1 = 2.0F;
            } else
            {
                f1 = 1.0F;
            }
            paint.setStrokeWidth(f1);
            canvas.drawLine(0.0F, j, l, j, paint);
            j += k;
            i++;
        }
    }
}
