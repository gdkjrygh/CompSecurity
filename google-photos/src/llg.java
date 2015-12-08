// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.sharing.AppContentReceivedResult;

public abstract class llg extends Binder
    implements llf
{

    public static llf a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
        if (iinterface != null && (iinterface instanceof llf))
        {
            return (llf)iinterface;
        } else
        {
            return new llh(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            parcel = a(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (AppContentReceivedResult)AppContentReceivedResult.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        return true;
    }
}
