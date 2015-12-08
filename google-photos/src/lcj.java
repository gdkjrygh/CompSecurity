// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.connection.AppMetadata;

public abstract class lcj extends Binder
    implements lci
{

    public static lci a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
        if (iinterface != null && (iinterface instanceof lci))
        {
            return (lci)iinterface;
        } else
        {
            return new lck(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            return true;

        case 1001: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 1002: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 1003: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 1004: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            String s = parcel.readString();
            String s2 = parcel.readString();
            String s3 = parcel.readString();
            String s4 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (AppMetadata)AppMetadata.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(s, s2, s3, s4, parcel);
            parcel1.writeNoException();
            return true;

        case 1005: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            b(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 1006: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            a(parcel.readString(), parcel.readInt(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 1007: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            String s1 = parcel.readString();
            byte abyte0[] = parcel.createByteArray();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(s1, abyte0, flag);
            parcel1.writeNoException();
            return true;

        case 1008: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            c(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 1009: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            a(parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 1010: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 1011: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 1012: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            c(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 1013: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            d(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 1014: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            e(parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }
}
