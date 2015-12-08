// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.animation;

import android.view.animation.Animation;

// Referenced classes of package com.google.android.play.animation:
//            AnimationCompat

final class val.toAlpha
    implements android.view.animation.nListener
{

    final AnimationCompat this$0;
    final float val$toAlpha;

    public final void onAnimationEnd(Animation animation)
    {
        mAlpha = val$toAlpha;
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    _cls9()
    {
        this$0 = final_animationcompat;
        val$toAlpha = F.this;
        super();
    }
}
