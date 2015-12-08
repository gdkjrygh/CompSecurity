// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

// Referenced classes of package com.google.android.gms.internal:
//            am, bu, an

public interface as
    extends IInterface
{
    public static abstract class a extends Binder
        implements as
    {

        public static as g(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (iinterface != null && (iinterface instanceof as))
            {
                return (as)iinterface;
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
                d = com.google.android.gms.dynamic.d.a.ag(parcel.readStrongBinder());
                break;
            }
            am am1;
            if (parcel.readInt() != 0)
            {
                am1 = am.CREATOR.c(parcel);
            } else
            {
                am1 = null;
            }
            parcel = a(d, am1, parcel.readString(), bu.a.i(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class a.a
        implements as
    {

        private IBinder ko;

        public IBinder a(d d1, am am1, String s, bu bu1, int i)
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
            if (am1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            am1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            d1 = obj;
            if (bu1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            d1 = bu1.asBinder();
            parcel.writeStrongBinder(d1);
            parcel.writeInt(i);
            ko.transact(1, parcel, parcel1, 0);
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
            return ko;
        }

        a.a(IBinder ibinder)
        {
            ko = ibinder;
        }
    }


    public abstract IBinder a(d d, am am, String s, bu bu, int i)
        throws RemoteException;
}
