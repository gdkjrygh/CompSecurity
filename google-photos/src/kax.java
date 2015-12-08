// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class kax
{

    public final Account a;
    public final Set b;
    final Set c;
    public final Map d;
    public final String e;
    final String f;
    public final loi g;
    public Integer h;

    public kax(Account account, Set set, Map map, int i, View view, String s, String s1, 
            loi loi)
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
        e = s;
        f = s1;
        g = loi;
        account = new HashSet(b);
        for (set = d.values().iterator(); set.hasNext(); account.addAll(null))
        {
            set.next();
        }

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
}
