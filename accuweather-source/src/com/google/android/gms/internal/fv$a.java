// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            fv, fs, fw

public static abstract class a.ko extends Binder
    implements fv
{
    private static class a
        implements fv
    {

        private IBinder ko;

        public void a(fw fw1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (fw1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            fw1 = fw1.asBinder();
_L1:
            parcel.writeStrongBinder(fw1);
            ko.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fw1 = null;
              goto _L1
            fw1;
            parcel1.recycle();
            parcel.recycle();
            throw fw1;
        }

        public void a(fw fw1, String s, fs afs[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (fw1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            fw1 = fw1.asBinder();
_L1:
            parcel.writeStrongBinder(fw1);
            parcel.writeString(s);
            parcel.writeTypedArray(afs, 0);
            ko.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fw1 = null;
              goto _L1
            fw1;
            parcel1.recycle();
            parcel.recycle();
            throw fw1;
        }

        public void a(fw fw1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (fw1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            fw1 = fw1.asBinder();
_L1:
            parcel.writeStrongBinder(fw1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            ko.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fw1 = null;
              goto _L1
            fw1;
            parcel1.recycle();
            parcel.recycle();
            throw fw1;
        }

        public IBinder asBinder()
        {
            return ko;
        }

        public void b(fw fw1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (fw1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            fw1 = fw1.asBinder();
_L1:
            parcel.writeStrongBinder(fw1);
            ko.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            fw1 = null;
              goto _L1
            fw1;
            parcel1.recycle();
            parcel.recycle();
            throw fw1;
        }

        a(IBinder ibinder)
        {
            ko = ibinder;
        }
    }


    public static fv A(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (iinterface != null && (iinterface instanceof fv))
        {
            return (fv)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        fw fw;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            a(B(parcel.readStrongBinder()), parcel.readString(), (fs[])parcel.createTypedArray(fs.CREATOR));
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
            fw = B(parcel.readStrongBinder());
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
        a(fw, flag);
        parcel1.writeNoException();
        return true;
    }
}
