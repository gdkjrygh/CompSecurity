// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fb
    implements android.view.View.OnClickListener
{

    final KikChatFragment a;

    fb(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onClick(View view)
    {
        if (KikChatFragment.o(a))
        {
            return;
        }
        KikChatFragment.p(a);
        KikChatFragment.q(a);
        if (KikChatFragment.r(a) == 0)
        {
            a.b(KikChatFragment.e(a));
            KikChatFragment.a(a, KikChatFragment.b.d, true);
            KikChatFragment.s(a);
            return;
        }
        if (KikChatFragment.t(a) && !KikChatFragment.g(a))
        {
            KikChatFragment.c(a, "Close");
            KikChatFragment.u(a);
            KikChatFragment.s(a);
            return;
        } else
        {
            KikChatFragment.c(a, "Close");
            KikChatFragment.a(a, KikChatFragment.e(a));
            return;
        }
    }
}
