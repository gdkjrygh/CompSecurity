// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;

class AdIdWrapper
{

    private final Context context;

    public AdIdWrapper(Context context1)
    {
        context = context1;
    }

    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdInfo()
        throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        return AdvertisingIdClient.getAdvertisingIdInfo(context);
    }

    public boolean isPlayServicesAvailable()
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0;
    }
}
