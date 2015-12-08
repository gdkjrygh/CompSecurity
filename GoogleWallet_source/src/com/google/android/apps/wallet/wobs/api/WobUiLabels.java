// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.api;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class WobUiLabels
{

    private static final Map labelMap = ImmutableMap.builder().put(Long.valueOf(0x5ca6fa4359bfd2eeL), ImmutableSet.of(Long.valueOf(0x5ca6fa4359bfd2edL), Long.valueOf(0x5ca6fa4359bfd2efL))).put(Long.valueOf(0xcc9803b6c1192477L), ImmutableSet.of(Long.valueOf(0xf824328813b0d35eL), Long.valueOf(0x1795015b9646fc27L))).put(Long.valueOf(0x6a73ed851981cb68L), ImmutableSet.of(Long.valueOf(0x8c2aa2b750ff66f8L), Long.valueOf(0x8d11e6de4edbd1d3L))).put(Long.valueOf(0xb01efe87478e2482L), ImmutableSet.of(Long.valueOf(0x7ab08b2c02b9edebL), Long.valueOf(0x80d2f5009d3c79e3L))).build();

    public static long getParentLabelOrdinal(long l)
    {
        for (Iterator iterator = labelMap.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((Set)entry.getValue()).contains(Long.valueOf(l)))
            {
                return ((Long)entry.getKey()).longValue();
            }
        }

        return 0L;
    }

}
