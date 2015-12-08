// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.AbsListView;
import kik.android.chat.am;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class eu
    implements android.widget.AbsListView.OnScrollListener
{

    final KikChatFragment a;

    eu(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (KikChatFragment.z(a) != null && !KikChatFragment.au(a) && !KikChatFragment.a(a)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l;
        int i1 = i + j;
        if (abslistview.getChildAt(0) == null)
        {
            l = -1;
        } else
        {
            l = abslistview.getChildAt(0).getTop();
        }
        if (i1 == KikChatFragment.av(a) && l == KikChatFragment.aw(a)) goto _L1; else goto _L3
_L3:
        KikChatFragment.i(a, false);
        if (KikChatFragment.B(a))
        {
            KikChatFragment.ax(a);
            KikChatFragment.ay(a);
        } else
        {
            KikChatFragment.az(a);
        }
        if ((i != KikChatFragment.aA(a) || l <= KikChatFragment.aw(a)) && i >= KikChatFragment.aA(a)) goto _L5; else goto _L4
_L4:
        KikChatFragment.aB(a);
        if (KikChatFragment.aC(a))
        {
            KikChatFragment.aD(a);
        }
_L7:
        if (i != KikChatFragment.aA(a) || i1 != KikChatFragment.av(a))
        {
            KikChatFragment.aG(a).onScroll(abslistview, i, j, k);
        }
        KikChatFragment.aB(a);
        KikChatFragment.g(a, i1);
        KikChatFragment.h(a, i);
        KikChatFragment.i(a, l);
        KikChatFragment.j(a, i1);
        return;
_L5:
        if ((i == KikChatFragment.aA(a) && l < KikChatFragment.aw(a) || i > KikChatFragment.aA(a)) && KikChatFragment.aE(a))
        {
            KikChatFragment.aF(a);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (KikChatFragment.as(a))
        {
            KikChatFragment.at(a);
        }
    }
}
