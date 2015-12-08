// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.animation.Animation;
import android.widget.Button;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ez
    implements android.view.animation.Animation.AnimationListener
{

    final Animation a;
    final KikChatFragment b;

    ez(KikChatFragment kikchatfragment, Animation animation)
    {
        b = kikchatfragment;
        a = animation;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        b._scrollToLastReadButton.startAnimation(a);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
