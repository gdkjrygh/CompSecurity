// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class crl extends Binder
    implements crk
{

    public static crk a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
        if (iinterface != null && (iinterface instanceof crk))
        {
            return (crk)iinterface;
        } else
        {
            return new crm(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }
}
