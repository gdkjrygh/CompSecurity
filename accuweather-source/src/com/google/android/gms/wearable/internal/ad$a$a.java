// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ad, ab, ao, b

private static class ko
    implements ad
{

    private IBinder ko;

    public void a(ab ab1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ab1 = ab1.asBinder();
_L1:
        parcel.writeStrongBinder(ab1);
        ko.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ab1 = null;
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    public void a(ab ab1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null) goto _L2; else goto _L1
_L1:
        ab1 = ab1.asBinder();
_L5:
        parcel.writeStrongBinder(ab1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        ko.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ab1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
          goto _L5
    }

    public void a(ab ab1, Asset asset)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null) goto _L2; else goto _L1
_L1:
        ab1 = ab1.asBinder();
_L5:
        parcel.writeStrongBinder(ab1);
        if (asset == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        asset.writeToParcel(parcel, 0);
_L6:
        ko.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ab1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
          goto _L5
    }

    public void a(ab ab1, PutDataRequest putdatarequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null) goto _L2; else goto _L1
_L1:
        ab1 = ab1.asBinder();
_L5:
        parcel.writeStrongBinder(ab1);
        if (putdatarequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        putdatarequest.writeToParcel(parcel, 0);
_L6:
        ko.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ab1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
          goto _L5
    }

    public void a(ab ab1, c c1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null) goto _L2; else goto _L1
_L1:
        ab1 = ab1.asBinder();
_L5:
        parcel.writeStrongBinder(ab1);
        if (c1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        c1.writeToParcel(parcel, 0);
_L6:
        ko.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ab1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
          goto _L5
    }

    public void a(ab ab1, ao ao1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null) goto _L2; else goto _L1
_L1:
        ab1 = ab1.asBinder();
_L5:
        parcel.writeStrongBinder(ab1);
        if (ao1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ao1.writeToParcel(parcel, 0);
_L6:
        ko.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ab1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
          goto _L5
    }

    public void a(ab ab1, b b1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null) goto _L2; else goto _L1
_L1:
        ab1 = ab1.asBinder();
_L5:
        parcel.writeStrongBinder(ab1);
        if (b1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        b1.writeToParcel(parcel, 0);
_L6:
        ko.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ab1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
          goto _L5
    }

    public void a(ab ab1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        ab1 = ab1.asBinder();
_L1:
        parcel.writeStrongBinder(ab1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeByteArray(abyte0);
        ko.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ab1 = null;
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    public IBinder asBinder()
    {
        return ko;
    }

    public void b(ab ab1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ab1 = ab1.asBinder();
_L1:
        parcel.writeStrongBinder(ab1);
        ko.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ab1 = null;
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    public void b(ab ab1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null) goto _L2; else goto _L1
_L1:
        ab1 = ab1.asBinder();
_L5:
        parcel.writeStrongBinder(ab1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        ko.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ab1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
          goto _L5
    }

    public void c(ab ab1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ab1 = ab1.asBinder();
_L1:
        parcel.writeStrongBinder(ab1);
        ko.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ab1 = null;
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    public void c(ab ab1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null) goto _L2; else goto _L1
_L1:
        ab1 = ab1.asBinder();
_L5:
        parcel.writeStrongBinder(ab1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        ko.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ab1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
          goto _L5
    }

    public void d(ab ab1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ab1 = ab1.asBinder();
_L1:
        parcel.writeStrongBinder(ab1);
        ko.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ab1 = null;
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    public void e(ab ab1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ab1 = ab1.asBinder();
_L1:
        parcel.writeStrongBinder(ab1);
        ko.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ab1 = null;
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    public void f(ab ab1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ab1 = ab1.asBinder();
_L1:
        parcel.writeStrongBinder(ab1);
        ko.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ab1 = null;
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    public void g(ab ab1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ab1 = ab1.asBinder();
_L1:
        parcel.writeStrongBinder(ab1);
        ko.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ab1 = null;
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    public void h(ab ab1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ab1 = ab1.asBinder();
_L1:
        parcel.writeStrongBinder(ab1);
        ko.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ab1 = null;
          goto _L1
        ab1;
        parcel1.recycle();
        parcel.recycle();
        throw ab1;
    }

    (IBinder ibinder)
    {
        ko = ibinder;
    }
}
