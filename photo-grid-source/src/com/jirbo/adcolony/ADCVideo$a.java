// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.jirbo.adcolony:
//            ADCVideo, ADCImage

class a extends View
{

    Rect a;
    final ADCVideo b;

    public void onDraw(Canvas canvas)
    {
        canvas.drawARGB(255, 0, 0, 0);
        getDrawingRect(a);
        b.R.a(canvas, (a.width() - b.R.f) / 2, (a.height() - b.R.g) / 2);
        invalidate();
    }

    public (ADCVideo adcvideo, Activity activity)
    {
        b = adcvideo;
        super(activity);
        a = new Rect();
    }
}
