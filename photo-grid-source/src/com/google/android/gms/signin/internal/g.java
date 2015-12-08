// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.signin.internal:
//            f, h, AuthAccountResult

public abstract class g extends Binder
    implements f
{

    public g()
    {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public static f a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
        if (iinterface != null && (iinterface instanceof f))
        {
            return (f)iinterface;
        } else
        {
            return new h(ibinder);
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
            parcel1.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            ConnectionResult connectionresult;
            if (parcel.readInt() != 0)
            {
                connectionresult = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(parcel);
            } else
            {
                connectionresult = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(connectionresult, parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(parcel);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            break;
        }
        Status status;
        if (parcel.readInt() != 0)
        {
            status = (Status)Status.CREATOR.createFromParcel(parcel);
        } else
        {
            status = null;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(status, parcel);
        parcel1.writeNoException();
        return true;
    }
}
