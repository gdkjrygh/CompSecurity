// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.view.animation.Animation;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class su
    implements android.view.animation.Animation.AnimationListener
{

    final ViewPictureFragment a;

    su(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        cv.b(new View[] {
            a._videoViewContainer, a._videoView
        });
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
