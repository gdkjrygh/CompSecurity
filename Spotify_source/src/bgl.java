// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

public abstract class bgl extends Binder
    implements bgk
{

    public static bgk a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (iinterface != null && (iinterface instanceof bgk))
        {
            return (bgk)iinterface;
        } else
        {
            return new bgm(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        byb byb = null;
        Object obj = null;
        byb byb1;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            byb = byc.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = AdSizeParcel.CREATOR;
                obj = bfp.a(parcel);
            }
            parcel = a(byb, ((AdSizeParcel) (obj)), parcel.readString(), cey.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            byb1 = byc.a(parcel.readStrongBinder());
            obj = byb;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = AdSizeParcel.CREATOR;
            obj = bfp.a(parcel);
        }
        parcel = a(byb1, ((AdSizeParcel) (obj)), parcel.readString(), cey.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
        parcel1.writeNoException();
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
