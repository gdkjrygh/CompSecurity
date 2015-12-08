// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.accounts.Account;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusCommonExtrasCreator;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesSignInService, IGamesSignInCallbacks

public static abstract class attachInterface extends Binder
    implements IGamesSignInService
{
    private static final class Proxy
        implements IGamesSignInService
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void checkOAuthConsent(IGamesSignInCallbacks igamessignincallbacks, Account account, Account account1, String s, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (igamessignincallbacks == null) goto _L2; else goto _L1
_L1:
            igamessignincallbacks = igamessignincallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamessignincallbacks);
            if (account == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L6:
            if (account1 == null)
            {
                break MISSING_BLOCK_LABEL_143;
            }
            parcel.writeInt(1);
            account1.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            parcel.writeStringArray(as);
            mRemote.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamessignincallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamessignincallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamessignincallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public final void forceRefreshToken(IGamesSignInCallbacks igamessignincallbacks, Account account)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (igamessignincallbacks == null) goto _L2; else goto _L1
_L1:
            igamessignincallbacks = igamessignincallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamessignincallbacks);
            if (account == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L6:
            mRemote.transact(17001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamessignincallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamessignincallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamessignincallbacks;
              goto _L5
        }

        public final String getGmsAccountName(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            parcel.writeString(s);
            mRemote.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final Intent getPlusUpgradeIntent(Account account, String s, String as[], PlusCommonExtras pluscommonextras)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (account == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L5:
            parcel.writeString(s);
            parcel.writeStringArray(as);
            if (pluscommonextras == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            pluscommonextras.writeToParcel(parcel, 0);
_L6:
            mRemote.transact(16001, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_153;
            }
            account = (Intent)Intent.CREATOR.createFromParcel(parcel1);
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

        public final Account getResolvedGmsAccount(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Account)Account.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final Account getSignedInAccount(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            parcel.writeString(s);
            mRemote.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Account)Account.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void loadGame(IGamesSignInCallbacks igamessignincallbacks, Account account, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (igamessignincallbacks == null) goto _L2; else goto _L1
_L1:
            igamessignincallbacks = igamessignincallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamessignincallbacks);
            if (account == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamessignincallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamessignincallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamessignincallbacks;
              goto _L5
        }

        public final void loadGameplayAcl(IGamesSignInCallbacks igamessignincallbacks, Account account, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (igamessignincallbacks == null) goto _L2; else goto _L1
_L1:
            igamessignincallbacks = igamessignincallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamessignincallbacks);
            if (account == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            mRemote.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamessignincallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamessignincallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamessignincallbacks;
              goto _L5
        }

        public final void loadSelf(IGamesSignInCallbacks igamessignincallbacks, Account account, Account account1, String s, String s1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (igamessignincallbacks == null) goto _L2; else goto _L1
_L1:
            igamessignincallbacks = igamessignincallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamessignincallbacks);
            if (account == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L6:
            if (account1 == null)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            parcel.writeInt(1);
            account1.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            mRemote.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamessignincallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamessignincallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamessignincallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public final void recordSignIn(IGamesSignInCallbacks igamessignincallbacks, Account account, Account account1, String s, String as[], String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (igamessignincallbacks == null) goto _L2; else goto _L1
_L1:
            igamessignincallbacks = igamessignincallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamessignincallbacks);
            if (account == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L6:
            if (account1 == null)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            parcel.writeInt(1);
            account1.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            parcel.writeStringArray(as);
            parcel.writeString(s1);
            mRemote.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamessignincallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamessignincallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamessignincallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public final void refreshGameplayAclStatus(Account account, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (account == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L1:
            parcel.writeString(s);
            mRemote.transact(9001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            account;
            parcel1.recycle();
            parcel.recycle();
            throw account;
        }

        public final void updateGameplayAcl(IGamesSignInCallbacks igamessignincallbacks, Account account, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (igamessignincallbacks == null) goto _L2; else goto _L1
_L1:
            igamessignincallbacks = igamessignincallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamessignincallbacks);
            if (account == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamessignincallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamessignincallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamessignincallbacks;
              goto _L5
        }

        public final void validateAccount(IGamesSignInCallbacks igamessignincallbacks, Account account)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInService");
            if (igamessignincallbacks == null) goto _L2; else goto _L1
_L1:
            igamessignincallbacks = igamessignincallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamessignincallbacks);
            if (account == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L6:
            mRemote.transact(14001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamessignincallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamessignincallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamessignincallbacks;
              goto _L5
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IGamesSignInService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesSignInService");
        if (iinterface != null && (iinterface instanceof IGamesSignInService))
        {
            return (IGamesSignInService)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        IGamesSignInCallbacks igamessignincallbacks1;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.games.internal.IGamesSignInService");
            return true;

        case 5001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            parcel = getSignedInAccount(parcel.readString());
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

        case 5002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            parcel = getGmsAccountName(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 5009: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            String s = parcel.readString();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            parcel = getResolvedGmsAccount(s, flag);
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

        case 5003: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            IGamesSignInCallbacks igamessignincallbacks5 = b.asInterface(parcel.readStrongBinder());
            Account account;
            Account account8;
            if (parcel.readInt() != 0)
            {
                account = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account = null;
            }
            if (parcel.readInt() != 0)
            {
                account8 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account8 = null;
            }
            recordSignIn(igamessignincallbacks5, account, account8, parcel.readString(), parcel.createStringArray(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5004: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            IGamesSignInCallbacks igamessignincallbacks6 = b.asInterface(parcel.readStrongBinder());
            Account account1;
            Account account9;
            if (parcel.readInt() != 0)
            {
                account1 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account1 = null;
            }
            if (parcel.readInt() != 0)
            {
                account9 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account9 = null;
            }
            checkOAuthConsent(igamessignincallbacks6, account1, account9, parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5005: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            IGamesSignInCallbacks igamessignincallbacks2 = b.asInterface(parcel.readStrongBinder());
            Account account2;
            if (parcel.readInt() != 0)
            {
                account2 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account2 = null;
            }
            loadGame(igamessignincallbacks2, account2, parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5006: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            IGamesSignInCallbacks igamessignincallbacks3 = b.asInterface(parcel.readStrongBinder());
            Account account3;
            if (parcel.readInt() != 0)
            {
                account3 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account3 = null;
            }
            loadGameplayAcl(igamessignincallbacks3, account3, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5007: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            IGamesSignInCallbacks igamessignincallbacks4 = b.asInterface(parcel.readStrongBinder());
            Account account4;
            if (parcel.readInt() != 0)
            {
                account4 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account4 = null;
            }
            updateGameplayAcl(igamessignincallbacks4, account4, parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5008: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            IGamesSignInCallbacks igamessignincallbacks7 = b.asInterface(parcel.readStrongBinder());
            Account account5;
            Account account10;
            if (parcel.readInt() != 0)
            {
                account5 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account5 = null;
            }
            if (parcel.readInt() != 0)
            {
                account10 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account10 = null;
            }
            loadSelf(igamessignincallbacks7, account5, account10, parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 9001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            Account account6;
            if (parcel.readInt() != 0)
            {
                account6 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account6 = null;
            }
            refreshGameplayAclStatus(account6, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 14001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            IGamesSignInCallbacks igamessignincallbacks = b.asInterface(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                parcel = null;
            }
            validateAccount(igamessignincallbacks, parcel);
            parcel1.writeNoException();
            return true;

        case 16001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            Account account7;
            String s1;
            String as[];
            if (parcel.readInt() != 0)
            {
                account7 = (Account)Account.CREATOR.FromParcel(parcel);
            } else
            {
                account7 = null;
            }
            s1 = parcel.readString();
            as = parcel.createStringArray();
            if (parcel.readInt() != 0)
            {
                PlusCommonExtrasCreator pluscommonextrascreator = PlusCommonExtras.CREATOR;
                parcel = PlusCommonExtrasCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = getPlusUpgradeIntent(account7, s1, as, parcel);
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

        case 17001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesSignInService");
            igamessignincallbacks1 = b.asInterface(parcel.readStrongBinder());
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Account)Account.CREATOR.FromParcel(parcel);
        } else
        {
            parcel = null;
        }
        forceRefreshToken(igamessignincallbacks1, parcel);
        parcel1.writeNoException();
        return true;
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.games.internal.IGamesSignInService");
    }
}
