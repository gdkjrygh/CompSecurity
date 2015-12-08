// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.view.animation.Animation;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText

final class a
    implements android.view.animation.istener
{

    private boolean a;
    private b b;

    public final void onAnimationEnd(Animation animation)
    {
        if (a)
        {
            b.b.setVisibility(0);
            b.b.setAlpha(1.0F);
            b.b.setCursorVisible(true);
        } else
        {
            b.b.setVisibility(4);
            b.b.setAlpha(0.0F);
        }
        b.b.invalidate();
        b.b.clearAnimation();
        b.b.g = false;
        b.b.f = false;
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        b.b.f = true;
    }

    _cls9(_cls9 _pcls9, boolean flag)
    {
        b = _pcls9;
        a = flag;
        super();
    }
}
