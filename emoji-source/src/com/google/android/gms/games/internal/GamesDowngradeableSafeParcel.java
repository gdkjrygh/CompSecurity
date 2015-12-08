// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.internal.ha;
import com.google.android.gms.internal.im;

public abstract class GamesDowngradeableSafeParcel extends ha
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
            return im.aE(integer.intValue());
        }
    }
}
