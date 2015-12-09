// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzv;
import java.util.Set;

public final class zzif
{

    public static String[] zzb(Scope ascope[])
    {
        zzv.zzb(ascope, "scopes can't be null.");
        String as[] = new String[ascope.length];
        for (int i = 0; i < ascope.length; i++)
        {
            as[i] = ascope[i].zzle();
        }

        return as;
    }

    public static String[] zzc(Set set)
    {
        return zzb((Scope[])set.toArray(new Scope[set.size()]));
    }
}
