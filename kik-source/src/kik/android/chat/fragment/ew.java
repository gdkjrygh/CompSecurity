// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;
import com.kik.view.adapters.au;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ew
    implements android.view.View.OnClickListener
{

    final KikChatFragment a;

    ew(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.g.b("Unread Messages Tapped").b();
        view = KikChatFragment.aJ(a);
        if (view == null) goto _L2; else goto _L1
_L1:
        int i = KikChatFragment.ar(a).getPosition(view) + KikChatFragment.m(a).getHeaderViewsCount();
        if (i < 0 || i >= KikChatFragment.m(a).getCount()) goto _L4; else goto _L3
_L3:
        KikChatFragment.m(a).smoothScrollToPosition(i);
_L2:
        KikChatFragment.aF(a);
        KikChatFragment.aK(a);
        return;
_L4:
        if (i < 0)
        {
            KikChatFragment.m(a).smoothScrollToPosition(0);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
