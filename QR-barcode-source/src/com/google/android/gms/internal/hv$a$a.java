// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hv, hw, hs

private static class lb
    implements hv
{

    private IBinder lb;

    public void a(lb lb1, hw hw1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (lb1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        lb1.iteToParcel(parcel, 0);
_L3:
        if (hw1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        lb1 = hw1.asBinder();
_L4:
        parcel.writeStrongBinder(lb1);
        lb.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        lb1;
        parcel1.recycle();
        parcel.recycle();
        throw lb1;
        lb1 = null;
          goto _L4
    }

    public void a(hw hw1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (hw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        hw1 = hw1.asBinder();
_L1:
        parcel.writeStrongBinder(hw1);
        lb.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hw1 = null;
          goto _L1
        hw1;
        parcel1.recycle();
        parcel.recycle();
        throw hw1;
    }

    public void a(hw hw1, String s, hs ahs[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (hw1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        hw1 = hw1.asBinder();
_L1:
        parcel.writeStrongBinder(hw1);
        parcel.writeString(s);
        parcel.writeTypedArray(ahs, 0);
        lb.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hw1 = null;
          goto _L1
        hw1;
        parcel1.recycle();
        parcel.recycle();
        throw hw1;
    }

    public void a(hw hw1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (hw1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        hw1 = hw1.asBinder();
_L1:
        parcel.writeStrongBinder(hw1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        lb.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hw1 = null;
          goto _L1
        hw1;
        parcel1.recycle();
        parcel.recycle();
        throw hw1;
    }

    public IBinder asBinder()
    {
        return lb;
    }

    public void b(hw hw1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (hw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        hw1 = hw1.asBinder();
_L1:
        parcel.writeStrongBinder(hw1);
        lb.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        hw1 = null;
          goto _L1
        hw1;
        parcel1.recycle();
        parcel.recycle();
        throw hw1;
    }

    (IBinder ibinder)
    {
        lb = ibinder;
    }
}
