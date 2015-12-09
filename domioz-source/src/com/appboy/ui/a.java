// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.widget.LinearLayout;
import android.widget.ProgressBar;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

final class a
    implements Runnable
{

    final AppboyFeedFragment a;

    a(AppboyFeedFragment appboyfeedfragment)
    {
        a = appboyfeedfragment;
        super();
    }

    public final void run()
    {
        if (AppboyFeedFragment.a(a) != null)
        {
            AppboyFeedFragment.a(a).setVisibility(8);
        }
        if (AppboyFeedFragment.b(a) != null)
        {
            AppboyFeedFragment.b(a).setVisibility(0);
        }
    }
}
