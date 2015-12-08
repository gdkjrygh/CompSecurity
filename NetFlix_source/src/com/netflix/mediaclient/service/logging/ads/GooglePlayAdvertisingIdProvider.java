// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

// Referenced classes of package com.netflix.mediaclient.service.logging.ads:
//            AdvertisingIdProvider

public class GooglePlayAdvertisingIdProvider
    implements AdvertisingIdProvider
{

    private String mAdvertisingId;
    private boolean mIsLAT;

    GooglePlayAdvertisingIdProvider(Context context)
        throws GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException, IOException
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context can not be null");
        } else
        {
            context = AdvertisingIdClient.getAdvertisingIdInfo(context);
            mAdvertisingId = context.getId();
            mIsLAT = context.isLimitAdTrackingEnabled();
            return;
        }
    }

    public String getId()
    {
        return mAdvertisingId;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return mIsLAT;
    }

    public boolean isResettable()
    {
        return true;
    }
}
