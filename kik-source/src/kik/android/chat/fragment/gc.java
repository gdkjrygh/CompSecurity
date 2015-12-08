// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.RelativeLayout;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class gc
    implements Runnable
{

    final KikChatFragment a;

    gc(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void run()
    {
        KikChatFragment.k(a, true);
        a._contentAttachFrame.setVisibility(0);
        if (!KikChatFragment.g(a))
        {
            a.D();
            KikChatFragment.f(a);
            a.a(KikChatFragment.e(a));
        }
    }
}
