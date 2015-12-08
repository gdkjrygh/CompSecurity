// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class LocaleUtils
{
    static class SyncAvoid
    {

        private static List AVAILABLE_LOCALE_LIST = Collections.unmodifiableList(new ArrayList(Arrays.asList(Locale.getAvailableLocales())));
        private static Set AVAILABLE_LOCALE_SET = Collections.unmodifiableSet(new HashSet(LocaleUtils.availableLocaleList()));




        SyncAvoid()
        {
        }
    }


    private static final ConcurrentMap cCountriesByLanguage = new ConcurrentHashMap();
    private static final ConcurrentMap cLanguagesByCountry = new ConcurrentHashMap();

    public LocaleUtils()
    {
    }

    public static List availableLocaleList()
    {
        return SyncAvoid.AVAILABLE_LOCALE_LIST;
    }

    public static Set availableLocaleSet()
    {
        return SyncAvoid.AVAILABLE_LOCALE_SET;
    }

    public static List countriesByLanguage(String s)
    {
        List list;
        if (s == null)
        {
            list = Collections.emptyList();
        } else
        {
            List list1 = (List)cCountriesByLanguage.get(s);
            list = list1;
            if (list1 == null)
            {
                Object obj = new ArrayList();
                List list2 = availableLocaleList();
                for (int i = 0; i < list2.size(); i++)
                {
                    Locale locale = (Locale)list2.get(i);
                    if (s.equals(locale.getLanguage()) && locale.getCountry().length() != 0 && locale.getVariant().length() == 0)
                    {
                        ((List) (obj)).add(locale);
                    }
                }

                obj = Collections.unmodifiableList(((List) (obj)));
                cCountriesByLanguage.putIfAbsent(s, obj);
                return (List)cCountriesByLanguage.get(s);
            }
        }
        return list;
    }

    public static boolean isAvailableLocale(Locale locale)
    {
        return availableLocaleList().contains(locale);
    }

    public static List languagesByCountry(String s)
    {
        List list;
        if (s == null)
        {
            list = Collections.emptyList();
        } else
        {
            List list1 = (List)cLanguagesByCountry.get(s);
            list = list1;
            if (list1 == null)
            {
                Object obj = new ArrayList();
                List list2 = availableLocaleList();
                for (int i = 0; i < list2.size(); i++)
                {
                    Locale locale = (Locale)list2.get(i);
                    if (s.equals(locale.getCountry()) && locale.getVariant().length() == 0)
                    {
                        ((List) (obj)).add(locale);
                    }
                }

                obj = Collections.unmodifiableList(((List) (obj)));
                cLanguagesByCountry.putIfAbsent(s, obj);
                return (List)cLanguagesByCountry.get(s);
            }
        }
        return list;
    }

    public static List localeLookupList(Locale locale)
    {
        return localeLookupList(locale, locale);
    }

    public static List localeLookupList(Locale locale, Locale locale1)
    {
        ArrayList arraylist = new ArrayList(4);
        if (locale != null)
        {
            arraylist.add(locale);
            if (locale.getVariant().length() > 0)
            {
                arraylist.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            if (locale.getCountry().length() > 0)
            {
                arraylist.add(new Locale(locale.getLanguage(), ""));
            }
            if (!arraylist.contains(locale1))
            {
                arraylist.add(locale1);
            }
        }
        return Collections.unmodifiableList(arraylist);
    }

    public static Locale toLocale(String s)
    {
        if (s == null)
        {
            return null;
        }
        int i = s.length();
        if (i != 2 && i != 5 && i < 7)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid locale format: ").append(s).toString());
        }
        char c = s.charAt(0);
        char c1 = s.charAt(1);
        if (c < 'a' || c > 'z' || c1 < 'a' || c1 > 'z')
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid locale format: ").append(s).toString());
        }
        if (i == 2)
        {
            return new Locale(s, "");
        }
        if (s.charAt(2) != '_')
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid locale format: ").append(s).toString());
        }
        c = s.charAt(3);
        if (c == '_')
        {
            return new Locale(s.substring(0, 2), "", s.substring(4));
        }
        c1 = s.charAt(4);
        if (c < 'A' || c > 'Z' || c1 < 'A' || c1 > 'Z')
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid locale format: ").append(s).toString());
        }
        if (i == 5)
        {
            return new Locale(s.substring(0, 2), s.substring(3, 5));
        }
        if (s.charAt(5) != '_')
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid locale format: ").append(s).toString());
        } else
        {
            return new Locale(s.substring(0, 2), s.substring(3, 5), s.substring(6));
        }
    }

}
