// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import Br;
import Bt;
import com.snapchat.android.analytics.NetworkAnalytics;
import javax.inject.Provider;
import lm;
import mu;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements Runnable
{

    private FeedFragment a;

    public final void run()
    {
        FeedFragment.d(a);
        Bt.y(null);
        if ((Br)FeedFragment.s(a).get() != null)
        {
            FeedFragment.t(a).b(com.snapchat.android.analytics..PageContext.FEED);
            FeedFragment.u(a).a("feed", "pull_to_refresh");
            FeedFragment.v(a);
            (new mu()).execute();
        }
    }

    Q(FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
