// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ei
    implements android.view.animation.Animation.AnimationListener
{

    final KikChatFragment a;

    ei(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        a._mediaLayout.setVisibility(0);
    }
}
