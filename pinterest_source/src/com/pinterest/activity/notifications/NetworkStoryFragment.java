// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.notifications.adapter.NetworkStoryAdapter;
import com.pinterest.activity.notifications.adapter.StoryAdapter;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.api.remote.NetworkStoryApi;
import com.pinterest.base.Events;
import com.pinterest.experience.Experiences;
import com.pinterest.experiment.Experiments;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.megaphone.MegaphoneView;
import com.pinterest.ui.megaphone.NagUtils;

// Referenced classes of package com.pinterest.activity.notifications:
//            BaseNotificationFragment, NoFacebookNetworkStoryFragment, NotificationCount

public class NetworkStoryFragment extends BaseNotificationFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;

    public NetworkStoryFragment()
    {
        _eventsSubscriber = new _cls2();
    }

    private void updateEmptyFeedUpsell()
    {
        if (!MyUser.isConnectedToFacebook())
        {
            Experiments.a("android_news_empty_state");
            if (Experiments.D())
            {
                _emptyView.setVisibility(4);
                FragmentHelper.addFragment(getFragmentManager(), 0x7f0f0211, new NoFacebookNetworkStoryFragment());
            }
        }
    }

    protected NetworkStoryAdapter createAdapter()
    {
        return new NetworkStoryAdapter();
    }

    protected volatile StoryAdapter createAdapter()
    {
        return createAdapter();
    }

    protected volatile BaseApiResponseHandler createResponseHandler()
    {
        return createResponseHandler();
    }

    protected com.pinterest.api.remote.NetworkStoryApi.StoriesFeedApiResponse createResponseHandler()
    {
        return new _cls1();
    }

    protected int getEmptyMessageResourceId()
    {
        return 0x7f070267;
    }

    protected void loadData()
    {
        NetworkStoryApi.a((com.pinterest.api.remote.NetworkStoryApi.StoriesFeedApiResponse)_apiResponseHandler, getApiTag());
        updateEmptyContent();
    }

    protected void onActivate()
    {
        super.onActivate();
        if (NotificationCount.getUnseenNetworkStoryCount() != 0)
        {
            NotificationCount.setUnseenNetworkStoryCount(0);
            MyUserApi.b(getApiTag());
        }
        if (!isNagShown() && isDataNonEmpty())
        {
            NagUtils.showNag(getPlacementId(), new NagEvent(null), 0x7f06000a);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _placementId = Experiences.e;
    }

    public void onDestroyView()
    {
        if (_nagView != null)
        {
            _nagView.setListViewParent(null);
        }
        _nagView = null;
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/notifications/NetworkStoryFragment$NagEvent, com/pinterest/base/Social$UpdateEvent
        });
        super.onDestroyView();
    }

    protected void onSetDataSource()
    {
        if (isActive() && !isNagShown())
        {
            NagUtils.showNag(getPlacementId(), new NagEvent(null), 0x7f06000a);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        Events.register(_eventsSubscriber, com/pinterest/activity/notifications/NetworkStoryFragment$NagEvent, new Class[] {
            com/pinterest/base/Social$UpdateEvent
        });
    }





/*
    static MegaphoneView access$402(NetworkStoryFragment networkstoryfragment, MegaphoneView megaphoneview)
    {
        networkstoryfragment._nagView = megaphoneview;
        return megaphoneview;
    }

*/





    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final NetworkStoryFragment this$0;

        public void onEventMainThread(NagEvent nagevent)
        {
            PLog.info("NetworkStoryFragment.NagEvent", new Object[0]);
            if (getActivity == null)
            {
                ((MegaphoneView)ViewHelper.viewById(getActivity(), 0x7f03017d)).getActivity = nagevent;
                getActivity.setListViewParent(viewById);
            }
            NagUtils.showNagFromEvent(NetworkStoryFragment.this, getActivity, nagevent);
        }

        public void onEventMainThread(com.pinterest.base.Social.UpdateEvent updateevent)
        {
            if (updateevent.getNetwork() == com.pinterest.base.Social.Network.FACEBOOK)
            {
                info.setVisibility(0);
                ((LinearLayout)getView().findViewById(0x7f0f0211)).setVisibility(4);
            }
        }

        _cls2()
        {
            this$0 = NetworkStoryFragment.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.api.remote.NetworkStoryApi.StoriesFeedApiResponse
    {

        final NetworkStoryFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            handleApiResponseOnFailure();
        }

        public void onStart()
        {
            super.onStart();
            handleApiResponseOnStart();
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            handleApiResponseOnSuccess((StoryFeed)feed);
            if (NetworkStoryFragment.this.onStart.getState() == 1 && feed.getCount() == 0)
            {
                updateEmptyFeedUpsell();
            }
        }

        _cls1()
        {
            this$0 = NetworkStoryFragment.this;
            super();
        }
    }


    private class NagEvent extends BaseNagEvent
    {

        private NagEvent()
        {
        }

        NagEvent(_cls1 _pcls1)
        {
            this();
        }
    }

}
