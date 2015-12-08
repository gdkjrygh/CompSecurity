// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzn

class a
    implements zzn
{

    private IBinder a;

    public boolean a(zzi zzi1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        if (zzi1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        zzi1 = zzi1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(zzi1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
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
