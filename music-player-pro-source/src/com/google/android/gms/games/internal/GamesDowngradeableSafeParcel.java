// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.internal.ji;
import com.google.android.gms.internal.lg;

public abstract class GamesDowngradeableSafeParcel extends ji
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
            return lg.aV(integer.intValue());
        }
    }
}
