// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.User;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.AdapterEmptyView;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedFragment

class this._cls0 extends BaseApiResponseHandler
{

    final UserFollowedFragment this$0;

    public void onFinish()
    {
        if (_swipeVw != null)
        {
            _swipeVw.setRefreshing(false);
        }
        UserFollowedFragment.access$402(UserFollowedFragment.this, false);
        AdapterEmptyView.setState(_emptyVw, 2);
        ViewHelper.setVisibility(_emptyVw, 8);
        ViewHelper.setVisibility(_contentVw, 0);
    }

    public void onStart()
    {
        AdapterEmptyView.setState(_emptyVw, 0);
        ViewHelper.setVisibility(_emptyVw, 0);
        ViewHelper.setVisibility(_contentVw, 8);
        ViewHelper.setVisibility(_contentVw, 8);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        PinterestJsonObject pinterestjsonobject1 = (PinterestJsonObject)apiresponse.getData();
        Object obj = UserFollowedFragment.access$200(UserFollowedFragment.this).getUid();
        apiresponse = pinterestjsonobject1.c(String.format("GET:/v3/users/%s/boards/following/", new Object[] {
            obj
        }));
        PinterestJsonObject pinterestjsonobject = pinterestjsonobject1.c(String.format("GET:/v3/users/%s/interests/favorited/", new Object[] {
            obj
        }));
        pinterestjsonobject1 = pinterestjsonobject1.c(String.format("GET:/v3/users/%s/following/", new Object[] {
            obj
        }));
        obj = new ApiResponse(apiresponse);
        ApiResponse apiresponse1 = new ApiResponse(pinterestjsonobject);
        ApiResponse apiresponse2 = new ApiResponse(pinterestjsonobject1);
        class _cls1 extends com.pinterest.api.remote.BoardApi.BoardFeedApiResponse
        {

            final UserFollowedFragment._cls3 this$1;

            public void onSuccess(Feed feed)
            {
                super.onSuccess(feed);
                if (getView() == null)
                {
                    return;
                }
                BoardGridAdapter boardgridadapter;
                boolean flag;
                if (feed.getCount() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ViewHelper.setVisibility(_seeAllBoardsBt, flag);
                feed = (BoardFeed)feed;
                boardgridadapter = new BoardGridAdapter();
                boardgridadapter.setDataSource(feed);
                _followedBoards.setAdapter(boardgridadapter);
            }

            _cls1()
            {
                this$1 = UserFollowedFragment._cls3.this;
                super();
            }
        }

        _cls1 _lcls1 = new _cls1();
        class _cls2 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
        {

            final UserFollowedFragment._cls3 this$1;

            public void onSuccess(Feed feed)
            {
                super.onSuccess(feed);
                if (getView() == null)
                {
                    return;
                }
                Object obj1;
                boolean flag;
                if (feed.getCount() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ViewHelper.setVisibility(_seeAllPinnersBt, flag);
                obj1 = getView().getContext();
                feed = (UserFeed)feed;
                obj1 = new PeopleListAdapter(((android.content.Context) (obj1)));
                ((PeopleListAdapter) (obj1)).setDataSource(feed);
                _followedPinners.setAdapter(((android.widget.Adapter) (obj1)));
            }

            _cls2()
            {
                this$1 = UserFollowedFragment._cls3.this;
                super();
            }
        }

        _cls2 _lcls2 = new _cls2();
        if (((ApiResponse) (obj)).getCode() == 0)
        {
            _lcls1.onSuccess(apiresponse);
        } else
        {
            _lcls1.onFailure(null, apiresponse);
        }
        if (apiresponse1.getCode() == 0)
        {
            UserFollowedFragment.access$300(UserFollowedFragment.this).onSuccess(pinterestjsonobject);
        } else
        {
            UserFollowedFragment.access$300(UserFollowedFragment.this).onFailure(null, pinterestjsonobject);
        }
        if (apiresponse2.getCode() == 0)
        {
            _lcls2.onSuccess(pinterestjsonobject1);
            return;
        } else
        {
            _lcls2.onFailure(null, pinterestjsonobject1);
            return;
        }
    }

    se()
    {
        this$0 = UserFollowedFragment.this;
        super();
    }
}
