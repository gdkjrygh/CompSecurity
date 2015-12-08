// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class kzp extends Binder
    implements kzo
{

    public static kzo a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (iinterface != null && (iinterface instanceof kzo))
        {
            return (kzo)iinterface;
        } else
        {
            return new kzq(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            a();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            b();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            kzl kzl = kzm.a(parcel.readStrongBinder());
            parcel1 = parcel.readStrongBinder();
            if (parcel1 == null)
            {
                parcel1 = null;
            } else
            {
                android.os.IInterface iinterface = parcel1.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                if (iinterface != null && (iinterface instanceof kzr))
                {
                    parcel1 = (kzr)iinterface;
                } else
                {
                    parcel1 = new kzt(parcel1);
                }
            }
            a(kzl, parcel1, parcel.readString(), parcel.readString());
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            a(kzm.a(parcel.readStrongBinder()), parcel.readInt());
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            a(kzm.a(parcel.readStrongBinder()));
            return true;
        }
    }
}
