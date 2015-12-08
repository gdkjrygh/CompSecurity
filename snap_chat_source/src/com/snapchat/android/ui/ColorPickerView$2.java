// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.snapchat.android.ui:
//            ColorPickerView

final class a
    implements android.view.er
{

    final ColorPickerView a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        switch (motionevent.getAction())
        {
        default:
            return true;

        case 0: // '\0'
            ColorPickerView.a(a, motionevent);
            ColorPickerView.b(a, true);
            ColorPickerView.j(a).postDelayed(ColorPickerView.i(a), 300L);
            return true;

        case 1: // '\001'
            ColorPickerView.b(a, false);
            ColorPickerView.j(a).removeCallbacks(ColorPickerView.i(a));
            view = new AlphaAnimation(1.0F, 0.0F);
            view.setDuration(200L);
            view.setFillAfter(true);
            view.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                private ColorPickerView._cls2 a;

                public final void onAnimationEnd(Animation animation)
                {
                    animation = new ScaleAnimation(26F, 1.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.5F);
                    animation.setDuration(140L);
                    ColorPickerView.f(a.a).startAnimation(animation);
                    animation = new TranslateAnimation((int)Jo.a(-23.5F, a.a.getContext()), 0.0F, 0.0F, 0.0F);
                    animation.setDuration(140L);
                    animation.setFillAfter(true);
                    ColorPickerView.d(a.a).startAnimation(animation);
                    animation = new ColorPickerView.a(ColorPickerView.h(a.a).getWidth(), (int)Jo.a(12F, a.a.getContext()), ColorPickerView.h(a.a));
                    animation.setDuration(140L);
                    ColorPickerView.h(a.a).startAnimation(animation);
                }

                public final void onAnimationRepeat(Animation animation)
                {
                }

                public final void onAnimationStart(Animation animation)
                {
                }

            
            {
                a = ColorPickerView._cls2.this;
                super();
            }
            });
            if (ColorPickerView.a(a))
            {
                a.findViewById(0x7f0d0554).startAnimation(view);
                a.findViewById(0x7f0d0553).startAnimation(view);
            }
            ColorPickerView.a(a, false);
            return true;

        case 2: // '\002'
            ColorPickerView.a(a, motionevent);
            return true;

        case 3: // '\003'
            ColorPickerView.b(a, false);
            return true;
        }
    }

    _cls1.a(ColorPickerView colorpickerview)
    {
        a = colorpickerview;
        super();
    }
}
