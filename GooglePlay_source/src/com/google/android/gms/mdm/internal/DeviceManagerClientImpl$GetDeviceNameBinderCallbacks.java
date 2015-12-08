// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.mdm.internal:
//            AbstractDeviceManagerCallbacks, DeviceManagerClientImpl, DeviceInfo

private static final class <init> extends AbstractDeviceManagerCallbacks
{

    private final com.google.android.gms.common.api.internal.tatusCode mListener;

    public final void onDeviceInfoFetched(final int statusCode, final DeviceInfo info)
    {
        if (mListener != null)
        {
            mListener.er(new com.google.android.gms.mdm.DeviceManagerApi.DeviceNameResult() {

                final DeviceManagerClientImpl.GetDeviceNameBinderCallbacks this$0;
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
                this$0 = DeviceManagerClientImpl.GetDeviceNameBinderCallbacks.this;
                info = deviceinfo;
                statusCode = i;
                super();
            }
            });
        }
    }

    private _cls1.val.statusCode(com.google.android.gms.common.api.internal.tatusCode tatuscode)
    {
        mListener = tatuscode;
    }

    mListener(com.google.android.gms.common.api.internal.er er, byte byte0)
    {
        this(er);
    }
}
