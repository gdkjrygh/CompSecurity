// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.widget.LinearLayout;
import android.widget.ProgressBar;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

class this._cls0
    implements Runnable
{

    final AppboyFeedFragment this$0;

    public void run()
    {
        if (AppboyFeedFragment.access$000(AppboyFeedFragment.this) != null)
        {
            AppboyFeedFragment.access$000(AppboyFeedFragment.this).setVisibility(8);
        }
        if (AppboyFeedFragment.access$100(AppboyFeedFragment.this) != null)
        {
            AppboyFeedFragment.access$100(AppboyFeedFragment.this).setVisibility(0);
        }
    }

    ()
    {
        this$0 = AppboyFeedFragment.this;
        super();
    }
}
