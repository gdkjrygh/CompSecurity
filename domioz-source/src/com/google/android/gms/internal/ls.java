// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.w;

// Referenced classes of package com.google.android.gms.internal:
//            lr, lt, zzut

public abstract class ls extends Binder
    implements lr
{

    public ls()
    {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public static lr a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
        if (iinterface != null && (iinterface instanceof lr))
        {
            return (lr)iinterface;
        } else
        {
            return new lt(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (parcel.readInt() != 0)
            {
                obj = ConnectionResult.CREATOR;
                obj = com.google.android.gms.common.a.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (zzut)zzut.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((ConnectionResult) (obj)), parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = Status.CREATOR;
            obj = w.a(parcel);
        }
        a(((Status) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
