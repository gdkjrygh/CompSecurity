// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            d, ParcelableCollaborator

public static abstract class a.kq extends Binder
    implements d
{
    private static class a
        implements d
    {

        private IBinder kq;

        public void a(ParcelableCollaborator parcelablecollaborator)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            if (parcelablecollaborator == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            parcelablecollaborator.writeToParcel(parcel, 0);
_L1:
            kq.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelablecollaborator;
            parcel1.recycle();
            parcel.recycle();
            throw parcelablecollaborator;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void b(ParcelableCollaborator parcelablecollaborator)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            if (parcelablecollaborator == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            parcelablecollaborator.writeToParcel(parcel, 0);
_L1:
            kq.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelablecollaborator;
            parcel1.recycle();
            parcel.recycle();
            throw parcelablecollaborator;
        }

        a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public static d T(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
        if (iinterface != null && (iinterface instanceof d))
        {
            return (d)iinterface;
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
        Object obj = null;
        ParcelableCollaborator parcelablecollaborator = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            if (parcel.readInt() != 0)
            {
                parcelablecollaborator = (ParcelableCollaborator)ParcelableCollaborator.CREATOR.createFromParcel(parcel);
            }
            a(parcelablecollaborator);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            parcelablecollaborator = obj;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcelablecollaborator = (ParcelableCollaborator)ParcelableCollaborator.CREATOR.createFromParcel(parcel);
        }
        b(parcelablecollaborator);
        parcel1.writeNoException();
        return true;
    }
}
