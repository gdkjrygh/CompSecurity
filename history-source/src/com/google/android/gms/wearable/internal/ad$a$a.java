// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ad, ab, ap, at, 
//            aw, p, r, t, 
//            v, x, z

private static class le
    implements ad
{

    private IBinder le;

    public void a(Status status)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (status == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        status.writeToParcel(parcel, 0);
_L1:
        le.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        status;
        parcel1.recycle();
        parcel.recycle();
        throw status;
    }

    public void a(ab ab1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        ab1.writeToParcel(parcel, 0);
_L1:
        le.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    public void a(ap ap1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (ap1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        ap1.writeToParcel(parcel, 0);
_L1:
        le.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ap1;
        parcel1.recycle();
        parcel.recycle();
        throw ap1;
    }

    public void a(at at1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (at1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        at1.writeToParcel(parcel, 0);
_L1:
        le.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        at1;
        parcel1.recycle();
        parcel.recycle();
        throw at1;
    }

    public void a(aw aw1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (aw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        aw1.writeToParcel(parcel, 0);
_L1:
        le.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        aw1;
        parcel1.recycle();
        parcel.recycle();
        throw aw1;
    }

    public void a(p p1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (p1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        p1.writeToParcel(parcel, 0);
_L1:
        le.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        p1;
        parcel1.recycle();
        parcel.recycle();
        throw p1;
    }

    public void a(r r1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (r1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, 0);
_L1:
        le.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        r1;
        parcel1.recycle();
        parcel.recycle();
        throw r1;
    }

    public void a(t t1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (t1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        t1.writeToParcel(parcel, 0);
_L1:
        le.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        t1;
        parcel1.recycle();
        parcel.recycle();
        throw t1;
    }

    public void a(v v1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (v1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        v1.writeToParcel(parcel, 0);
_L1:
        le.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        v1;
        parcel1.recycle();
        parcel.recycle();
        throw v1;
    }

    public void a(x x1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (x1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        x1.writeToParcel(parcel, 0);
_L1:
        le.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        x1;
        parcel1.recycle();
        parcel.recycle();
        throw x1;
    }

    public void a(z z1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (z1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        z1.writeToParcel(parcel, 0);
_L1:
        le.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        z1;
        parcel1.recycle();
        parcel.recycle();
        throw z1;
    }

    public void ab(DataHolder dataholder)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (dataholder == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L1:
        le.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        dataholder;
        parcel1.recycle();
        parcel.recycle();
        throw dataholder;
    }

    public IBinder asBinder()
    {
        return le;
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
