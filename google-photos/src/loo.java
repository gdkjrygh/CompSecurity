// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;

public abstract class loo extends Binder
    implements lon
{

    public loo()
    {
        attachInterface(this, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
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
            parcel1.writeString("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            a(parcel.readString(), parcel.createTypedArrayList(Scope.CREATOR), lot.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            a(parcel.readString(), parcel.readString(), lot.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
