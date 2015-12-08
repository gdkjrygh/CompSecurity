// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class lbk extends Binder
    implements lbj
{

    public static lbj a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
        if (iinterface != null && (iinterface instanceof lbj))
        {
            return (lbj)iinterface;
        } else
        {
            return new lbl(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        String s = null;
        Bundle bundle = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.mdm.internal.INetworkQualityService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
            s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(s, bundle, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = bundle;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
                if (iinterface != null && (iinterface instanceof kqs))
                {
                    parcel = (kqs)iinterface;
                } else
                {
                    parcel = new kqu(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
            parcel = parcel.readStrongBinder();
            break;
        }
        if (parcel == null)
        {
            parcel = s;
        } else
        {
            android.os.IInterface iinterface1 = parcel.queryLocalInterface("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
            if (iinterface1 != null && (iinterface1 instanceof kqv))
            {
                parcel = (kqv)iinterface1;
            } else
            {
                parcel = new kqx(parcel);
            }
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
