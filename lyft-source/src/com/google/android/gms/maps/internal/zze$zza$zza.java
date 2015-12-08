// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zze

class a
    implements zze
{

    private IBinder a;

    public Bitmap a(zzi zzi1, int i, int j)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowRenderer");
        if (zzi1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        zzi1 = zzi1.asBinder();
_L1:
        parcel.writeStrongBinder(zzi1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzi1 = obj;
        if (parcel1.readInt() != 0)
        {
            zzi1 = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel1);
        }
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

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
