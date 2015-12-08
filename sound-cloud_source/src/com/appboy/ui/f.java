// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.appboy.c.a;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment, e

final class f
    implements Runnable
{

    final a a;
    final e b;

    f(e e1, a a1)
    {
        b = e1;
        a = a1;
        super();
    }

    public final void run()
    {
        com.appboy.ui.AppboyFeedFragment.a();
        (new StringBuilder("Updating feed views in response to FeedUpdatedEvent: ")).append(a);
        AppboyFeedFragment.h(b.b).removeCallbacks(AppboyFeedFragment.g(b.b));
        AppboyFeedFragment.b(b.b).setVisibility(8);
        if (a.b(AppboyFeedFragment.i(b.b)) == 0)
        {
            b.a.setVisibility(8);
            AppboyFeedFragment.f(b.b).clear();
        } else
        {
            AppboyFeedFragment.j(b.b).setVisibility(8);
            com.appboy.ui.AppboyFeedFragment.a(b.b).setVisibility(8);
            AppboyFeedFragment.k(b.b).setVisibility(8);
        }
        if (a.a && (a.b + 60L) * 1000L < System.currentTimeMillis())
        {
            com.appboy.ui.AppboyFeedFragment.a();
            String.format("Feed received was older than the max time to live of %d seconds, displaying it for now, but requesting an updated view from the server.", new Object[] {
                Integer.valueOf(60)
            });
            AppboyFeedFragment.l(b.b).c();
            if (a.b(AppboyFeedFragment.i(b.b)) == 0)
            {
                com.appboy.ui.AppboyFeedFragment.a();
                String.format("Old feed was empty, putting up a network spinner and registering the network error message on a delay of %dms.", new Object[] {
                    Integer.valueOf(5000)
                });
                AppboyFeedFragment.j(b.b).setVisibility(8);
                com.appboy.ui.AppboyFeedFragment.a(b.b).setVisibility(0);
                AppboyFeedFragment.k(b.b).setVisibility(0);
                AppboyFeedFragment.h(b.b).postDelayed(AppboyFeedFragment.g(b.b), 5000L);
                return;
            }
        }
        if (a.b(AppboyFeedFragment.i(b.b)) == 0)
        {
            com.appboy.ui.AppboyFeedFragment.a(b.b).setVisibility(8);
            AppboyFeedFragment.j(b.b).setVisibility(0);
            AppboyFeedFragment.k(b.b).setVisibility(0);
        } else
        {
            AppboyFeedFragment.f(b.b).a(a.a(AppboyFeedFragment.i(b.b)));
            b.a.setVisibility(0);
        }
        AppboyFeedFragment.d(b.b).setRefreshing(false);
    }
}
