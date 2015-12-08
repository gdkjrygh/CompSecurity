// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.kik.m.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class dz extends c
{

    final KikChatFragment a;

    dz(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        KikChatFragment.f(a, false);
        a._mediaShadow.setVisibility(0);
        KikChatFragment.a(a, KikChatFragment.e.b);
    }

    public final void onAnimationStart(Animator animator)
    {
        KikChatFragment.e(a, false);
        KikChatFragment.f(a, true);
        KikChatFragment.ak(a);
        KikChatFragment.a(a, KikChatFragment.e.d);
    }
}
