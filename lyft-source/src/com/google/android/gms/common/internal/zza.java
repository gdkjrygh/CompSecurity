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

    int a;
    private Account b;
    private Context c;

    public static Account a(IAccountAccessor iaccountaccessor)
    {
        Account account;
        long l;
        account = null;
        if (iaccountaccessor == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        l = Binder.clearCallingIdentity();
        account = iaccountaccessor.a();
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

    public Account a()
    {
        int i = Binder.getCallingUid();
        if (i == a)
        {
            return b;
        }
        if (GooglePlayServicesUtil.a(c, i))
        {
            a = i;
            return b;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
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
            return b.equals(((zza)obj).b);
        }
    }
}
