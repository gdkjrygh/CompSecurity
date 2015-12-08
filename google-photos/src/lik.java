// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationResult;

public abstract class lik extends Binder
    implements lij
{

    public static lij a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (iinterface != null && (iinterface instanceof lij))
        {
            return (lij)iinterface;
        } else
        {
            return new lil(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.ILocationCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = (LocationResult)LocationResult.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
            parcel1 = obj1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = lgs.a(parcel);
        }
        a(parcel1);
        return true;
    }
}
