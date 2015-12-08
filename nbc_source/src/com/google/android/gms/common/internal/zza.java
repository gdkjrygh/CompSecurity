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

public class zza extends IAccountAccessor.zza
{

    private Context mContext;
    private Account zzMY;
    int zzZN;

    public static Account zza(IAccountAccessor iaccountaccessor)
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

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof zza))
        {
            return false;
        } else
        {
            return zzMY.equals(((zza)obj).zzMY);
        }
    }

    public Account getAccount()
    {
        int i = Binder.getCallingUid();
        if (i == zzZN)
        {
            return zzMY;
        }
        if (GooglePlayServicesUtil.zzd(mContext, i))
        {
            zzZN = i;
            return zzMY;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }
}
