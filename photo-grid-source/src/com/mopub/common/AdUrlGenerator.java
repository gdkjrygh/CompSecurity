// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.mopub.common.util.DateAndTime;

// Referenced classes of package com.mopub.common:
//            BaseUrlGenerator, ClientMetadata, MoPub, LocationService, 
//            Preconditions

public abstract class AdUrlGenerator extends BaseUrlGenerator
{

    protected Context a;
    protected String b;
    protected String c;
    protected Location d;

    public AdUrlGenerator(Context context)
    {
        a = context;
    }

    private static int e(String s)
    {
        return Math.min(3, s.length());
    }

    protected final void a()
    {
        b("mr", "0");
    }

    protected final void a(ClientMetadata clientmetadata)
    {
        Object obj;
        Object obj1;
label0:
        {
            b("id", b);
            a(clientmetadata.getSdkVersion());
            a(new String[] {
                clientmetadata.getDeviceManufacturer(), clientmetadata.getDeviceModel(), clientmetadata.getDeviceProduct()
            });
            obj = clientmetadata.getAppPackageName();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b("bundle", ((String) (obj)));
            }
            b("q", c);
            Location location = d;
            obj1 = LocationService.getLastKnownLocation(a, MoPub.getLocationPrecision(), MoPub.getLocationAwareness());
            obj = location;
            if (obj1 == null)
            {
                break label0;
            }
            if (location != null)
            {
                obj = location;
                if (((Location) (obj1)).getTime() < location.getTime())
                {
                    break label0;
                }
            }
            obj = obj1;
        }
        if (obj != null)
        {
            b("ll", (new StringBuilder()).append(((Location) (obj)).getLatitude()).append(",").append(((Location) (obj)).getLongitude()).toString());
            b("lla", String.valueOf((int)((Location) (obj)).getAccuracy()));
            Preconditions.checkNotNull(obj);
            long l = ((Location) (obj)).getTime();
            b("llf", String.valueOf((int)(System.currentTimeMillis() - l)));
            if (obj == obj1)
            {
                b("llsdk", "1");
            }
        }
        b("z", DateAndTime.getTimeZoneOffsetString());
        b("o", clientmetadata.getOrientationString());
        a(clientmetadata.getDeviceDimensions());
        b("sc_a", String.valueOf(clientmetadata.getDensity()));
        obj1 = clientmetadata.getNetworkOperatorForUrl();
        if (obj1 == null)
        {
            obj = "";
        } else
        {
            obj = ((String) (obj1)).substring(0, e(((String) (obj1))));
        }
        b("mcc", ((String) (obj)));
        if (obj1 == null)
        {
            obj = "";
        } else
        {
            obj = ((String) (obj1)).substring(e(((String) (obj1))));
        }
        b("mnc", ((String) (obj)));
        b("iso", clientmetadata.getIsoCountryCode());
        b("cn", clientmetadata.getNetworkOperatorName());
        b("ct", clientmetadata.getActiveNetworkType().toString());
        c(clientmetadata.getAppVersion());
        d(clientmetadata.getDeviceId());
        b(clientmetadata.isDoNotTrackSet());
    }

    protected void a(String s)
    {
        b("nv", s);
    }

    public AdUrlGenerator withAdUnitId(String s)
    {
        b = s;
        return this;
    }

    public AdUrlGenerator withFacebookSupported(boolean flag)
    {
        return this;
    }

    public AdUrlGenerator withKeywords(String s)
    {
        c = s;
        return this;
    }

    public AdUrlGenerator withLocation(Location location)
    {
        d = location;
        return this;
    }
}
