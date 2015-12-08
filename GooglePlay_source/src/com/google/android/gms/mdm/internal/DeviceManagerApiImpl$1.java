// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.mdm.internal:
//            DeviceManagerApiImpl, DeviceManagerClientImpl, IDeviceManagerService

final class tDeviceNameImpl extends tDeviceNameImpl
{

    final DeviceManagerApiImpl this$0;

    protected final volatile void doExecute(com.google.android.gms.common.api._cls1 _pcls1)
        throws RemoteException
    {
        _pcls1 = (DeviceManagerClientImpl)_pcls1;
        _pcls1.checkConnected();
        .GetDeviceNameBinderCallbacks getdevicenamebindercallbacks = new .GetDeviceNameBinderCallbacks(this, (byte)0);
        ((IDeviceManagerService)_pcls1.getService()).getDeviceName(getdevicenamebindercallbacks);
    }

    .GetDeviceNameBinderCallbacks(com.google.android.gms.common.api._cls1 _pcls1, GoogleApiClient googleapiclient)
    {
        this$0 = DeviceManagerApiImpl.this;
        super(_pcls1, googleapiclient);
    }
}
