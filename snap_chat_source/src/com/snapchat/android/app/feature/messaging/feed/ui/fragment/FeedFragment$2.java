// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import afz;
import android.support.v7.widget.LinearLayoutManager;
import in.srain.cube.views.ptr.PtrFrameLayout;
import java.util.List;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements afz
{

    private FeedFragment a;

    public final void a(PtrFrameLayout ptrframelayout)
    {
        FeedFragment.l(a);
        ptrframelayout.post(FeedFragment.m(a));
    }

    public final boolean a()
    {
        return !FeedFragment.i(a) && (FeedFragment.j(a).n() == 0 || FeedFragment.k(a).isEmpty());
    }

    (FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
