// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.dialog.AddInterestDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.schemas.event.ElementType;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedFragment

class this._cls0
    implements com.pinterest.ui.layout.hildViewClickListener
{

    final UserFollowedFragment this$0;

    public void onChildViewClick(Object obj)
    {
        if (obj == null || !(obj instanceof Interest))
        {
            if (MyUser.isUserMe(UserFollowedFragment.access$200(UserFollowedFragment.this)))
            {
                Events.post(new DialogEvent(new AddInterestDialog()));
            }
            return;
        } else
        {
            obj = (Interest)obj;
            HashMap hashmap = new HashMap();
            hashmap.put("interest", ((Interest) (obj)).getUrlName());
            Pinalytics.a(ElementType.FLOWED_INTEREST, hashmap);
            StopWatch.get().start("interest_ttrfp");
            Events.post(new Navigation(Location.INTEREST, ((com.pinterest.api.model.Model) (obj))));
            return;
        }
    }

    Listener()
    {
        this$0 = UserFollowedFragment.this;
        super();
    }
}
