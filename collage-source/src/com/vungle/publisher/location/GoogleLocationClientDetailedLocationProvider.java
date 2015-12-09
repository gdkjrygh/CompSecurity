// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.location;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationClient;
import com.vungle.log.Logger;
import com.vungle.publisher.cl;

// Referenced classes of package com.vungle.publisher.location:
//            BaseGoogleDetailedLocationProvider

public class GoogleLocationClientDetailedLocationProvider extends BaseGoogleDetailedLocationProvider
    implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, cl
{

    Context b;

    public GoogleLocationClientDetailedLocationProvider()
    {
    }

    protected final String a()
    {
        return "Google Play Services LocationClient";
    }

    protected final boolean a(Object obj)
    {
        return ((LocationClient)obj).isConnected();
    }

    public final volatile Location b()
    {
        return super.b();
    }

    protected final void b(Object obj)
    {
        ((LocationClient)obj).connect();
    }

    protected final Location c(Object obj)
    {
        return ((LocationClient)obj).getLastLocation();
    }

    protected final Object c()
    {
        return new LocationClient(b, this, this);
    }

    protected final void d(Object obj)
    {
        ((LocationClient)obj).disconnect();
    }

    public void onConnected(Bundle bundle)
    {
        super.d();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        super.onConnectionFailed(connectionresult);
    }

    public void onDisconnected()
    {
        Logger.v("VungleLocation", (new StringBuilder("disconnected from Google Play Services LocationClient ")).append(super.a).toString());
    }
}
