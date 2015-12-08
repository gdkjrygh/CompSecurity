// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzg;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzg

class a
    implements com.google.android.gms.maps.internal.zzg
{

    private IBinder a;

    public void a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(zzg zzg1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
        if (zzg1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzg1 = zzg1.asBinder();
_L1:
        parcel.writeStrongBinder(zzg1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzg1 = null;
          goto _L1
        zzg1;
        parcel1.recycle();
        parcel.recycle();
        throw zzg1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
