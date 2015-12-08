// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzi, AdRequestInfoParcel, zzj, AdResponseParcel, 
//            zzh

private static class zznF
    implements zzi
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(AdRequestInfoParcel adrequestinfoparcel, zzj zzj1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        adrequestinfoparcel.writeToParcel(parcel, 0);
_L3:
        if (zzj1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        adrequestinfoparcel = zzj1.asBinder();
_L4:
        parcel.writeStrongBinder(adrequestinfoparcel);
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        adrequestinfoparcel;
        parcel1.recycle();
        parcel.recycle();
        throw adrequestinfoparcel;
        adrequestinfoparcel = null;
          goto _L4
    }

    public AdResponseParcel zze(AdRequestInfoParcel adrequestinfoparcel)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        adrequestinfoparcel.writeToParcel(parcel, 0);
_L3:
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        adrequestinfoparcel = AdResponseParcel.CREATOR.zzk(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return adrequestinfoparcel;
_L2:
        parcel.writeInt(0);
          goto _L3
        adrequestinfoparcel;
        parcel1.recycle();
        parcel.recycle();
        throw adrequestinfoparcel;
        adrequestinfoparcel = null;
          goto _L4
    }

    rcel(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
