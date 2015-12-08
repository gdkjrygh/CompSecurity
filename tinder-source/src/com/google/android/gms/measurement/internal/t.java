// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            AppMetadata, EventParcel, UserAttributeParcel, q, 
//            i, g

public interface t
    extends IInterface
{
    public static abstract class a extends Binder
        implements t
    {

        public static t a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
            if (iinterface != null && (iinterface instanceof t))
            {
                return (t)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            Object obj3 = null;
            Object obj = null;
            Object obj1 = null;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.measurement.internal.IMeasurementService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                if (parcel.readInt() != 0)
                {
                    obj = EventParcel.CREATOR;
                    obj = q.a(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = AppMetadata.CREATOR;
                    obj1 = i.a(parcel);
                }
                a(((EventParcel) (obj)), ((AppMetadata) (obj1)));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                Object obj2;
                if (parcel.readInt() != 0)
                {
                    obj = UserAttributeParcel.CREATOR;
                    obj = g.a(parcel);
                } else
                {
                    obj = null;
                }
                obj2 = obj3;
                if (parcel.readInt() != 0)
                {
                    obj2 = AppMetadata.CREATOR;
                    obj2 = i.a(parcel);
                }
                a(((UserAttributeParcel) (obj)), ((AppMetadata) (obj2)));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = AppMetadata.CREATOR;
                obj = i.a(parcel);
            }
            a(((AppMetadata) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.measurement.internal.IMeasurementService");
        }
    }

    private static final class a.a
        implements t
    {

        private IBinder a;

        public final void a(AppMetadata appmetadata)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.measurement.internal.IMeasurementService");
            if (appmetadata == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            appmetadata.writeToParcel(parcel, 0);
_L1:
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            appmetadata;
            parcel1.recycle();
            parcel.recycle();
            throw appmetadata;
        }

        public final void a(EventParcel eventparcel, AppMetadata appmetadata)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.measurement.internal.IMeasurementService");
            if (eventparcel == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            eventparcel.writeToParcel(parcel, 0);
_L3:
            if (appmetadata == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            parcel.writeInt(1);
            appmetadata.writeToParcel(parcel, 0);
_L4:
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            eventparcel;
            parcel1.recycle();
            parcel.recycle();
            throw eventparcel;
            parcel.writeInt(0);
              goto _L4
        }

        public final void a(UserAttributeParcel userattributeparcel, AppMetadata appmetadata)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.measurement.internal.IMeasurementService");
            if (userattributeparcel == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            userattributeparcel.writeToParcel(parcel, 0);
_L3:
            if (appmetadata == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            parcel.writeInt(1);
            appmetadata.writeToParcel(parcel, 0);
_L4:
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            userattributeparcel;
            parcel1.recycle();
            parcel.recycle();
            throw userattributeparcel;
            parcel.writeInt(0);
              goto _L4
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(AppMetadata appmetadata)
        throws RemoteException;

    public abstract void a(EventParcel eventparcel, AppMetadata appmetadata)
        throws RemoteException;

    public abstract void a(UserAttributeParcel userattributeparcel, AppMetadata appmetadata)
        throws RemoteException;
}
