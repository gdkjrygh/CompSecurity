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
//            af, ad, ar, b

private static class le
    implements af
{

    private IBinder le;

    public void a(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void a(ad ad1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad1 = ad1.asBinder();
_L5:
        parcel.writeStrongBinder(ad1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        le.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ad1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
          goto _L5
    }

    public void a(ad ad1, Asset asset)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad1 = ad1.asBinder();
_L5:
        parcel.writeStrongBinder(ad1);
        if (asset == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        asset.writeToParcel(parcel, 0);
_L6:
        le.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ad1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
          goto _L5
    }

    public void a(ad ad1, PutDataRequest putdatarequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad1 = ad1.asBinder();
_L5:
        parcel.writeStrongBinder(ad1);
        if (putdatarequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        putdatarequest.writeToParcel(parcel, 0);
_L6:
        le.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ad1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
          goto _L5
    }

    public void a(ad ad1, c c1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad1 = ad1.asBinder();
_L5:
        parcel.writeStrongBinder(ad1);
        if (c1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        c1.writeToParcel(parcel, 0);
_L6:
        le.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ad1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
          goto _L5
    }

    public void a(ad ad1, ar ar1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad1 = ad1.asBinder();
_L5:
        parcel.writeStrongBinder(ad1);
        if (ar1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ar1.writeToParcel(parcel, 0);
_L6:
        le.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ad1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
          goto _L5
    }

    public void a(ad ad1, b b1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad1 = ad1.asBinder();
_L5:
        parcel.writeStrongBinder(ad1);
        if (b1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        b1.writeToParcel(parcel, 0);
_L6:
        le.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ad1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
          goto _L5
    }

    public void a(ad ad1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        parcel.writeString(s);
        le.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void a(ad ad1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeByteArray(abyte0);
        le.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public IBinder asBinder()
    {
        return le;
    }

    public void b(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void b(ad ad1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad1 = ad1.asBinder();
_L5:
        parcel.writeStrongBinder(ad1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        le.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ad1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
          goto _L5
    }

    public void b(ad ad1, c c1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad1 = ad1.asBinder();
_L5:
        parcel.writeStrongBinder(ad1);
        if (c1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        c1.writeToParcel(parcel, 0);
_L6:
        le.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ad1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
          goto _L5
    }

    public void b(ad ad1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        parcel.writeString(s);
        le.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void c(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void c(ad ad1, Uri uri)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad1 = ad1.asBinder();
_L5:
        parcel.writeStrongBinder(ad1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        le.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ad1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
          goto _L5
    }

    public void c(ad ad1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        parcel.writeString(s);
        le.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void d(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void e(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void f(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void g(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void h(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void i(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void j(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    public void k(ad ad1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        le.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ad1 = null;
          goto _L1
        ad1;
        parcel1.recycle();
        parcel.recycle();
        throw ad1;
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
