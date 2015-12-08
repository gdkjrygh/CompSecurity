// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.rsa.mobilesdk.sdk;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.rsa.mobilesdk.sdk:
//            LocationRetriever

private class <init>
    implements LocationListener
{

    final LocationRetriever this$0;

    public void onLocationChanged(Location location)
    {
        Log.i("LocationRetriever", "onLocationChanged");
        LocationRetriever.access$300(LocationRetriever.this, location);
        if (LocationRetriever.access$500(LocationRetriever.this, LocationRetriever.access$400(LocationRetriever.this)))
        {
            LocationRetriever.access$600(LocationRetriever.this);
            LocationRetriever.access$700(LocationRetriever.this);
            LocationRetriever.access$800(LocationRetriever.this);
            LocationRetriever.access$902(LocationRetriever.this, 0);
        }
        LocationRetriever.access$1000(LocationRetriever.this);
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    private ()
    {
        this$0 = LocationRetriever.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
