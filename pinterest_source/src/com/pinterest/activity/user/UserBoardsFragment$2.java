// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import com.android.volley.NetworkError;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.adapter.MyUserBoardGridAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Colors;
import com.pinterest.experiment.Experiments;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.user:
//            UserBoardsFragment

class retries extends com.pinterest.api.remote.Response
{

    private int retries;
    final UserBoardsFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if ((throwable == null || (throwable instanceof NetworkError)) && UserBoardsFragment.access$900(UserBoardsFragment.this).getId().equals(MyUser.getUid()) && Experiments.v())
        {
            class _cls1 extends BackgroundTask
            {

                BoardFeed _feed;
                final UserBoardsFragment._cls2 this$1;

                public void onFinish()
                {
                    if (_feed != null && _feed.getAbsCount() > 0)
                    {
                        _feed.setOffline(true);
                        onSuccess(_feed);
                    }
                }

                public void run()
                {
                    _feed = new BoardFeed();
                    _feed.setItems(ModelHelper.getUserSecretBoards(MyUser.getUid()));
                }

            _cls1()
            {
                this$1 = UserBoardsFragment._cls2.this;
                super();
            }
            }

            (new _cls1()).execute();
            return;
        }
        if (retries < 3)
        {
            retries = retries + 1;
            MyUserApi.a(UserBoardsFragment.access$1000(UserBoardsFragment.this), getApiTag());
            UserBoardsFragment.access$1200(UserBoardsFragment.this, UserBoardsFragment.access$1100(UserBoardsFragment.this));
            return;
        } else
        {
            super.onFailure(throwable, apiresponse);
            return;
        }
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (UserBoardsFragment.access$200(UserBoardsFragment.this) instanceof MyUserBoardGridAdapter)
        {
            ((MyUserBoardGridAdapter)UserBoardsFragment.access$300(UserBoardsFragment.this)).setSecretDatasource(feed);
            if (UserBoardsFragment.access$400(UserBoardsFragment.this) != null)
            {
                UserBoardsFragment.access$500(UserBoardsFragment.this).getFooterView().setBackgroundColor(Colors.BG_GRID_DARK);
                UserBoardsFragment.access$600(UserBoardsFragment.this).setState(com.pinterest.ui.grid.te.LOADED);
            }
        }
        UserBoardsFragment.access$800(UserBoardsFragment.this, UserBoardsFragment.access$700(UserBoardsFragment.this));
    }

    idAdapter()
    {
        this$0 = UserBoardsFragment.this;
        super();
        retries = 0;
    }
}
