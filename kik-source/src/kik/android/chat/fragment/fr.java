// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import com.kik.m.c;
import kik.a.d.a.a;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fr extends c
{

    final a a;
    final KikChatFragment b;

    fr(KikChatFragment kikchatfragment, a a1)
    {
        b = kikchatfragment;
        a = a1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        KikChatFragment.d(b, a);
    }
}
