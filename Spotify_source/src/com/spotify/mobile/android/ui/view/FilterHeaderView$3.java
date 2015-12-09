// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.view.View;
import com.spotify.mobile.android.util.ClientEventFactory;
import fop;
import gat;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            FilterHeaderView

final class a
    implements android.view.r
{

    private FilterHeaderView a;

    public final void onClick(View view)
    {
        if (FilterHeaderView.c(a) != null)
        {
            fop.a(a.getContext(), FilterHeaderView.c(a), ClientEventFactory.a(FilterHeaderView.d(a), com.spotify.mobile.android.util.t.aA, null, null));
        }
        FilterHeaderView.g(a).a(FilterHeaderView.f(a));
    }

    (FilterHeaderView filterheaderview)
    {
        a = filterheaderview;
        super();
    }
}
