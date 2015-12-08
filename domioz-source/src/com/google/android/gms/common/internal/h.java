// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.internal.lk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class h
{

    private final Account a;
    private final List b;
    private final int c;
    private final View d;
    private final String e;
    private final String f;
    private final lk g;
    private Integer h;

    public h(Account account, Collection collection, int i, View view, String s, String s1, lk lk)
    {
        a = account;
        if (collection == null)
        {
            account = Collections.EMPTY_LIST;
        } else
        {
            account = Collections.unmodifiableList(new ArrayList(collection));
        }
        b = account;
        d = view;
        c = i;
        e = s;
        f = s1;
        g = lk;
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
        h = integer;
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

    public final List d()
    {
        return b;
    }

    public final String e()
    {
        return e;
    }

    public final String f()
    {
        return f;
    }

    public final lk g()
    {
        return g;
    }

    public final Integer h()
    {
        return h;
    }
}
