// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.common.internal:
//            IAccountAccessor

public final class AccountAccessor extends IAccountAccessor.Stub
{

    private Account mAccount;
    private Context mContext;
    int mGmsCoreUid;

    public AccountAccessor(Context context, Account account)
    {
        mGmsCoreUid = -1;
        mContext = context;
        mAccount = account;
    }

    public static Account getAccountBinderSafe(IAccountAccessor iaccountaccessor)
    {
        Account account;
        long l;
        account = null;
        if (iaccountaccessor == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        l = Binder.clearCallingIdentity();
        account = iaccountaccessor.getAccount();
        Binder.restoreCallingIdentity(l);
        return account;
        iaccountaccessor;
        Log.w("AccountAccessor", "Remote account accessor probably died");
        Binder.restoreCallingIdentity(l);
        return null;
        iaccountaccessor;
        Binder.restoreCallingIdentity(l);
        throw iaccountaccessor;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof AccountAccessor))
        {
            return false;
        } else
        {
            return mAccount.equals(((AccountAccessor)obj).mAccount);
        }
    }

    public final Account getAccount()
    {
        int i = Binder.getCallingUid();
        if (i == mGmsCoreUid)
        {
            return mAccount;
        }
        if (GooglePlayServicesUtil.isGooglePlayServicesUid(mContext, i))
        {
            mGmsCoreUid = i;
            return mAccount;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }
}
