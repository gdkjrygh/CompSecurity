// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.mdm.internal:
//            DeviceManagerApiImpl

private static abstract class thodImpl extends thodImpl
{

    protected final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.mdm.DeviceManagerApi.DeviceNameResult() {

            final DeviceManagerApiImpl.GetDeviceNameImpl this$0;
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
                this$0 = DeviceManagerApiImpl.GetDeviceNameImpl.this;
                status = status1;
                super();
            }
        };
    }

    protected _cls1.val.status(com.google.android.gms.common.api.l l, GoogleApiClient googleapiclient)
    {
        super(l, googleapiclient);
    }
}
