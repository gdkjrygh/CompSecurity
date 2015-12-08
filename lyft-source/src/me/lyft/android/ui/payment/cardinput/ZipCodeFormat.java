// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;


public class ZipCodeFormat
{

    private int countryFlagResourceId;
    boolean digitsOnly;
    int maxLength;

    public ZipCodeFormat(int i, boolean flag, int j)
    {
        maxLength = i;
        digitsOnly = flag;
        countryFlagResourceId = j;
    }

    public int getCountryFlagResourceId()
    {
        return countryFlagResourceId;
    }

    public int getMaxLength()
    {
        return maxLength;
    }

    public boolean isDigitsOnly()
    {
        return digitsOnly;
    }
}
