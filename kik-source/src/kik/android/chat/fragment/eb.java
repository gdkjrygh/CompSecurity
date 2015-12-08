// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.view.View;
import com.kik.m.c;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class eb extends c
{

    final KikChatFragment a;

    eb(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        KikChatFragment.g(a, false);
    }

    public final void onAnimationStart(Animator animator)
    {
        KikChatFragment.g(a, true);
        cv.b(new View[] {
            a._suggestedRecyclerView
        });
    }
}
