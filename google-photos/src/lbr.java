// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;

public abstract class lbr extends Binder
    implements lbq
{

    public static lbq a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
        if (iinterface != null && (iinterface instanceof lbq))
        {
            return (lbq)iinterface;
        } else
        {
            return new lbs(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            Device device;
            if (parcel.readInt() != 0)
            {
                device = (Device)Device.CREATOR.createFromParcel(parcel);
            } else
            {
                device = null;
            }
            a(device, parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            a();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            b();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            b(parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
