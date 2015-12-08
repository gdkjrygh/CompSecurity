// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hu, hr, hm, hv

public static abstract class a.le extends Binder
    implements hu
{
    private static class a
        implements hu
    {

        private IBinder le;

        public void a(hl.a a1, hv hv1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            a1.writeToParcel(parcel, 0);
_L3:
            if (hv1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            a1 = hv1.asBinder();
_L4:
            parcel.writeStrongBinder(a1);
            le.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
            a1 = null;
              goto _L4
        }

        public void a(hv hv1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (hv1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            hv1 = hv1.asBinder();
_L1:
            parcel.writeStrongBinder(hv1);
            le.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hv1 = null;
              goto _L1
            hv1;
            parcel1.recycle();
            parcel.recycle();
            throw hv1;
        }

        public void a(hv hv1, String s, hr ahr[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (hv1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            hv1 = hv1.asBinder();
_L1:
            parcel.writeStrongBinder(hv1);
            parcel.writeString(s);
            parcel.writeTypedArray(ahr, 0);
            le.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hv1 = null;
              goto _L1
            hv1;
            parcel1.recycle();
            parcel.recycle();
            throw hv1;
        }

        public void a(hv hv1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (hv1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            hv1 = hv1.asBinder();
_L1:
            parcel.writeStrongBinder(hv1);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            le.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hv1 = null;
              goto _L1
            hv1;
            parcel1.recycle();
            parcel.recycle();
            throw hv1;
        }

        public IBinder asBinder()
        {
            return le;
        }

        public void b(hv hv1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (hv1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            hv1 = hv1.asBinder();
_L1:
            parcel.writeStrongBinder(hv1);
            le.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            hv1 = null;
              goto _L1
            hv1;
            parcel1.recycle();
            parcel.recycle();
            throw hv1;
        }

        a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public static hu E(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (iinterface != null && (iinterface instanceof hu))
        {
            return (hu)iinterface;
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
            parcel1.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            a(F(parcel.readStrongBinder()), parcel.readString(), (hr[])parcel.createTypedArray(hr.CREATOR));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            a(F(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            b(F(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            hv hv = F(parcel.readStrongBinder());
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(hv, flag);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            break;
        }
        a a1;
        if (parcel.readInt() != 0)
        {
            a1 = CREATOR.p(parcel);
        } else
        {
            a1 = null;
        }
        a(a1, F(parcel.readStrongBinder()));
        parcel1.writeNoException();
        return true;
    }
}
