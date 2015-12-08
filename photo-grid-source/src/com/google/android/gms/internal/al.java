// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

// Referenced classes of package com.google.android.gms.internal:
//            ak, am

public abstract class al extends Binder
    implements ak
{

    public static ak a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (iinterface != null && (iinterface instanceof ak))
        {
            return (ak)iinterface;
        } else
        {
            return new am(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.auth.IAuthManagerService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            String s = parcel.readString();
            String s2 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(s, s2, parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            String s1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(s1, parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            if (parcel.readInt() != 0)
            {
                parcel = (AccountChangeEventsRequest)AccountChangeEventsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            Account account;
            String s3;
            if (parcel.readInt() != 0)
            {
                account = (Account)Account.CREATOR.createFromParcel(parcel);
            } else
            {
                account = null;
            }
            s3 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(account, s3, parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Account)Account.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        parcel = a(parcel);
        parcel1.writeNoException();
        if (parcel != null)
        {
            parcel1.writeInt(1);
            parcel.writeToParcel(parcel1, 1);
        } else
        {
            parcel1.writeInt(0);
        }
        return true;
    }
}
