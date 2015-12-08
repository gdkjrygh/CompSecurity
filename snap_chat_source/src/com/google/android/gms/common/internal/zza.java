// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzq

public class zza extends zzq.zza
{

    private Context mContext;
    private Account zzFN;
    int zzPm;

    public static Account zzc(zzq zzq1)
    {
        Account account = null;
        if (zzq1 != null)
        {
            long l = Binder.clearCallingIdentity();
            try
            {
                account = zzq1.getAccount();
            }
            // Misplaced declaration of an exception variable
            catch (zzq zzq1)
            {
                Binder.restoreCallingIdentity(l);
                return null;
            }
            finally
            {
                Binder.restoreCallingIdentity(l);
            }
            Binder.restoreCallingIdentity(l);
        }
        return account;
        throw zzq1;
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
            return zzFN.equals(((zza)obj).zzFN);
        }
    }

    public Account getAccount()
    {
        int i = Binder.getCallingUid();
        if (i == zzPm)
        {
            return zzFN;
        }
        if (GooglePlayServicesUtil.zzd(mContext, i))
        {
            zzPm = i;
            return zzFN;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }
}
