// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.creditcard;

import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public final class CreditCardUtil
{

    private static final Set PLASTIC_CARD_BIN_RANGES = ImmutableSet.of("60113928", "539648", "524825");

    public static String mask(Integer integer, String s)
    {
        Preconditions.checkNotNull(s);
        if (Protos.valuesEqual(integer, 3))
        {
            integer = String.valueOf("XXXX XXXXXX X");
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                return integer.concat(s);
            } else
            {
                return new String(integer);
            }
        }
        integer = String.valueOf("XXXX XXXX XXXX ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return integer.concat(s);
        } else
        {
            return new String(integer);
        }
    }

}
