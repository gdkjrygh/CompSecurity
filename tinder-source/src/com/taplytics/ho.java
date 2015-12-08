// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package com.taplytics:
//            hp

final class ho
    implements android.view.animation.Animation.AnimationListener
{

    final View a;

    ho(View view)
    {
        a = view;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        animation = new AlphaAnimation(1.0F, 0.5F);
        animation.setDuration(300L);
        animation.setAnimationListener(new hp(this));
        a.startAnimation(animation);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
