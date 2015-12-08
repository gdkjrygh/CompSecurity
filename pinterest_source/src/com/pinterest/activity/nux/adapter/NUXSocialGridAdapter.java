// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.adapter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.nux.fragment.NUXSocialGridFragment;
import com.pinterest.activity.nux.view.NUXSocialGridCell;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.User;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.AdapterFooterView;
import java.util.ArrayList;
import java.util.HashMap;

public class NUXSocialGridAdapter extends PinterestBaseAdapter
{

    private ArrayList _checkedUsers;
    private ArrayList _defaultUserImages;
    private AdapterFooterView _footerView;
    private NUXSocialGridFragment _fragment;
    private Handler _handler;
    private boolean _isAllUsersChecked;
    private boolean _isDefaultView;
    private boolean isLoadingMoreItems;

    public NUXSocialGridAdapter(NUXSocialGridFragment nuxsocialgridfragment, boolean flag)
    {
        isLoadingMoreItems = false;
        _isAllUsersChecked = false;
        _isDefaultView = false;
        _dataSource = new UserFeed();
        _checkedUsers = new ArrayList();
        _handler = new Handler();
        _isAllUsersChecked = false;
        _isDefaultView = false;
        _fragment = nuxsocialgridfragment;
        _isAllUsersChecked = flag;
    }

    public int getCheckUsersSize()
    {
        if (_isAllUsersChecked)
        {
            return _checkedUsers.size() + 1;
        } else
        {
            return _checkedUsers.size();
        }
    }

    public ArrayList getCheckedUsers()
    {
        return _checkedUsers;
    }

    public int getCount()
    {
        while (_dataSource == null || _dataSource.getCount() == 0) 
        {
            return 0;
        }
        return _dataSource.getCount() + 1;
    }

    public volatile Model getItem(int i)
    {
        return getItem(i);
    }

    public User getItem(int i)
    {
        return (User)_dataSource.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public int getItemHeight(int i, int j, boolean flag)
    {
        _cachedItemHeights.put(Integer.valueOf(i), Integer.valueOf(j));
        return j;
    }

    public int getItemSpan(int i)
    {
        return 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return getView(i, view, viewgroup, false);
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        boolean flag2 = true;
        super.getView(i, view, viewgroup, flag);
        view = NUXSocialGridCell.from(view, ViewHelper.getContext(view, viewgroup));
        boolean flag1;
        if (_isDefaultView && _defaultUserImages != null)
        {
            view.setBackgroundDrawable((Drawable)_defaultUserImages.get(i % _defaultUserImages.size()));
            view.setImageVisiblity(4);
            flag1 = false;
        } else
        if (i == 0)
        {
            view.setIsFirstCell(true, _isAllUsersChecked);
            view.setAlpha(1.0F);
            view.setImageBackgroundResource(0);
            flag1 = flag2;
        } else
        {
            viewgroup = getItem(i - 1);
            view.setIsFirstCell(false, _isAllUsersChecked);
            view.setUser(viewgroup);
            view.setImageBackgroundResource(0x7f0200cb);
            float f;
            if (_isAllUsersChecked)
            {
                flag1 = true;
            } else
            {
                flag1 = _checkedUsers.contains(viewgroup);
            }
            view.setChecked(flag1);
            if (_isAllUsersChecked)
            {
                f = 0.5F;
            } else
            {
                f = 1.0F;
            }
            view.setAlpha(f);
            if (_isAllUsersChecked)
            {
                flag1 = false;
            } else
            {
                flag1 = flag2;
            }
        }
        view.setEnabled(flag1);
        if (!flag)
        {
            loadMore(i);
        }
        return view;
    }

    public boolean isAllUsersChecked()
    {
        return _isAllUsersChecked;
    }

    public boolean isCheckedUsersEmpty()
    {
        if (_isAllUsersChecked)
        {
            return false;
        } else
        {
            return _checkedUsers.isEmpty();
        }
    }

    public boolean isUserChecked(User user)
    {
        return _checkedUsers.contains(user);
    }

    public void loadMore(final int position)
    {
        super.loadMore(position);
        int i = getCount();
        if (i >= 0 && i - position <= 1 && !isLoadingMoreItems && _dataSource.getNextUrl() != null)
        {
            isLoadingMoreItems = true;
            setSpinnerState(0);
            BaseApi.e(_dataSource.getNextUrl(), new _cls1(), _apiTag);
        }
        if (i == 0 && _dataSource.getNextUrl() == null)
        {
            _fragment.showNoFollowersHeader();
        }
    }

    public void setFooterView(AdapterFooterView adapterfooterview)
    {
        _footerView = adapterfooterview;
    }

    public void setIsDefault(boolean flag, ArrayList arraylist)
    {
        _isDefaultView = flag;
        _defaultUserImages = arraylist;
    }

    public void setSpinnerState(int i)
    {
        if (_footerView != null)
        {
            _footerView.setState(i);
        }
    }

    public void toggleCheckAllUsers()
    {
        boolean flag;
        if (!_isAllUsersChecked)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isAllUsersChecked = flag;
        notifyDataSetChanged();
    }

    public void toggleCheckUser(User user)
    {
        if (_checkedUsers.contains(user))
        {
            _checkedUsers.remove(user);
            return;
        } else
        {
            _checkedUsers.add(user);
            return;
        }
    }


/*
    static boolean access$002(NUXSocialGridAdapter nuxsocialgridadapter, boolean flag)
    {
        nuxsocialgridadapter.isLoadingMoreItems = flag;
        return flag;
    }

*/



    private class _cls1 extends BaseApiResponseHandler
    {

        final NUXSocialGridAdapter this$0;
        final int val$position;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            class _cls2
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    setSpinnerState(1);
                    isLoadingMoreItems = false;
                }

                _cls2()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            _handler.post(new _cls2());
        }

        public void onSuccess(final PinterestJsonObject nextUserFeed)
        {
            nextUserFeed = new UserFeed(nextUserFeed, getBaseUrl());
            class _cls1
                implements Runnable
            {

                final _cls1 this$1;
                final Feed val$nextUserFeed;

                public void run()
                {
                    setSpinnerState(1);
                    isLoadingMoreItems = false;
                    
// JavaClassFileOutputException: get_constant: invalid tag

                _cls1()
                {
                    this$1 = _cls1.this;
                    nextUserFeed = feed;
                    super();
                }
            }

            _handler.post(new _cls1());
        }

        _cls1()
        {
            this$0 = NUXSocialGridAdapter.this;
            position = i;
            super();
        }
    }

}
