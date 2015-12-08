// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.animation.Animation;

// Referenced classes of package kik.android.widget:
//            TalkToCoverView

final class ed
    implements android.view.animation.Animation.AnimationListener
{

    final TalkToCoverView a;

    ed(TalkToCoverView talktocoverview)
    {
        a = talktocoverview;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        TalkToCoverView.j(a);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        TalkToCoverView.i(a);
    }
}
