// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ey;
import com.google.android.gms.internal.fb;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzq, zzo, zzp

final class d
    implements zzq
{

    private IBinder a;

    d(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void zza(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (nativeadoptionsparcel == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        nativeadoptionsparcel.writeToParcel(parcel, 0);
_L1:
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        nativeadoptionsparcel;
        parcel1.recycle();
        parcel.recycle();
        throw nativeadoptionsparcel;
    }

    public final void zza(es es1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (es1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        es1 = es1.asBinder();
_L1:
        parcel.writeStrongBinder(es1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        es1 = null;
          goto _L1
        es1;
        parcel1.recycle();
        parcel.recycle();
        throw es1;
    }

    public final void zza(ev ev1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (ev1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ev1 = ev1.asBinder();
_L1:
        parcel.writeStrongBinder(ev1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ev1 = null;
          goto _L1
        ev1;
        parcel1.recycle();
        parcel.recycle();
        throw ev1;
    }

    public final void zza(String s, fb fb1, ey ey1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        parcel.writeString(s);
        if (fb1 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        s = fb1.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        s = obj;
        if (ey1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        s = ey1.asBinder();
        parcel.writeStrongBinder(s);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void zzb(zzo zzo1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (zzo1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzo1 = zzo1.asBinder();
_L1:
        parcel.writeStrongBinder(zzo1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzo1 = null;
          goto _L1
        zzo1;
        parcel1.recycle();
        parcel.recycle();
        throw zzo1;
    }

    public final zzp zzbk()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        zzp zzp;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzp = com.google.android.gms.ads.internal.client.zzp.zza.zzh(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzp;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
