// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.location;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationServices;
import com.vungle.log.Logger;
import com.vungle.publisher.cm;

// Referenced classes of package com.vungle.publisher.location:
//            BaseGoogleDetailedLocationProvider

public class GoogleLocationServicesDetailedLocationProvider extends BaseGoogleDetailedLocationProvider
    implements com.google.android.gms.common.api.c.b, com.google.android.gms.common.api.c.c, cm
{

    Context b;

    public GoogleLocationServicesDetailedLocationProvider()
    {
    }

    protected final String a()
    {
        return "Google Play Services LocationServices";
    }

    protected final boolean a(Object obj)
    {
        return ((c)obj).d();
    }

    public final volatile Location b()
    {
        return super.b();
    }

    protected final void b(Object obj)
    {
        ((c)obj).b();
    }

    protected final Location c(Object obj)
    {
        obj = (c)obj;
        return LocationServices.FusedLocationApi.getLastLocation(((com.google.android.gms.common.api.GoogleApiClient) (obj)));
    }

    protected final Object c()
    {
        Context context = b;
        com.google.android.gms.common.api.Api api = LocationServices.API;
        return (new com.google.android.gms.common.api.c.a(context)).a(api).a(this).a(this).b();
    }

    protected final void d(Object obj)
    {
        ((c)obj).c();
    }

    public void onConnected(Bundle bundle)
    {
        super.d();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        super.onConnectionFailed(connectionresult);
    }

    public void onConnectionSuspended(int i)
    {
        Logger.v("VungleLocation", (new StringBuilder("connection suspended for Google Play Services LocationServices ")).append(super.a).toString());
    }
}
