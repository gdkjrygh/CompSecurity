// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText

public final class a extends AlphaAnimation
{

    final CaptionEditText a;

    (CaptionEditText captionedittext, boolean flag)
    {
        float f1 = 1.0F;
        a = captionedittext;
        float f;
        if (flag)
        {
            f = 0.0F;
        } else
        {
            f = 1.0F;
        }
        if (!flag)
        {
            f1 = 0.0F;
        }
        super(f, f1);
        setDuration(410L);
        setFillAfter(true);
        setAnimationListener(new android.view.animation.Animation.AnimationListener(flag) {

            private boolean a;
            private CaptionEditText.a b;

            public final void onAnimationEnd(Animation animation)
            {
                if (a)
                {
                    b.a.setVisibility(0);
                    b.a.setAlpha(1.0F);
                    b.a.setCursorVisible(true);
                } else
                {
                    b.a.setVisibility(4);
                    b.a.setAlpha(0.0F);
                }
                b.a.invalidate();
                b.a.clearAnimation();
                b.a.g = false;
                b.a.f = false;
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
                b.a.f = true;
            }

            
            {
                b = CaptionEditText.a.this;
                a = flag;
                super();
            }
        });
    }
}
