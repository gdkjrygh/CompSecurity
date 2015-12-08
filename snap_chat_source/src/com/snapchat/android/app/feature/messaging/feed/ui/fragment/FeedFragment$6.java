// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import java.util.List;
import pZ;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment, FeedAdapter

final class a
    implements Runnable
{

    private FeedFragment a;

    public final void run()
    {
        FeedFragment.q(a).a = false;
        int i = FeedFragment.k(a).indexOf(FeedFragment.q(a));
        if (i != -1)
        {
            FeedFragment.k(a).remove(i);
            FeedFragment.k(a).add(FeedFragment.q(a));
            if (i == FeedFragment.k(a).size() - 1)
            {
                a.a.c(i);
            } else
            {
                a.a.a(i, FeedFragment.k(a).size() - 1);
            }
        } else
        {
            FeedFragment.k(a).add(FeedFragment.q(a));
            a.a.d(FeedFragment.k(a).size() - 1);
        }
        if (FeedFragment.j(a).o() == FeedFragment.k(a).size() - 2)
        {
            FeedFragment.j(a).a(FeedFragment.k(a).size() - 1, 0);
        }
    }

    (FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
