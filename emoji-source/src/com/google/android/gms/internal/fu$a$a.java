// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            fu, fv, fr

private static class kq
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

    (IBinder ibinder)
    {
        kq = ibinder;
    }
}
