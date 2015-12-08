// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui.animation;

import android.animation.Animator;

// Referenced classes of package com.snapchat.android.stories.ui.animation:
//            DismissAnimationView

final class a
    implements android.animation.er
{

    private DismissAnimationView a;

    public final void onAnimationCancel(Animator animator)
    {
        a.setVisibility(8);
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        a.setVisibility(0);
    }

    (DismissAnimationView dismissanimationview)
    {
        a = dismissanimationview;
        super();
    }
}
