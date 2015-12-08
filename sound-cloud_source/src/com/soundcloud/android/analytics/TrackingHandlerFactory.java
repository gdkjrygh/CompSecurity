// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.os.Looper;
import com.soundcloud.android.utils.NetworkConnectionHelper;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingHandler, TrackingStorage, TrackingApiFactory

class TrackingHandlerFactory
{

    private final NetworkConnectionHelper networkConnectionHelper;
    private final TrackingStorage storage;
    private final TrackingApiFactory trackingApiFactory;

    TrackingHandlerFactory(NetworkConnectionHelper networkconnectionhelper, TrackingStorage trackingstorage, TrackingApiFactory trackingapifactory)
    {
        networkConnectionHelper = networkconnectionhelper;
        storage = trackingstorage;
        trackingApiFactory = trackingapifactory;
    }

    TrackingHandler create(Looper looper)
    {
        return new TrackingHandler(looper, networkConnectionHelper, storage, trackingApiFactory);
    }
}
