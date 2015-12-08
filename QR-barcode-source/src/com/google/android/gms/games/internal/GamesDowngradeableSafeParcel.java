// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.jx;

public abstract class GamesDowngradeableSafeParcel extends d
{

    public GamesDowngradeableSafeParcel()
    {
    }

    protected static boolean c(Integer integer)
    {
        if (integer == null)
        {
            return false;
        } else
        {
            return jx.aQ(integer.intValue());
        }
    }
}
