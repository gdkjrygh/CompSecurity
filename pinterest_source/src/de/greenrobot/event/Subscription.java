// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


// Referenced classes of package de.greenrobot.event:
//            SubscriberMethod

final class Subscription
{

    volatile boolean active;
    final int priority;
    final Object subscriber;
    final SubscriberMethod subscriberMethod;

    Subscription(Object obj, SubscriberMethod subscribermethod, int i)
    {
        subscriber = obj;
        subscriberMethod = subscribermethod;
        priority = i;
        active = true;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Subscription)
        {
            obj = (Subscription)obj;
            flag = flag1;
            if (subscriber == ((Subscription) (obj)).subscriber)
            {
                flag = flag1;
                if (subscriberMethod.equals(((Subscription) (obj)).subscriberMethod))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return subscriber.hashCode() + subscriberMethod.methodString.hashCode();
    }
}
