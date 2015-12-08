// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.findfriend.adapter.InviteFriendAdapter;
import com.pinterest.activity.findfriend.event.InviteCountChangeEvent;
import com.pinterest.activity.findfriend.event.InviteCreateEvent;
import com.pinterest.activity.findfriend.event.SelectAllEvent;
import com.pinterest.activity.findfriend.view.FindFriendsInviteAllHeaderView;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Events;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.text.PButton;

public class FindFriendsInviteAllFragment extends BaseFragment
{

    ActionBar _actionBar;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private FindFriendsInviteAllHeaderView _header;
    ListView _listView;
    private InviteFriendAdapter _listViewAdapter;
    private PButton _sendBtn;

    public FindFriendsInviteAllFragment()
    {
        _eventsSubscriber = new _cls2();
    }

    protected void onActivate()
    {
        super.onActivate();
        Events.register(_eventsSubscriber, com/pinterest/activity/findfriend/event/InviteCreateEvent, new Class[] {
            com/pinterest/activity/findfriend/event/InviteCountChangeEvent, com/pinterest/activity/findfriend/event/SelectAllEvent
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300c6;
        _menuId = 0;
    }

    protected void onDeactivate()
    {
        Events.unregister(_eventsSubscriber);
        super.onDeactivate();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _listViewAdapter = new InviteFriendAdapter(getActivity());
        _listViewAdapter.setApiTag(getApiTag());
        _listViewAdapter.setContactType(0);
        _listViewAdapter.addAllToInviteList();
        _header = new FindFriendsInviteAllHeaderView(getActivity());
        _listView.addHeaderView(_header);
        _listView.setAdapter(_listViewAdapter);
        _listView.setSelection(0);
        _listViewAdapter.refresh();
        view = LayoutInflater.from(getActivity()).inflate(0x7f0301df, null);
        _actionBar.getActionBar().addView(view, -1, -2);
        _sendBtn = (PButton)view.findViewById(0x7f0f022e);
        _sendBtn.setOnClickListener(new _cls1());
    }



    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final FindFriendsInviteAllFragment this$0;

        public void onEventMainThread(InviteCountChangeEvent invitecountchangeevent)
        {
            if (_header != null)
            {
                _header.updateFriendsCount(invitecountchangeevent.count);
            }
        }

        public void onEventMainThread(InviteCreateEvent invitecreateevent)
        {
            _listViewAdapter.bulkInvite();
        }

        public void onEventMainThread(SelectAllEvent selectallevent)
        {
            if (selectallevent.isSelectAll)
            {
                _listViewAdapter.addAllToInviteList();
            } else
            {
                _listViewAdapter.clearInviteList();
            }
            _listViewAdapter.notifyDataSetChanged();
            if (_header != null)
            {
                _header.updateFriendsCount(_listViewAdapter.getInviteListSize());
            }
        }

        _cls2()
        {
            this$0 = FindFriendsInviteAllFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FindFriendsInviteAllFragment this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.SEND_INVITE_BUTTON, ComponentType.BULK_INVITE);
            Events.post(new InviteCreateEvent(true));
        }

        _cls1()
        {
            this$0 = FindFriendsInviteAllFragment.this;
            super();
        }
    }

}
