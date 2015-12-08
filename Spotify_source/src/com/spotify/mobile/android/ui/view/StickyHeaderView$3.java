// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.widget.ListView;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            StickyHeaderView

final class a
    implements Runnable
{

    private StickyHeaderView a;

    public final void run()
    {
        a.requestLayout();
        StickyHeaderView.d(a).requestLayout();
    }

    (StickyHeaderView stickyheaderview)
    {
        a = stickyheaderview;
        super();
    }
}
