// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.home.adapter.HomefeedBuilderBaseAdapter;
import com.pinterest.activity.home.util.HomefeedBuilderData;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.ModelAccessCache;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.schemas.event.EventType;
import java.util.ArrayList;
import java.util.List;

public abstract class HomefeedBuilderBaseFragment extends PinterestGridFragment
    implements android.widget.AdapterView.OnItemClickListener
{

    private static final int IMPRESSION_DUMP_TIMEOUT = 30000;
    protected Handler _handler;
    protected ArrayList _impressions;
    private Runnable dumpImpressionInterval;

    public HomefeedBuilderBaseFragment()
    {
        _impressions = new ArrayList();
        dumpImpressionInterval = new _cls2();
        _handler = new Handler();
    }

    private void reportImpressions()
    {
        dumpImpressionsFromAdapter();
        if (_impressions == null || _impressions.size() == 0)
        {
            return;
        } else
        {
            Pinalytics.e(EventType.INTEREST_IMPRESSION_CLIENT_SIDE, _impressions);
            _impressions.clear();
            return;
        }
    }

    protected void beforeFollow(Interest interest, int i)
    {
    }

    protected void dumpImpressionsFromAdapter()
    {
        if (_adapter == null || _impressions == null)
        {
            return;
        } else
        {
            _impressions.addAll(((HomefeedBuilderBaseAdapter)_adapter).getImpressions());
            ((HomefeedBuilderBaseAdapter)_adapter).clearImpressions();
            return;
        }
    }

    protected void followInterest(final Interest interest, int i)
    {
        EventType eventtype;
        if (interest.getFollowing().booleanValue())
        {
            eventtype = EventType.INTEREST_FOLLOW;
        } else
        {
            eventtype = EventType.INTEREST_UNFOLLOW;
        }
        Pinalytics.a(eventtype, interest.getUid(), null, HomefeedBuilderData.getAuxData(interest, getReferralType()));
        beforeFollow(interest, i);
        InterestsApi.a(interest, interest.getFollowing().booleanValue(), getReferralType(), interest.getRecommendationSource(), Boolean.valueOf(false), new _cls1(), getApiTag());
    }

    protected String getReferralType()
    {
        return null;
    }

    protected void onHomefeedInterestButtonFollow(Interest interest)
    {
        if (interest == null)
        {
            return;
        } else
        {
            followInterest(interest, 0);
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
    }

    public void setActive(boolean flag)
    {
        boolean flag1;
        if (_active != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            _handler.removeCallbacksAndMessages(null);
            if (_active)
            {
                reportImpressions();
            } else
            {
                _handler.postDelayed(dumpImpressionInterval, 30000L);
            }
        }
        super.setActive(flag);
    }

    protected void updateFollowingCount()
    {
    }

    protected void updateList()
    {
        Object obj = _adapter.getDataSource();
        if (obj == null)
        {
            return;
        }
        obj = ((Feed) (obj)).getItems();
        for (int i = 0; i < ((List) (obj)).size(); i++)
        {
            Interest interest = (Interest)((List) (obj)).get(i);
            Interest interest1 = ModelAccessCache.getInterest(interest.getUid());
            if (interest1 != null && interest1.getFollowing() != null)
            {
                interest.setFollowing(interest1.getFollowing());
                ((List) (obj)).set(i, interest);
            }
        }

        _adapter.notifyDataSetChanged();
    }


    private class _cls2
        implements Runnable
    {

        final HomefeedBuilderBaseFragment this$0;

        public void run()
        {
            reportImpressions();
            if (isAdded() && isActive() && _handler != null)
            {
                _handler.postDelayed(this, 30000L);
            }
        }

        _cls2()
        {
            this$0 = HomefeedBuilderBaseFragment.this;
            super();
        }
    }


    private class _cls1 extends ApiResponseHandler
    {

        final HomefeedBuilderBaseFragment this$0;
        final Interest val$interest;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            throwable = interest;
            boolean flag;
            if (!interest.getFollowing().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            throwable.setFollowing(Boolean.valueOf(flag));
        }

        public void onFinish()
        {
            super.onFinish();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            ModelHelper.setInterest(interest);
            Events.post(new com.pinterest.api.model.Interest.UpdateEvent(interest, interest.getFollowing()));
            updateFollowingCount();
        }

        _cls1()
        {
            this$0 = HomefeedBuilderBaseFragment.this;
            interest = interest1;
            super();
        }
    }

}
