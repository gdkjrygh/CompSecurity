// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.text.format.DateUtils;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            NotificationResponse, WebPhoto, PicUser

public static class 
{

    private String clickUrl;
    private WebPhoto collage;
    private String collageId;
    private String flurryEvent;
    private String followedId;
    private String followerId;
    private String text;
    private long timestamp;
    private String type;
    private PicUser user;
    private int userCount;
    private String userId;

    private void setClickUrl(String s)
    {
        clickUrl = s;
    }

    private void setCollageId(String s)
    {
        collageId = s;
    }

    private void setFlurryEvent(String s)
    {
        flurryEvent = s;
    }

    private void setText(String s)
    {
        text = s;
    }

    private void setUser(PicUser picuser)
    {
        user = picuser;
    }

    private void setUserCount(int i)
    {
        userCount = i;
    }

    private void setUserId(String s)
    {
        userId = s;
    }

    public String getClickUrl()
    {
        return clickUrl;
    }

    public WebPhoto getCollage()
    {
        return collage;
    }

    public String getCollageId()
    {
        return collageId;
    }

    public String getDisplayText()
    {
        return String.format("%s <font color=\"B2B2B@\">%s</font>", new Object[] {
            getText(), getTimestamp()
        });
    }

    public String getFlurryEvent()
    {
        return flurryEvent;
    }

    public int getResourceId()
    {
        if ("user_followed_notification".equals(type))
        {
            return 0x7f0201e9;
        }
        if ("collage_liked_notification".equals(type))
        {
            return 0x7f0201ea;
        }
        if ("collage_echoed_notification".equals(type) || "collage_commented_notification".equals(type))
        {
            return 0x7f020189;
        }
        return !"collage_featured_notification".equals(type) ? -1 : 0x7f0201e8;
    }

    public String getText()
    {
        if (text == null)
        {
            return "";
        } else
        {
            return text;
        }
    }

    public CharSequence getTimestamp()
    {
        return DateUtils.getRelativeTimeSpanString(timestamp * 1000L, System.currentTimeMillis(), 1000L);
    }

    public String getType()
    {
        return type;
    }

    public PicUser getUser()
    {
        return user;
    }

    public int getUserCount()
    {
        return userCount;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setCollage(WebPhoto webphoto)
    {
        collage = webphoto;
    }

    public ()
    {
    }
}
