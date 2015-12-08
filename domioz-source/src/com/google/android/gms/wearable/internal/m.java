// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.zze;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            k, e, zzau, zzb, 
//            zze

final class m
    implements k
{

    private IBinder a;

    m(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void a(e e1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        parcel.writeInt(i1);
        a.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void a(e e1, Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void a(e e1, Asset asset)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (asset == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        asset.writeToParcel(parcel, 0);
_L6:
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void a(e e1, PutDataRequest putdatarequest)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (putdatarequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        putdatarequest.writeToParcel(parcel, 0);
_L6:
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void a(e e1, zzau zzau1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (zzau1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzau1.writeToParcel(parcel, 0);
_L6:
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void a(e e1, zzb zzb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (zzb1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zzb1.writeToParcel(parcel, 0);
_L6:
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void a(e e1, com.google.android.gms.wearable.internal.zze zze1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (zze1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zze1.writeToParcel(parcel, 0);
_L6:
        a.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void a(e e1, zze zze1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (zze1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zze1.writeToParcel(parcel, 0);
_L6:
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void a(e e1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        parcel.writeString(s);
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void a(e e1, String s, String s1, byte abyte0[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeByteArray(abyte0);
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void b(e e1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        parcel.writeInt(i1);
        a.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void b(e e1, Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void b(e e1, zze zze1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (zze1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        zze1.writeToParcel(parcel, 0);
_L6:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void b(e e1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        parcel.writeString(s);
        a.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void c(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void c(e e1, Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1 = e1.asBinder();
_L5:
        parcel.writeStrongBinder(e1);
        if (uri == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L6:
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        e1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
          goto _L5
    }

    public final void c(e e1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        parcel.writeString(s);
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void d(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void e(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void f(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void g(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void h(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void i(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void j(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void k(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final void l(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }
}
