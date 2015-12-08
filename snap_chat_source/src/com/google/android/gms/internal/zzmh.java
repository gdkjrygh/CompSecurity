// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public final class zzmh
{

    public static Scope[] zzi(List list)
    {
        zzx.zzb(list, "scopeStrings can't be null.");
        Scope ascope[] = new Scope[list.size()];
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            ascope[i] = new Scope((String)list.get(i));
        }

        return ascope;
    }
}
