// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.view.ViewTreeObserver;
import com.pinterest.activity.user.view.UserSuggestedPinnersView;
import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.User;
import com.pinterest.api.model.UserFeed;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.user:
//            UserBoardsFragment

class nse extends com.pinterest.api.remote.sponse
{

    final UserBoardsFragment this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        UserFeed userfeed = (UserFeed)feed;
        Object obj = feed.getItems();
        if (obj != null && ((List) (obj)).size() != 0 && UserBoardsFragment.access$1300(UserBoardsFragment.this) != null && UserBoardsFragment.access$1400(UserBoardsFragment.this) != null)
        {
            feed = new ArrayList();
            obj = ((List) (obj)).iterator();
label0:
            do
            {
                User user;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    user = (User)((Iterator) (obj)).next();
                } while (user.getFollowing().booleanValue());
                feed.add(user);
            } while (feed.size() < 3);
            if (feed.size() != 0)
            {
                userfeed.setItems(feed);
                feed = new PeopleListAdapter(getActivity());
                feed.setDataSource(userfeed);
                UserBoardsFragment.access$1300(UserBoardsFragment.this).setAdapter(feed);
                if (UserBoardsFragment.access$1500(UserBoardsFragment.this))
                {
                    feed.notifyDataSetChanged();
                    return;
                } else
                {
                    UserBoardsFragment.access$1600(UserBoardsFragment.this).addHeaderView(UserBoardsFragment.access$1300(UserBoardsFragment.this), -1, -2);
                    class _cls1
                        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
                    {

                        final UserBoardsFragment._cls3 this$1;

                        public void onGlobalLayout()
                        {
                            UserBoardsFragment.access$1300(this$0).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                                0, UserBoardsFragment.access$1300(this$0).getHeight()
                            });
                            class _cls1
                                implements android.animation.ValueAnimator.AnimatorUpdateListener
                            {

                                final _cls1 this$2;

                                public void onAnimationUpdate(ValueAnimator valueanimator1)
                                {
                                    int i = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                                    valueanimator1 = UserBoardsFragment.access$1300(this$0).getLayoutParams();
                                    valueanimator1.height = i;
                                    UserBoardsFragment.access$1300(this$0).setLayoutParams(valueanimator1);
                                }

                                    _cls1()
                                    {
                                        this$2 = _cls1.this;
                                        super();
                                    }
                            }

                            valueanimator.addUpdateListener(new _cls1());
                            valueanimator.setDuration(Resources.integer(0x7f0d000d).intValue());
                            valueanimator.start();
                        }

            _cls1()
            {
                this$1 = UserBoardsFragment._cls3.this;
                super();
            }
                    }

                    UserBoardsFragment.access$1300(UserBoardsFragment.this).getViewTreeObserver().addOnGlobalLayoutListener(new _cls1());
                    UserBoardsFragment.access$1502(UserBoardsFragment.this, true);
                    return;
                }
            }
        }
    }

    _cls1()
    {
        this$0 = UserBoardsFragment.this;
        super();
    }
}
