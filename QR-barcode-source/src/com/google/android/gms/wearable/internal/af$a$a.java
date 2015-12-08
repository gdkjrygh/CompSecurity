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
//            af, ad, aq, b

private static class lb
    implements af
{

    private IBinder lb;

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
        lb.transact(22, parcel, parcel1, 0);
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
        lb.transact(7, parcel, parcel1, 0);
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
        lb.transact(13, parcel, parcel1, 0);
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
        lb.transact(6, parcel, parcel1, 0);
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
        lb.transact(20, parcel, parcel1, 0);
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

    public void a(ad ad1, aq aq1)
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
        if (aq1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        aq1.writeToParcel(parcel, 0);
_L6:
        lb.transact(17, parcel, parcel1, 0);
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
        lb.transact(16, parcel, parcel1, 0);
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
        lb.transact(21, parcel, parcel1, 0);
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
        lb.transact(12, parcel, parcel1, 0);
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
        return lb;
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
        lb.transact(8, parcel, parcel1, 0);
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
        lb.transact(9, parcel, parcel1, 0);
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
        lb.transact(2, parcel, parcel1, 0);
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
        lb.transact(23, parcel, parcel1, 0);
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
        lb.transact(14, parcel, parcel1, 0);
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
        lb.transact(11, parcel, parcel1, 0);
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
        lb.transact(24, parcel, parcel1, 0);
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
        lb.transact(15, parcel, parcel1, 0);
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
        lb.transact(18, parcel, parcel1, 0);
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
        lb.transact(19, parcel, parcel1, 0);
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
            break MISSING_BLOCK_LABEL_57;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        lb.transact(3, parcel, parcel1, 0);
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
            break MISSING_BLOCK_LABEL_57;
        }
        ad1 = ad1.asBinder();
_L1:
        parcel.writeStrongBinder(ad1);
        lb.transact(4, parcel, parcel1, 0);
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
        lb.transact(5, parcel, parcel1, 0);
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
        lb = ibinder;
    }
}
