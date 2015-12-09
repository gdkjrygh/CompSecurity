// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.internal.connection;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;

// Referenced classes of package com.google.android.gms.nearby.internal.connection:
//            ConnectionsImpl, ConnectionsClientImpl

static final class Listener extends com.google.android.gms.common.api.Builder
{

    public final volatile com.google.android.gms.common.api.stener buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.nnectionCallbacks nnectioncallbacks, com.google.android.gms.common.api.ConnectionFailedListener connectionfailedlistener)
    {
        return new ConnectionsClientImpl(context, looper, clientsettings, nnectioncallbacks, connectionfailedlistener);
    }

    Listener()
    {
    }
}
