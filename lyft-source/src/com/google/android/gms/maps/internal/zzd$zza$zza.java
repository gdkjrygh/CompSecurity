// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzd

class a
    implements com.google.android.gms.maps.internal.zzd
{

    private IBinder a;

    public zzd a(zzi zzi1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (zzi1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzi1 = zzi1.asBinder();
_L1:
        parcel.writeStrongBinder(zzi1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzi1 = com.google.android.gms.dynamic.a.zza.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzi1;
        zzi1 = null;
          goto _L1
        zzi1;
        parcel1.recycle();
        parcel.recycle();
        throw zzi1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public zzd b(zzi zzi1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (zzi1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzi1 = zzi1.asBinder();
_L1:
        parcel.writeStrongBinder(zzi1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        zzi1 = com.google.android.gms.dynamic.a.zza.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzi1;
        zzi1 = null;
          goto _L1
        zzi1;
        parcel1.recycle();
        parcel.recycle();
        throw zzi1;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
