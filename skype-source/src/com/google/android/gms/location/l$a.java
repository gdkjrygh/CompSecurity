// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.location:
//            l, LocationResult, LocationAvailability, e

public static abstract class a.a extends Binder
    implements l
{
    private static final class a
        implements l
    {

        private IBinder a;

        public final void a(LocationAvailability locationavailability)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            if (locationavailability == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            locationavailability.writeToParcel(parcel, 0);
_L1:
            a.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            locationavailability;
            parcel.recycle();
            throw locationavailability;
        }

        public final void a(LocationResult locationresult)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
            if (locationresult == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            locationresult.writeToParcel(parcel, 0);
_L1:
            a.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            locationresult;
            parcel.recycle();
            throw locationresult;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static l a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (iinterface != null && (iinterface instanceof l))
        {
            return (l)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.ILocationCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = (LocationResult)LocationResult.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
            parcel1 = obj1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = LocationAvailability.CREATOR;
            parcel1 = e.a(parcel);
        }
        a(parcel1);
        return true;
    }
}
