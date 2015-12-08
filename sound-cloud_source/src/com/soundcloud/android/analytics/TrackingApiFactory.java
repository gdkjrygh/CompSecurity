// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.res.Resources;
import com.c.a.t;
import com.soundcloud.android.utils.DeviceHelper;

// Referenced classes of package com.soundcloud.android.analytics:
//            BatchTrackingApi, SimpleTrackingApi, TrackingApi

class TrackingApiFactory
{

    private static final int BATCH_SIZE = 100;
    private final DeviceHelper deviceHelper;
    private final t httpClient;
    private final Resources resources;

    TrackingApiFactory(t t, DeviceHelper devicehelper, Resources resources1)
    {
        httpClient = t;
        deviceHelper = devicehelper;
        resources = resources1;
    }

    TrackingApi create(String s)
    {
        if ("boogaloo".equals(s))
        {
            return new BatchTrackingApi(httpClient, deviceHelper, resources.getString(0x7f0702aa), 100);
        } else
        {
            return new SimpleTrackingApi(httpClient, deviceHelper);
        }
    }
}
