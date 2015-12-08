// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.nearby.sharing.Sharing;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            NearbySharingClientImpl

public final class SharingImpl
    implements Sharing
{

    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

        public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new NearbySharingClientImpl(context, looper, connectioncallbacks, onconnectionfailedlistener, clientsettings);
        }

    };
    public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();

    public SharingImpl()
    {
    }

}
