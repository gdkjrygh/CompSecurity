// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mopub.common.ClientMetadata;
import com.roidapp.baselib.c.aj;

final class c extends Thread
{

    c()
    {
    }

    public final void run()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(aj.a());
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        if (info == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        ClientMetadata.getInstance(aj.a()).setAdvertisingInfo(info.getId(), info.isLimitAdTrackingEnabled());
    }
}
