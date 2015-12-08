// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.view.View;
import com.pinterest.activity.findfriend.event.InviteCreateEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsInviteAllFragment

class this._cls0
    implements android.view.sInviteAllFragment._cls1
{

    final FindFriendsInviteAllFragment this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.SEND_INVITE_BUTTON, ComponentType.BULK_INVITE);
        Events.post(new InviteCreateEvent(true));
    }

    ()
    {
        this$0 = FindFriendsInviteAllFragment.this;
        super();
    }
}
