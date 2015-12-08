// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;

// Referenced classes of package com.google.android.m4b.maps.df:
//            ad

static final class a
    implements ad
{

    private IBinder a;

    public final void a(Location location)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnLocationChangeListener");
        if (location == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        location.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        location;
        parcel1.recycle();
        parcel.recycle();
        throw location;
    }

    public final void a(b b1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnLocationChangeListener");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
