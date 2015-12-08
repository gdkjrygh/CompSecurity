// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.fitbit.food.barcode.a.d;
import com.fitbit.util.b.a;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity, BarcodeCrosshairView

class a
    implements android.view.LayoutListener
{

    final BarcodeScannerActivity a;

    public void onGlobalLayout()
    {
        Rect rect;
        Point point;
        int i;
        int j;
        if (com.fitbit.util.b.a.a(16))
        {
            a.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else
        {
            a.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        rect = new Rect();
        a.b.getGlobalVisibleRect(rect);
        point = new Point(rect.left, rect.top);
        i = rect.width();
        j = rect.height();
        com.fitbit.food.barcode.ui.BarcodeScannerActivity.d(a).a(point, i, j);
    }

    (BarcodeScannerActivity barcodescanneractivity)
    {
        a = barcodescanneractivity;
        super();
    }
}
