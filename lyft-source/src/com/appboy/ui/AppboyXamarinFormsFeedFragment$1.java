// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.widget.LinearLayout;
import android.widget.ProgressBar;

// Referenced classes of package com.appboy.ui:
//            AppboyXamarinFormsFeedFragment

class this._cls0
    implements Runnable
{

    final AppboyXamarinFormsFeedFragment this$0;

    public void run()
    {
        if (AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment.this) != null)
        {
            AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment.this).setVisibility(8);
        }
        if (AppboyXamarinFormsFeedFragment.access$100(AppboyXamarinFormsFeedFragment.this) != null)
        {
            AppboyXamarinFormsFeedFragment.access$100(AppboyXamarinFormsFeedFragment.this).setVisibility(0);
        }
    }

    ()
    {
        this$0 = AppboyXamarinFormsFeedFragment.this;
        super();
    }
}
