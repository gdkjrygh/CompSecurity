// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.jcp.productentity.OptionValueEntity;
import com.squareup.a.bi;

// Referenced classes of package com.jcp.util:
//            e, d, c, f

public final class ac
{

    public static Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(100, 100, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, 100, 100);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(Color.parseColor("#5C5858"));
        canvas.drawCircle(50.7F, 50.7F, 38F, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmap1;
    }

    public static bi a(OptionValueEntity optionvalueentity)
    {
        boolean flag = optionvalueentity.getSelected().booleanValue();
        boolean flag1 = optionvalueentity.getAvailable().booleanValue();
        if (flag && flag1)
        {
            return new e();
        }
        if (!flag1 && flag)
        {
            return new d();
        }
        if (!flag1 && !flag)
        {
            return new c();
        } else
        {
            return new f();
        }
    }
}
