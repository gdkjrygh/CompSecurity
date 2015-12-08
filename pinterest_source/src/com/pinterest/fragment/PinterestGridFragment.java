// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import butterknife.ButterKnife;
import com.pinterest.activity.task.fragment.AdapterViewFragment;
import com.pinterest.adapter.LoadMoreListener;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.adapter.Refreshable;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.actions.ScrollableListener;
import com.pinterest.ui.grid.PinterestGridView;

public class PinterestGridFragment extends AdapterViewFragment
    implements Refreshable
{

    private static final int ACTIONBAR_HEIGHT = (int)Resources.dimension(0x7f0a0009);
    private static final int FEED_PINS_UNTIL_GIFTWRAP = 100;
    private static final int METADATABAR_HEIGHT = (int)Resources.dimension(0x7f0a0010);
    protected PinterestBaseAdapter _adapter;
    protected boolean _fixedActionBar;
    protected PinterestGridView _gridVw;
    protected float _movingSpeed;
    private int _offlinePagination;
    protected int _swipeOffsetEnd;
    protected int _swipeOffsetStart;
    protected SwipeRefreshLayout _swipeVw;
    protected FeedApiResponseHandler gridResponseHandler;
    protected LoadMoreListener loadMoreListener;

    public PinterestGridFragment()
    {
        _fixedActionBar = false;
        _movingSpeed = 1.0F;
        _swipeOffsetStart = 0;
        _swipeOffsetEnd = Constants.SWIPE_OFFSET_LENGTH;
        _offlinePagination = -1;
        gridResponseHandler = new _cls3();
        loadMoreListener = new _cls4();
        _layoutId = 0x7f0300f8;
    }

    private int nextOfflinePagination()
    {
        if (_refreshing)
        {
            _offlinePagination = 0;
        } else
        {
            _offlinePagination = _offlinePagination + 1;
        }
        return _offlinePagination;
    }

    protected Feed getOfflineFeed(int i)
    {
        return null;
    }

    public Pair getScrollPosition()
    {
        if (_gridVw != null)
        {
            return new Pair(Integer.valueOf(_gridVw.getScrolledX()), Integer.valueOf(_gridVw.getScrolledY()));
        } else
        {
            return super.getScrollPosition();
        }
    }

    public boolean isDataNonEmpty()
    {
        return _adapter != null && !_adapter.isEmpty();
    }

    protected void onActivate()
    {
        super.onActivate();
        if (_gridVw != null)
        {
            _gridVw.forceMakeCurrent();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        _adapter.setLoadMoreListener(loadMoreListener);
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        ButterKnife.a(this, layoutinflater);
        _gridVw.setAdapter(_adapter);
        if (_scrollListener != null)
        {
            _gridVw.addListener(_scrollListener);
        }
        if (_adapter.restoreInstanceState(bundle))
        {
            _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADED);
        }
        _gridVw.addListener(new _cls1());
        if (_swipeVw != null)
        {
            _swipeVw.setColorSchemeResources(new int[] {
                0x7f0e009c
            });
            _swipeVw.setOnRefreshListener(new _cls2());
        }
        return layoutinflater;
    }

    protected void onDataSourceChanged(boolean flag)
    {
    }

    public void onDestroyView()
    {
        if (_adapter != null)
        {
            _adapter.setLoadMoreListener(null);
        }
        if (_gridVw != null)
        {
            _gridVw.cleanupView();
        }
        ButterKnife.a(this);
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(_adapter.saveInstanceState(bundle));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        boolean flag;
        flag = false;
        super.onViewCreated(view, bundle);
        if (_swipeVw != null)
        {
            _swipeVw.setProgressViewOffset(false, _swipeOffsetStart, _swipeOffsetEnd);
        }
        if (_adapter == null || _adapter.getDataSource() == null) goto _L2; else goto _L1
_L1:
        view = _adapter.getDataSource();
        if (view.getAbsCount() <= 0) goto _L2; else goto _L3
_L3:
        view.onStart();
        reset(view);
        _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADED);
_L5:
        if (flag)
        {
            loadData();
        }
        return;
_L2:
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void reset()
    {
        Feed feed;
        if (_adapter == null)
        {
            feed = null;
        } else
        {
            feed = _adapter.getDataSource();
        }
        reset(feed);
    }

    public void reset(Feed feed)
    {
        if (_adapter != null && feed != null)
        {
            _adapter.resetCachedItemHeights();
            _adapter.setDataSource(feed);
            if (_gridVw != null)
            {
                _gridVw.requestLayout();
                _gridVw.reset();
            }
        }
    }

    public void scrollTo(int i, int j)
    {
        scrollTo(i, j, false);
    }

    public void scrollTo(int i, int j, boolean flag)
    {
        if (_gridVw == null)
        {
            return;
        }
        if (flag)
        {
            _gridVw.scrollTo(i, j);
            return;
        } else
        {
            _gridVw.smoothScrollTo(i, j);
            return;
        }
    }

    public void setMovingSpeed(float f)
    {
        _movingSpeed = f;
    }

    public void setScrollListener(ScrollableListener scrollablelistener)
    {
        super.setScrollListener(scrollablelistener);
        if (_gridVw != null)
        {
            _gridVw.addListener(scrollablelistener);
        }
    }





/*
    static boolean access$1002(PinterestGridFragment pinterestgridfragment, boolean flag)
    {
        pinterestgridfragment._refreshing = flag;
        return flag;
    }

*/








/*
    static boolean access$702(PinterestGridFragment pinterestgridfragment, boolean flag)
    {
        pinterestgridfragment._refreshing = flag;
        return flag;
    }

*/



    private class _cls3 extends FeedApiResponseHandler
    {

        final PinterestGridFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if ((throwable == null || (throwable instanceof NetworkError)) && Experiments.v())
            {
                class _cls1 extends BackgroundTask
                {

                    Feed _feed;
                    final _cls3 this$1;
                    final int val$pagination;
                    final ApiResponse val$response;

                    public void onFinish()
                    {
                        if (_feed != null && _feed.getAbsCount() > 0)
                        {
                            _feed.setOffline(true);
                            onSuccess(_feed);
                            return;
                        } else
                        {
                            onFailure(new SQLDataException(), response);
                            return;
                        }
                    }

                    public void run()
                    {
                        _feed = getOfflineFeed(pagination);
                    }

                _cls1()
                {
                    this$1 = _cls3.this;
                    pagination = i;
                    response = apiresponse;
                    super();
                }
                }

                (new _cls1()).execute();
                return;
            }
            super.onFailure(throwable, apiresponse);
            if (_gridVw != null)
            {
                if (!NetworkUtils.getInstance().hasInternet())
                {
                    _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.ERROR);
                    return;
                }
                throwable = Resources.string(0x7f070350);
                if (apiresponse != null)
                {
                    throwable = apiresponse.getMessageDetailIfExist();
                }
                _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.ERROR);
                _gridVw.setEmptyMessage(throwable);
            }
            false. = throwable;
            if (_adapter != null)
            {
                _adapter.setLoading(false);
            }
            setEmptyContent(_adapter);
        }

        public void onFinish()
        {
            super.onFinish();
            if (_swipeVw != null)
            {
                _swipeVw.setRefreshing(false);
            }
        }

        public void onStart()
        {
            super.onStart();
            if (_gridVw != null)
            {
                _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADING);
            }
            if (_adapter != null)
            {
                _adapter.setLoading(true);
            }
        }

        public void onSuccess(Feed feed)
        {
            int i = 0;
            super.onSuccess(feed);
            if (_gridVw != null)
            {
                StopWatch.get().logTimeStamp("ttrfp_tmp_log", "ts_50_set_data_source");
                if ()
                {
                    _gridVw.setDataSource(feed);
                    onDataSourceChanged(false);
                } else
                {
                    _gridVw.appendDataSource(feed);
                    onDataSourceChanged(false);
                }
                _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADED);
            }
            false. = feed;
            if (_adapter != null)
            {
                _adapter.setLoading(false);
            }
            if (feed != null)
            {
                i = feed.getCount();
            }
            Events.post(new FeedLoadedEvent(i));
            setEmptyContent(_adapter);
        }

        _cls3()
        {
            this$0 = PinterestGridFragment.this;
            super();
        }

        private class FeedLoadedEvent
        {

            private int count;

            public int getCount()
            {
                return count;
            }

            public FeedLoadedEvent(int i)
            {
                count = i;
            }
        }

    }


    private class _cls4
        implements LoadMoreListener
    {

        final PinterestGridFragment this$0;

        public void loadMore()
        {
            if (_adapter != null && _adapter.getCount() != 0) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (_adapter.getDataSource().isOffline() && Experiments.v())
            {
                class _cls1 extends BackgroundTask
                {

                    Feed _feed;
                    final _cls4 this$1;
                    final int val$pagination;

                    public void onFinish()
                    {
                        if (_feed != null && _feed.getAbsCount() > 0)
                        {
                            _feed.setOffline(true);
                            gridResponseHandler.onSuccess(_feed);
                        }
                    }

                    public void run()
                    {
                        _feed = getOfflineFeed(pagination);
                    }

                _cls1()
                {
                    this$1 = _cls4.this;
                    pagination = i;
                    super();
                }
                }

                (new _cls1()).execute();
                return;
            }
            if (EducationHelper.n() && _adapter.getCount() >= 100)
            {
                Events.post(new GiftwrapNUXEvent());
            }
            Object obj1 = _adapter.getDataSource().getBaseUrl();
            if (StringUtils.isNotEmpty(((CharSequence) (obj1))))
            {
                String s = NetworkUtils.findParam(((String) (obj1)), "page_size");
                Object obj;
                if (Device.getFirstRequestPageSizeString().equals(s))
                {
                    obj = NetworkUtils.replaceParam(((String) (obj1)), "page_size", Device.getSecondRequestPageSizeString());
                } else
                {
                    obj = obj1;
                    if (Device.getSecondRequestPageSizeString().equals(s))
                    {
                        obj = NetworkUtils.replaceParam(((String) (obj1)), "page_size", Device.getPageSizeString());
                    }
                }
                _adapter.getDataSource().setBaseUrl(((String) (obj)));
            }
            obj = _adapter.getDataSource().getNextUrl();
            if (obj == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = _adapter.getDataSource().newApiHandler();
            if (obj1 != null)
            {
                try
                {
                    ((FeedApiResponseHandler) (obj1)).setHandler(gridResponseHandler);
                    BaseApi.e(((String) (obj)), ((com.pinterest.api.BaseApiResponseHandler) (obj1)), getApiTag());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    PLog.error(((Throwable) (obj)), "exception occurred", new Object[0]);
                }
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        _cls4()
        {
            this$0 = PinterestGridFragment.this;
            super();
        }

        private class GiftwrapNUXEvent
        {

            public GiftwrapNUXEvent()
            {
            }
        }

    }



}
