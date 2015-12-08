// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.enums.NotificationSubscriptionType;

public final class ai
{

    public static final int a[];

    static 
    {
        a = new int[NotificationSubscriptionType.values().length];
        try
        {
            a[NotificationSubscriptionType.UNSUBSCRIBED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[NotificationSubscriptionType.SUBSCRIBED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[NotificationSubscriptionType.OPTED_IN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
