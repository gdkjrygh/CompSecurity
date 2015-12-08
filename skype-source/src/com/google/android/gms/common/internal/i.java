// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.signin.e;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            y

public final class i
{
    public static final class a
    {

        public final Set a;
        public final boolean b = true;

        public a(Set set)
        {
            y.a(set);
            a = Collections.unmodifiableSet(set);
        }
    }


    private final Account a;
    private final Set b;
    private final Set c;
    private final Map d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final e i;
    private Integer j;

    public i(Account account, Set set, Map map, int k, View view, String s, String s1, 
            e e1)
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
        i = e1;
        account = new HashSet(b);
        for (set = d.values().iterator(); set.hasNext(); account.addAll(((a)set.next()).a)) { }
        c = Collections.unmodifiableSet(account);
    }

    public final String a()
    {
        if (a != null)
        {
            return a.name;
        } else
        {
            return null;
        }
    }

    public final void a(Integer integer)
    {
        j = integer;
    }

    public final Account b()
    {
        return a;
    }

    public final Account c()
    {
        if (a != null)
        {
            return a;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    public final Set d()
    {
        return b;
    }

    public final Set e()
    {
        return c;
    }

    public final Map f()
    {
        return d;
    }

    public final String g()
    {
        return g;
    }

    public final String h()
    {
        return h;
    }

    public final e i()
    {
        return i;
    }

    public final Integer j()
    {
        return j;
    }
}
