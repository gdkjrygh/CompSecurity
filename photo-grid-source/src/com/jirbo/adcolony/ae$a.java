// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.jirbo.adcolony:
//            ae, ADCImage

class nit> extends View
{

    Rect a;
    final ae b;

    public void onDraw(Canvas canvas)
    {
        canvas.drawARGB(255, 0, 0, 0);
        getDrawingRect(a);
        b.as.a(canvas, (a.width() - b.as.f) / 2, (a.height() - b.as.g) / 2);
        invalidate();
    }

    public age(ae ae1, Activity activity)
    {
        b = ae1;
        super(activity);
        a = new Rect();
    }
}
