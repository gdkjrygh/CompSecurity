// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity;

import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.megaphone.HomeFeedMegaphoneEvent;

public class HomeHelper
{

    public HomeHelper()
    {
    }

    public static void showEmailVerificationMegaphone()
    {
        HomeFeedMegaphoneEvent homefeedmegaphoneevent = new HomeFeedMegaphoneEvent(com.pinterest.ui.megaphone.HomeFeedMegaphoneEvent.EventType.CONFIRM_EMAIL);
        homefeedmegaphoneevent.setTitle(Resources.string(0x7f07016a));
        homefeedmegaphoneevent.setDesc(Resources.string(0x7f070167));
        homefeedmegaphoneevent.setPositiveBtnText(Resources.string(0x7f070169));
        homefeedmegaphoneevent.setNegativeBtnText(Resources.string(0x7f070168));
        Events.removeStickyEvent(com/pinterest/ui/megaphone/HomeFeedMegaphoneEvent);
        Events.postSticky(homefeedmegaphoneevent);
    }

    public static void showEmptyFollowingMegaphone()
    {
        User user = MyUser.get();
        if (user != null && user.getFirstName() != null)
        {
            HomeFeedMegaphoneEvent homefeedmegaphoneevent = new HomeFeedMegaphoneEvent(com.pinterest.ui.megaphone.HomeFeedMegaphoneEvent.EventType.EMPTY_FEED);
            homefeedmegaphoneevent.setTitle(Resources.string(0x7f070249, new Object[] {
                user.getFirstName()
            }));
            homefeedmegaphoneevent.setDesc(Resources.string(0x7f070248));
            homefeedmegaphoneevent.setPositiveBtnText(Resources.string(0x7f0702a1));
            Events.removeStickyEvent(com/pinterest/ui/megaphone/HomeFeedMegaphoneEvent);
            Events.postSticky(homefeedmegaphoneevent);
        }
    }

    public static void showWriteBannedMegaphone()
    {
        HomeFeedMegaphoneEvent homefeedmegaphoneevent = new HomeFeedMegaphoneEvent(com.pinterest.ui.megaphone.HomeFeedMegaphoneEvent.EventType.WRITE_BANNED);
        homefeedmegaphoneevent.setTitle(Resources.string(0x7f07060c));
        homefeedmegaphoneevent.setDesc(Resources.string(0x7f07060b));
        homefeedmegaphoneevent.setPositiveBtnText(Resources.string(0x7f0704b9));
        Events.removeStickyEvent(com/pinterest/ui/megaphone/HomeFeedMegaphoneEvent);
        Events.postSticky(homefeedmegaphoneevent);
    }
}
