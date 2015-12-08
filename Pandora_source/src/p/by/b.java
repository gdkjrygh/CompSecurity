// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.by;

import android.content.Context;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.GoogleApiClient;

public class b
{

    public b()
    {
    }

    public GoogleApiClient a(CastDevice castdevice, Context context, com.google.android.gms.cast.Cast.Listener listener, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        castdevice = com.google.android.gms.cast.Cast.CastOptions.builder(castdevice, listener);
        context = new com.google.android.gms.common.api.GoogleApiClient.Builder(context);
        context.addApi(Cast.API, castdevice.build()).addOnConnectionFailedListener(onconnectionfailedlistener).addConnectionCallbacks(connectioncallbacks);
        return context.build();
    }
}
