// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import butterknife.ButterKnife;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinPicksAdapter;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.PinPicksFeed;
import com.pinterest.api.model.PinPicksSections;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.api.remote.PinPicksApi;
import com.pinterest.base.Events;
import com.pinterest.ui.PinPickHeroCell;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.fragment:
//            PinterestGridFragment

public class PinPicksFragment extends PinterestGridFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private boolean _firstLoad;
    private Handler _handler;
    PinPicksApiResponse _pinPickHandler;
    private String _pinPickUrl;
    private PinPicksFeed _pinPicksFeed;
    PinPickHeroCell heroCell;
    public FeedApiResponseHandler pinGridCellResponseHandler;

    public PinPicksFragment()
    {
        _firstLoad = true;
        _eventsSubscriber = new _cls2();
        pinGridCellResponseHandler = new _cls3();
        _layoutId = 0x7f0300f4;
        _adapter = new PinPicksAdapter();
        _handler = new Handler(Looper.getMainLooper());
        _pinPickHandler = new PinPicksApiResponse(gridResponseHandler);
    }

    private void loadNetworkData()
    {
        PinPicksApi.f(_pinPickUrl, _pinPickHandler, getApiTag());
    }

    private void loadPinGridData(PinPicksSections pinpickssections)
    {
        BoardApi.a(pinpickssections.getBoard().getUid(), new com.pinterest.api.remote.PinApi.PinFeedApiResponse(pinGridCellResponseHandler), getApiTag());
    }

    private void loadPinPicksData()
    {
        loadPinGridData((PinPicksSections)_pinPicksFeed.get(_pinPicksFeed.getCount() - 2));
    }

    protected void loadData()
    {
        super.loadData();
        if (!_firstLoad)
        {
            loadNetworkData();
            return;
        } else
        {
            (new _cls1()).execute();
            return;
        }
    }

    protected void onActivate()
    {
        super.onActivate();
        Events.register(_eventsSubscriber, com/pinterest/api/remote/PinPicksApi$FeedDownloadedEvent, new Class[0]);
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        Events.unregister(_eventsSubscriber);
    }

    public void onDestroyView()
    {
        if (heroCell != null)
        {
            heroCell = null;
        }
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070417);
        _actionBarWrapper.setShadowVisibility(0);
        heroCell = new PinPickHeroCell(getActivity());
        _gridVw.addHeaderView(heroCell, -1, -1);
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _pinPickUrl = navigation.getId();
    }




/*
    static boolean access$202(PinPicksFragment pinpicksfragment, boolean flag)
    {
        pinpicksfragment._firstLoad = flag;
        return flag;
    }

*/




/*
    static PinPicksFeed access$402(PinPicksFragment pinpicksfragment, PinPicksFeed pinpicksfeed)
    {
        pinpicksfragment._pinPicksFeed = pinpicksfeed;
        return pinpicksfeed;
    }

*/


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinPicksFragment this$0;

        public void onEventMainThread(com.pinterest.api.remote.PinPicksApi.FeedDownloadedEvent feeddownloadedevent)
        {
            loadPinPicksData();
        }

        _cls2()
        {
            this$0 = PinPicksFragment.this;
            super();
        }
    }


    private class _cls3 extends FeedApiResponseHandler
    {

        final PinPicksFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            feed = (PinFeed)feed;
            if (feed.getCount() > 0)
            {
                PinPicksSections pinpickssections;
                for (feed = feed.getItems().iterator(); feed.hasNext(); _pinPicksFeed.appendItem(pinpickssections))
                {
                    Pin pin = (Pin)feed.next();
                    pinpickssections = new PinPicksSections();
                    pinpickssections.setPinId(pin.getUid());
                    pinpickssections.setType("pins");
                }

                ((PinPicksAdapter)_adapter).setDataSource(_pinPicksFeed);
                ((PinPicksAdapter)_adapter).notifyDataSetChanged();
            }
        }

        _cls3()
        {
            this$0 = PinPicksFragment.this;
            super();
        }
    }


    private class PinPicksApiResponse extends com.pinterest.api.remote.PinPicksApi.PinPickFeedApiResponseHandler
    {

        final PinPicksFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            setEmptyContent(_adapter);
        }

        public void onStart()
        {
            super.onStart();
        }

        public void onSuccess(Feed feed)
        {
            if (feed != null && feed.getCode() == 0)
            {
                _pinPicksFeed = (PinPicksFeed)feed;
                if (_pinPicksFeed.getCount() > 0)
                {
                    ((PinPicksAdapter)_adapter).setDataSource(_pinPicksFeed);
                    PinPicksSections pinpickssections = (PinPicksSections)_pinPicksFeed.get(0);
                    if (pinpickssections != null && pinpickssections.getType().equals("hero"))
                    {
                        heroCell.updateUI(pinpickssections.getMobileImageUrl(), pinpickssections.getTitle(), pinpickssections.getDetail());
                    }
                }
                Events.post(new com.pinterest.api.remote.PinPicksApi.FeedDownloadedEvent());
                super.onSuccess(feed);
            }
        }

        public PinPicksApiResponse()
        {
            this$0 = PinPicksFragment.this;
            super();
        }

        public PinPicksApiResponse(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = PinPicksFragment.this;
            super(feedapiresponsehandler);
        }
    }


    private class _cls1 extends BackgroundTask
    {

        PinPicksFeed _cachedFeed;
        final PinPicksFragment this$0;

        public void onFinish()
        {
            _firstLoad = false;
            _pinPickHandler.onSuccess(_cachedFeed);
            refresh();
        }

        public void run()
        {
            com.pinterest.network.json.PinterestJsonObject pinterestjsonobject = DiskCache.getJsonObject("MY_PINPICKS_FEED");
            if (pinterestjsonobject == null)
            {
                class _cls1
                    implements Runnable
                {

                    final _cls1 this$1;

                    public void run()
                    {
                        loadNetworkData();
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
                }

                _handler.post(new _cls1());
                return;
            } else
            {
                _cachedFeed = new PinPicksFeed(pinterestjsonobject, null);
                return;
            }
        }

        _cls1()
        {
            this$0 = PinPicksFragment.this;
            super();
        }
    }

}
