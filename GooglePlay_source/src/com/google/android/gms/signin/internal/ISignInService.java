// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IResolveAccountCallbacks;
import com.google.android.gms.common.internal.ResolveAccountRequest;

// Referenced classes of package com.google.android.gms.signin.internal:
//            ISignInCallbacks, CheckServerAuthResult, RecordConsentRequest

public interface ISignInService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ISignInService
    {

        public static ISignInService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (iinterface != null && (iinterface instanceof ISignInService))
            {
                return (ISignInService)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.signin.internal.ISignInService");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                AuthAccountRequest authaccountrequest;
                if (parcel.readInt() != 0)
                {
                    authaccountrequest = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    authaccountrequest = null;
                }
                authAccount(authaccountrequest, ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                if (parcel.readInt() != 0)
                {
                    parcel = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onCheckServerAuthorization(parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                boolean flag;
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                onUploadServerAuthCode(flag);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                ResolveAccountRequest resolveaccountrequest;
                if (parcel.readInt() != 0)
                {
                    resolveaccountrequest = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    resolveaccountrequest = null;
                }
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = null;
                } else
                {
                    IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    if (iinterface != null && (iinterface instanceof IResolveAccountCallbacks))
                    {
                        parcel = (IResolveAccountCallbacks)iinterface;
                    } else
                    {
                        parcel = new com.google.android.gms.common.internal.IResolveAccountCallbacks.Stub.Proxy(parcel);
                    }
                }
                resolveAccount(resolveaccountrequest, parcel);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                clearAccountFromSessionStore(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                i = parcel.readInt();
                Account account;
                if (parcel.readInt() != 0)
                {
                    account = (Account)Account.CREATOR.createFromParcel(parcel);
                } else
                {
                    account = null;
                }
                saveAccountToSessionStore(i, account, ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                IAccountAccessor iaccountaccessor = com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(parcel.readStrongBinder());
                i = parcel.readInt();
                boolean flag1;
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                saveDefaultAccountToSharedPref(iaccountaccessor, i, flag1);
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                RecordConsentRequest recordconsentrequest;
                if (parcel.readInt() != 0)
                {
                    recordconsentrequest = (RecordConsentRequest)RecordConsentRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    recordconsentrequest = null;
                }
                recordConsent(recordconsentrequest, ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                getCurrentAccount(ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static final class Stub.Proxy
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

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void authAccount(AuthAccountRequest authaccountrequest, ISignInCallbacks isignincallbacks)
        throws RemoteException;

    public abstract void clearAccountFromSessionStore(int i)
        throws RemoteException;

    public abstract void getCurrentAccount(ISignInCallbacks isignincallbacks)
        throws RemoteException;

    public abstract void onCheckServerAuthorization(CheckServerAuthResult checkserverauthresult)
        throws RemoteException;

    public abstract void onUploadServerAuthCode(boolean flag)
        throws RemoteException;

    public abstract void recordConsent(RecordConsentRequest recordconsentrequest, ISignInCallbacks isignincallbacks)
        throws RemoteException;

    public abstract void resolveAccount(ResolveAccountRequest resolveaccountrequest, IResolveAccountCallbacks iresolveaccountcallbacks)
        throws RemoteException;

    public abstract void saveAccountToSessionStore(int i, Account account, ISignInCallbacks isignincallbacks)
        throws RemoteException;

    public abstract void saveDefaultAccountToSharedPref(IAccountAccessor iaccountaccessor, int i, boolean flag)
        throws RemoteException;
}
