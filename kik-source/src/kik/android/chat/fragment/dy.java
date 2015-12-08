// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.kik.android.a;
import com.kik.sdkutils.y;
import com.kik.view.adapters.MediaTrayTabAdapter;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class dy
    implements android.view.View.OnClickListener
{

    final KikChatFragment a;

    dy(KikChatFragment kikchatfragment)
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
        boolean flag;
        if (y.b(14) && "Camera".equals(KikChatFragment.K(a).a(KikChatFragment.L(a))))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (KikChatFragment.b(a))
        {
            kik.android.chat.fragment.KikChatFragment.a(a, flag, true);
            KikChatFragment.e(a, KikChatFragment.c.c);
            return;
        } else
        {
            a.g.b("Minimized Tray").a("Is Landscape", KikChatFragment.g(a)).a("Tab", KikChatFragment.K(a).a(KikChatFragment.L(a))).b();
            a._mediaItemArea.setVisibility(0);
            kik.android.chat.fragment.KikChatFragment.a(a, flag);
            KikChatFragment.e(a, KikChatFragment.c.b);
            return;
        }
    }
}
