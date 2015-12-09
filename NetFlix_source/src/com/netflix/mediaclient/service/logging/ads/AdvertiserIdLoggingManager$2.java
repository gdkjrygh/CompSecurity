// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;

// Referenced classes of package com.netflix.mediaclient.service.logging.ads:
//            AdvertiserIdLoggingCallback, AdvertiserIdLoggingManager

class val.optedIn
    implements AdvertiserIdLoggingCallback
{

    final AdvertiserIdLoggingManager this$0;
    final String val$id;
    final Boolean val$optedIn;

    public void onFailure()
    {
        Log.d("nf_adv_id", "Advertiser ID failed to be delivered");
    }

    public void onSuccess()
    {
        Log.d("nf_adv_id", "Advertiser ID delivered");
        long l = System.currentTimeMillis();
        PreferenceUtils.putStringPref(AdvertiserIdLoggingManager.access$100(AdvertiserIdLoggingManager.this), "advertisement_id", val$id);
        PreferenceUtils.putLongPref(AdvertiserIdLoggingManager.access$100(AdvertiserIdLoggingManager.this), "advertisement_id_ts", l);
        PreferenceUtils.putBooleanPref(AdvertiserIdLoggingManager.access$100(AdvertiserIdLoggingManager.this), "advertisement_id_opted_in", val$optedIn.booleanValue());
        AdvertiserIdLoggingManager.access$002(AdvertiserIdLoggingManager.this, val$id);
        AdvertiserIdLoggingManager.access$202(AdvertiserIdLoggingManager.this, l);
        AdvertiserIdLoggingManager.access$302(AdvertiserIdLoggingManager.this, val$optedIn);
    }

    ()
    {
        this$0 = final_advertiseridloggingmanager;
        val$id = s;
        val$optedIn = Boolean.this;
        super();
    }
}
