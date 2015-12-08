// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class LocaleManager
{

    private static final String DEFAULT_COUNTRY = "US";
    private static final String DEFAULT_LANGUAGE = "en";
    private static final String DEFAULT_TLD = "com";
    private static final Map GOOGLE_BOOK_SEARCH_COUNTRY_TLD;
    private static final Map GOOGLE_COUNTRY_TLD;
    private static final Map GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD;
    private static final Collection TRANSLATED_HELP_ASSET_LANGUAGES = Arrays.asList(new String[] {
        "de", "en", "es", "fr", "it", "ja", "ko", "nl", "pt", "ru", 
        "zh-rCN", "zh-rTW"
    });

    private LocaleManager()
    {
    }

    private static String doGetTLD(Map map, Context context)
    {
        context = (String)map.get(getCountry(context));
        map = context;
        if (context == null)
        {
            map = "com";
        }
        return map;
    }

    public static String getBookSearchCountryTLD(Context context)
    {
        return doGetTLD(GOOGLE_BOOK_SEARCH_COUNTRY_TLD, context);
    }

    public static String getCountry(Context context)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).getString("preferences_search_country", null);
        if (context != null && !context.isEmpty() && !"-".equals(context))
        {
            return context;
        } else
        {
            return getSystemCountry();
        }
    }

    public static String getCountryTLD(Context context)
    {
        return doGetTLD(GOOGLE_COUNTRY_TLD, context);
    }

    public static String getProductSearchCountryTLD(Context context)
    {
        return doGetTLD(GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD, context);
    }

    private static String getSystemCountry()
    {
        Locale locale = Locale.getDefault();
        if (locale == null)
        {
            return "US";
        } else
        {
            return locale.getCountry();
        }
    }

    private static String getSystemLanguage()
    {
        Object obj = Locale.getDefault();
        if (obj == null)
        {
            obj = "en";
        } else
        {
            String s = ((Locale) (obj)).getLanguage();
            obj = s;
            if (Locale.SIMPLIFIED_CHINESE.getLanguage().equals(s))
            {
                return (new StringBuilder()).append(s).append("-r").append(getSystemCountry()).toString();
            }
        }
        return ((String) (obj));
    }

    public static String getTranslatedAssetLanguage()
    {
        String s = getSystemLanguage();
        if (TRANSLATED_HELP_ASSET_LANGUAGES.contains(s))
        {
            return s;
        } else
        {
            return "en";
        }
    }

    public static boolean isBookSearchUrl(String s)
    {
        return s.startsWith("http://google.com/books") || s.startsWith("http://books.google.");
    }

    static 
    {
        GOOGLE_COUNTRY_TLD = new HashMap();
        GOOGLE_COUNTRY_TLD.put("AR", "com.ar");
        GOOGLE_COUNTRY_TLD.put("AU", "com.au");
        GOOGLE_COUNTRY_TLD.put("BR", "com.br");
        GOOGLE_COUNTRY_TLD.put("BG", "bg");
        GOOGLE_COUNTRY_TLD.put(Locale.CANADA.getCountry(), "ca");
        GOOGLE_COUNTRY_TLD.put(Locale.CHINA.getCountry(), "cn");
        GOOGLE_COUNTRY_TLD.put("CZ", "cz");
        GOOGLE_COUNTRY_TLD.put("DK", "dk");
        GOOGLE_COUNTRY_TLD.put("FI", "fi");
        GOOGLE_COUNTRY_TLD.put(Locale.FRANCE.getCountry(), "fr");
        GOOGLE_COUNTRY_TLD.put(Locale.GERMANY.getCountry(), "de");
        GOOGLE_COUNTRY_TLD.put("GR", "gr");
        GOOGLE_COUNTRY_TLD.put("HU", "hu");
        GOOGLE_COUNTRY_TLD.put("ID", "co.id");
        GOOGLE_COUNTRY_TLD.put("IL", "co.il");
        GOOGLE_COUNTRY_TLD.put(Locale.ITALY.getCountry(), "it");
        GOOGLE_COUNTRY_TLD.put(Locale.JAPAN.getCountry(), "co.jp");
        GOOGLE_COUNTRY_TLD.put(Locale.KOREA.getCountry(), "co.kr");
        GOOGLE_COUNTRY_TLD.put("NL", "nl");
        GOOGLE_COUNTRY_TLD.put("PL", "pl");
        GOOGLE_COUNTRY_TLD.put("PT", "pt");
        GOOGLE_COUNTRY_TLD.put("RO", "ro");
        GOOGLE_COUNTRY_TLD.put("RU", "ru");
        GOOGLE_COUNTRY_TLD.put("SK", "sk");
        GOOGLE_COUNTRY_TLD.put("SI", "si");
        GOOGLE_COUNTRY_TLD.put("ES", "es");
        GOOGLE_COUNTRY_TLD.put("SE", "se");
        GOOGLE_COUNTRY_TLD.put("CH", "ch");
        GOOGLE_COUNTRY_TLD.put(Locale.TAIWAN.getCountry(), "tw");
        GOOGLE_COUNTRY_TLD.put("TR", "com.tr");
        GOOGLE_COUNTRY_TLD.put(Locale.UK.getCountry(), "co.uk");
        GOOGLE_COUNTRY_TLD.put(Locale.US.getCountry(), "com");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD = new HashMap();
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put("AU", "com.au");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put(Locale.FRANCE.getCountry(), "fr");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put(Locale.GERMANY.getCountry(), "de");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put(Locale.ITALY.getCountry(), "it");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put(Locale.JAPAN.getCountry(), "co.jp");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put("NL", "nl");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put("ES", "es");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put("CH", "ch");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put(Locale.UK.getCountry(), "co.uk");
        GOOGLE_PRODUCT_SEARCH_COUNTRY_TLD.put(Locale.US.getCountry(), "com");
        GOOGLE_BOOK_SEARCH_COUNTRY_TLD = GOOGLE_COUNTRY_TLD;
    }
}
