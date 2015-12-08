// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hu, hv, hr

private static class le
    implements hu
{

    private IBinder le;

    public void a(le le1, hv hv1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (le1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        le1.iteToParcel(parcel, 0);
_L3:
        if (hv1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        le1 = hv1.asBinder();
_L4:
        parcel.writeStrongBinder(le1);
        le.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        le1;
        parcel1.recycle();
        parcel.recycle();
        throw le1;
        le1 = null;
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

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
