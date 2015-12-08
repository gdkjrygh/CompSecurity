// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzq;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzf, zze, CheckServerAuthResult

class a
    implements zzf
{

    private IBinder a;

    public void a(int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        parcel.writeInt(i);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(int i, Account account, zze zze1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        parcel.writeInt(i);
        if (account == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        account.writeToParcel(parcel, 0);
_L3:
        if (zze1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        account = zze1.asBinder();
_L4:
        parcel.writeStrongBinder(account);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
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

    public void a(AuthAccountRequest authaccountrequest, zze zze1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (authaccountrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        authaccountrequest.writeToParcel(parcel, 0);
_L3:
        if (zze1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        authaccountrequest = zze1.asBinder();
_L4:
        parcel.writeStrongBinder(authaccountrequest);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        authaccountrequest;
        parcel1.recycle();
        parcel.recycle();
        throw authaccountrequest;
        authaccountrequest = null;
          goto _L4
    }

    public void a(IAccountAccessor iaccountaccessor, int i, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (iaccountaccessor == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        iaccountaccessor = iaccountaccessor.asBinder();
_L1:
        parcel.writeStrongBinder(iaccountaccessor);
        parcel.writeInt(i);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iaccountaccessor = null;
          goto _L1
        iaccountaccessor;
        parcel1.recycle();
        parcel.recycle();
        throw iaccountaccessor;
    }

    public void a(ResolveAccountRequest resolveaccountrequest, zzq zzq1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (resolveaccountrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        resolveaccountrequest.writeToParcel(parcel, 0);
_L3:
        if (zzq1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        resolveaccountrequest = zzq1.asBinder();
_L4:
        parcel.writeStrongBinder(resolveaccountrequest);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        resolveaccountrequest;
        parcel1.recycle();
        parcel.recycle();
        throw resolveaccountrequest;
        resolveaccountrequest = null;
          goto _L4
    }

    public void a(CheckServerAuthResult checkserverauthresult)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (checkserverauthresult == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        checkserverauthresult.writeToParcel(parcel, 0);
_L1:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        checkserverauthresult;
        parcel1.recycle();
        parcel.recycle();
        throw checkserverauthresult;
    }

    public void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public IBinder asBinder()
    {
        return a;
    }

    uthResult(IBinder ibinder)
    {
        a = ibinder;
    }
}
