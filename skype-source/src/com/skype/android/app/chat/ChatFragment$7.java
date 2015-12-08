// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.util.permission.PermissionHandlerAdapter;

// Referenced classes of package com.skype.android.app.chat:
//            ChatFragment

final class onHandlerAdapter extends PermissionHandlerAdapter
{

    final ChatFragment this$0;

    public final void onGranted()
    {
        analytics.c(AnalyticsEvent.t);
        startVideoMessageFlow();
    }

    ()
    {
        this$0 = ChatFragment.this;
        super();
    }
}
