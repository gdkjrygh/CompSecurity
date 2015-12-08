// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import com.kik.m.c;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fs extends c
{

    final KikChatFragment a;

    fs(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        KikChatFragment.m(a).setPadding(0, 0, 0, 0);
    }
}
