// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public final class kbb extends kaz
{

    private int a;

    public static Account a(kay kay1)
    {
        Account account;
        long l;
        account = null;
        if (kay1 == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        l = Binder.clearCallingIdentity();
        account = kay1.a();
        Binder.restoreCallingIdentity(l);
        return account;
        kay1;
        Log.w("AccountAccessor", "Remote account accessor probably died");
        Binder.restoreCallingIdentity(l);
        return null;
        kay1;
        Binder.restoreCallingIdentity(l);
        throw kay1;
    }

    public final Account a()
    {
        int i = Binder.getCallingUid();
        if (i == a)
        {
            return null;
        }
        if (jyc.a(null, i))
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
        if (!(obj instanceof kbb))
        {
            return false;
        } else
        {
            throw new NullPointerException();
        }
    }
}
