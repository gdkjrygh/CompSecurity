// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton;
import com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            TiltShiftPanel

class a
    implements Runnable
{

    final TiltShiftPanel a;

    public void run()
    {
        ImageViewTiltiShiftTouch imageviewtiltishifttouch = (ImageViewTiltiShiftTouch)a.c;
        if (a.u == com.aviary.android.feather.headless.filters.c.a)
        {
            TiltShiftPanel.a(a).setChecked(true);
            imageviewtiltishifttouch.setTiltShiftDrawMode(com.aviary.android.feather.sdk.widget.ftTouch.b.a);
            return;
        } else
        {
            TiltShiftPanel.b(a).setChecked(true);
            imageviewtiltishifttouch.setTiltShiftDrawMode(com.aviary.android.feather.sdk.widget.ftTouch.b.b);
            return;
        }
    }

    ftTouch.b(TiltShiftPanel tiltshiftpanel)
    {
        a = tiltshiftpanel;
        super();
    }
}
