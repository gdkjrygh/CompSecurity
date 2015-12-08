// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.geo;

import me.lyft.android.common.Strings;

public class Address
{

    private final String city;
    private final String state;

    public Address(String s, String s1)
    {
        city = Strings.nullToEmpty(s);
        state = Strings.nullToEmpty(s1);
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }
}
