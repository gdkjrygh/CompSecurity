// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

// Referenced classes of package com.google.android.gms.internal:
//            be, ay, az, ct

public static abstract class a.lb extends Binder
    implements be
{
    private static class a
        implements be
    {

        private IBinder lb;

        public IBinder a(d d1, ay ay1, String s, ct ct1, int i)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L5:
            parcel.writeStrongBinder(d1);
            if (ay1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            ay1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            d1 = obj;
            if (ct1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            d1 = ct1.asBinder();
            parcel.writeStrongBinder(d1);
            parcel.writeInt(i);
            lb.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            d1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return d1;
_L2:
            d1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
              goto _L5
        }

        public IBinder asBinder()
        {
            return lb;
        }

        a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public static be g(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (iinterface != null && (iinterface instanceof be))
        {
            return (be)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        d d;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            d = com.google.android.gms.dynamic.m(parcel.readStrongBinder());
            break;
        }
        ay ay1;
        if (parcel.readInt() != 0)
        {
            ay1 = ay.CREATOR.c(parcel);
        } else
        {
            ay1 = null;
        }
        parcel = a(d, ay1, parcel.readString(), l(parcel.readStrongBinder()), parcel.readInt());
        parcel1.writeNoException();
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
