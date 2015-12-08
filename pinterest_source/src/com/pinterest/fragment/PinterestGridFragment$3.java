// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import com.android.volley.NetworkError;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.fragment:
//            PinterestGridFragment

class  extends FeedApiResponseHandler
{

    final PinterestGridFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if ((throwable == null || (throwable instanceof NetworkError)) && Experiments.v())
        {
            class _cls1 extends BackgroundTask
            {

                Feed _feed;
                final PinterestGridFragment._cls3 this$1;
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
                this$1 = PinterestGridFragment._cls3.this;
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
                _gridVw.setState(com.pinterest.ui.grid.ERROR);
                return;
            }
            throwable = Resources.string(0x7f070350);
            if (apiresponse != null)
            {
                throwable = apiresponse.getMessageDetailIfExist();
            }
            _gridVw.setState(com.pinterest.ui.grid.ERROR);
            _gridVw.setEmptyMessage(throwable);
        }
        PinterestGridFragment.access$1002(PinterestGridFragment.this, false);
        if (_adapter != null)
        {
            _adapter.setLoading(false);
        }
        PinterestGridFragment.access$1100(PinterestGridFragment.this, _adapter);
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
            _gridVw.setState(com.pinterest.ui.grid.LOADING);
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
            if (PinterestGridFragment.access$600(PinterestGridFragment.this))
            {
                _gridVw.setDataSource(feed);
                onDataSourceChanged(false);
            } else
            {
                _gridVw.appendDataSource(feed);
                onDataSourceChanged(false);
            }
            _gridVw.setState(com.pinterest.ui.grid.LOADED);
        }
        PinterestGridFragment.access$702(PinterestGridFragment.this, false);
        if (_adapter != null)
        {
            _adapter.setLoading(false);
        }
        if (feed != null)
        {
            i = feed.getCount();
        }
        Events.post(new edLoadedEvent(i));
        PinterestGridFragment.access$800(PinterestGridFragment.this, _adapter);
    }

    edLoadedEvent()
    {
        this$0 = PinterestGridFragment.this;
        super();
    }
}
