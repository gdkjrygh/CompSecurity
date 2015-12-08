// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.findfriend.event.SelectAllEvent;
import com.pinterest.activity.findfriend.event.SingleCheckEvent;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

public class FindFriendsInviteAllHeaderView extends FrameLayout
{

    private boolean _allSelected;
    TextView _deselectAllTv;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    TextView _selectedCountTv;

    public FindFriendsInviteAllHeaderView(Context context)
    {
        this(context, null);
    }

    public FindFriendsInviteAllHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FindFriendsInviteAllHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _allSelected = true;
        _eventsSubscriber = new _cls1();
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301cf, this, true);
        ButterKnife.a(this, this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/activity/findfriend/event/SingleCheckEvent, new Class[0]);
    }

    public void onDeselectAllClick()
    {
        TextView textview;
        int i;
        boolean flag;
        if (!_allSelected)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _allSelected = flag;
        textview = _deselectAllTv;
        if (_allSelected)
        {
            i = 0x7f0701f8;
        } else
        {
            i = 0x7f070506;
        }
        textview.setText(i);
        Events.post(new SelectAllEvent(_allSelected));
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }

    public void updateFriendsCount(int i)
    {
        _selectedCountTv.setText(Resources.stringPlural(0x7f09000a, Integer.valueOf(i)));
    }



/*
    static boolean access$002(FindFriendsInviteAllHeaderView findfriendsinviteallheaderview, boolean flag)
    {
        findfriendsinviteallheaderview._allSelected = flag;
        return flag;
    }

*/

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final FindFriendsInviteAllHeaderView this$0;

        public void onEventMainThread(SingleCheckEvent singlecheckevent)
        {
            _allSelected = singlecheckevent.isAllChecked();
            singlecheckevent = _deselectAllTv;
            int i;
            if (_allSelected)
            {
                i = 0x7f0701f8;
            } else
            {
                i = 0x7f070506;
            }
            singlecheckevent.setText(i);
        }

        _cls1()
        {
            this$0 = FindFriendsInviteAllHeaderView.this;
            super();
        }
    }

}
