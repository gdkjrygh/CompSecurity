// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText

public final class a extends TranslateAnimation
{

    final CaptionEditText a;

    (CaptionEditText captionedittext, int i, int j, int k, int l)
    {
        a = captionedittext;
        super(0, i, 0, j, 0, k, 0, l);
        setDuration(410L);
        setFillAfter(true);
        setInterpolator(new DecelerateInterpolator());
        captionedittext.a(0, 0);
        setAnimationListener(new android.view.animation.Animation.AnimationListener(j, l) {

            private boolean a;
            private int b;
            private int c;
            private CaptionEditText.b d;

            public final void onAnimationEnd(Animation animation)
            {
                if (a)
                {
                    d.a.setVisibility(0);
                    d.a.setAlpha(1.0F);
                    d.a.setCursorVisible(true);
                } else
                {
                    d.a.setVisibility(4);
                    d.a.setAlpha(0.0F);
                }
                d.a.invalidate();
                d.a.a(b, c);
                d.a.clearAnimation();
                d.a.g = false;
                d.a.f = false;
                CaptionEditText.a(d.a);
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
                d.a.f = true;
            }

            
            {
                d = CaptionEditText.b.this;
                a = true;
                b = i;
                c = j;
                super();
            }
        });
    }
}
