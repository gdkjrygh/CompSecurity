// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class joj extends Binder
    implements joi
{

    public static joi a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (iinterface != null && (iinterface instanceof joi))
        {
            return (joi)iinterface;
        } else
        {
            return new jok(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        kok kok = null;
        Object obj = null;
        kok kok1;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            kok = kol.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = joe.a(parcel);
            }
            parcel = a(kok, ((com.google.android.gms.ads.internal.client.AdSizeParcel) (obj)), parcel.readString(), kut.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            kok1 = kol.a(parcel.readStrongBinder());
            obj = kok;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = joe.a(parcel);
        }
        parcel = a(kok1, ((com.google.android.gms.ads.internal.client.AdSizeParcel) (obj)), parcel.readString(), kut.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
        parcel1.writeNoException();
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
