// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums;

import bo.app.an;
import com.appboy.models.IPutIntoJson;

public final class NotificationSubscriptionType extends Enum
    implements IPutIntoJson
{

    public static final NotificationSubscriptionType OPTED_IN;
    public static final NotificationSubscriptionType SUBSCRIBED;
    public static final NotificationSubscriptionType UNSUBSCRIBED;
    private static final NotificationSubscriptionType a[];

    private NotificationSubscriptionType(String s, int i)
    {
        super(s, i);
    }

    public static NotificationSubscriptionType valueOf(String s)
    {
        return (NotificationSubscriptionType)Enum.valueOf(com/appboy/enums/NotificationSubscriptionType, s);
    }

    public static NotificationSubscriptionType[] values()
    {
        return (NotificationSubscriptionType[])a.clone();
    }

    public final volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public final String forJsonPut()
    {
        switch (an.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "unsubscribed";

        case 2: // '\002'
            return "subscribed";

        case 3: // '\003'
            return "opted_in";
        }
    }

    static 
    {
        OPTED_IN = new NotificationSubscriptionType("OPTED_IN", 0);
        SUBSCRIBED = new NotificationSubscriptionType("SUBSCRIBED", 1);
        UNSUBSCRIBED = new NotificationSubscriptionType("UNSUBSCRIBED", 2);
        a = (new NotificationSubscriptionType[] {
            OPTED_IN, SUBSCRIBED, UNSUBSCRIBED
        });
    }
}
