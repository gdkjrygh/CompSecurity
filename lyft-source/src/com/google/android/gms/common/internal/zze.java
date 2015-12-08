// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.internal.zzpt;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zze
{

    private final Account a;
    private final Set b;
    private final Set c;
    private final Map d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final zzpt i;
    private Integer j;

    public zze(Account account, Collection collection, Map map, int k, View view, String s, String s1, 
            zzpt zzpt)
    {
        a = account;
        if (collection == null)
        {
            account = Collections.EMPTY_SET;
        } else
        {
            account = Collections.unmodifiableSet(new HashSet(collection));
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
        i = zzpt;
        account = new HashSet(b);
        for (collection = d.values().iterator(); collection.hasNext(); account.addAll(((zza)collection.next()).a)) { }
        c = Collections.unmodifiableSet(account);
    }

    public String a()
    {
        if (a != null)
        {
            return a.name;
        } else
        {
            return null;
        }
    }

    public void a(Integer integer)
    {
        j = integer;
    }

    public Account b()
    {
        return a;
    }

    public Account c()
    {
        if (a != null)
        {
            return a;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    public Set d()
    {
        return b;
    }

    public Set e()
    {
        return c;
    }

    public Map f()
    {
        return d;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public zzpt i()
    {
        return i;
    }

    public Integer j()
    {
        return j;
    }

    private class zza
    {

        public final Set a;
        public final boolean b;

        public zza(Set set, boolean flag)
        {
            zzu.a(set);
            a = Collections.unmodifiableSet(set);
            b = flag;
        }
    }

}
