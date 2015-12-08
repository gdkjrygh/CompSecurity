// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import java.util.HashSet;

public final class AddressField
{

    private static final char ALL_ADDRESS_FIELDS[] = {
        'S', 'C', 'N', 'O', '1', '2', '3', 'D', 'Z', 'X', 
        'A', 'U', 'F', 'P', 'T', 'B', 'R'
    };
    private static final HashSet ALL_ADDRESS_FIELD_SET;

    public static boolean exists(char c)
    {
        return ALL_ADDRESS_FIELD_SET.contains(Character.valueOf(c));
    }

    static 
    {
        ALL_ADDRESS_FIELD_SET = new HashSet(ALL_ADDRESS_FIELDS.length);
        char ac[] = ALL_ADDRESS_FIELDS;
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            char c = ac[i];
            ALL_ADDRESS_FIELD_SET.add(Character.valueOf(c));
        }

    }
}
