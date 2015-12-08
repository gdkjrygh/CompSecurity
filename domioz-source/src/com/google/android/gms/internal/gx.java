// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            gv, gy, zzjb

final class gx
    implements gv
{

    private IBinder a;

    gx(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(gy gy1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (gy1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        gy1 = gy1.asBinder();
_L1:
        parcel.writeStrongBinder(gy1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gy1 = null;
          goto _L1
        gy1;
        parcel1.recycle();
        parcel.recycle();
        throw gy1;
    }

    public final void a(gy gy1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (gy1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        gy1 = gy1.asBinder();
_L1:
        parcel.writeStrongBinder(gy1);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gy1 = null;
          goto _L1
        gy1;
        parcel1.recycle();
        parcel.recycle();
        throw gy1;
    }

    public final void a(gy gy1, String s, zzjb azzjb[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (gy1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        gy1 = gy1.asBinder();
_L1:
        parcel.writeStrongBinder(gy1);
        parcel.writeString(s);
        parcel.writeTypedArray(azzjb, 0);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gy1 = null;
          goto _L1
        gy1;
        parcel1.recycle();
        parcel.recycle();
        throw gy1;
    }

    public final void a(gy gy1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (gy1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        gy1 = gy1.asBinder();
_L1:
        parcel.writeStrongBinder(gy1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gy1 = null;
          goto _L1
        gy1;
        parcel1.recycle();
        parcel.recycle();
        throw gy1;
    }

    public final void a(zziv.zza zza, gy gy1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (zza == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        zza.writeToParcel(parcel, 0);
_L3:
        if (gy1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        zza = gy1.asBinder();
_L4:
        parcel.writeStrongBinder(zza);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        zza;
        parcel1.recycle();
        parcel.recycle();
        throw zza;
        zza = null;
          goto _L4
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(gy gy1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (gy1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        gy1 = gy1.asBinder();
_L1:
        parcel.writeStrongBinder(gy1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        gy1 = null;
          goto _L1
        gy1;
        parcel1.recycle();
        parcel.recycle();
        throw gy1;
    }
}
