// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.support.v4.widget.SwipeRefreshLayout;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

class this._cls0
    implements Runnable
{

    final AppboyFeedFragment this$0;

    public void run()
    {
        AppboyFeedFragment.access$300(AppboyFeedFragment.this).setRefreshing(false);
    }

    eshLayout()
    {
        this$0 = AppboyFeedFragment.this;
        super();
    }
}
