// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.content.Context;
import com.pinterest.activity.findfriend.util.InviteUtil;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.base.SocialUtils;
import com.pinterest.experiment.Experiments;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.sendshare:
//            SendShareFragment

class val.moreIconText
    implements OnItemClickListener
{

    final SendShareFragment this$0;
    final Context val$context;
    final com.pinterest.adapter.IconText val$moreIconText;

    public void onItemClick(com.pinterest.adapter.IconText icontext)
    {
        if (Experiments.L())
        {
            InviteUtil.setInviteSource("send_share_main_dialog");
            SocialUtils.shareWithInviteCode(val$context, SendShareFragment.access$500(SendShareFragment.this), icontext.meta, getApiTag());
        } else
        {
            if (icontext == val$moreIconText)
            {
                SocialUtils.startShare(val$context, SendShareFragment.access$500(SendShareFragment.this), null, null, null);
            } else
            {
                SocialUtils.startShare(val$context, SendShareFragment.access$500(SendShareFragment.this), icontext.text, icontext.meta, null);
            }
            Events.post(new ndShareDismissEvent());
        }
        Pinalytics.a(ElementType.APP_LIST_ITEM, ComponentType.SEND_SHARE, icontext.text);
    }

    ndShareDismissEvent()
    {
        this$0 = final_sendsharefragment;
        val$context = context1;
        val$moreIconText = com.pinterest.adapter.IconText.this;
        super();
    }
}
