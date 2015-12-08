// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.os.Bundle;
import android.view.View;
import com.pinterest.activity.search.SearchNagView;
import com.pinterest.activity.search.adapter.GuidedSearchMyBoardAdapter;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.text.BevelTitleDivider;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedPinFragment

public class GuidedMyPinSearchFragment extends GuidedPinFragment
{

    private static int BOARD_ITEM_PADDING = (int)Resources.dimension(0x7f0a0162);
    private static int SCROLLVIEW_PADDING = (int)Resources.dimension(0x7f0a015f);
    private BevelTitleDivider _boardDividerView;
    private TwoWayView _boardListView;
    GuidedSearchMyBoardAdapter _myBoardAdapter;
    private BevelTitleDivider _pinDividerView;
    private BoardSearchFeedResponse onAllBoardsLoaded;
    private PinSearchFeedResponse onUserPinsLoaded;

    public GuidedMyPinSearchFragment()
    {
        onAllBoardsLoaded = new BoardSearchFeedResponse(gridResponseHandler);
        onUserPinsLoaded = new PinSearchFeedResponse(gridResponseHandler);
        _layoutId = 0x7f0300cf;
    }

    protected void loadData()
    {
        if (_lastQuery != null)
        {
            updateEmptyContent();
            SearchApi.a(_lastQuery, true, onAllBoardsLoaded, getApiTag());
            SearchApi.a(_lastQuery, onUserPinsLoaded, getApiTag());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _myBoardAdapter = new GuidedSearchMyBoardAdapter(getActivity());
        ((PinGridAdapter)_adapter).setRenderCompactUserOnly(true);
    }

    public void onDestroyView()
    {
        _boardListView = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _nagView = new SearchNagView(view.getContext());
        _nagView.setVisibility(8);
        _gridVw.addHeaderView(_nagView, -1, -2);
        _boardDividerView = new BevelTitleDivider(view.getContext());
        _boardDividerView.setPadding(0, SCROLLVIEW_PADDING, 0, 0);
        _boardDividerView.setText(0x7f07061c);
        _gridVw.addHeaderView(_boardDividerView, -1, -2);
        _boardListView = new TwoWayView(view.getContext());
        _boardListView.setVisibility(8);
        _boardListView.setPadding(0, SCROLLVIEW_PADDING, 0, 0);
        _boardListView.setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        _boardListView.setLongClickable(true);
        _myBoardAdapter.setOuterPadding(_gridVw.getAdapterView().getOuterPadding());
        _myBoardAdapter.setBrickPadding(_gridVw.getAdapterView().getBrickPadding());
        _myBoardAdapter.setColumnCount(_gridVw.getAdapterView().getColumnCount());
        _boardListView.setAdapter(_myBoardAdapter);
        _boardListView.setHorizontalScrollBarEnabled(false);
        _boardListView.setItemMargin(BOARD_ITEM_PADDING);
        _boardListView.setOverScrollMode(2);
        _gridVw.addHeaderView(_boardListView, -1, -2);
        _pinDividerView = new BevelTitleDivider(view.getContext());
        _pinDividerView.setPadding(0, SCROLLVIEW_PADDING, 0, 0);
        _pinDividerView.setText(0x7f07061e);
        _pinDividerView.setVisibility(8);
        _gridVw.addHeaderView(_pinDividerView, -1, -2);
        _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADING);
        _gridVw.setAdapterViewListener(new MyPinAdapterViewListener(null));
    }

    protected void updateEmptyContent()
    {
        _emptyMessage = Resources.string(0x7f070275, new Object[] {
            _lastQuery
        });
        super.updateEmptyContent();
    }






    private class BoardSearchFeedResponse extends com.pinterest.api.remote.BoardApi.GuidedBoardFeedApiResponse
    {

        final GuidedMyPinSearchFragment this$0;

        public void onSuccess(Feed feed)
        {
            byte byte2 = 8;
            _myBoardAdapter.setDataSource(feed);
            byte byte0;
            byte byte1;
            if (_myBoardAdapter == null || _myBoardAdapter.getCount() == 0)
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            feed = _boardListView;
            if (byte0 != 0)
            {
                byte1 = 8;
            } else
            {
                byte1 = 0;
            }
            ViewHelper.setVisibility(feed, byte1);
            feed = _boardDividerView;
            if (byte0 != 0)
            {
                byte0 = byte2;
            } else
            {
                byte0 = 0;
            }
            ViewHelper.setVisibility(feed, byte0);
        }

        public BoardSearchFeedResponse(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = GuidedMyPinSearchFragment.this;
            super(feedapiresponsehandler);
        }
    }


    private class PinSearchFeedResponse extends com.pinterest.api.remote.PinApi.GuidedPinFeedApiResponse
    {

        final GuidedMyPinSearchFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            class _cls1 extends BackgroundTask
            {

                public PinFeed feed;
                final PinSearchFeedResponse this$1;

                public void onFinish()
                {
                    super.onFinish();
                    onSuccess(feed);
                }

                public void run()
                {
                    feed = new PinFeed();
                    feed.setItems(ModelHelper.searchUserPins(MyUser.getUid(), _lastQuery));
                }

                _cls1()
                {
                    this$1 = PinSearchFeedResponse.this;
                    super();
                }
            }

            (new _cls1()).execute();
        }

        public void onStart()
        {
            super.onStart();
            ViewHelper.setVisibility(_nagView, 8);
        }

        public void onSuccess(Feed feed)
        {
            byte byte0 = 0;
            super.onSuccess(feed);
            Object obj = new HashMap();
            ((HashMap) (obj)).put("query", _lastQuery);
            Pinalytics.a(EventType.SEARCH_MY_PINS, "0", ((HashMap) (obj)));
            boolean flag;
            if (feed == null || feed.getCount() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = _pinDividerView;
            if (flag)
            {
                byte0 = 8;
            }
            ((BevelTitleDivider) (obj)).setVisibility(byte0);
            SearchNagView.showSearchNag(_nagView, feed);
        }

        public PinSearchFeedResponse()
        {
            this$0 = GuidedMyPinSearchFragment.this;
            super();
        }

        public PinSearchFeedResponse(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = GuidedMyPinSearchFragment.this;
            super(feedapiresponsehandler);
        }
    }


    private class MyPinAdapterViewListener
        implements com.pinterest.ui.grid.PinterestAdapterView.PinterAdapterViewListener
    {

        final GuidedMyPinSearchFragment this$0;

        public void onConfigurationChanged(Configuration configuration)
        {
            if (configuration.orientation == 2 || configuration.orientation == 1)
            {
                _myBoardAdapter.updateColumnWidth((int)Device.dpToPixel(configuration.screenWidthDp), 
// JavaClassFileOutputException: get_constant: invalid tag

        public void onLayout()
        {
        }

        public void onMeasure()
        {
        }

        private MyPinAdapterViewListener()
        {
            this$0 = GuidedMyPinSearchFragment.this;
            super();
        }

        MyPinAdapterViewListener(_cls1 _pcls1)
        {
            this();
        }
    }

}
