// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import com.pinterest.adapter.LoadMoreListener;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.NetworkUtils;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.fragment:
//            PinterestGridFragment

class this._cls0
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
                final PinterestGridFragment._cls4 this$1;
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
                this$1 = PinterestGridFragment._cls4.this;
                pagination = i;
                super();
            }
            }

            (new _cls1()).execute();
            return;
        }
        if (EducationHelper.n() && _adapter.getCount() >= 100)
        {
            Events.post(new ftwrapNUXEvent());
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

    ()
    {
        this$0 = PinterestGridFragment.this;
        super();
    }
}
