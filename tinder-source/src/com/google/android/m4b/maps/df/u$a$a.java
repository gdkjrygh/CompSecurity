// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.model.internal.k;

// Referenced classes of package com.google.android.m4b.maps.df:
//            u

static final class a
    implements u
{

    private IBinder a;

    public final b a(k k1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        k1 = com.google.android.m4b.maps.da.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k1;
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

    public final b b(k k1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        k1 = com.google.android.m4b.maps.da.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return k1;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    ernal.k(IBinder ibinder)
    {
        a = ibinder;
    }
}
