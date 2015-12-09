// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.support.v4.widget.SwipeRefreshLayout;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

final class g
    implements Runnable
{

    final AppboyFeedFragment a;

    g(AppboyFeedFragment appboyfeedfragment)
    {
        a = appboyfeedfragment;
        super();
    }

    public final void run()
    {
        AppboyFeedFragment.d(a).b();
    }
}
