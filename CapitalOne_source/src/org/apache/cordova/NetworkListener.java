// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.location.LocationManager;

// Referenced classes of package org.apache.cordova:
//            CordovaLocationListener, GeoBroker

public class NetworkListener extends CordovaLocationListener
{

    public NetworkListener(LocationManager locationmanager, GeoBroker geobroker)
    {
        super(locationmanager, geobroker, "[Cordova NetworkListener]");
    }
}
