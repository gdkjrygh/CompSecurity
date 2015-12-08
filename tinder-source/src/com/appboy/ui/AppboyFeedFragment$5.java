// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.app.Activity;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.appboy.Appboy;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.adapters.AppboyListAdapter;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

class val.listView
    implements IEventSubscriber
{

    final AppboyFeedFragment this$0;
    final ListView val$listView;

    public void trigger(final FeedUpdatedEvent event)
    {
        android.support.v4.app.i i = getActivity();
        if (i == null)
        {
            return;
        } else
        {
            i.runOnUiThread(new Runnable() {

                final AppboyFeedFragment._cls5 this$1;
                final FeedUpdatedEvent val$event;

                public void run()
                {
                    AppboyLogger.d(AppboyFeedFragment.access$700(), (new StringBuilder("Updating feed views in response to FeedUpdatedEvent: ")).append(event).toString());
                    AppboyFeedFragment.access$900(this$0).removeCallbacks(AppboyFeedFragment.access$800(this$0));
                    AppboyFeedFragment.access$100(this$0).setVisibility(8);
                    if (event.getCardCount(AppboyFeedFragment.access$1000(this$0)) == 0)
                    {
                        listView.setVisibility(8);
                        AppboyFeedFragment.access$500(this$0).clear();
                    } else
                    {
                        AppboyFeedFragment.access$1100(this$0).setVisibility(8);
                        AppboyFeedFragment.access$000(this$0).setVisibility(8);
                        AppboyFeedFragment.access$1200(this$0).setVisibility(8);
                    }
                    if (event.isFromOfflineStorage() && (event.lastUpdatedInSecondsFromEpoch() + 60L) * 1000L < System.currentTimeMillis())
                    {
                        AppboyLogger.i(AppboyFeedFragment.access$700(), String.format("Feed received was older than the max time to live of %d seconds, displaying it for now, but requesting an updated view from the server.", new Object[] {
                            Integer.valueOf(60)
                        }));
                        AppboyFeedFragment.access$1300(this$0).requestFeedRefresh();
                        if (event.getCardCount(AppboyFeedFragment.access$1000(this$0)) == 0)
                        {
                            AppboyLogger.d(AppboyFeedFragment.access$700(), String.format("Old feed was empty, putting up a network spinner and registering the network error message on a delay of %dms.", new Object[] {
                                Integer.valueOf(5000)
                            }));
                            AppboyFeedFragment.access$1100(this$0).setVisibility(8);
                            AppboyFeedFragment.access$000(this$0).setVisibility(0);
                            AppboyFeedFragment.access$1200(this$0).setVisibility(0);
                            AppboyFeedFragment.access$900(this$0).postDelayed(AppboyFeedFragment.access$800(this$0), 5000L);
                            return;
                        }
                    }
                    if (event.getCardCount(AppboyFeedFragment.access$1000(this$0)) == 0)
                    {
                        AppboyFeedFragment.access$000(this$0).setVisibility(8);
                        AppboyFeedFragment.access$1100(this$0).setVisibility(0);
                        AppboyFeedFragment.access$1200(this$0).setVisibility(0);
                    } else
                    {
                        AppboyFeedFragment.access$500(this$0).replaceFeed(event.getFeedCards(AppboyFeedFragment.access$1000(this$0)));
                        listView.setVisibility(0);
                    }
                    AppboyFeedFragment.access$300(this$0).setRefreshing(false);
                }

            
            {
                this$1 = AppboyFeedFragment._cls5.this;
                event = feedupdatedevent;
                super();
            }
            });
            return;
        }
    }

    public volatile void trigger(Object obj)
    {
        trigger((FeedUpdatedEvent)obj);
    }

    _cls1.val.event()
    {
        this$0 = final_appboyfeedfragment;
        val$listView = ListView.this;
        super();
    }
}
