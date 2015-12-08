// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.g.g;

// Referenced classes of package com.google.android.m4b.maps.j:
//            q

public final class a extends q.a
{

    private int a;

    public static Account a(q q1)
    {
        Account account;
        long l;
        account = null;
        if (q1 == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        l = Binder.clearCallingIdentity();
        account = q1.a();
        Binder.restoreCallingIdentity(l);
        return account;
        q1;
        Log.w("AccountAccessor", "Remote account accessor probably died");
        Binder.restoreCallingIdentity(l);
        return null;
        q1;
        Binder.restoreCallingIdentity(l);
        throw q1;
    }

    public final Account a()
    {
        int i = Binder.getCallingUid();
        if (i == a)
        {
            return null;
        }
        if (g.a(i))
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
        if (!(obj instanceof a))
        {
            return false;
        } else
        {
            throw new NullPointerException();
        }
    }
}
