// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import com.pinterest.activity.home.HomeFragment;
import com.pinterest.adapter.DynamicGridAdapter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.remote.DynamicGridApi;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.developer.DeveloperHelper;
import com.pinterest.ui.grid.PinterestGridView;

public class DynamicGridFragment extends HomeFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;

    public DynamicGridFragment()
    {
        _eventsSubscriber = new _cls1();
        _adapter = new DynamicGridAdapter();
    }

    protected void loadNetworkData()
    {
        StopWatch.get().startSubWatch("ttrfp_tmp_log", "du_42_load_hf_from_net");
        com.pinterest.api.remote.PinApi.HomePinFeedApiResponseHandler homepinfeedapiresponsehandler = _homeFeedHandler;
        String s;
        if (DeveloperHelper.b())
        {
            s = "API_VX_TAG";
        } else
        {
            s = getApiTag();
        }
        DynamicGridApi.a(homepinfeedapiresponsehandler, s);
    }

    protected void onActivate()
    {
        super.onActivate();
        Events.register(_eventsSubscriber);
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        Events.unregister(_eventsSubscriber);
    }





    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final DynamicGridFragment this$0;

        public void onEventMainThread(com.pinterest.api.model.DynamicStory.DismissFeedStoryEvent dismissfeedstoryevent)
        {
            dismissfeedstoryevent = dismissfeedstoryevent.getDismissedStory();
            if (((PinGridAdapter)getDismissedStory).getDataSource() != null)
            {
                ((PinGridAdapter)getDismissedStory).getDataSource().removeStory(dismissfeedstoryevent);
            }
            ((PinGridAdapter)getDismissedStory).notifyDataSetChanged();
            getDataSource.reset();
        }

        _cls1()
        {
            this$0 = DynamicGridFragment.this;
            super();
        }
    }

}
