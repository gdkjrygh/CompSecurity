// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableCollaborator

public interface e
    extends IInterface
{
    public static abstract class a extends Binder
        implements e
    {

        public static e ad(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
            if (iinterface != null && (iinterface instanceof e))
            {
                return (e)iinterface;
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
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                a((ParcelableCollaborator[])parcel.createTypedArray(ParcelableCollaborator.CREATOR));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = Status.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            n(parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    private static class a.a
        implements e
    {

        private IBinder le;

        public void a(ParcelableCollaborator aparcelablecollaborator[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
            parcel.writeTypedArray(aparcelablecollaborator, 0);
            le.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            aparcelablecollaborator;
            parcel1.recycle();
            parcel.recycle();
            throw aparcelablecollaborator;
        }

        public IBinder asBinder()
        {
            return le;
        }

        public void n(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            le.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        a.a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public abstract void a(ParcelableCollaborator aparcelablecollaborator[])
        throws RemoteException;

    public abstract void n(Status status)
        throws RemoteException;
}
