// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdm.DeviceManagerApi;

// Referenced classes of package com.google.android.gms.mdm.internal:
//            DeviceManagerClientImpl, IDeviceManagerService

public final class DeviceManagerApiImpl
    implements DeviceManagerApi
{
    public static abstract class DeviceManagerApiMethodImpl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    {

        public DeviceManagerApiMethodImpl(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }

    private static abstract class GetDeviceNameImpl extends DeviceManagerApiMethodImpl
    {

        protected final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.mdm.DeviceManagerApi.DeviceNameResult() {

                final GetDeviceNameImpl this$0;
                final Status val$status;

                public final String getModel()
                {
                    return null;
                }

                public final String getName()
                {
                    return null;
                }

                public final Status getStatus()
                {
                    return status;
                }

            
            {
                this$0 = final_getdevicenameimpl;
                status = Status.this;
                super();
            }
            };
        }

        protected GetDeviceNameImpl(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }


    final com.google.android.gms.common.api.Api.ClientKey mClientKey;

    public DeviceManagerApiImpl(com.google.android.gms.common.api.Api.ClientKey clientkey)
    {
        mClientKey = clientkey;
    }

    public final PendingResult getDeviceName(GoogleApiClient googleapiclient)
    {
        return googleapiclient.enqueue(new GetDeviceNameImpl(mClientKey, googleapiclient) {

            final DeviceManagerApiImpl this$0;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (DeviceManagerClientImpl)client;
                client.checkConnected();
                DeviceManagerClientImpl.GetDeviceNameBinderCallbacks getdevicenamebindercallbacks = new DeviceManagerClientImpl.GetDeviceNameBinderCallbacks(this, (byte)0);
                ((IDeviceManagerService)client.getService()).getDeviceName(getdevicenamebindercallbacks);
            }

            
            {
                this$0 = DeviceManagerApiImpl.this;
                super(clientkey, googleapiclient);
            }
        });
    }
}
