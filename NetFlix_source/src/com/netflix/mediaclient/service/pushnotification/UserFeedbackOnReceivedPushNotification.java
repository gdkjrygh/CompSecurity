// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;


public final class UserFeedbackOnReceivedPushNotification extends Enum
{

    private static final UserFeedbackOnReceivedPushNotification $VALUES[];
    public static final UserFeedbackOnReceivedPushNotification canceled;
    public static final UserFeedbackOnReceivedPushNotification opened;
    private String mValue;

    private UserFeedbackOnReceivedPushNotification(String s, int i, String s1)
    {
        super(s, i);
        mValue = s1;
    }

    public static UserFeedbackOnReceivedPushNotification valueOf(String s)
    {
        return (UserFeedbackOnReceivedPushNotification)Enum.valueOf(com/netflix/mediaclient/service/pushnotification/UserFeedbackOnReceivedPushNotification, s);
    }

    public static UserFeedbackOnReceivedPushNotification[] values()
    {
        return (UserFeedbackOnReceivedPushNotification[])$VALUES.clone();
    }

    public String getValue()
    {
        return mValue;
    }

    static 
    {
        opened = new UserFeedbackOnReceivedPushNotification("opened", 0, "opened");
        canceled = new UserFeedbackOnReceivedPushNotification("canceled", 1, "canceled");
        $VALUES = (new UserFeedbackOnReceivedPushNotification[] {
            opened, canceled
        });
    }
}
