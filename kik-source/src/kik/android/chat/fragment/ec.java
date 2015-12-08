// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import com.kik.m.c;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, ed

final class ec extends c
{

    final boolean a;
    final KikChatFragment b;

    ec(KikChatFragment kikchatfragment, boolean flag)
    {
        b = kikchatfragment;
        a = flag;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (a)
        {
            KikChatFragment.m(b).postDelayed(new ed(this), 100L);
        }
    }
}
