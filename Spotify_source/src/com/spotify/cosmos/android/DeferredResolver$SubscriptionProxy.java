// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;


// Referenced classes of package com.spotify.cosmos.android:
//            InternalSubscription

public class mSubscription
    implements InternalSubscription
{

    private boolean mShouldUnsubscribe;
    private InternalSubscription mSubscription;

    private boolean hasSubscription()
    {
        return mSubscription != null;
    }

    private void setSubscription(InternalSubscription internalsubscription)
    {
        mSubscription = internalsubscription;
        if (mShouldUnsubscribe)
        {
            unsubscribe();
        }
    }

    public boolean isActive()
    {
        return !mShouldUnsubscribe && (mSubscription == null || mSubscription.isActive());
    }

    public void setDestroyed()
    {
        if (mSubscription != null)
        {
            mSubscription.setDestroyed();
        }
    }

    public boolean unsubscribe()
    {
        if (hasSubscription())
        {
            return mSubscription.unsubscribe();
        } else
        {
            mShouldUnsubscribe = true;
            return false;
        }
    }


    public (InternalSubscription internalsubscription)
    {
        mSubscription = internalsubscription;
    }
}
