// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.TwitterException;
import twitter4j.User;

public interface NotificationMethods
{

    public abstract User disableNotification(long l)
        throws TwitterException;

    public abstract User disableNotification(String s)
        throws TwitterException;

    public abstract User enableNotification(long l)
        throws TwitterException;

    public abstract User enableNotification(String s)
        throws TwitterException;
}
