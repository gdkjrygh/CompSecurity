// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;


// Referenced classes of package com.soundcloud.android.payments.googleplay:
//            Payload

public final class SubscriptionStatus
{

    private final Payload payload;
    private final String token;

    private SubscriptionStatus(String s, Payload payload1)
    {
        token = s;
        payload = payload1;
    }

    public static SubscriptionStatus notSubscribed()
    {
        return new SubscriptionStatus(null, null);
    }

    public static SubscriptionStatus subscribed(String s, Payload payload1)
    {
        return new SubscriptionStatus(s, payload1);
    }

    public final Payload getPayload()
    {
        return payload;
    }

    public final String getToken()
    {
        return token;
    }

    public final boolean isSubscribed()
    {
        return payload != null;
    }
}
