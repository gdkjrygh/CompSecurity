// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import com.google.common.collect.ImmutableMap;

public final class NotificationIconRegistry
{

    private static final ImmutableMap ICONS;

    public static int getIconByType(Integer integer, int i)
    {
        int j = i;
        if (integer != null)
        {
            j = i;
            if (ICONS.containsKey(integer))
            {
                j = ((Integer)ICONS.get(integer)).intValue();
            }
        }
        return j;
    }

    static 
    {
        ICONS = ImmutableMap.of(Integer.valueOf(1), Integer.valueOf(com.google.android.apps.walletnfcrel.R.drawable.add_icon), Integer.valueOf(2), Integer.valueOf(com.google.android.apps.walletnfcrel.R.drawable.ic_checkmark_light), Integer.valueOf(3), Integer.valueOf(com.google.android.apps.walletnfcrel.R.drawable.ic_cancel_light));
    }
}
