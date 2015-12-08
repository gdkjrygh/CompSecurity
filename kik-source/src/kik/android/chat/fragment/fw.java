// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.ValueAnimator;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fw
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final boolean a;
    final KikChatFragment b;

    fw(KikChatFragment kikchatfragment, boolean flag)
    {
        b = kikchatfragment;
        a = flag;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (KikChatFragment.m(b) != null && a)
        {
            KikChatFragment.m(b).smoothScrollToPosition(KikChatFragment.m(b).getCount());
        }
    }
}
