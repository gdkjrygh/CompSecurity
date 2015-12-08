// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.common.internal:
//            bc, be, ResolveAccountResponse

public abstract class bd extends Binder
    implements bc
{

    public bd()
    {
        attachInterface(this, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
    }

    public static bc a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        if (iinterface != null && (iinterface instanceof bc))
        {
            return (bc)iinterface;
        } else
        {
            return new be(ibinder);
        }
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
            parcel1.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (ResolveAccountResponse)ResolveAccountResponse.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
