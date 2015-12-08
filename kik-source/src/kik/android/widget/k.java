// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.animation.Animation;

// Referenced classes of package kik.android.widget:
//            BugmeBarView

final class k
    implements android.view.animation.Animation.AnimationListener
{

    final BugmeBarView a;

    k(BugmeBarView bugmebarview)
    {
        a = bugmebarview;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.setVisibility(8);
        BugmeBarView.b(a, false);
        BugmeBarView.c(a, false);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        BugmeBarView.b(a, true);
    }
}
