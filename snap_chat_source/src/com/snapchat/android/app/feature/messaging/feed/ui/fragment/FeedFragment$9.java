// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

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
        if (FeedFragment.k(a).remove(FeedFragment.q(a)))
        {
            a.a.e(FeedFragment.k(a).size());
        }
        if (FeedFragment.r(a))
        {
            a.a.a(true);
        }
    }

    (FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
