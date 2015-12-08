// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IResolveAccountCallbacks;
import com.google.android.gms.common.internal.ResolveAccountRequest;

// Referenced classes of package com.google.android.gms.signin.internal:
//            ISignInService, ISignInCallbacks, CheckServerAuthResult, RecordConsentRequest

private static final class mRemote
    implements ISignInService
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void authAccount(AuthAccountRequest authaccountrequest, ISignInCallbacks isignincallbacks)
        throws RemoteException
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
        if (isignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        authaccountrequest = isignincallbacks.asBinder();
_L4:
        parcel.writeStrongBinder(authaccountrequest);
        mRemote.transact(2, parcel, parcel1, 0);
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

    public final void clearAccountFromSessionStore(int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        parcel.writeInt(i);
        mRemote.transact(7, parcel, parcel1, 0);
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

    public final void getCurrentAccount(ISignInCallbacks isignincallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (isignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        isignincallbacks = isignincallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(isignincallbacks);
        mRemote.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        isignincallbacks = null;
          goto _L1
        isignincallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw isignincallbacks;
    }

    public final void onCheckServerAuthorization(CheckServerAuthResult checkserverauthresult)
        throws RemoteException
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
        mRemote.transact(3, parcel, parcel1, 0);
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

    public final void onUploadServerAuthCode(boolean flag)
        throws RemoteException
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
        mRemote.transact(4, parcel, parcel1, 0);
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

    public final void recordConsent(RecordConsentRequest recordconsentrequest, ISignInCallbacks isignincallbacks)
        throws RemoteException
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
        if (isignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        recordconsentrequest = isignincallbacks.asBinder();
_L4:
        parcel.writeStrongBinder(recordconsentrequest);
        mRemote.transact(10, parcel, parcel1, 0);
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

    public final void resolveAccount(ResolveAccountRequest resolveaccountrequest, IResolveAccountCallbacks iresolveaccountcallbacks)
        throws RemoteException
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
        if (iresolveaccountcallbacks == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        resolveaccountrequest = iresolveaccountcallbacks.asBinder();
_L4:
        parcel.writeStrongBinder(resolveaccountrequest);
        mRemote.transact(5, parcel, parcel1, 0);
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

    public final void saveAccountToSessionStore(int i, Account account, ISignInCallbacks isignincallbacks)
        throws RemoteException
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
        if (isignincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        account = isignincallbacks.asBinder();
_L4:
        parcel.writeStrongBinder(account);
        mRemote.transact(8, parcel, parcel1, 0);
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

    public final void saveDefaultAccountToSharedPref(IAccountAccessor iaccountaccessor, int i, boolean flag)
        throws RemoteException
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
        mRemote.transact(9, parcel, parcel1, 0);
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
