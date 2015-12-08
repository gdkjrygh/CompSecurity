// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.RelativeLayout;
import java.lang.reflect.Method;

// Referenced classes of package com.jirbo.adcolony:
//            ADCImage, a, AdColonyBrowser

class  extends View
{

    Paint a;
    ADCImage b;
    ADCImage c;
    final AdColonyBrowser d;

    public void onDraw(Canvas canvas)
    {
        canvas.drawRect(0.0F, 0.0F, d.l.getWidth(), 10F, a);
    }

    public (AdColonyBrowser adcolonybrowser, Activity activity)
    {
        d = adcolonybrowser;
        super(activity);
        a = new Paint();
        b = new ADCImage(com.jirbo.adcolony.a.j("close_image_normal"));
        c = new ADCImage(com.jirbo.adcolony.a.j("close_image_down"));
        try
        {
            getClass().getMethod("setLayerType", new Class[] {
                Integer.TYPE, android/graphics/Paint
            }).invoke(this, new Object[] {
                Integer.valueOf(1), null
            });
        }
        // Misplaced declaration of an exception variable
        catch (AdColonyBrowser adcolonybrowser) { }
        a.setColor(0xffcccccc);
        a.setStrokeWidth(10F);
        a.setStyle(android.graphics.);
        a.setShadowLayer(3F, 0.0F, 1.0F, 0xff000000);
    }
}
