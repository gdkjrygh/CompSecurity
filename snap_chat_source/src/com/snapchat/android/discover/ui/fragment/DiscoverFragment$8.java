// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import android.support.v7.widget.RecyclerView;
import com.snapchat.android.discover.ui.ChannelGroupView;
import com.snapchat.android.discover.ui.ChannelView;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            DiscoverFragment

final class a extends android.support.v7.widget.coverFragment._cls8
{

    private String a;
    private DiscoverFragment b;

    public final void a(RecyclerView recyclerview, int i)
    {
        super.coverFragment(recyclerview, i);
        if (i == 0)
        {
            recyclerview = (ChannelView)DiscoverFragment.b(b).findViewWithTag(a);
            DiscoverFragment.a(b, ((ChannelView) (recyclerview)).a);
            DiscoverFragment.b(b).b(this);
        }
    }

    (DiscoverFragment discoverfragment, String s)
    {
        b = discoverfragment;
        a = s;
        super();
    }
}
