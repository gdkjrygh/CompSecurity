// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.here;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;

// Referenced classes of package com.snapchat.android.ui.here:
//            HereTooltip

final class a
    implements android.animation.torListener
{

    private ViewPropertyAnimator a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.setListener(null);
        a.alpha(0.0F);
        a.setDuration(1000L);
        a.setStartDelay(3000L);
        a.start();
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (ViewPropertyAnimator viewpropertyanimator)
    {
        a = viewpropertyanimator;
        super();
    }
}
