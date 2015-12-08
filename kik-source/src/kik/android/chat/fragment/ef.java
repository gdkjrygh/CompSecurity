// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.support.v4.view.ViewPager;
import com.kik.m.c;
import com.kik.view.adapters.MediaTrayTabAdapter;
import kik.android.widget.TabIconImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ef extends c
{

    final KikChatFragment a;

    ef(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        KikChatFragment.f(a, false);
        if (KikChatFragment.g(a))
        {
            a._mediaModeButton.setVisibility(8);
        }
        KikChatFragment.e(a, kik.android.chat.fragment.KikChatFragment.c.c);
        KikChatFragment.a(a, kik.android.chat.fragment.KikChatFragment.e.c);
        if ("Camera".equals(KikChatFragment.K(a).a(KikChatFragment.L(a))))
        {
            KikChatFragment.d(a, true);
        }
        KikChatFragment.h(a, false);
    }

    public final void onAnimationStart(Animator animator)
    {
        KikChatFragment.f(a, true);
        a._mediaItemArea.setVisibility(0);
        KikChatFragment.a(a, KikChatFragment.e.e);
        KikChatFragment.ak(a);
    }
}
