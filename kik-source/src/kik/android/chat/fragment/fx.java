// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.view.View;
import com.kik.m.c;
import kik.android.util.cv;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, fy

final class fx extends c
{

    final boolean a;
    final KikChatFragment b;

    fx(KikChatFragment kikchatfragment, boolean flag)
    {
        b = kikchatfragment;
        a = flag;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        KikChatFragment.g(b, false);
        if (KikChatFragment.m(b) != null && a)
        {
            KikChatFragment.m(b).postDelayed(new fy(this), 100L);
        }
        KikChatFragment.e(b, false);
        KikChatFragment.i(b, a);
    }

    public final void onAnimationStart(Animator animator)
    {
        cv.b(new View[] {
            b._suggestedRecyclerView
        });
        KikChatFragment.g(b, true);
    }
}
