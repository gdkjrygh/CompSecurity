// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

public abstract class kzm extends Binder
    implements kzl
{

    public kzm()
    {
        attachInterface(this, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    public static kzl a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
        if (iinterface != null && (iinterface instanceof kzl))
        {
            return (kzl)iinterface;
        } else
        {
            return new kzn(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            i = parcel.readInt();
            j = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (Surface)Surface.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, j, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            a();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            b();
            parcel1.writeNoException();
            return true;
        }
    }
}
