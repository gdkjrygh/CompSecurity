// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.animation.Animation;
import android.widget.Button;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fa
    implements android.view.animation.Animation.AnimationListener
{

    final KikChatFragment a;

    fa(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a._scrollToLastReadButton.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
