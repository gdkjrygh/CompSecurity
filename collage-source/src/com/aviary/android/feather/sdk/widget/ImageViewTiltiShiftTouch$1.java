// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            ImageViewTiltiShiftTouch, g

class a
    implements it.sephiroth.android.library.easing._cls1
{

    final ImageViewTiltiShiftTouch a;

    public void a(double d)
    {
        if (ImageViewTiltiShiftTouch.a(a))
        {
            ImageViewTiltiShiftTouch.b(a).a.a((float)d);
            ImageViewTiltiShiftTouch.b(a).a.a(1.0F);
            a.invalidate();
        }
    }

    public void a(double d, double d1)
    {
        if (ImageViewTiltiShiftTouch.a(a))
        {
            ImageViewTiltiShiftTouch.b(a).a.a((float)d);
            a.invalidate();
        }
    }

    public void b(double d)
    {
        if (ImageViewTiltiShiftTouch.a(a))
        {
            ImageViewTiltiShiftTouch.b(a).a.a(0.0F);
            ImageViewTiltiShiftTouch.b(a).a.a(0.0F);
            a.invalidate();
        }
    }

    (ImageViewTiltiShiftTouch imageviewtiltishifttouch)
    {
        a = imageviewtiltishifttouch;
        super();
    }
}
