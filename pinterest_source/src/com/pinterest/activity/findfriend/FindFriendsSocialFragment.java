// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.findfriend.view.FindFriendsSocialEmptyView;
import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.fragment.PeopleListFragment;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.text.PButton;

public abstract class FindFriendsSocialFragment extends PeopleListFragment
{

    protected static final int AFTER_CONNECT_LOAD_DELAY = 2000;
    protected PButton _connectBtn;
    protected TextView _connectSubtitleTv;
    protected TextView _connectTitleTv;
    private FindFriendsSocialEmptyView _emptyViewContainer;
    protected Handler _handler;
    protected ViewGroup _unconnectedViewContainer;

    public FindFriendsSocialFragment()
    {
    }

    public void buildEmptyViewContainer()
    {
        _emptyViewContainer = new FindFriendsSocialEmptyView(getActivity());
        _emptyViewContainer.setSubtitleTextId(getEmptySubtitleStringId());
        _emptyView.setCustomView(_emptyViewContainer);
    }

    public abstract void buildUnconnectedView();

    protected abstract int getEmptySubtitleStringId();

    protected void initializeListView()
    {
        if (isSocialServiceConnected())
        {
            super.initializeListView();
        }
    }

    public abstract boolean isSocialServiceConnected();

    public void loadData()
    {
        if (isSocialServiceConnected())
        {
            loadSocialData();
        }
    }

    public abstract void loadSocialData();

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300c8;
        ((PeopleListAdapter)_adapter).setRequireFullUserInfo(true);
        ((PeopleListAdapter)_adapter).setIsLastNameEmphasized(true);
        _handler = new Handler(Looper.getMainLooper());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        buildUnconnectedView();
        buildEmptyViewContainer();
        if (refreshState())
        {
            loadData();
        }
    }

    public boolean refreshState()
    {
        boolean flag1 = isSocialServiceConnected();
        ViewGroup viewgroup = _unconnectedViewContainer;
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(viewgroup, flag);
        ViewHelper.setVisibility(_listView, flag1);
        if (flag1)
        {
            initializeListView();
        }
        return flag1;
    }
}
