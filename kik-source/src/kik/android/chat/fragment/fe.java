// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.text.Editable;
import com.kik.m.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fe extends c
{

    final Editable a;
    final String b;
    final int c;
    final KikChatFragment d;

    fe(KikChatFragment kikchatfragment, Editable editable, String s, int i)
    {
        d = kikchatfragment;
        a = editable;
        b = s;
        c = i;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        KikChatFragment.a(d, a, b, c);
    }
}
