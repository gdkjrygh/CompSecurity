// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.animation.Animation;

// Referenced classes of package kik.android.widget:
//            ContentLinkView

final class s
    implements android.view.animation.Animation.AnimationListener
{

    final ContentLinkView a;

    s(ContentLinkView contentlinkview)
    {
        a = contentlinkview;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.setVisibility(8);
        ContentLinkView.a(a, false);
        ContentLinkView.b(a, false);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        ContentLinkView.a(a, true);
    }
}
