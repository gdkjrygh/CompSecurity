// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            fu, fr, fv

public static abstract class a.kq extends Binder
    implements fu
{
    private static class a
        implements fu
    {

        private IBinder kq;

        public void a(fv fv1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (fv1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            fv1 = fv1.asBinder();
_L1:
            parcel.writeStrongBinder(fv1);
            kq.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fv1 = null;
              goto _L1
            fv1;
            parcel1.recycle();
            parcel.recycle();
            throw fv1;
        }

        public void a(fv fv1, String s, fr afr[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (fv1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            fv1 = fv1.asBinder();
_L1:
            parcel.writeStrongBinder(fv1);
            parcel.writeString(s);
            parcel.writeTypedArray(afr, 0);
            kq.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fv1 = null;
              goto _L1
            fv1;
            parcel1.recycle();
            parcel.recycle();
            throw fv1;
        }

        public void a(fv fv1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (fv1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            fv1 = fv1.asBinder();
_L1:
            parcel.writeStrongBinder(fv1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            kq.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fv1 = null;
              goto _L1
            fv1;
            parcel1.recycle();
            parcel.recycle();
            throw fv1;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void b(fv fv1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (fv1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            fv1 = fv1.asBinder();
_L1:
            parcel.writeStrongBinder(fv1);
            kq.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fv1 = null;
              goto _L1
            fv1;
            parcel1.recycle();
            parcel.recycle();
            throw fv1;
        }

        a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public static fu A(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (iinterface != null && (iinterface instanceof fu))
        {
            return (fu)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        fv fv;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            a(B(parcel.readStrongBinder()), parcel.readString(), (fr[])parcel.createTypedArray(fr.CREATOR));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            a(B(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            b(B(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            fv = B(parcel.readStrongBinder());
            break;
        }
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(fv, flag);
        parcel1.writeNoException();
        return true;
    }
}
