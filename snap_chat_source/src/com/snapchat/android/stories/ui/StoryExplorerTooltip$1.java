// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;

// Referenced classes of package com.snapchat.android.stories.ui:
//            StoryExplorerTooltip

final class a
    implements android.animation.er
{

    private ViewPropertyAnimator a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.setListener(null);
        a.alpha(0.0F).setDuration(1000L).setStartDelay(3000L).start();
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
