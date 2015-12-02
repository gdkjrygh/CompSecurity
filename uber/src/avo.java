// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class avo
    implements avm
{

    private IBinder a;

    avo(IBinder ibinder)
    {
        a = ibinder;
    }

    public final aaf a(ayw ayw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (ayw1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        ayw1 = ayw1.asBinder();
_L1:
        parcel.writeStrongBinder(ayw1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        ayw1 = aag.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ayw1;
        ayw1 = null;
          goto _L1
        ayw1;
        parcel1.recycle();
        parcel.recycle();
        throw ayw1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final aaf b(ayw ayw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (ayw1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        ayw1 = ayw1.asBinder();
_L1:
        parcel.writeStrongBinder(ayw1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        ayw1 = aag.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ayw1;
        ayw1 = null;
          goto _L1
        ayw1;
        parcel1.recycle();
        parcel.recycle();
        throw ayw1;
    }
}
