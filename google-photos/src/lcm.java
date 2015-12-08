// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.connection.AppMetadata;

public abstract class lcm extends Binder
    implements lcl
{

    public static lcl a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (iinterface != null && (iinterface instanceof lcl))
        {
            return (lcl)iinterface;
        } else
        {
            return new lcn(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            return true;

        case 1001: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            lci lci = lcj.a(parcel.readStrongBinder());
            String s = parcel.readString();
            AppMetadata appmetadata;
            if (parcel.readInt() != 0)
            {
                appmetadata = (AppMetadata)AppMetadata.CREATOR.createFromParcel(parcel);
            } else
            {
                appmetadata = null;
            }
            a(lci, s, appmetadata, parcel.readLong(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1002: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            a(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1003: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            a(lcj.a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1004: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            a(parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1005: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            a(lcj.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1006: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            b(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1007: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            a(lcj.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1008: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            a(lcj.a(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1009: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            a(lcj.a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1010: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            a(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1011: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            b(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1012: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            b(parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1013: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            c(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1014: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            d(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1015: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel = e(parcel.readLong());
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 1016: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel = a();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;
        }
    }
}
