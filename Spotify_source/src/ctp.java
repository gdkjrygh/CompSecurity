// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class ctp extends Binder
    implements cto
{

    public static cto a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.now.INowAuthService");
        if (iinterface != null && (iinterface instanceof cto))
        {
            return (cto)iinterface;
        } else
        {
            return new ctq(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.now.INowAuthService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.now.INowAuthService");
            parcel = a(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            break;
        }
        if (parcel != null)
        {
            parcel1.writeInt(1);
            parcel.writeToParcel(parcel1, 1);
            return true;
        } else
        {
            parcel1.writeInt(0);
            return true;
        }
    }
}
