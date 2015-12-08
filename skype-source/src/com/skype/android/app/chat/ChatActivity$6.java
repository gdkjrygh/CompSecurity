// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.PROPKEY;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import com.skype.android.util.permission.PermissionHandlerAdapter;

// Referenced classes of package com.skype.android.app.chat:
//            ChatActivity

final class onHandlerAdapter extends PermissionHandlerAdapter
{

    final ChatActivity this$0;
    final com.skype.android.widget.tem val$item;

    public final void onGranted()
    {
        PROPKEY propkey;
label0:
        {
            if (val$item != null)
            {
                propkey = (PROPKEY)val$item.c();
                if (propkey != PROPKEY.CONTACT_SKYPENAME)
                {
                    break label0;
                }
                analytics.c(AnalyticsEvent.n);
                navigation.placeCall(ChatActivity.access$200(ChatActivity.this));
            }
            return;
        }
        if (propkey == PROPKEY.CONVERSATION_IDENTITY)
        {
            analytics.c(AnalyticsEvent.n);
            navigation.placeCall(ChatActivity.access$100(ChatActivity.this));
            return;
        } else
        {
            analytics.c(AnalyticsEvent.m);
            navigation.placeCall(ChatActivity.access$200(ChatActivity.this), propkey);
            return;
        }
    }

    m()
    {
        this$0 = final_chatactivity;
        val$item = com.skype.android.widget.tem.this;
        super();
    }
}
