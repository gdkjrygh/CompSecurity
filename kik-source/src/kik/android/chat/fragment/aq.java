// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.AbsListView;

// Referenced classes of package kik.android.chat.fragment:
//            ConversationsBaseFragment

final class aq
    implements android.widget.AbsListView.OnScrollListener
{

    final ConversationsBaseFragment a;

    aq(ConversationsBaseFragment conversationsbasefragment)
    {
        a = conversationsbasefragment;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        a.a(abslistview, i, j, k);
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        ConversationsBaseFragment.a(a, i);
    }
}
