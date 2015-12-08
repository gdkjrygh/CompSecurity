// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;

public abstract class AbstractNotification
{

    private String changed;
    private String channelExpiration;
    private String channelId;
    private String channelToken;
    private long messageNumber;
    private String resourceId;
    private String resourceState;
    private String resourceUri;

    protected AbstractNotification(long l, String s, String s1, String s2, String s3)
    {
        setMessageNumber(l);
        setResourceState(s);
        setResourceId(s1);
        setResourceUri(s2);
        setChannelId(s3);
    }

    protected AbstractNotification(AbstractNotification abstractnotification)
    {
        this(abstractnotification.getMessageNumber(), abstractnotification.getResourceState(), abstractnotification.getResourceId(), abstractnotification.getResourceUri(), abstractnotification.getChannelId());
        setChannelExpiration(abstractnotification.getChannelExpiration());
        setChannelToken(abstractnotification.getChannelToken());
        setChanged(abstractnotification.getChanged());
    }

    public final String getChanged()
    {
        return changed;
    }

    public final String getChannelExpiration()
    {
        return channelExpiration;
    }

    public final String getChannelId()
    {
        return channelId;
    }

    public final String getChannelToken()
    {
        return channelToken;
    }

    public final long getMessageNumber()
    {
        return messageNumber;
    }

    public final String getResourceId()
    {
        return resourceId;
    }

    public final String getResourceState()
    {
        return resourceState;
    }

    public final String getResourceUri()
    {
        return resourceUri;
    }

    public AbstractNotification setChanged(String s)
    {
        changed = s;
        return this;
    }

    public AbstractNotification setChannelExpiration(String s)
    {
        channelExpiration = s;
        return this;
    }

    public AbstractNotification setChannelId(String s)
    {
        channelId = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public AbstractNotification setChannelToken(String s)
    {
        channelToken = s;
        return this;
    }

    public AbstractNotification setMessageNumber(long l)
    {
        boolean flag;
        if (l >= 1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        messageNumber = l;
        return this;
    }

    public AbstractNotification setResourceId(String s)
    {
        resourceId = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public AbstractNotification setResourceState(String s)
    {
        resourceState = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public AbstractNotification setResourceUri(String s)
    {
        resourceUri = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public String toString()
    {
        return toStringHelper().toString();
    }

    protected com.google.api.client.util.Objects.ToStringHelper toStringHelper()
    {
        return Objects.toStringHelper(this).add("messageNumber", Long.valueOf(messageNumber)).add("resourceState", resourceState).add("resourceId", resourceId).add("resourceUri", resourceUri).add("channelId", channelId).add("channelExpiration", channelExpiration).add("channelToken", channelToken).add("changed", changed);
    }
}
