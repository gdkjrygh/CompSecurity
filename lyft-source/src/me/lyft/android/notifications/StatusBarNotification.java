// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import java.util.Collections;
import java.util.List;
import me.lyft.android.common.Objects;

public class StatusBarNotification
{

    List actions;
    private String bigImageUrl;
    private String bigMessage;
    private String bigTitle;
    private String deepLink;
    private String message;
    private long timestamp;
    private String title;

    public StatusBarNotification()
    {
    }

    public List getActions()
    {
        return (List)Objects.firstNonNull(actions, Collections.emptyList());
    }

    public String getBigImageUrl()
    {
        return bigImageUrl;
    }

    public String getBigMessage()
    {
        return bigMessage;
    }

    public String getBigTitle()
    {
        return bigTitle;
    }

    public String getDeepLink()
    {
        return deepLink;
    }

    public String getMessage()
    {
        return message;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public String getTitle()
    {
        return title;
    }

    void setActions(List list)
    {
        actions = list;
    }

    void setBigImageUrl(String s)
    {
        bigImageUrl = s;
    }

    void setBigMessage(String s)
    {
        bigMessage = s;
    }

    void setBigTitle(String s)
    {
        bigTitle = s;
    }

    void setDeepLink(String s)
    {
        deepLink = s;
    }

    void setMessage(String s)
    {
        message = s;
    }

    void setTimestamp(long l)
    {
        timestamp = l;
    }

    void setTitle(String s)
    {
        title = s;
    }
}
