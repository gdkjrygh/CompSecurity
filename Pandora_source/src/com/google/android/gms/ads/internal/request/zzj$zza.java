// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzj, AdResponseParcel, zzh

public static abstract class attachInterface extends Binder
    implements zzj
{
    private static class a
        implements zzj
    {

        private IBinder a;

        public IBinder asBinder()
        {
            return a;
        }

        public void zzb(AdResponseParcel adresponseparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdResponseListener");
            if (adresponseparcel == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            adresponseparcel.writeToParcel(parcel, 0);
_L1:
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            adresponseparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adresponseparcel;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static zzj zzF(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
        if (iinterface != null && (iinterface instanceof zzj))
        {
            return (zzj)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.request.IAdResponseListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = AdResponseParcel.CREATOR.zzi(parcel);
        } else
        {
            parcel = null;
        }
        zzb(parcel);
        parcel1.writeNoException();
        return true;
    }

    public a.a()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }
}
