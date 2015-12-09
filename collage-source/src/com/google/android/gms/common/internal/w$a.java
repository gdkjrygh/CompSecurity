// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.a.a;

// Referenced classes of package com.google.android.gms.common.internal:
//            w

public static abstract class a.a extends Binder
    implements w
{
    private static class a
        implements w
    {

        private IBinder a;

        public com.google.android.gms.a.a a(com.google.android.gms.a.a a1, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            a1 = a1.asBinder();
_L1:
            parcel.writeStrongBinder(a1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            a1 = com.google.android.gms.a.a.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return a1;
            a1 = null;
              goto _L1
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
        }

        public IBinder asBinder()
        {
            return a;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static w a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (iinterface != null && (iinterface instanceof w))
        {
            return (w)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            parcel = a(com.google.android.gms.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            break;
        }
        if (parcel != null)
        {
            parcel = parcel.asBinder();
        } else
        {
            parcel = null;
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
