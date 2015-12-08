// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.home.adapter.HomefeedBuilderGridAdapter;
import com.pinterest.activity.home.util.HomefeedBuilderData;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.ApiFields;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderBaseFragment

public class HomefeedBuilderMyTopicsFragment extends HomefeedBuilderBaseFragment
{

    protected com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    protected HomefeedBuilderFragment.MODE _mode;

    public HomefeedBuilderMyTopicsFragment()
    {
        _mode = HomefeedBuilderFragment.MODE.BROWSE;
        _eventsSubscriber = new _cls1();
        _layoutId = 0x7f0300d5;
        _menuId = 0x7f100002;
        _adapter = new HomefeedBuilderGridAdapter();
        ((HomefeedBuilderGridAdapter)_adapter).setIsOwnTopic(true);
        _movingSpeed = 0.0F;
    }

    protected void beforeFollow(Interest interest, int i)
    {
        EventType eventtype;
        HomefeedBuilderData homefeedbuilderdata;
        if (interest.getFollowing().booleanValue())
        {
            eventtype = EventType.INTEREST_FOLLOW;
        } else
        {
            eventtype = EventType.INTEREST_UNFOLLOW;
        }
        homefeedbuilderdata = HomefeedBuilderData.get();
        if (eventtype != EventType.INTEREST_FOLLOW) goto _L2; else goto _L1
_L1:
        homefeedbuilderdata.getUnfollowedInterestUids().remove(interest.getUid());
_L4:
        _adapter.notifyDataSetChanged();
        return;
_L2:
        if (eventtype == EventType.INTEREST_UNFOLLOW)
        {
            homefeedbuilderdata.getFollowedInterestUids().remove(interest.getUid());
            homefeedbuilderdata.getUnfollowedInterestUids().add(interest.getUid());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected String getReferralType()
    {
        return "homefeed_builder_browse";
    }

    protected void loadData()
    {
        InterestsApi.a(MyUser.getUid(), Device.getPageSize(), ApiFields.v, new com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse(gridResponseHandler), getApiTag());
    }

    protected void onActivate()
    {
        super.onActivate();
        loadData();
        updateList();
        Events.register(_eventsSubscriber);
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        Events.unregister(_eventsSubscriber);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.a(this);
        Events.unregister(_eventsSubscriber);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _gridVw.setOnItemClickListener(this);
        _gridVw.getFooterView().setBackgroundResource(0x7f0e00bf);
        view = new TextView(getActivity());
        view.setText(0x7f0705bc);
        view.setTextColor(Resources.color(0x7f0e00a9));
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        view.setGravity(17);
        view.setTextSize(0, Resources.dimension(0x7f0a01e3));
        view.setPadding(0, (int)Resources.dimension(0x7f0a015f), 0, (int)Resources.dimension(0x7f0a0162));
        _gridVw.addHeaderView(view);
        view = new TextView(getActivity());
        view.setText(0x7f07059e);
        view.setTextColor(Resources.color(0x7f0e00a9));
        bundle = new android.widget.LinearLayout.LayoutParams(-1, -2);
        bundle.setMargins(0, 0, (int)Resources.dimension(0x7f0a005f), 0);
        view.setLayoutParams(bundle);
        view.setGravity(17);
        view.setTextSize(0, Resources.dimension(0x7f0a01e4));
        _actionBar.addView(view);
        Events.register(_eventsSubscriber, com/pinterest/activity/home/view/HomefeedBuilderInterestFollowButton$InterestFollowEvent, new Class[0]);
        updateEmptyContent();
    }

    protected void updateEmptyContent()
    {
        _emptyMessage = Resources.string(0x7f0703a2);
        _emptyLeftImage = 0x7f02020f;
        _emptyCenterImage = 0x7f020217;
        _emptyRightImage = 0x7f020212;
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final HomefeedBuilderMyTopicsFragment this$0;

        public void onEventMainThread(com.pinterest.activity.home.view.HomefeedBuilderInterestFollowButton.InterestFollowEvent interestfollowevent)
        {
            onHomefeedInterestButtonFollow(interestfollowevent.getInterest());
        }

        _cls1()
        {
            this$0 = HomefeedBuilderMyTopicsFragment.this;
            super();
        }
    }

}
