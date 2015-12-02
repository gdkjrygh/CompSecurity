// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class awv
    implements awt
{

    private IBinder a;

    awv(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(ayw ayw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (ayw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ayw1 = ayw1.asBinder();
_L1:
        parcel.writeStrongBinder(ayw1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
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

    public final void b(ayw ayw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (ayw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ayw1 = ayw1.asBinder();
_L1:
        parcel.writeStrongBinder(ayw1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ayw1 = null;
          goto _L1
        ayw1;
        parcel1.recycle();
        parcel.recycle();
        throw ayw1;
    }

    public final void c(ayw ayw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (ayw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ayw1 = ayw1.asBinder();
_L1:
        parcel.writeStrongBinder(ayw1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ayw1 = null;
          goto _L1
        ayw1;
        parcel1.recycle();
        parcel.recycle();
        throw ayw1;
    }
}
