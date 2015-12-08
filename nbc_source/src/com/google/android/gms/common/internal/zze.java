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
    public static final class zza
    {

        public final Set zzWJ;
    }


    private final Account zzMY;
    private final String zzOd;
    private final String zzOe;
    private final Set zzWv;
    private final int zzWw;
    private final View zzWx;
    private final Set zzZS;
    private final Map zzZT;
    private final zzpt zzZU;

    public zze(Account account, Collection collection, Map map, int i, View view, String s, String s1, 
            zzpt zzpt)
    {
        zzMY = account;
        if (collection == null)
        {
            account = Collections.EMPTY_SET;
        } else
        {
            account = Collections.unmodifiableSet(new HashSet(collection));
        }
        zzWv = account;
        account = map;
        if (map == null)
        {
            account = Collections.EMPTY_MAP;
        }
        zzZT = account;
        zzWx = view;
        zzWw = i;
        zzOe = s;
        zzOd = s1;
        zzZU = zzpt;
        account = new HashSet(zzWv);
        for (collection = zzZT.values().iterator(); collection.hasNext(); account.addAll(((zza)collection.next()).zzWJ)) { }
        zzZS = Collections.unmodifiableSet(account);
    }

    public String zznz()
    {
        return zzOd;
    }
}
