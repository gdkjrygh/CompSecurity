// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package com.snapchat.android.ui:
//            ColorPickerView

final class a
    implements android.view.animation.istener
{

    private ViewById a;

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        animation = new AlphaAnimation(0.0F, 1.0F);
        animation.setDuration(140L);
        animation.setFillAfter(true);
        a.a.findViewById(0x7f0d0554).startAnimation(animation);
        a.a.findViewById(0x7f0d0553).startAnimation(animation);
    }

    stener(stener stener)
    {
        a = stener;
        super();
    }

    // Unreferenced inner class com/snapchat/android/ui/ColorPickerView$1

/* anonymous class */
    final class ColorPickerView._cls1
        implements Runnable
    {

        final ColorPickerView a;

        public final void run()
        {
            if (!ColorPickerView.a(a) && ColorPickerView.b(a))
            {
                ColorPickerView.d(a).startAnimation(ColorPickerView.c(a));
                ColorPickerView.f(a).startAnimation(ColorPickerView.e(a));
                ColorPickerView.g(a).setAnimationListener(new ColorPickerView._cls1._cls1(this));
                ColorPickerView.h(a).startAnimation(ColorPickerView.g(a));
                ColorPickerView.a(a, true);
            }
        }

            
            {
                a = colorpickerview;
                super();
            }
    }

}
