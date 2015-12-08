// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.facebookinvites.FacebookInvitesItem;
import com.soundcloud.android.main.Screen;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public final class StreamNotificationEvent extends TrackingEvent
{

    public static final String KEY_CLICK_CATEGORY = "click_category";
    public static final String KEY_CLICK_NAME = "click_name";
    public static final String KEY_IMPRESSION_CATEGORY = "impression_category";
    public static final String KEY_IMPRESSION_NAME = "impression_name";
    public static final String KEY_PAGE_NAME = "page_name";
    public static final String KIND_CLICK = "click";
    public static final String KIND_IMPRESSION = "impression";
    public static final String TYPE_DISMISS_WITHOUT_IMAGES = "fb::no_image::dismiss";
    public static final String TYPE_DISMISS_WITH_IMAGES = "fb::with_images::dismiss";
    public static final String TYPE_INVITE_FRIENDS = "invite_friends";
    public static final String TYPE_WITHOUT_IMAGES = "fb::no_image";
    public static final String TYPE_WITH_IMAGES = "fb::with_images";

    private StreamNotificationEvent(String s, long l)
    {
        super(s, l);
    }

    private static StreamNotificationEvent baseEvent(String s, String s1)
    {
        return (StreamNotificationEvent)(new StreamNotificationEvent(s, System.currentTimeMillis())).put("page_name", s1);
    }

    private static String dismissWithImages(FacebookInvitesItem facebookinvitesitem)
    {
        if (facebookinvitesitem.hasPictures())
        {
            return "fb::with_images::dismiss";
        } else
        {
            return "fb::no_image::dismiss";
        }
    }

    public static StreamNotificationEvent forFacebookInviteClick(FacebookInvitesItem facebookinvitesitem)
    {
        return (StreamNotificationEvent)baseEvent("click", Screen.STREAM.get()).put("click_category", "invite_friends").put("click_name", withImages(facebookinvitesitem));
    }

    public static StreamNotificationEvent forFacebookInviteDismissed(FacebookInvitesItem facebookinvitesitem)
    {
        return (StreamNotificationEvent)baseEvent("click", Screen.STREAM.get()).put("click_category", "invite_friends").put("click_name", dismissWithImages(facebookinvitesitem));
    }

    public static StreamNotificationEvent forFacebookInviteShown(FacebookInvitesItem facebookinvitesitem)
    {
        StreamNotificationEvent streamnotificationevent = baseEvent("impression", Screen.STREAM.get());
        streamnotificationevent.put("impression_category", "invite_friends");
        streamnotificationevent.put("impression_name", withImages(facebookinvitesitem));
        return streamnotificationevent;
    }

    private static String withImages(FacebookInvitesItem facebookinvitesitem)
    {
        if (facebookinvitesitem.hasPictures())
        {
            return "fb::with_images";
        } else
        {
            return "fb::no_image";
        }
    }
}
