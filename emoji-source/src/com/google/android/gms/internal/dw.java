// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ds, du, dt, dv

public interface dw
    extends IInterface
{
    public static abstract class a extends Binder
        implements dw
    {

        public static dw y(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (iinterface != null && (iinterface instanceof dw))
            {
                return (dw)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = ds.CREATOR.h(parcel);
            } else
            {
                parcel = null;
            }
            parcel = b(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }
    }

    private static class a.a
        implements dw
    {

        private IBinder kq;

        public IBinder asBinder()
        {
            return kq;
        }

        public du b(ds ds1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (ds1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ds1.writeToParcel(parcel, 0);
_L3:
            kq.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            ds1 = du.CREATOR.i(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ds1;
_L2:
            parcel.writeInt(0);
              goto _L3
            ds1;
            parcel1.recycle();
            parcel.recycle();
            throw ds1;
            ds1 = null;
              goto _L4
        }

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract du b(ds ds)
        throws RemoteException;
}
