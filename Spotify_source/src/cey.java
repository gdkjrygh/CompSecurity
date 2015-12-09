// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class cey extends Binder
    implements cex
{

    public cey()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static cex a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (iinterface != null && (iinterface instanceof cex))
        {
            return (cex)iinterface;
        } else
        {
            return new cez(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            parcel = a(parcel.readString());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            flag = b(parcel.readString());
            parcel1.writeNoException();
            break;
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel1.writeInt(i);
        return true;
    }
}
