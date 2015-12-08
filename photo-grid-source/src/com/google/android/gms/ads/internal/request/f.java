// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzj, AdRequestInfoParcel, zzk, AdResponseParcel, 
//            zzh

final class f
    implements zzj
{

    private IBinder a;

    f(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void zza(AdRequestInfoParcel adrequestinfoparcel, zzk zzk1)
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
        if (zzk1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        adrequestinfoparcel = zzk1.asBinder();
_L4:
        parcel.writeStrongBinder(adrequestinfoparcel);
        a.transact(2, parcel, parcel1, 0);
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

    public final AdResponseParcel zze(AdRequestInfoParcel adrequestinfoparcel)
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
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        adrequestinfoparcel = AdResponseParcel.CREATOR.zzj(parcel1);
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
}
