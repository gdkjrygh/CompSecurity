// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzir, zzin

public final class gj
{

    private List a;
    private String b;
    private boolean c;
    private Account d;

    public gj()
    {
    }

    public final gj a()
    {
        c = true;
        return this;
    }

    public final gj a(Account account)
    {
        d = account;
        return this;
    }

    public final gj a(zzir zzir1)
    {
        if (a == null)
        {
            a = new ArrayList();
        }
        a.add(zzir1);
        return this;
    }

    public final gj a(String s)
    {
        b = s;
        return this;
    }

    public final zzin b()
    {
        String s = b;
        boolean flag = c;
        Account account = d;
        zzir azzir[];
        if (a != null)
        {
            azzir = (zzir[])a.toArray(new zzir[a.size()]);
        } else
        {
            azzir = null;
        }
        return new zzin(s, flag, account, azzir);
    }
}
