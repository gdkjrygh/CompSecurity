// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

// Referenced classes of package com.google.android.gms.mdm.internal:
//            AbstractDeviceManagerCallbacks, DeviceInfo

public final class DeviceManagerClientImpl extends GmsClient
{
    private static final class GetDeviceNameBinderCallbacks extends AbstractDeviceManagerCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mListener;

        public final void onDeviceInfoFetched(int i, final DeviceInfo info)
        {
            if (mListener != null)
            {
                mListener.setResult(i. new com.google.android.gms.mdm.DeviceManagerApi.DeviceNameResult() {

                    final GetDeviceNameBinderCallbacks this$0;
                    final DeviceInfo val$info;
                    final int val$statusCode;

                    public final String getModel()
                    {
                        if (info == null)
                        {
                            return null;
                        } else
                        {
                            return info.mModelName;
                        }
                    }

                    public final String getName()
                    {
                        if (info == null)
                        {
                            return null;
                        } else
                        {
                            return info.mNickname;
                        }
                    }

                    public final Status getStatus()
                    {
                        return new Status(statusCode);
                    }

            
            {
                this$0 = final_getdevicenamebindercallbacks;
                info = deviceinfo;
                statusCode = I.this;
                super();
            }
                });
            }
        }

        private GetDeviceNameBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mListener = resultholder;
        }

        GetDeviceNameBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, byte byte0)
        {
            this(resultholder);
        }
    }


    public DeviceManagerClientImpl(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 37, clientsettings, connectioncallbacks, onconnectionfailedlistener);
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return IDeviceManagerService.Stub.asInterface(ibinder);
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.mdm.internal.IDeviceManagerService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.mdm.services.DeviceManagerApiService.START";
    }
}
