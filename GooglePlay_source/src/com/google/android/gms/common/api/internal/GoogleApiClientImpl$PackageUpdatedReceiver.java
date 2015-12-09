// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GooglePlayServicesUpdatedReceiver, GoogleApiClientImpl

static final class mClientRef extends GooglePlayServicesUpdatedReceiver
{

    private WeakReference mClientRef;

    public final void onUpdated()
    {
        GoogleApiClientImpl googleapiclientimpl = (GoogleApiClientImpl)mClientRef.get();
        if (googleapiclientimpl == null)
        {
            return;
        } else
        {
            GoogleApiClientImpl.access$200(googleapiclientimpl);
            return;
        }
    }

    (GoogleApiClientImpl googleapiclientimpl)
    {
        mClientRef = new WeakReference(googleapiclientimpl);
    }
}
