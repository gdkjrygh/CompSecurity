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
//            zzo

public class zza extends zzo.zza
{

    private Context mContext;
    private Account zzJc;
    int zzSR;

    public static Account zzb(zzo zzo1)
    {
        Account account;
        long l;
        account = null;
        if (zzo1 == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        l = Binder.clearCallingIdentity();
        account = zzo1.getAccount();
        Binder.restoreCallingIdentity(l);
        return account;
        zzo1;
        Log.w("AccountAccessor", "Remote account accessor probably died");
        Binder.restoreCallingIdentity(l);
        return null;
        zzo1;
        Binder.restoreCallingIdentity(l);
        throw zzo1;
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
            return zzJc.equals(((zza)obj).zzJc);
        }
    }

    public Account getAccount()
    {
        int i = Binder.getCallingUid();
        if (i == zzSR)
        {
            return zzJc;
        }
        if (GooglePlayServicesUtil.zzd(mContext, i))
        {
            zzSR = i;
            return zzJc;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }
}
