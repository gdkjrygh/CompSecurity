// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.urbanairship.Logger;
import com.urbanairship.util.UAStringUtil;

// Referenced classes of package com.urbanairship.location:
//            LocationService

private class <init>
    implements LocationListener
{

    final LocationService this$0;

    public void onLocationChanged(Location location)
    {
    }

    public void onProviderDisabled(String s)
    {
        Logger.info((new StringBuilder()).append("Location provider disabled: ").append(s).toString());
        if (s.equals(LocationService.access$300(LocationService.this)))
        {
            Logger.info((new StringBuilder()).append("Current provider (").append(s).append(") disabled, resetting providers.").toString());
            LocationService.access$400(LocationService.this);
            LocationService.access$500(LocationService.this);
        }
    }

    public void onProviderEnabled(String s)
    {
        Logger.info((new StringBuilder()).append("Location provider enabled: ").append(s).toString());
        if (!s.equals(LocationService.access$300(LocationService.this)) && s.equals(LocationService.access$600(LocationService.this)) || UAStringUtil.isEmpty(LocationService.access$300(LocationService.this)))
        {
            Logger.info((new StringBuilder()).append("Best provider (").append(s).append(") now available; resetting providers.").toString());
            LocationService.access$302(LocationService.this, s);
            LocationService.access$500(LocationService.this);
        }
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    private ()
    {
        this$0 = LocationService.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
