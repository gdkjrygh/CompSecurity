// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.content.Context;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.board.view.PersonListCell;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.remote.ApiBatcher;
import com.pinterest.api.remote.UserApi;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class PeopleListAdapter extends BaseAdapter
{

    private static final int USER_INFO_PAGE_SIZE = 20;
    private static AbstractMap _runnableMap = new ConcurrentHashMap();
    private String _apiTag;
    protected UserFeed _dataSource;
    private Handler _followHandler;
    private boolean _isLastNameEmphasized;
    private LayoutInflater _li;
    private PeopleListListener _listener;
    protected boolean _loading;
    BaseApiResponseHandler _onUserLoad;
    private boolean _requireFullUserInfo;
    private HashMap _userMap;
    private android.view.View.OnClickListener onFollowClicked;
    public android.widget.AdapterView.OnItemClickListener onItemClick;

    public PeopleListAdapter()
    {
        this(null);
    }

    public PeopleListAdapter(Context context)
    {
        _isLastNameEmphasized = false;
        _onUserLoad = new _cls2();
        onItemClick = new _cls3();
        onFollowClicked = new _cls4();
        if (context != null)
        {
            _li = LayoutInflater.from(context);
        }
        _followHandler = new Handler();
        _dataSource = new UserFeed();
        _userMap = new HashMap();
    }

    private SpannableStringBuilder getEmphasizedLastName(String s)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        int i = 0;
        int j = s.lastIndexOf(' ');
        spannablestringbuilder.append(s);
        if (j != -1)
        {
            i = j + 1;
        }
        spannablestringbuilder.setSpan(new StyleSpan(1), i, spannablestringbuilder.length(), 33);
        return spannablestringbuilder;
    }

    private void loadFullUserInfo(UserFeed userfeed)
    {
        if (!_requireFullUserInfo)
        {
            return;
        } else
        {
            _cls1 _lcls1 = new _cls1();
            (new ApiBatcher(userfeed.getItems(), _lcls1, _onUserLoad, _apiTag)).run();
            return;
        }
    }

    public void appendItems(UserFeed userfeed)
    {
        _dataSource.appendItems(userfeed);
        loadFullUserInfo(userfeed);
    }

    public final void finishedLoading()
    {
        _loading = false;
    }

    public int getCount()
    {
        if (_dataSource == null)
        {
            return 0;
        } else
        {
            return _dataSource.getCount();
        }
    }

    public UserFeed getDataSource()
    {
        return _dataSource;
    }

    public User getItem(int i)
    {
        return (User)_dataSource.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (_li == null)
        {
            _li = LayoutInflater.from(ViewHelper.getContext(view, viewgroup));
        }
        User user;
        if (view != null && (view instanceof PersonListCell))
        {
            viewgroup = (PersonListCell)view;
            viewgroup.reset();
        } else
        {
            viewgroup = (PersonListCell)_li.inflate(0x7f030163, viewgroup, false);
        }
        user = getItem(i);
        if (user != null)
        {
            Object obj;
            if (!TextUtils.isEmpty(user.getSocialNetworkName()))
            {
                view = user.getSocialNetworkName();
            } else
            {
                view = user.getFullName();
            }
            obj = view;
            if (_isLastNameEmphasized)
            {
                obj = getEmphasizedLastName(view.toString());
            }
            viewgroup.setTitle(((CharSequence) (obj)));
            if (user.getVerifiedIdentity() == Boolean.TRUE)
            {
                viewgroup.setVerifiedIdentity();
            }
            viewgroup.setDesc(user.getWebsite(), Boolean.valueOf(false), user.getLocation());
            viewgroup.setImage(user.getImageMediumUrl());
            if (MyUser.getUid().equals(user.getUid()))
            {
                viewgroup.createActionButton(null, null);
            } else
            {
                if (!user.getFollowing().booleanValue())
                {
                    viewgroup.createActionButton(Resources.string(0x7f0702ab), onFollowClicked);
                    viewgroup.setActionButtonStyle(com.pinterest.ui.text.PButton.ButtonStyle.RED);
                } else
                {
                    viewgroup.createActionButton(Resources.string(0x7f0705b2), onFollowClicked);
                    viewgroup.setActionButtonStyle(com.pinterest.ui.text.PButton.ButtonStyle.PLAIN);
                }
                viewgroup.setActionButtonTag(user);
            }
        }
        loadMore(i);
        return viewgroup;
    }

    protected final void loadMore(int i)
    {
        if (_listener != null && i == getCount() - 1 && !_loading)
        {
            _listener.loadMore();
            _loading = true;
        }
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setDataSource(UserFeed userfeed)
    {
        _loading = false;
        _dataSource = userfeed;
        loadFullUserInfo(userfeed);
        notifyDataSetChanged();
    }

    public void setIsLastNameEmphasized(boolean flag)
    {
        _isLastNameEmphasized = flag;
    }

    public void setListener(PeopleListListener peoplelistlistener)
    {
        _listener = peoplelistlistener;
    }

    public void setRequireFullUserInfo(boolean flag)
    {
        _requireFullUserInfo = flag;
    }





    private class _cls2 extends BaseApiResponseHandler
    {

        final PeopleListAdapter this$0;

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            super.onSuccess(pinterestjsonobject);
            pinterestjsonobject = pinterestjsonobject.c("data");
            if (pinterestjsonobject == null)
            {
                return;
            }
            pinterestjsonobject = pinterestjsonobject.b().values().iterator();
            do
            {
                if (!pinterestjsonobject.hasNext())
                {
                    break;
                }
                User user = User.make((PinterestJsonObject)pinterestjsonobject.next(), false);
                User user1 = (User)_userMap.get(user.getUid());
                if (user1 != null)
                {
                    user1.setExplicitFollowing(user.getExplicitFollowing());
                    user1.setImplicitFollowing(user.getImplicitFollowing());
                }
            } while (true);
            notifyDataSetChanged();
        }

        _cls2()
        {
            this$0 = PeopleListAdapter.this;
            super();
        }
    }


    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final PeopleListAdapter this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (User)adapterview.getItemAtPosition(i);
            if (adapterview == null)
            {
                return;
            } else
            {
                adapterview = adapterview.getUid();
                Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED, adapterview);
                Events.post(new Navigation(Location.USER, adapterview));
                return;
            }
        }

        _cls3()
        {
            this$0 = PeopleListAdapter.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final PeopleListAdapter this$0;

        public void onClick(View view)
        {
            final User user = (User)view.getTag();
            boolean flag;
            if (!user.getFollowing().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            user.setFollowing(flag);
            notifyDataSetChanged();
            Pinalytics.a(ElementType.USER_FEED_FOLLOW, ComponentType.USER_FEED, user.getUid());
            if (PeopleListAdapter._runnableMap.containsKey(user))
            {
                view = (com.pinterest.base.FollowUtils.DelayedFollowRunnable)PeopleListAdapter._runnableMap.get(user);
                _followHandler.removeCallbacks(view);
                PeopleListAdapter._runnableMap.remove(user);
            } else
            {
                class _cls1
                    implements com.pinterest.base.FollowUtils.DelayedFollowRunnable.DelayedFollowListener
                {

                    final _cls4 this$1;
                    final User val$user;

                    public void onComplete()
                    {
                        notifyDataSetChanged();
                        PeopleListAdapter._runnableMap.remove(user);
                    }

                _cls1()
                {
                    this$1 = _cls4.this;
                    user = user1;
                    super();
                }
                }

                view = new com.pinterest.base.FollowUtils.DelayedFollowRunnable(user, new _cls1(), PeopleListAdapter.this);
                PeopleListAdapter._runnableMap.put(user, view);
            }
            _followHandler.postDelayed(view, 1000L);
        }

        _cls4()
        {
            this$0 = PeopleListAdapter.this;
            super();
        }
    }


    private class _cls1
        implements com.pinterest.api.remote.ApiBatcher.BatchRequestBuilder
    {

        final PeopleListAdapter this$0;
        final com.pinterest.api.remote.ApiBatcher.BatchRequestBuilder val$userBatchRequestBuilder;

        public BatchRequest build(User user)
        {
            _userMap.put(user.getUid(), user);
            return userBatchRequestBuilder.build(user.getUid());
        }

        public volatile BatchRequest build(Object obj)
        {
            return build((User)obj);
        }

        _cls1()
        {
            this$0 = PeopleListAdapter.this;
            userBatchRequestBuilder = batchrequestbuilder;
            super();
        }
    }


    private class PeopleListListener
    {

        public abstract void loadMore();
    }

}
