// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;


// Referenced classes of package com.digby.localpoint.sdk.core:
//            ILPMessage

public interface ILPLocalNotification
    extends ILPMessage
{

    public abstract String getCampaignType();

    public abstract String getNotificationMessage();

    public abstract String getNotificationTitle();

    public abstract void setCampaignBody(String s)
        throws IllegalArgumentException;

    public abstract void setCampaignTitle(String s)
        throws IllegalArgumentException;

    public abstract void setNotificationMessage(String s)
        throws IllegalArgumentException;

    public abstract void setNotificationTitle(String s)
        throws IllegalArgumentException;
}
