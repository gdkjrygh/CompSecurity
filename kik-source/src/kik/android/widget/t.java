// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.animation.Animation;

// Referenced classes of package kik.android.widget:
//            ContentLinkView

final class t
    implements android.view.animation.Animation.AnimationListener
{

    final ContentLinkView a;

    t(ContentLinkView contentlinkview)
    {
        a = contentlinkview;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        ContentLinkView.c(a, false);
        ContentLinkView.b(a, true);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        a.setVisibility(0);
        ContentLinkView.c(a, true);
    }
}
