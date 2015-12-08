// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.pandora.radio.util.a;
import java.io.IOException;

public class f
    implements a
{

    private Context a;

    public f(Context context)
    {
        a = context;
    }

    public com.pandora.radio.util.a.a a()
    {
        Object obj;
        obj = AdvertisingIdClient.getAdvertisingIdInfo(a);
        obj = new com.pandora.radio.util.a.a(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).getId(), ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).isLimitAdTrackingEnabled());
        return ((com.pandora.radio.util.a.a) (obj));
        Object obj1;
        obj1;
_L2:
        return null;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
