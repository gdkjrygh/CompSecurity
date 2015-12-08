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
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

public interface j
    extends IInterface
{
    public static abstract class a extends Binder
        implements j
    {

        public static j Z(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
            if (iinterface != null && (iinterface instanceof j))
            {
                return (j)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.drive.realtime.internal.IEventCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                if (parcel.readInt() != 0)
                {
                    obj = (ParcelableEventList)ParcelableEventList.CREATOR.createFromParcel(parcel);
                }
                a(((ParcelableEventList) (obj)));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                obj = obj1;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = Status.CREATOR.createFromParcel(parcel);
            }
            o(((Status) (obj)));
            parcel1.writeNoException();
            return true;
        }
    }

    private static class a.a
        implements j
    {

        private IBinder kq;

        public void a(ParcelableEventList parcelableeventlist)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IEventCallback");
            if (parcelableeventlist == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            parcelableeventlist.writeToParcel(parcel, 0);
_L1:
            kq.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelableeventlist;
            parcel1.recycle();
            parcel.recycle();
            throw parcelableeventlist;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void o(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IEventCallback");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            kq.transact(2, parcel, parcel1, 0);
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
            kq = ibinder;
        }
    }


    public abstract void a(ParcelableEventList parcelableeventlist)
        throws RemoteException;

    public abstract void o(Status status)
        throws RemoteException;
}
