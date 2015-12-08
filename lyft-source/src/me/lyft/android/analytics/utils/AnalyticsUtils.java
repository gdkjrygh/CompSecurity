// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.utils;

import me.lyft.android.common.ExceptionUtils;
import me.lyft.android.common.IHasReason;

public class AnalyticsUtils
{

    public AnalyticsUtils()
    {
    }

    public static String resolveReason(Throwable throwable)
    {
        StringBuilder stringbuilder;
        if (throwable instanceof IHasReason)
        {
            return ((IHasReason)throwable).getReason();
        }
        stringbuilder = new StringBuilder();
        if (!ExceptionUtils.isInterruptedException(throwable)) goto _L2; else goto _L1
_L1:
        stringbuilder.append("interrupted: ");
_L4:
        stringbuilder.append(String.format("%s: %s", new Object[] {
            throwable.getClass().getSimpleName(), throwable.getMessage()
        }));
        return stringbuilder.toString();
_L2:
        if (ExceptionUtils.isNetworkException(throwable))
        {
            stringbuilder.append("network_failure: ");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
