// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import Jo;
import android.widget.AbsListView;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatWithFragment

final class a
    implements android.widget.lListener
{

    private ChatWithFragment a;

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i != 0)
        {
            Jo.a(a.getActivity(), ChatWithFragment.e(a));
        }
    }

    (ChatWithFragment chatwithfragment)
    {
        a = chatwithfragment;
        super();
    }
}
