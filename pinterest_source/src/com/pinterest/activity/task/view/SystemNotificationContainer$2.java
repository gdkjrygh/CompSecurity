// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;

import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.MyUser;
import com.pinterest.networking.events.ConnectivityChanged;

// Referenced classes of package com.pinterest.activity.task.view:
//            SystemNotificationContainer

class this._cls0
    implements com.pinterest.base.onContainer._cls2
{

    final SystemNotificationContainer this$0;

    public void onEventMainThread(Navigation navigation)
    {
        if (navigation.getLocation() == Location.USER && MyUser.isUserMe(navigation.getId()))
        {
            SystemNotificationContainer.access$200(SystemNotificationContainer.this, 0x7f070175, false);
            return;
        } else
        {
            SystemNotificationContainer.access$200(SystemNotificationContainer.this, 0x7f070176, true);
            return;
        }
    }

    public void onEventMainThread(ConnectivityChanged connectivitychanged)
    {
        SystemNotificationContainer.access$100(SystemNotificationContainer.this, Boolean.valueOf(connectivitychanged.a()), true);
    }

    ()
    {
        this$0 = SystemNotificationContainer.this;
        super();
    }
}
