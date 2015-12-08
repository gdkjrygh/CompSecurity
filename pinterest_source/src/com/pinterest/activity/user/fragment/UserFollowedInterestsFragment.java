// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.interest.InterestsFragment;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.dialog.AddInterestDialog;
import com.pinterest.adapter.InterestsGridAdapter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            MyUserInterestsGridAdapter

public class UserFollowedInterestsFragment extends InterestsFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private User _user;

    public UserFollowedInterestsFragment()
    {
        _eventsSubscriber = new _cls1();
        _layoutId = 0x7f03011f;
    }

    protected void loadData()
    {
        InterestsApi.a(_navigation.getId(), -1, new com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse(gridResponseHandler), getApiTag());
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/user/fragment/UserFollowedInterestsFragment$UpdateEvent
        });
        super.onDestroyView();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            if (_adapter != null)
            {
                if (_adapter.getItemViewType(i) != 1)
                {
                    break label0;
                }
                Events.post(new DialogEvent(new AddInterestDialog()));
            }
            return;
        }
        if (MyUser.isUserMe(_user))
        {
            Interest interest = (Interest)((InterestsGridAdapter)_adapter).getItem(i);
            if (interest != null)
            {
                interest.setFollowing(Boolean.valueOf(true));
            }
        }
        super.onItemClick(adapterview, view, i, l);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        Events.register(_eventsSubscriber, com/pinterest/activity/user/fragment/UserFollowedInterestsFragment$UpdateEvent, new Class[0]);
        _actionBar.setTitle(0x7f0702b6);
        updateEmptyContent();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation != null)
        {
            _user = navigation.getModelAsUser();
            if (MyUser.isUserMe(_user))
            {
                _adapter = new MyUserInterestsGridAdapter();
                return;
            }
        }
    }

    protected void updateEmptyContent()
    {
        if (MyUser.isUserMe(_user))
        {
            _emptyMessage = Resources.string(0x7f07025e);
            return;
        } else
        {
            _emptyMessage = Resources.string(0x7f07024b, new Object[] {
                _user.getFirstName()
            });
            return;
        }
    }


    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UserFollowedInterestsFragment this$0;

        public void onEventMainThread(UpdateEvent updateevent)
        {
            if (MyUser.isUserMe(
// JavaClassFileOutputException: get_constant: invalid tag

        _cls1()
        {
            this$0 = UserFollowedInterestsFragment.this;
            super();
        }
    }

}
