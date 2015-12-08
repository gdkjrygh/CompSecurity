// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.pin.adapter:
//            PinActivityAdapter

class val.user
    implements android.view..PinActivityAdapter._cls1
{

    final PinActivityAdapter this$0;
    final User val$user;

    public void onClick(View view)
    {
        Events.post(new Navigation(Location.USER, val$user));
        Pinalytics.a(ElementType.PIN_ACTIVITY_LIKE);
    }

    ()
    {
        this$0 = final_pinactivityadapter;
        val$user = User.this;
        super();
    }
}
