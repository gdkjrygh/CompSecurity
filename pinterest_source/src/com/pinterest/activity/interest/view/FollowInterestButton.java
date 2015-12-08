// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.TopicFollowToast;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.api.model.Interest;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.text.FollowButton;
import java.util.HashMap;

public class FollowInterestButton extends FollowButton
{

    protected Interest _interest;
    protected boolean _pendingApiResponse;

    public FollowInterestButton(Context context)
    {
        super(context);
    }

    public FollowInterestButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FollowInterestButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void saveInterest()
    {
        (new _cls3()).execute();
    }

    protected boolean isFollowing()
    {
        return _interest != null && Constants.isTrue(_interest.getFollowing());
    }

    public void onClick(View view)
    {
        boolean flag = true;
        if (_pendingApiResponse)
        {
            return;
        }
        _pendingApiResponse = true;
        view = _interest;
        HashMap hashmap;
        if (Constants.isTrue(_interest.getFollowing()))
        {
            flag = false;
        }
        view.setFollowing(Boolean.valueOf(flag));
        updateDisplay();
        if (_interest.getFollowing().booleanValue())
        {
            view = EventType.INTEREST_FOLLOW;
        } else
        {
            view = EventType.INTEREST_UNFOLLOW;
        }
        hashmap = new HashMap();
        hashmap.put("interest", _interest.getUrlName());
        if (_interest.getRecommendationSource() != null)
        {
            hashmap.put("recommendation_source", _interest.getRecommendationSource());
        }
        if (_mode == com.pinterest.ui.text.FollowButton.MODE.DYNAMIC_GRID && _story != null)
        {
            hashmap.putAll(_story.getAuxData());
            Events.post(new ToastEvent(new TopicFollowToast(_interest)));
        }
        Pinalytics.a(view, _interest.getUid(), null, hashmap);
        InterestsApi.a(_interest, _interest.getFollowing().booleanValue(), null, _interest.getRecommendationSource(), null, new _cls1(), null);
    }

    public void setInterest(Interest interest)
    {
        _interest = interest;
        if (_interest == null) goto _L2; else goto _L1
_L1:
        if (_interest.getFollowing() == null) goto _L4; else goto _L3
_L3:
        setLoading(false);
_L2:
        updateDisplay();
_L6:
        return;
_L4:
        if (!_pendingApiResponse)
        {
            _pendingApiResponse = true;
            setLoading(true);
            InterestsApi.a(_interest.getUid(), new _cls2());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }



    private class _cls3 extends BackgroundTask
    {

        final FollowInterestButton this$0;

        public void run()
        {
            ModelHelper.setInterest(_interest);
        }

        _cls3()
        {
            this$0 = FollowInterestButton.this;
            super();
        }
    }


    private class _cls1 extends ApiResponseHandler
    {

        final FollowInterestButton this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            throwable = _interest;
            boolean flag;
            if (!_interest.getFollowing().booleanValue())
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
            setLoading(false);
            _pendingApiResponse = false;
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            ModelHelper.setInterest(_interest);
            Events.post(new com.pinterest.api.model.Interest.UpdateEvent(_interest, _interest.getFollowing()));
            Events.post(new com.pinterest.activity.user.fragment.UserFollowedInterestsFragment.UpdateEvent());
        }

        _cls1()
        {
            this$0 = FollowInterestButton.this;
            super();
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final FollowInterestButton this$0;

        public void onFinish()
        {
            _pendingApiResponse = false;
            setLoading(false);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = ((ApiResponse) (apiresponse.getData()));
            boolean flag;
            if (apiresponse instanceof String)
            {
                flag = Boolean.valueOf((String)apiresponse).booleanValue();
            } else
            {
                flag = false;
            }
            _interest.setFollowing(Boolean.valueOf(flag));
            saveInterest();
            updateDisplay();
        }

        _cls2()
        {
            this$0 = FollowInterestButton.this;
            super();
        }
    }

}
