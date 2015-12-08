// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.b.k;
import com.google.android.gms.maps.model.internal.s;

// Referenced classes of package com.google.android.gms.maps.internal:
//            an

final class ap
    implements an
{

    private IBinder a;

    ap(IBinder ibinder)
    {
        a = ibinder;
    }

    public final j a(s s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        s1 = k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return s1;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final j b(s s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        s1 = k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return s1;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }
}
