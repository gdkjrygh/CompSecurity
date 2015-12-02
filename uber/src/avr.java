// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

final class avr
    implements avp
{

    private IBinder a;

    avr(IBinder ibinder)
    {
        a = ibinder;
    }

    public final Bitmap a(ayw ayw1, int i, int j)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowRenderer");
        if (ayw1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        ayw1 = ayw1.asBinder();
_L1:
        parcel.writeStrongBinder(ayw1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        ayw1 = obj;
        if (parcel1.readInt() != 0)
        {
            ayw1 = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel1);
        }
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
}
