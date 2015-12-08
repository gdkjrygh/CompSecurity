// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.pinterest.base.Application;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import java.util.Locale;

public class LocaleUtils
{

    public static final String EMPTY = "";
    public static final String PREF_LOCALE_COUNTRY = "PREF_LOCALE_COUNTRY";
    public static final String PREF_LOCALE_LANG = "PREF_LOCALE_LANG";

    public LocaleUtils()
    {
    }

    public static String getCountry()
    {
        return Preferences.user().getString("PREF_LOCALE_COUNTRY", null);
    }

    public static String getCountryFromCode(String s)
    {
        return (new Locale(Locale.getDefault().getLanguage(), s)).getDisplayCountry();
    }

    public static String getDisplayCountry()
    {
        return Locale.getDefault().getDisplayCountry();
    }

    public static String getDisplayLang()
    {
        return Locale.getDefault().getDisplayLanguage();
    }

    public static String getLang()
    {
        return Preferences.user().getString("PREF_LOCALE_LANG", null);
    }

    public static void init()
    {
        setLocale(Preferences.user().getString("PREF_LOCALE_LANG", ""), Preferences.user().getString("PREF_LOCALE_COUNTRY", ""));
    }

    public static boolean isLanguageDe()
    {
        return Locale.getDefault().getLanguage().startsWith("de");
    }

    public static boolean isLanguageEn()
    {
        return Locale.getDefault().getLanguage().startsWith("en");
    }

    public static boolean isLanguageEs()
    {
        return Locale.getDefault().getLanguage().startsWith("es");
    }

    public static boolean isLanguageFr()
    {
        return Locale.getDefault().getLanguage().startsWith("fr");
    }

    public static boolean isLanguageJa()
    {
        return Locale.getDefault().getLanguage().startsWith("ja");
    }

    public static void saveLocale(String s, String s1)
    {
        Preferences.user().set("PREF_LOCALE_LANG", s);
        Preferences.user().set("PREF_LOCALE_COUNTRY", s1);
    }

    public static void setLocale(String s)
    {
        setLocale(s, "");
    }

    public static void setLocale(String s, String s1)
    {
        if (TextUtils.isEmpty(s) && TextUtils.isEmpty(s1))
        {
            setLocale(Locale.getDefault());
            return;
        } else
        {
            setLocale(new Locale(s, s1));
            saveLocale(s, s1);
            return;
        }
    }

    private static void setLocale(Locale locale)
    {
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        locale = Application.context().getResources();
        locale.updateConfiguration(configuration, locale.getDisplayMetrics());
    }

    public static void setLocaleDutch()
    {
        setLocale("nl");
    }

    public static void setLocaleEnglish()
    {
        setLocale("en");
    }

    public static void setLocaleFrench()
    {
        setLocale("fr");
    }

    public static void setLocaleGerman()
    {
        setLocale("de");
    }

    public static void setLocalePortuguese()
    {
        setLocale("pt");
    }

    public static void setLocalePortugueseBrazil()
    {
        setLocale("pt", "br");
    }

    public static void setLocaleSpanish()
    {
        setLocale("es");
    }
}
