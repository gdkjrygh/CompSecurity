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
//            cx, cz, cy, da

public interface db
    extends IInterface
{
    public static abstract class a extends Binder
        implements db
    {

        public static db s(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (iinterface != null && (iinterface instanceof db))
            {
                return (db)iinterface;
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
                parcel = cx.CREATOR.f(parcel);
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
        implements db
    {

        private IBinder kn;

        public IBinder asBinder()
        {
            return kn;
        }

        public cz b(cx cx1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (cx1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            cx1.writeToParcel(parcel, 0);
_L3:
            kn.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            cx1 = cz.CREATOR.g(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return cx1;
_L2:
            parcel.writeInt(0);
              goto _L3
            cx1;
            parcel1.recycle();
            parcel.recycle();
            throw cx1;
            cx1 = null;
              goto _L4
        }

        a.a(IBinder ibinder)
        {
            kn = ibinder;
        }
    }


    public abstract cz b(cx cx)
        throws RemoteException;
}
