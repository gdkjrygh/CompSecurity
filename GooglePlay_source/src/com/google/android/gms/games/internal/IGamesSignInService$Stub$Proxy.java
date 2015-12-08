// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.accounts.Account;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.plus.internal.PlusCommonExtras;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesSignInService, IGamesSignInCallbacks

private static final class mRemote
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
        account = (Intent)Intent.CREATOR.rcel(parcel1);
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
        s = (Account)Account.CREATOR.rcel(parcel1);
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
        s = (Account)Account.CREATOR.rcel(parcel1);
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
