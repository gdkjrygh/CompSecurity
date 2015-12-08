// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import me.lyft.android.common.Strings;
import me.lyft.android.ui.payment.cardinput.ZipCodeFormat;
import me.lyft.android.ui.payment.cardinput.ZipCodeFormatRegistry;

public class CardExtensions
{

    public CardExtensions()
    {
    }

    public static int getCVCMaxLength(String s, String s1)
    {
        while (Strings.isNullOrEmpty(s) || "American Express".equals(s1)) 
        {
            return 4;
        }
        return 3;
    }

    public static int getCardTypeImageResource(String s)
    {
        return getCardTypeImageResource(s, false);
    }

    private static int getCardTypeImageResource(String s, boolean flag)
    {
        if ("MasterCard".equalsIgnoreCase(s))
        {
            return !flag ? 0x7f020076 : 0x7f020077;
        }
        if ("Visa".equalsIgnoreCase(s))
        {
            return !flag ? 0x7f02007b : 0x7f02007c;
        }
        if ("JCB".equalsIgnoreCase(s))
        {
            return !flag ? 0x7f020072 : 0x7f020073;
        }
        if ("American Express".equalsIgnoreCase(s))
        {
            return !flag ? 0x7f020065 : 0x7f020066;
        }
        if ("Discover".equalsIgnoreCase(s))
        {
            return !flag ? 0x7f02006d : 0x7f02006e;
        }
        if ("Diners Club".equalsIgnoreCase(s))
        {
            return !flag ? 0x7f02006b : 0x7f02006c;
        }
        return !flag ? 0x7f020069 : 0x7f02006a;
    }

    public static int getCardTypeImageResourceWithOutline(String s)
    {
        return getCardTypeImageResource(s, true);
    }

    public static String getTruncatedLabel(String s)
    {
        String s1 = s;
        if (s.length() > 16)
        {
            s1 = (new StringBuilder()).append(s.substring(0, 15)).append("...").toString();
        }
        return s1;
    }

    public static int getZipMaxLength(String s)
    {
        return ZipCodeFormatRegistry.getZipCodeFormat(s).getMaxLength();
    }

    public static boolean isValidZip(String s)
    {
        return !Strings.isNullOrEmpty(s) && s.length() > 4;
    }
}
