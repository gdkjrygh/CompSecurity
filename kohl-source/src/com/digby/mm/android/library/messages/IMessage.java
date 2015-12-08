// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.messages;

import java.util.Date;
import java.util.Map;

public interface IMessage
{

    public abstract long getCampaignID();

    public abstract Date getExpirationDate();

    public abstract long getID();

    public abstract String getMessage();

    public abstract Map getMetadata();

    public abstract String getTitle();

    public abstract boolean isExpired();

    public abstract boolean isRead();
}
