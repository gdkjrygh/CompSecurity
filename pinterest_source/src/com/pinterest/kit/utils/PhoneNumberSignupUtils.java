// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.pinterest.kit.utils:
//            PStringUtils

public class PhoneNumberSignupUtils
{

    private static Set supportedCountries;

    public PhoneNumberSignupUtils()
    {
    }

    public static int getCountryCode(String s)
    {
        return PhoneNumberUtil.getInstance().getCountryCodeForRegion(s);
    }

    public static String getCountryName(String s)
    {
        return (new Locale(Locale.getDefault().getLanguage(), s)).getDisplayCountry();
    }

    public static String getFormattedCountryCode(String s)
    {
        String s1 = "";
        if (supportedCountries.contains(s))
        {
            s1 = PStringUtils.format("%s (+%d)", new Object[] {
                getCountryName(s), Integer.valueOf(getCountryCode(s))
            });
        }
        return s1;
    }

    public static Set getSupportedCountries()
    {
        return supportedCountries;
    }

    public static boolean isCountrySupported(String s)
    {
        return supportedCountries.contains(s);
    }

    static 
    {
        HashSet hashset = new HashSet();
        supportedCountries = hashset;
        hashset.add("JP");
        supportedCountries.add("DE");
        supportedCountries.add("FR");
        supportedCountries.add("BR");
        supportedCountries.add("KR");
        supportedCountries.add("IT");
        supportedCountries.add("NL");
        supportedCountries.add("SE");
        supportedCountries.add("ES");
        supportedCountries.add("NO");
        supportedCountries.add("DK");
        supportedCountries.add("MX");
        supportedCountries.add("IN");
        supportedCountries.add("AU");
        supportedCountries.add("GB");
        supportedCountries.add("RU");
    }
}
