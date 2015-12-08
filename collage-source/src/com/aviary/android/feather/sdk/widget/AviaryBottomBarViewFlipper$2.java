// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryBottomBarViewFlipper

class a
    implements android.view.animation.rViewFlipper._cls2
{

    final AviaryBottomBarViewFlipper a;

    public void onAnimationEnd(Animation animation)
    {
        if (AviaryBottomBarViewFlipper.a(a) != null)
        {
            AviaryBottomBarViewFlipper.a(a).d();
        }
        a.getChildAt(0).setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        a.getChildAt(1).setVisibility(0);
        if (AviaryBottomBarViewFlipper.a(a) != null)
        {
            AviaryBottomBarViewFlipper.a(a).c();
        }
    }

    (AviaryBottomBarViewFlipper aviarybottombarviewflipper)
    {
        a = aviarybottombarviewflipper;
        super();
    }
}
