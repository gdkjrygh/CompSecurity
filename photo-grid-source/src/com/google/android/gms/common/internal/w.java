// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.internal.xj;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            x

public final class w
{

    private final Account a;
    private final Set b;
    private final Set c;
    private final Map d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final xj i;
    private Integer j;

    public w(Account account, Set set, Map map, int k, View view, String s, String s1, 
            xj xj)
    {
        a = account;
        if (set == null)
        {
            account = Collections.EMPTY_SET;
        } else
        {
            account = Collections.unmodifiableSet(set);
        }
        b = account;
        account = map;
        if (map == null)
        {
            account = Collections.EMPTY_MAP;
        }
        d = account;
        f = view;
        e = k;
        g = s;
        h = s1;
        i = xj;
        account = new HashSet(b);
        for (set = d.values().iterator(); set.hasNext(); account.addAll(((x)set.next()).a)) { }
        c = Collections.unmodifiableSet(account);
    }

    public final Account a()
    {
        return a;
    }

    public final void a(Integer integer)
    {
        j = integer;
    }

    public final Account b()
    {
        if (a != null)
        {
            return a;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    public final Set c()
    {
        return b;
    }

    public final Set d()
    {
        return c;
    }

    public final Map e()
    {
        return d;
    }

    public final String f()
    {
        return g;
    }

    public final String g()
    {
        return h;
    }

    public final xj h()
    {
        return i;
    }

    public final Integer i()
    {
        return j;
    }
}
