// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.util.GmsVersion;

public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel
{

    public GamesDowngradeableSafeParcel()
    {
    }

    public static boolean versionSupportsSafeParcel(Integer integer)
    {
        if (integer == null)
        {
            return false;
        } else
        {
            return GmsVersion.isAtLeastFenacho(integer.intValue());
        }
    }

    public final boolean prepareForClientVersion(int i)
    {
        boolean flag;
        if (!versionSupportsSafeParcel(Integer.valueOf(i)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setShouldDowngrade(flag);
        return true;
    }
}
