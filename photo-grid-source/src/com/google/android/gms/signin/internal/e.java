// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;

// Referenced classes of package com.google.android.gms.signin.internal:
//            d, j

public abstract class e extends Binder
    implements d
{

    public e()
    {
        attachInterface(this, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            a(parcel.readString(), parcel.createTypedArrayList(Scope.CREATOR), j.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            a(parcel.readString(), parcel.readString(), j.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
