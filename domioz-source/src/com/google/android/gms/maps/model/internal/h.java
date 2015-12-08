// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            g, i

public abstract class h extends Binder
    implements g
{

    public static g a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (iinterface != null && (iinterface instanceof g))
        {
            return (g)iinterface;
        } else
        {
            return new i(ibinder);
        }
    }

    public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int l)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        j j1 = null;
        Object obj4 = null;
        Object obj = null;
        switch (k)
        {
        default:
            return super.onTransact(k, parcel, parcel1, l);

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
            j1 = a(parcel.readString());
            parcel1.writeNoException();
            parcel = obj;
            if (j1 != null)
            {
                parcel = j1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            j1 = b(parcel.readString());
            parcel1.writeNoException();
            parcel = obj1;
            if (j1 != null)
            {
                parcel = j1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            j1 = a();
            parcel1.writeNoException();
            parcel = obj2;
            if (j1 != null)
            {
                parcel = j1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            j1 = a(parcel.readFloat());
            parcel1.writeNoException();
            parcel = obj3;
            if (j1 != null)
            {
                parcel = j1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            j j2;
            if (parcel.readInt() != 0)
            {
                parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            j2 = a(parcel);
            parcel1.writeNoException();
            parcel = j1;
            if (j2 != null)
            {
                parcel = j2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            j1 = c(parcel.readString());
            parcel1.writeNoException();
            parcel = obj4;
            break;
        }
        if (j1 != null)
        {
            parcel = j1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
