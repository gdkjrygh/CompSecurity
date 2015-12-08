// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.mdm.internal.DeviceManagerClientImpl;

// Referenced classes of package com.google.android.gms.mdm:
//            DeviceManager

static final class t extends com.google.android.gms.common.api.ntBuilder
{

    public final volatile com.google.android.gms.common.api.edListener buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new DeviceManagerClientImpl(context, looper, clientsettings, connectioncallbacks, onconnectionfailedlistener);
    }

    t()
    {
    }
}
