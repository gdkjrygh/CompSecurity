// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import java.util.List;

public interface AddressSource
{

    public abstract com.google.location.country.NanoPostaladdress.PostalAddress getAddress(String s, String s1);

    public abstract List getAddresses(CharSequence charsequence, char c, char ac[], String s, String s1);

    public abstract String getName();
}
