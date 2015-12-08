// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import com.kik.m.c;

// Referenced classes of package kik.android.chat.fragment:
//            dg, KikChatFragment

final class dh extends c
{

    final String a;
    final dg b;

    dh(dg dg1, String s)
    {
        b = dg1;
        a = s;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        KikChatFragment.a(b.a, a, kik.a.d.s.a.b);
    }
}
