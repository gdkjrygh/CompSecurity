// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            SharingImpl, NearbySharingClientImpl

static final class nFailedListener extends com.google.android.gms.common.api.ientBuilder
{

    public final volatile com.google.android.gms.common.api.FailedListener buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.t.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.t.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new NearbySharingClientImpl(context, looper, connectioncallbacks, onconnectionfailedlistener, clientsettings);
    }

    nFailedListener()
    {
    }
}
