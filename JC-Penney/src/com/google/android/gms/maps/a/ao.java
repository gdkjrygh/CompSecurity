// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.b.k;
import com.google.android.gms.maps.model.a.p;

// Referenced classes of package com.google.android.gms.maps.a:
//            am

class ao
    implements am
{

    private IBinder a;

    ao(IBinder ibinder)
    {
        a = ibinder;
    }

    public j a(p p1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (p1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        p1 = p1.asBinder();
_L1:
        parcel.writeStrongBinder(p1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        p1 = k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return p1;
        p1 = null;
          goto _L1
        p1;
        parcel1.recycle();
        parcel.recycle();
        throw p1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public j b(p p1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (p1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        p1 = p1.asBinder();
_L1:
        parcel.writeStrongBinder(p1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        p1 = k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return p1;
        p1 = null;
          goto _L1
        p1;
        parcel1.recycle();
        parcel.recycle();
        throw p1;
    }
}
