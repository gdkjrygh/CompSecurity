// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class ayl extends Binder
    implements ayk
{

    public static ayk a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (iinterface != null && (iinterface instanceof ayk))
        {
            return (ayk)iinterface;
        } else
        {
            return new aym(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        aaf aaf1 = null;
        Object obj4 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            parcel = a(parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            aaf1 = a(parcel.readString());
            parcel1.writeNoException();
            parcel = obj;
            if (aaf1 != null)
            {
                parcel = aaf1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            aaf1 = b(parcel.readString());
            parcel1.writeNoException();
            parcel = obj1;
            if (aaf1 != null)
            {
                parcel = aaf1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            aaf1 = a();
            parcel1.writeNoException();
            parcel = obj2;
            if (aaf1 != null)
            {
                parcel = aaf1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            aaf1 = a(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj3;
            if (aaf1 != null)
            {
                parcel = aaf1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            aaf aaf2;
            if (parcel.readInt() != 0)
            {
                parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            aaf2 = a(parcel);
            parcel1.writeNoException();
            parcel = aaf1;
            if (aaf2 != null)
            {
                parcel = aaf2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            aaf1 = c(parcel.readString());
            parcel1.writeNoException();
            parcel = obj4;
            break;
        }
        if (aaf1 != null)
        {
            parcel = aaf1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
