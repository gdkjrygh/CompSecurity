// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.k;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.a.d;
import com.google.android.gms.maps.o;
import com.google.android.gms.maps.p;

// Referenced classes of package com.google.android.gms.maps.a:
//            aj, al, j, m, 
//            a, y, v

public abstract class ak extends Binder
    implements aj
{

    public static aj a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        if (iinterface != null && (iinterface instanceof aj))
        {
            return (aj)iinterface;
        } else
        {
            return new al(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int l)
    {
        Object obj = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj1 = null;
        Object obj5 = null;
        Object obj2 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, l);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(k.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = b(k.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((j) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj1 = k.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = GoogleMapOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj1 = a(((com.google.android.gms.b.j) (obj1)), parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj1 != null)
            {
                parcel = ((m) (obj1)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = a();
            parcel1.writeNoException();
            parcel = obj3;
            if (obj != null)
            {
                parcel = ((a) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = b();
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((d) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(k.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = k.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = StreetViewPanoramaOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(((com.google.android.gms.b.j) (obj)), parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj1));
            if (obj != null)
            {
                parcel = ((y) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = c(k.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = obj5;
            break;
        }
        if (obj != null)
        {
            parcel = ((v) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
