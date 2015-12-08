// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.support.v4.view.ViewPager;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class eh
    implements Runnable
{

    final KikChatFragment a;

    eh(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void run()
    {
        KikChatFragment.al(a);
        KikChatFragment.am(a);
        a._mediaItemArea.setVisibility(8);
        KikChatFragment.an(a);
        KikChatFragment.d(a, false);
        KikChatFragment.ao(a);
    }
}
