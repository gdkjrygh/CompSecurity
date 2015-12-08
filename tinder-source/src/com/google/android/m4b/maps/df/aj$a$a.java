// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.k;

// Referenced classes of package com.google.android.m4b.maps.df:
//            aj

static final class a
    implements aj
{

    private IBinder a;

    public final boolean a(k k1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMarkerClickListener");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        k1 = k1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(k1);
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
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    rnal.k(IBinder ibinder)
    {
        a = ibinder;
    }
}
