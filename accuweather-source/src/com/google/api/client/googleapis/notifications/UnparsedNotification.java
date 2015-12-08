// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.notifications;

import java.io.InputStream;

// Referenced classes of package com.google.api.client.googleapis.notifications:
//            AbstractNotification

public class UnparsedNotification extends AbstractNotification
{

    private InputStream contentStream;
    private String contentType;

    public UnparsedNotification(long l, String s, String s1, String s2, String s3)
    {
        super(l, s, s1, s2, s3);
    }

    public final InputStream getContentStream()
    {
        return contentStream;
    }

    public final String getContentType()
    {
        return contentType;
    }

    public volatile AbstractNotification setChanged(String s)
    {
        return setChanged(s);
    }

    public UnparsedNotification setChanged(String s)
    {
        return (UnparsedNotification)super.setChanged(s);
    }

    public volatile AbstractNotification setChannelExpiration(String s)
    {
        return setChannelExpiration(s);
    }

    public UnparsedNotification setChannelExpiration(String s)
    {
        return (UnparsedNotification)super.setChannelExpiration(s);
    }

    public volatile AbstractNotification setChannelId(String s)
    {
        return setChannelId(s);
    }

    public UnparsedNotification setChannelId(String s)
    {
        return (UnparsedNotification)super.setChannelId(s);
    }

    public volatile AbstractNotification setChannelToken(String s)
    {
        return setChannelToken(s);
    }

    public UnparsedNotification setChannelToken(String s)
    {
        return (UnparsedNotification)super.setChannelToken(s);
    }

    public UnparsedNotification setContentStream(InputStream inputstream)
    {
        contentStream = inputstream;
        return this;
    }

    public UnparsedNotification setContentType(String s)
    {
        contentType = s;
        return this;
    }

    public volatile AbstractNotification setMessageNumber(long l)
    {
        return setMessageNumber(l);
    }

    public UnparsedNotification setMessageNumber(long l)
    {
        return (UnparsedNotification)super.setMessageNumber(l);
    }

    public volatile AbstractNotification setResourceId(String s)
    {
        return setResourceId(s);
    }

    public UnparsedNotification setResourceId(String s)
    {
        return (UnparsedNotification)super.setResourceId(s);
    }

    public volatile AbstractNotification setResourceState(String s)
    {
        return setResourceState(s);
    }

    public UnparsedNotification setResourceState(String s)
    {
        return (UnparsedNotification)super.setResourceState(s);
    }

    public volatile AbstractNotification setResourceUri(String s)
    {
        return setResourceUri(s);
    }

    public UnparsedNotification setResourceUri(String s)
    {
        return (UnparsedNotification)super.setResourceUri(s);
    }

    public String toString()
    {
        return super.toStringHelper().add("contentType", contentType).toString();
    }
}
