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
//            o

public final class a extends o.a
{

    int a;
    private Account b;
    private Context c;

    public static Account a(o o1)
    {
        Account account;
        long l;
        account = null;
        if (o1 == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        l = Binder.clearCallingIdentity();
        account = o1.a();
        Binder.restoreCallingIdentity(l);
        return account;
        o1;
        Log.w("AccountAccessor", "Remote account accessor probably died");
        Binder.restoreCallingIdentity(l);
        return null;
        o1;
        Binder.restoreCallingIdentity(l);
        throw o1;
    }

    public final Account a()
    {
        int i = Binder.getCallingUid();
        if (i == a)
        {
            return b;
        }
        if (GooglePlayServicesUtil.zze(c, i))
        {
            a = i;
            return b;
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
        if (!(obj instanceof a))
        {
            return false;
        } else
        {
            return b.equals(((a)obj).b);
        }
    }
}
