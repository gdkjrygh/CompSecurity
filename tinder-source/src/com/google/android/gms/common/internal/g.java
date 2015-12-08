// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.internal.et;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            u

public final class g
{
    public static final class a
    {

        public final Set a;
        public final boolean b = true;

        public a(Set set)
        {
            u.a(set);
            a = Collections.unmodifiableSet(set);
        }
    }


    public final Account a;
    public final Set b;
    final Set c;
    public final Map d;
    public final String e;
    final String f;
    public final et g;
    public Integer h;
    private final int i;
    private final View j;

    public g(Account account, Set set, Map map, int k, View view, String s, String s1, 
            et et)
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
        j = view;
        i = k;
        e = s;
        f = s1;
        g = et;
        account = new HashSet(b);
        for (set = d.values().iterator(); set.hasNext(); account.addAll(((a)set.next()).a)) { }
        c = Collections.unmodifiableSet(account);
    }
}
