// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

final class bjg
    implements bje
{

    private IBinder a;

    bjg(IBinder ibinder)
    {
        a = ibinder;
    }

    public final AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel)
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
            break MISSING_BLOCK_LABEL_92;
        }
        adrequestinfoparcel = AdResponseParcel.CREATOR;
        adrequestinfoparcel = bjc.a(parcel1);
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

    public final void a(AdRequestInfoParcel adrequestinfoparcel, bjh bjh1)
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
        if (bjh1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        adrequestinfoparcel = bjh1.asBinder();
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

    public final IBinder asBinder()
    {
        return a;
    }
}
