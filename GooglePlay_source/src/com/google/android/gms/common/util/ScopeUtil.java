// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Set;

public final class ScopeUtil
{

    public static transient Set fromScopeString(String as[])
    {
        Preconditions.checkNotNull(as, "scopeStrings can't be null.");
        HashSet hashset = new HashSet(as.length);
        int i = 0;
        for (int j = as.length; i < j; i++)
        {
            String s = as[i];
            if (!TextUtils.isEmpty(s))
            {
                hashset.add(new Scope(s));
            }
        }

        return hashset;
    }

    public static String[] toScopeString(Scope ascope[])
    {
        Preconditions.checkNotNull(ascope, "scopes can't be null.");
        String as[] = new String[ascope.length];
        for (int i = 0; i < ascope.length; i++)
        {
            as[i] = ascope[i].mScopeUri;
        }

        return as;
    }
}
