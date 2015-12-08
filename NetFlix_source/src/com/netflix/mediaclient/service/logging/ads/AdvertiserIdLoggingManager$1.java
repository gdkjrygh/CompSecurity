// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.PreferenceUtils;

// Referenced classes of package com.netflix.mediaclient.service.logging.ads:
//            AdvertiserIdLoggingManager, AdvertisingIdProviderFactory

class this._cls0
    implements Runnable
{

    final AdvertiserIdLoggingManager this$0;

    public void run()
    {
        AdvertiserIdLoggingManager.access$002(AdvertiserIdLoggingManager.this, PreferenceUtils.getStringPref(AdvertiserIdLoggingManager.access$100(AdvertiserIdLoggingManager.this), "advertisement_id", null));
        AdvertiserIdLoggingManager.access$202(AdvertiserIdLoggingManager.this, PreferenceUtils.getLongPref(AdvertiserIdLoggingManager.access$100(AdvertiserIdLoggingManager.this), "advertisement_id_ts", 0L));
        AdvertiserIdLoggingManager.access$302(AdvertiserIdLoggingManager.this, Boolean.valueOf(PreferenceUtils.getBooleanPref(AdvertiserIdLoggingManager.access$100(AdvertiserIdLoggingManager.this), "advertisement_id_opted_in", false)));
        AdvertiserIdLoggingManager.access$402(AdvertiserIdLoggingManager.this, AdvertisingIdProviderFactory.getInstance(AdvertiserIdLoggingManager.access$100(AdvertiserIdLoggingManager.this)));
        com.netflix.mediaclient.servicemgr.  = AdvertiserIdLoggingManager.access$500(AdvertiserIdLoggingManager.this);
        AdvertiserIdLoggingManager.access$502(AdvertiserIdLoggingManager.this, null);
        if (!DeviceUtils.isFirstApplicationStartAfterInstallation(AdvertiserIdLoggingManager.access$100(AdvertiserIdLoggingManager.this)))
        {
            Log.d("nf_adv_id", "Not first start after installation");
        } else
        {
            Log.d("nf_adv_id", "First start after installation");
            sendAdvertiserId(com.netflix.mediaclient.servicemgr..install);
        }
        if ( != null)
        {
            sendAdvertiserId();
        }
    }

    ()
    {
        this$0 = AdvertiserIdLoggingManager.this;
        super();
    }
}
