// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            e

private static final class a
    implements IInterface
{

    private final IBinder a;

    public final String a()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Object obj;
        obj;
        c.a().a("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
        parcel1.recycle();
        parcel.recycle();
        return null;
        obj;
        parcel1.recycle();
        parcel.recycle();
        throw obj;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final boolean b()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        parcel.writeInt(1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Object obj;
        obj;
        c.a().a("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
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
        a = ibinder;
    }
}
