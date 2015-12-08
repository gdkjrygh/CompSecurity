// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import Bj;
import Bt;
import afz;
import android.support.v7.widget.LinearLayoutManager;
import com.snapchat.android.analytics.NetworkAnalytics;
import in.srain.cube.views.ptr.PtrFrameLayout;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesFragment

final class a
    implements afz
{

    private StoriesFragment a;

    public final void a(PtrFrameLayout ptrframelayout)
    {
        StoriesFragment.n(a).b(com.snapchat.android.analytics.ageContext.STORY);
        a.a.q();
        ((android.support.v7.widget.esFragment.a) (a.d)).d.d();
        StoriesFragment.o(a);
        Bt.y(null);
        StoriesFragment.p(a);
    }

    public final boolean a()
    {
        return a.e.n() == 0;
    }

    xt(StoriesFragment storiesfragment)
    {
        a = storiesfragment;
        super();
    }
}
