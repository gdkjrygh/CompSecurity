// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

// Referenced classes of package com.google.android.gms.internal:
//            ak

final class am
    implements ak
{

    private IBinder a;

    am(IBinder ibinder)
    {
        a = ibinder;
    }

    public final Bundle a(Account account)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        if (account == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        account.writeToParcel(parcel, 0);
_L3:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        account = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return account;
_L2:
        parcel.writeInt(0);
          goto _L3
        account;
        parcel1.recycle();
        parcel.recycle();
        throw account;
        account = null;
          goto _L4
    }

    public final Bundle a(Account account, String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        if (account == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        account.writeToParcel(parcel, 0);
_L5:
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        account = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L7:
        parcel1.recycle();
        parcel.recycle();
        return account;
_L2:
        parcel.writeInt(0);
          goto _L5
        account;
        parcel1.recycle();
        parcel.recycle();
        throw account;
_L4:
        parcel.writeInt(0);
          goto _L6
        account = null;
          goto _L7
    }

    public final Bundle a(Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return bundle;
_L2:
        parcel.writeInt(0);
          goto _L3
        bundle;
        parcel1.recycle();
        parcel.recycle();
        throw bundle;
        bundle = null;
          goto _L4
    }

    public final Bundle a(String s, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        parcel.writeString(s);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        s = null;
          goto _L4
    }

    public final Bundle a(String s, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        parcel.writeString(s);
        parcel.writeString(s1);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        s = null;
          goto _L4
    }

    public final AccountChangeEventsResponse a(AccountChangeEventsRequest accountchangeeventsrequest)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
        if (accountchangeeventsrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        accountchangeeventsrequest.writeToParcel(parcel, 0);
_L3:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        accountchangeeventsrequest = (AccountChangeEventsResponse)AccountChangeEventsResponse.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return accountchangeeventsrequest;
_L2:
        parcel.writeInt(0);
          goto _L3
        accountchangeeventsrequest;
        parcel1.recycle();
        parcel.recycle();
        throw accountchangeeventsrequest;
        accountchangeeventsrequest = null;
          goto _L4
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
