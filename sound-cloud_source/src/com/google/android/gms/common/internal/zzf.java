// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.signin.g;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzf
{

    private final Account zzOY;
    private final String zzQl;
    private final Set zzYY;
    private final int zzYZ;
    private final View zzZa;
    private final String zzZb;
    private final Set zzadc;
    private final Map zzadd;
    private final g zzade;
    private Integer zzadf;

    public zzf(Account account, Set set, Map map, int i, View view, String s, String s1, 
            g g)
    {
        zzOY = account;
        if (set == null)
        {
            account = Collections.EMPTY_SET;
        } else
        {
            account = Collections.unmodifiableSet(set);
        }
        zzYY = account;
        account = map;
        if (map == null)
        {
            account = Collections.EMPTY_MAP;
        }
        zzadd = account;
        zzZa = view;
        zzYZ = i;
        zzQl = s;
        zzZb = s1;
        zzade = g;
        account = new HashSet(zzYY);
    /* block-local class not found */
    class zza {}

        for (set = zzadd.values().iterator(); set.hasNext(); account.addAll(((zza)set.next()).zzZp)) { }
        zzadc = Collections.unmodifiableSet(account);
    }

    public static zzf zzaj(Context context)
    {
        return (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).zzni();
    }

    public final Account getAccount()
    {
        return zzOY;
    }

    public final String getAccountName()
    {
        if (zzOY != null)
        {
            return zzOY.name;
        } else
        {
            return null;
        }
    }

    public final void zza(Integer integer)
    {
        zzadf = integer;
    }

    public final Set zzb(Api api)
    {
        api = (zza)zzadd.get(api);
        if (api == null || ((zza) (api)).zzZp.isEmpty())
        {
            return zzYY;
        } else
        {
            HashSet hashset = new HashSet(zzYY);
            hashset.addAll(((zza) (api)).zzZp);
            return hashset;
        }
    }

    public final Account zzog()
    {
        if (zzOY != null)
        {
            return zzOY;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    public final int zzoh()
    {
        return zzYZ;
    }

    public final Set zzoi()
    {
        return zzYY;
    }

    public final Set zzoj()
    {
        return zzadc;
    }

    public final Map zzok()
    {
        return zzadd;
    }

    public final String zzol()
    {
        return zzQl;
    }

    public final String zzom()
    {
        return zzZb;
    }

    public final View zzon()
    {
        return zzZa;
    }

    public final g zzoo()
    {
        return zzade;
    }

    public final Integer zzop()
    {
        return zzadf;
    }
}
