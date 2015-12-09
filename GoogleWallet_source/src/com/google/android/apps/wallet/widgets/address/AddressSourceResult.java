// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import android.text.TextUtils;
import com.google.common.base.Preconditions;

public final class AddressSourceResult
{

    private final com.google.location.country.NanoPostaladdress.PostalAddress address;
    private final CharSequence description;
    private final String matchingTerm;
    private final String reference;
    private final String sourceName;

    public AddressSourceResult(String s, CharSequence charsequence, String s1, String s2)
    {
        boolean flag;
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        matchingTerm = s;
        address = null;
        description = charsequence;
        sourceName = s1;
        reference = s2;
    }

    public AddressSourceResult(String s, String s1)
    {
        this(s, ((CharSequence) (s)), s1, null);
    }

    public final com.google.location.country.NanoPostaladdress.PostalAddress getAddress()
    {
        return address;
    }

    public final CharSequence getDescription()
    {
        return description;
    }

    public final String getMatchingTerm()
    {
        return matchingTerm;
    }

    public final String getReference()
    {
        return reference;
    }

    public final String getSourceName()
    {
        return sourceName;
    }
}
