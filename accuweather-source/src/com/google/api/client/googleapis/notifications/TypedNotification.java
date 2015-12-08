// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.notifications;


// Referenced classes of package com.google.api.client.googleapis.notifications:
//            AbstractNotification, UnparsedNotification

public class TypedNotification extends AbstractNotification
{

    private Object content;

    public TypedNotification(long l, String s, String s1, String s2, String s3)
    {
        super(l, s, s1, s2, s3);
    }

    public TypedNotification(UnparsedNotification unparsednotification)
    {
        super(unparsednotification);
    }

    public final Object getContent()
    {
        return content;
    }

    public volatile AbstractNotification setChanged(String s)
    {
        return setChanged(s);
    }

    public TypedNotification setChanged(String s)
    {
        return (TypedNotification)super.setChanged(s);
    }

    public volatile AbstractNotification setChannelExpiration(String s)
    {
        return setChannelExpiration(s);
    }

    public TypedNotification setChannelExpiration(String s)
    {
        return (TypedNotification)super.setChannelExpiration(s);
    }

    public volatile AbstractNotification setChannelId(String s)
    {
        return setChannelId(s);
    }

    public TypedNotification setChannelId(String s)
    {
        return (TypedNotification)super.setChannelId(s);
    }

    public volatile AbstractNotification setChannelToken(String s)
    {
        return setChannelToken(s);
    }

    public TypedNotification setChannelToken(String s)
    {
        return (TypedNotification)super.setChannelToken(s);
    }

    public TypedNotification setContent(Object obj)
    {
        content = obj;
        return this;
    }

    public volatile AbstractNotification setMessageNumber(long l)
    {
        return setMessageNumber(l);
    }

    public TypedNotification setMessageNumber(long l)
    {
        return (TypedNotification)super.setMessageNumber(l);
    }

    public volatile AbstractNotification setResourceId(String s)
    {
        return setResourceId(s);
    }

    public TypedNotification setResourceId(String s)
    {
        return (TypedNotification)super.setResourceId(s);
    }

    public volatile AbstractNotification setResourceState(String s)
    {
        return setResourceState(s);
    }

    public TypedNotification setResourceState(String s)
    {
        return (TypedNotification)super.setResourceState(s);
    }

    public volatile AbstractNotification setResourceUri(String s)
    {
        return setResourceUri(s);
    }

    public TypedNotification setResourceUri(String s)
    {
        return (TypedNotification)super.setResourceUri(s);
    }

    public String toString()
    {
        return super.toStringHelper().add("content", content).toString();
    }
}
