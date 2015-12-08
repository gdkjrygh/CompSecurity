// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public abstract class bjf extends Binder
    implements bje
{

    public bjf()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public static bje a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (iinterface != null && (iinterface instanceof bje))
        {
            return (bje)iinterface;
        } else
        {
            return new bjg(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (parcel.readInt() != 0)
            {
                obj = AdRequestInfoParcel.CREATOR;
                obj = bja.a(parcel);
            }
            parcel = a(((AdRequestInfoParcel) (obj)));
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = AdRequestInfoParcel.CREATOR;
            obj = bja.a(parcel);
        } else
        {
            obj = null;
        }
        parcel = parcel.readStrongBinder();
        if (parcel == null)
        {
            parcel = obj1;
        } else
        {
            android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
            if (iinterface != null && (iinterface instanceof bjh))
            {
                parcel = (bjh)iinterface;
            } else
            {
                parcel = new bjj(parcel);
            }
        }
        a(((AdRequestInfoParcel) (obj)), parcel);
        parcel1.writeNoException();
        return true;
    }
}
