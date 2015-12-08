// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            AdvertisingInfoServiceStrategy

private static final class binder
    implements IInterface
{

    public static final String ADVERTISING_ID_SERVICE_INTERFACE_TOKEN = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    private static final int AD_TRANSACTION_CODE_ID = 1;
    private static final int AD_TRANSACTION_CODE_LIMIT_AD_TRACKING = 2;
    private static final int FLAGS_NONE = 0;
    private final IBinder binder;

    public IBinder asBinder()
    {
        return binder;
    }

    public String getId()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        binder.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Object obj;
        obj;
        Fabric.getLogger().d("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
        parcel1.recycle();
        parcel.recycle();
        return null;
        obj;
        parcel1.recycle();
        parcel.recycle();
        throw obj;
    }

    public boolean isLimitAdTrackingEnabled()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        parcel.writeInt(1);
        binder.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Object obj;
        obj;
        Fabric.getLogger().d("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
        parcel1.recycle();
        parcel.recycle();
        return false;
        obj;
        parcel1.recycle();
        parcel.recycle();
        throw obj;
    }

    public (IBinder ibinder)
    {
        binder = ibinder;
    }
}
