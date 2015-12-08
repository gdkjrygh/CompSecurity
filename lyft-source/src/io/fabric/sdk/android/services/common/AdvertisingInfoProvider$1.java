// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            BackgroundPriorityRunnable, AdvertisingInfoProvider, AdvertisingInfo

class  extends BackgroundPriorityRunnable
{

    final AdvertisingInfo a;
    final AdvertisingInfoProvider b;

    public void a()
    {
        AdvertisingInfo advertisinginfo = AdvertisingInfoProvider.a(b);
        if (!a.equals(advertisinginfo))
        {
            Fabric.g().a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
            AdvertisingInfoProvider.a(b, advertisinginfo);
        }
    }

    (AdvertisingInfoProvider advertisinginfoprovider, AdvertisingInfo advertisinginfo)
    {
        b = advertisinginfoprovider;
        a = advertisinginfo;
        super();
    }
}
