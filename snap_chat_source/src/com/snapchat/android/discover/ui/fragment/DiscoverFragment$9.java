// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            DiscoverFragment

final class a extends android.support.v7.widget.coverFragment._cls9
{

    private DiscoverFragment a;

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        i = DiscoverFragment.f(a).o();
        if (DiscoverFragment.g(a) != -1 && DiscoverFragment.g(a) == i)
        {
            return;
        } else
        {
            a.m();
            return;
        }
    }

    (DiscoverFragment discoverfragment)
    {
        a = discoverfragment;
        super();
    }
}
