// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.os.Handler;
import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.AbstractMap;

// Referenced classes of package com.pinterest.adapter:
//            PeopleListAdapter

class this._cls0
    implements android.view.
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
        if (PeopleListAdapter.access$100().containsKey(user))
        {
            view = (com.pinterest.base.ollowRunnable)PeopleListAdapter.access$100().get(user);
            PeopleListAdapter.access$200(PeopleListAdapter.this).removeCallbacks(view);
            PeopleListAdapter.access$100().remove(user);
        } else
        {
            class _cls1
                implements com.pinterest.base.FollowUtils.DelayedFollowRunnable.DelayedFollowListener
            {

                final PeopleListAdapter._cls4 this$1;
                final User val$user;

                public void onComplete()
                {
                    notifyDataSetChanged();
                    PeopleListAdapter.access$100().remove(user);
                }

            _cls1()
            {
                this$1 = PeopleListAdapter._cls4.this;
                user = user1;
                super();
            }
            }

            view = new com.pinterest.base.ollowRunnable(user, new _cls1(), PeopleListAdapter.this);
            PeopleListAdapter.access$100().put(user, view);
        }
        PeopleListAdapter.access$200(PeopleListAdapter.this).postDelayed(view, 1000L);
    }

    _cls1()
    {
        this$0 = PeopleListAdapter.this;
        super();
    }
}
