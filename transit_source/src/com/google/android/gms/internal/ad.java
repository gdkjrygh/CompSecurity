// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

// Referenced classes of package com.google.android.gms.internal:
//            x, aw, y

public interface ad
    extends IInterface
{
    public static abstract class a extends Binder
        implements ad
    {

        public static ad g(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (iinterface != null && (iinterface instanceof ad))
            {
                return (ad)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            b b;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                b = com.google.android.gms.dynamic.b.a.z(parcel.readStrongBinder());
                break;
            }
            x x1;
            if (parcel.readInt() != 0)
            {
                x1 = x.CREATOR.b(parcel);
            } else
            {
                x1 = null;
            }
            parcel = a(b, x1, parcel.readString(), aw.a.i(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class a.a
        implements ad
    {

        private IBinder dG;

        public IBinder a(b b1, x x1, String s, aw aw1, int i)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            if (b1 == null) goto _L2; else goto _L1
_L1:
            b1 = b1.asBinder();
_L5:
            parcel.writeStrongBinder(b1);
            if (x1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            x1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            b1 = obj;
            if (aw1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            b1 = aw1.asBinder();
            parcel.writeStrongBinder(b1);
            parcel.writeInt(i);
            dG.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            b1 = parcel1.readStrongBinder();
            parcel1.recycle();
            parcel.recycle();
            return b1;
_L2:
            b1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            b1;
            parcel1.recycle();
            parcel.recycle();
            throw b1;
              goto _L5
        }

        public IBinder asBinder()
        {
            return dG;
        }

        a.a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public abstract IBinder a(b b, x x, String s, aw aw, int i)
        throws RemoteException;
}
