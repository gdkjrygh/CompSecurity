// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzi

public abstract class zza extends Binder
    implements zzi
{

    public static zzi a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
        class zza
            implements zzi
        {

            private IBinder a;

            public void a(Location location)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                if (location == null)
                {
                    break MISSING_BLOCK_LABEL_56;
                }
                parcel.writeInt(1);
                location.writeToParcel(parcel, 0);
_L1:
                a.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                parcel.writeInt(0);
                  goto _L1
                location;
                parcel1.recycle();
                parcel.recycle();
                throw location;
            }

            public void a(zzd zzd1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                if (zzd1 == null)
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                zzd1 = zzd1.asBinder();
_L1:
                parcel.writeStrongBinder(zzd1);
                a.transact(1, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                zzd1 = null;
                  goto _L1
                zzd1;
                parcel1.recycle();
                parcel.recycle();
                throw zzd1;
            }

            public IBinder asBinder()
            {
                return a;
            }

            zza(IBinder ibinder)
            {
                a = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof zzi))
        {
            return (zzi)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            a(com.google.android.gms.dynamic.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Location)Location.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
