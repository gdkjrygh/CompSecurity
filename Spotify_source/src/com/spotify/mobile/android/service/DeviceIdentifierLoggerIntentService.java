// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dmz;
import fop;
import gcz;
import java.io.IOException;

public class DeviceIdentifierLoggerIntentService extends IntentService
{

    public DeviceIdentifierLoggerIntentService()
    {
        super(com/spotify/mobile/android/service/DeviceIdentifierLoggerIntentService.getSimpleName());
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/spotify/mobile/android/service/DeviceIdentifierLoggerIntentService);
    }

    protected void onHandleIntent(Intent intent)
    {
        int i;
        intent = "";
        i = 3;
_L3:
        if (i <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext());
        if (((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).isLimitAdTrackingEnabled())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        obj = ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).getId();
        intent = ((Intent) (obj));
_L4:
        i = 0;
          goto _L3
        Object obj1;
        obj1;
        i--;
          goto _L3
_L2:
        dmz.a(fop);
        fop.a(this, intent, ((gcz)dmz.a(gcz)).e());
        return;
        obj1;
          goto _L4
        obj1;
          goto _L4
    }
}
