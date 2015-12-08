// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.view.animation.Animation;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText

final class c
    implements android.view.animation.istener
{

    private boolean a;
    private int b;
    private int c;
    private d d;

    public final void onAnimationEnd(Animation animation)
    {
        if (a)
        {
            d.d.setVisibility(0);
            d.d.setAlpha(1.0F);
            d.d.setCursorVisible(true);
        } else
        {
            d.d.setVisibility(4);
            d.d.setAlpha(0.0F);
        }
        d.d.invalidate();
        d.d.a(b, c);
        d.d.clearAnimation();
        d.d.g = false;
        d.d.f = false;
        CaptionEditText.a(d.d);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        d.d.f = true;
    }

    _cls9(_cls9 _pcls9, int i, int j)
    {
        d = _pcls9;
        a = true;
        b = i;
        c = j;
        super();
    }
}
