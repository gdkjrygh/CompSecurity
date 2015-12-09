// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.nearby.messages.SubscribeCallback;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessagesClientImpl

private static final class callback extends callback
{

    private final SubscribeCallback callback;

    public final void onExpired()
    {
    }


/*
    static a access$400(SubscribeCallback subscribecallback)
    {
        if (subscribecallback == null)
        {
            return null;
        } else
        {
            return new <init>(subscribecallback);
        }
    }

*/

    private <init>(SubscribeCallback subscribecallback)
    {
        callback = subscribecallback;
    }
}
