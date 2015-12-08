// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;

final class lou
    implements los
{

    private IBinder a;

    lou(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(int i)
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

    public final void a(int i, Account account, lop lop1)
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
        if (lop1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        account = lop1.asBinder();
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

    public final void a(AuthAccountRequest authaccountrequest, lop lop1)
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
        if (lop1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        authaccountrequest = lop1.asBinder();
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

    public final void a(ResolveAccountRequest resolveaccountrequest, kcp kcp1)
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
        if (kcp1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        resolveaccountrequest = kcp1.asBinder();
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

    public final void a(CheckServerAuthResult checkserverauthresult)
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

    public final void a(RecordConsentRequest recordconsentrequest, lop lop1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (recordconsentrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        recordconsentrequest.writeToParcel(parcel, 0);
_L3:
        if (lop1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        recordconsentrequest = lop1.asBinder();
_L4:
        parcel.writeStrongBinder(recordconsentrequest);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        recordconsentrequest;
        parcel1.recycle();
        parcel.recycle();
        throw recordconsentrequest;
        recordconsentrequest = null;
          goto _L4
    }

    public final void a(kay kay1, int i, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (kay1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        kay1 = kay1.asBinder();
_L1:
        parcel.writeStrongBinder(kay1);
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
        kay1 = null;
          goto _L1
        kay1;
        parcel1.recycle();
        parcel.recycle();
        throw kay1;
    }

    public final void a(lop lop1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (lop1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        lop1 = lop1.asBinder();
_L1:
        parcel.writeStrongBinder(lop1);
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lop1 = null;
          goto _L1
        lop1;
        parcel1.recycle();
        parcel.recycle();
        throw lop1;
    }

    public final void a(boolean flag)
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

    public final IBinder asBinder()
    {
        return a;
    }
}
