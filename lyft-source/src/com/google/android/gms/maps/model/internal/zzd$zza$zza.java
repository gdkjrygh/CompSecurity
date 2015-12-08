// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzd

class a
    implements com.google.android.gms.maps.model.internal.zzd
{

    private IBinder a;

    public zzd a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        zzd zzd1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        zzd1 = com.google.android.gms.dynamic.zzd.zza.zza.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzd1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public zzd a(float f)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        zzd zzd1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        parcel.writeFloat(f);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        zzd1 = com.google.android.gms.dynamic.zzd.zza.zza.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzd1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public zzd a(int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        zzd zzd1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        parcel.writeInt(i);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzd1 = com.google.android.gms.dynamic.zzd.zza.zza.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzd1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public zzd a(Bitmap bitmap)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        bitmap.writeToParcel(parcel, 0);
_L1:
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        bitmap = com.google.android.gms.dynamic.zzd.zza.zza.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return bitmap;
        parcel.writeInt(0);
          goto _L1
        bitmap;
        parcel1.recycle();
        parcel.recycle();
        throw bitmap;
    }

    public zzd a(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        parcel.writeString(s);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        s = com.google.android.gms.dynamic.zzd.zza.zza.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public zzd b(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        parcel.writeString(s);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        s = com.google.android.gms.dynamic.zzd.zza.zza.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public zzd c(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        parcel.writeString(s);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        s = com.google.android.gms.dynamic.zzd.zza.zza.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
