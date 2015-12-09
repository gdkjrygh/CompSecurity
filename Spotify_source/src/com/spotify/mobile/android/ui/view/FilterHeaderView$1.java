// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import fop;
import gas;
import gav;
import gfp;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            FilterHeaderView

final class a
    implements gav
{

    private FilterHeaderView a;

    public final void a(gfp gfp1)
    {
        if (FilterHeaderView.b(a) != null)
        {
            FilterHeaderView.b(a).a(gfp1);
        }
        if (FilterHeaderView.c(a) != null)
        {
            ClientEvent clientevent = ClientEventFactory.a(FilterHeaderView.d(a), com.spotify.mobile.android.util.t.az, null, null);
            clientevent.a("order", gfp1.a());
            clientevent.a("reversed", String.valueOf(gfp1.b()));
            fop.a(a.getContext(), FilterHeaderView.c(a), clientevent);
        }
        FilterHeaderView.a(a, gfp1);
    }

    (FilterHeaderView filterheaderview)
    {
        a = filterheaderview;
        super();
    }
}
