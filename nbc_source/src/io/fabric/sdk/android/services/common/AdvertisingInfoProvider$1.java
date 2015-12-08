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

    final AdvertisingInfoProvider this$0;
    final AdvertisingInfo val$advertisingInfo;

    public void onRun()
    {
        AdvertisingInfo advertisinginfo = AdvertisingInfoProvider.access$000(AdvertisingInfoProvider.this);
        if (!val$advertisingInfo.equals(advertisinginfo))
        {
            Fabric.getLogger().d("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
            AdvertisingInfoProvider.access$100(AdvertisingInfoProvider.this, advertisinginfo);
        }
    }

    ()
    {
        this$0 = final_advertisinginfoprovider;
        val$advertisingInfo = AdvertisingInfo.this;
        super();
    }
}
