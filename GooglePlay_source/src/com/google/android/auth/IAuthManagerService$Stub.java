// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.auth;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

// Referenced classes of package com.google.android.auth:
//            IAuthManagerService

public static abstract class Proxy.mRemote extends Binder
    implements IAuthManagerService
{
    private static final class Proxy
        implements IAuthManagerService
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final Bundle clearToken(String s, Bundle bundle)
            throws RemoteException
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
            mRemote.transact(2, parcel, parcel1, 0);
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

        public final AccountChangeEventsResponse getAccountChangeEvents(AccountChangeEventsRequest accountchangeeventsrequest)
            throws RemoteException
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
            mRemote.transact(3, parcel, parcel1, 0);
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

        public final Bundle getAccounts(Bundle bundle)
            throws RemoteException
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
            mRemote.transact(6, parcel, parcel1, 0);
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

        public final Bundle getToken(String s, String s1, Bundle bundle)
            throws RemoteException
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
            mRemote.transact(1, parcel, parcel1, 0);
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

        public final Bundle getTokenByAccount(Account account, String s, Bundle bundle)
            throws RemoteException
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
            mRemote.transact(5, parcel, parcel1, 0);
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

        public final Bundle removeAccount(Account account)
            throws RemoteException
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
            mRemote.transact(7, parcel, parcel1, 0);
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

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IAuthManagerService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (iinterface != null && (iinterface instanceof IAuthManagerService))
        {
            return (IAuthManagerService)iinterface;
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
            parcel1.writeString("com.google.android.auth.IAuthManagerService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            String s = parcel.readString();
            String s2 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.FromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = getToken(s, s2, parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            String s1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.FromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = clearToken(s1, parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            if (parcel.readInt() != 0)
            {
                parcel = (AccountChangeEventsRequest)AccountChangeEventsRequest.CREATOR.FromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = getAccountChangeEvents(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            Account account;
            String s3;
            if (parcel.readInt() != 0)
            {
                account = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account = null;
            }
            s3 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.FromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = getTokenByAccount(account, s3, parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.FromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = getAccounts(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Account)Account.CREATOR.FromParcel(parcel);
        } else
        {
            parcel = null;
        }
        parcel = removeAccount(parcel);
        parcel1.writeNoException();
        if (parcel != null)
        {
            parcel1.writeInt(1);
            parcel.writeToParcel(parcel1, 1);
            return true;
        } else
        {
            parcel1.writeInt(0);
            return true;
        }
    }
}
