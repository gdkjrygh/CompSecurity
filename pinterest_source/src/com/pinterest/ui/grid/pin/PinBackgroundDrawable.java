// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.pinterest.base.Colors;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinCellDrawable

public class PinBackgroundDrawable extends PinCellDrawable
{

    public PinBackgroundDrawable()
    {
        backgroundPaint.setColor(Colors.WHITE);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRect(x, y, x + width, y + height, backgroundPaint);
    }

    public void measure()
    {
    }
}
