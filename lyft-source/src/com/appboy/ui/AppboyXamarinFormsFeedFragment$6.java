// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.support.v4.widget.SwipeRefreshLayout;

// Referenced classes of package com.appboy.ui:
//            AppboyXamarinFormsFeedFragment

class this._cls0
    implements Runnable
{

    final AppboyXamarinFormsFeedFragment this$0;

    public void run()
    {
        AppboyXamarinFormsFeedFragment.access$300(AppboyXamarinFormsFeedFragment.this).setRefreshing(false);
    }

    ()
    {
        this$0 = AppboyXamarinFormsFeedFragment.this;
        super();
    }
}
