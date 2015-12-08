// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.pinterest.base.Colors;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinCellDrawable

public class PinDividerDrawable extends PinCellDrawable
{

    private final Paint dividerPaint = new Paint(1);

    public PinDividerDrawable()
    {
        dividerPaint.setColor(Colors.LIGHT_GRAY);
        dividerPaint.setAntiAlias(true);
        dividerPaint.setStyle(android.graphics.Paint.Style.FILL);
        setHeight(DIVIDER_HEIGHT);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawRect(1.0F, y, width - 1, y + DIVIDER_HEIGHT, dividerPaint);
    }

    public void measure()
    {
        setHeight(padding.top + DIVIDER_HEIGHT + padding.bottom);
    }
}
