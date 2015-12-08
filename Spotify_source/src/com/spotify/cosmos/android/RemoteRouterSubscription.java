// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;


// Referenced classes of package com.spotify.cosmos.android:
//            InternalSubscription, Resolver

public class RemoteRouterSubscription
    implements InternalSubscription
{

    private boolean mActive;
    private Resolver mResolver;
    private int mSubscriptionId;

    RemoteRouterSubscription(Resolver resolver, int i)
    {
        mResolver = resolver;
        mSubscriptionId = i;
        mActive = true;
    }

    public boolean isActive()
    {
        return mActive;
    }

    public void setDestroyed()
    {
        mActive = false;
    }

    public boolean unsubscribe()
    {
        if (!mResolver.isConnected() || mResolver.isConnecting())
        {
            return false;
        } else
        {
            return mResolver.unsubscribe(mSubscriptionId);
        }
    }
}
