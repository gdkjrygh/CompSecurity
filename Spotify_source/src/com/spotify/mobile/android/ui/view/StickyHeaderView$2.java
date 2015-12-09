// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            StickyHeaderView

final class a
    implements Runnable
{

    private StickyHeaderView a;

    public final void run()
    {
        StickyHeaderView.e(a).width = StickyHeaderView.f(a).getWidth();
        StickyHeaderView.e(a).height = StickyHeaderView.f(a).getHeight();
        StickyHeaderView.g(a).setLayoutParams(StickyHeaderView.e(a));
    }

    (StickyHeaderView stickyheaderview)
    {
        a = stickyheaderview;
        super();
    }
}
