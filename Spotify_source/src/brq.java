// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;

public final class brq extends bsv
{

    private int a;

    public static Account a(bsu bsu1)
    {
        Account account;
        long l;
        account = null;
        if (bsu1 == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        l = Binder.clearCallingIdentity();
        account = bsu1.a();
        Binder.restoreCallingIdentity(l);
        return account;
        bsu1;
        Log.w("AccountAccessor", "Remote account accessor probably died");
        Binder.restoreCallingIdentity(l);
        return null;
        bsu1;
        Binder.restoreCallingIdentity(l);
        throw bsu1;
    }

    public final Account a()
    {
        int i = Binder.getCallingUid();
        if (i == a)
        {
            return null;
        }
        if (GooglePlayServicesUtil.zze(null, i))
        {
            a = i;
            return null;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof brq))
        {
            return false;
        } else
        {
            throw new NullPointerException();
        }
    }
}
