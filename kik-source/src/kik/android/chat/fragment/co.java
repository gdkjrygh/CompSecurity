// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.android.a;
import com.kik.view.adapters.MediaTrayTabAdapter;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class co
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    final KikChatFragment a;

    co(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onPageScrollStateChanged(int i)
    {
        if (i == 1)
        {
            KikChatFragment.c(a, true);
        }
        if (KikChatFragment.J(a) && i == 0)
        {
            KikChatFragment.b(a, KikChatFragment.e.g);
            KikChatFragment.b(a, false);
        }
    }

    public final void onPageScrolled(int i, float f, int j)
    {
        if (!KikChatFragment.J(a) && (double)f < 0.99299999999999999D && (double)f > 0.0070000000000000001D)
        {
            KikChatFragment.b(a, true);
            kik.android.chat.fragment.KikChatFragment.a(a, KikChatFragment.e.f);
        }
    }

    public final void onPageSelected(int i)
    {
        a.g.b("Switched Tab").a("Is Swipe", KikChatFragment.M(a)).a("Start Tab", KikChatFragment.K(a).a(KikChatFragment.L(a))).a("End Tab", KikChatFragment.K(a).a(i)).a("Is Maximized", kik.android.chat.fragment.KikChatFragment.a(a)).a("Is Landscape", KikChatFragment.g(a)).b();
        KikChatFragment.c(a, false);
        KikChatFragment.c(a, i);
        KikChatFragment.d(a, i);
        if (kik.android.chat.fragment.KikChatFragment.a(a))
        {
            kik.android.chat.fragment.KikChatFragment.a(a, KikChatFragment.e.c);
        } else
        {
            kik.android.chat.fragment.KikChatFragment.a(a, KikChatFragment.e.b);
        }
        if ("Camera".equals(KikChatFragment.K(a).a(KikChatFragment.L(a))) && kik.android.chat.fragment.KikChatFragment.a(a))
        {
            KikChatFragment.d(a, true);
            return;
        } else
        {
            KikChatFragment.d(a, false);
            return;
        }
    }
}
